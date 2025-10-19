const exports = {}

// 数组扁平化
import { flatDeep } from './utils/flatDeep.js'
// 随机生成id
import { nanoid } from '/node_modules/nanoid/index.browser.js'
// 随机生成颜色
import { randomColors } from './utils/randomColors.js'
// 检测当前是PC端还是移动端
import { equipment } from './utils/equipment.js'

exports.flatDeep = flatDeep
exports.nanoid = nanoid
exports.randomColors = randomColors
exports.equipment = equipment

window.exports = exports