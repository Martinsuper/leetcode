package easy

/*
 * @lc app=leetcode.cn id=14 lang=golang
 *
 * [14] 最长公共前缀
 *
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (38.90%)
 * Likes:    1414
 * Dislikes: 0
 * Total Accepted:    428.3K
 * Total Submissions: 1.1M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 *
 *
 * 示例 2：
 *
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *
 *
 *
 * 提示：
 *
 *
 * 0
 * 0
 * strs[i] 仅由小写英文字母组成
 *
 *
 */

// LongestCommonPrefix 求最长公共前缀
func LongestCommonPrefix(strs []string) string {
	commonPrefix := ""
	if len(strs) == 0 {
		return commonPrefix
	}
	for i := 0; ; i++ {
		if i >= len(strs[0]) {
			return commonPrefix
		}
		cur := strs[0][i]
		for j := 0; j < len(strs); j++ {
			if i >= len(strs[j]) {
				return commonPrefix
			}
			if cur != strs[j][i] {
				return commonPrefix
			}
		}
		commonPrefix = commonPrefix + string(cur)
	}
}

// @lc code=end
