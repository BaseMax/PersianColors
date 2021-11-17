class PersianColor {
  static Map<String, String> colors = {
    'red': '#c81d11',
    'plum': '#701c1c',
    'pink': '#f77fbe',
    'rose': '#fe28a2',
    'green': '#00a693',
    'orange': '#d99058',
    'indigo': '#32127a',
    'blue': '#1c39bb',
    'mediumBlue': '#0067a5'
  };

  void _iterateMapExample() {
    for (var color in colors.values) {
      print(color);
    }
  }

  void _getColorExample() {
    print(colors['red']);
  }
}
