package main

import (
	"fmt"
	"go/go/easy"
)

func main() {
	var strs = [...]string{"a"}
	fmt.Println(easy.LongestCommonPrefix(strs[:]))
}
