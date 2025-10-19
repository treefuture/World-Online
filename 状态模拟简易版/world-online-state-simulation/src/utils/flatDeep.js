/**
 * 数组扁平化，将高维数组转为一维数组
 * @param {*} arr 
 * @returns 一维数组
 */
export const flatDeep = function (arr) {
  return arr.reduce((pre, next) => {
    if (next) return pre.concat(Array.isArray(next) ? flatDeep(next) : next)
    else return pre
  }, [])
}