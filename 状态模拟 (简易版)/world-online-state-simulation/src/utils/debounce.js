/**
 * 防抖函数 debouncedFunction 使用 debouncedFunction.cancel 取消执行
 * @param {传递一个需要延时执行的函数} func
 * @param {需要延迟的时间,默认两秒} delay
 * @returns
 */
export const debounce = (func, delay = 2000) => {
  let timer
  let cancel = () => {
    clearTimeout(timer)
    timer = null
  }
  const debouncedFunction = (...args) => {
    const context = this
    clearTimeout(timer)
    timer = setTimeout(() => {
      if (func) {
        func.apply(context, args)
      }
    }, delay)
  }
  debouncedFunction.cancel = cancel
  return debouncedFunction
}

/**
 * 防抖函数
 * @param {传递一个需要延时执行的函数} func
 * @param {需要延迟的时间,默认两秒} delay
 * @param {是否立即执行,第一次默认立即执行} immediately
 * @param {没有操作后等待多久重置状态} resetTime
 * @returns
 */
export const debouncePuls = (
  func,
  delay = 2000,
  immediately = true,
  resetTime = 5000
) => {
  let timer
  let tempTimer
  let first = true

  const reset = immediately
    ? () => {
        // 如果用户没有操作,resetTime秒后再次触发立即执行
        clearTimeout(tempTimer)
        tempTimer = setTimeout(() => {
          first = true
          console.log('状态已重置')
        }, resetTime)
      }
    : () => {} // 如果不需要立即执行，reset 是一个空函数

  const debouncedFunction = (...args) => {
    const context = this
    clearTimeout(timer)
    if (immediately && first) {
      first = false
      if (func) {
        func.apply(context, args)
      }
    } else {
      timer = setTimeout(() => {
        if (func) {
          func.apply(context, args)
        }
        // 延时的状态重置
        reset()
      }, delay)
    }
    // 延时的状态重置
    reset()
  }

  return debouncedFunction
}

/**
 * 自动取消操作的防抖函数
 * 当一段时间内执行同种操作时，操作会被无视 (AI)
 * @param {*} func
 * @param {*} delay
 * @returns
 */
export const autoCancelDebounce = (func, delay = 2000) => {
  let timer
  let lastCallTime = 0

  const debouncedFunction = (...args) => {
    const now = Date.now()
    const context = this

    // 如果在延迟时间内再次调用，取消之前的定时器
    if (now - lastCallTime < delay) {
      clearTimeout(timer)
    }

    // 重置 lastCallTime
    lastCallTime = now

    // 设置新的定时器
    timer = setTimeout(() => {
      // 如果在延迟时间内没有再次调用，则执行函数
      if (now - lastCallTime >= delay) {
        func.apply(context, args)
      }
    }, delay)
  }

  return debouncedFunction
}
