/**
 * 随机生成一种颜色
 * @returns 颜色的十六进制代码
 */
export const randomColors = function () {
  return ("#" + Math.random().toString(16).substring(2, 8))
}