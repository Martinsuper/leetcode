package easy

// RomanToInt 罗马数字转阿拉伯数字
func RomanToInt(s string) int {
	romanMap := make(map[string]int)
	romanMap["I"] = 1
	romanMap["V"] = 5
	romanMap["X"] = 10
	romanMap["L"] = 50
	romanMap["C"] = 100
	romanMap["D"] = 500
	romanMap["M"] = 1000
	sum := 0
	for i := 0; i < len(s); i++ {
		curValue := romanMap[string(s[i])]
		var nexValue int
		if i+1 < len(s) {
			nexValue = romanMap[string(s[i+1])]
		} else {
			nexValue = 0
		}
		if curValue < nexValue {
			sum = sum - curValue
		} else {
			sum = sum + curValue
		}
	}
	return sum
}
