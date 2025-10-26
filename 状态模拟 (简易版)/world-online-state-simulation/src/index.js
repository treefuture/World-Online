const exports = {}

// 数组扁平化
import { flatDeep } from './utils/flatDeep.js'
// 随机生成颜色
import { randomColors } from './utils/randomColors.js'
// 检测当前是PC端还是移动端
import { equipment } from './utils/equipment.js'
// 防抖函数
import { debounce, debouncePuls } from './utils/debounce.js'
// gz解压工具
import { inflate } from '/node_modules/pako/dist/pako.esm.mjs'
// 随机生成id
import { nanoid } from '/node_modules/nanoid/index.browser.js'

exports.flatDeep = flatDeep
exports.nanoid = nanoid
exports.randomColors = randomColors
exports.equipment = equipment
exports.inflate = inflate
exports.debounce = debounce
exports.debouncePuls = debouncePuls

window.exports = exports
