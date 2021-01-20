package easy

import (
	"container/list"
	"fmt"
)

// IsValid 判断有效的括号
func IsValid(s string) bool {
	resultMap := make(map[string]string)
	resultMap["["] = "]"
	resultMap["("] = ")"
	resultMap["{"] = "}"
	stack := list.New()
	for i := 0; i < len(s); i++ {
		if stack.Len() == 0 {
			stack.PushBack(s[i])
		} else if resultMap[stack.Back().Value] == string(s[i]) {
			stack.Remove(stack.Back())
		} else {
			stack.PushBack(s[i])
		}
	}
	fmt.Println(stack.Len())
	if stack.Len() == 0 {
		return true
	}
	return false
}
