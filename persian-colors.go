package main

import "fmt"

func PersianColors() map[string]string {
	return map[string]string{
		"red":        "#c81d11",
		"plum":       "#701c1c",
		"pink":       "#f77fbe",
		"rose":       "#fe28a2",
		"green":      "#00a693",
		"orange":     "#d99058",
		"indigo":     "#32127a",
		"blue":       "#1c39bb",
		"mediumBlue": "#0067a5",
	}
}

func main() {
	// 	An example to show PersianColors cases
	colors := PersianColors()

	for name, hex := range colors {
		fmt.Printf("%s: %s\n", name, hex)
	}
}
