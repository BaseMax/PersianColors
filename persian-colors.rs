struct PersianColors {
    red: String,
    plum: String,
    pink: String,
    rose: String,
    green: String,
    orange: String,
    indigo: String,
    blue: String,
    medium_blue: String,
}

fn main() {
    let persian_colors = PersianColors {
        red: "#c81d11".to_string(),
        plum: "#701c1c".to_string(),
        pink: "#f77fbe".to_string(),
        rose: "#fe28a2".to_string(),
        green: "#00a693".to_string(),
        orange: "#d99058".to_string(),
        indigo: "#32127a".to_string(),
        blue: "#1c39bb".to_string(),
        medium_blue: "#0067a5".to_string(),
    };

    print!("Red: {}, Plum: {}, Pink: {}, Rose: {}, Green: {}, Orange: {}, Indigo: {}, Blue: {}, Medium Blue: {}",
        persian_colors.red, persian_colors.plum, persian_colors.pink, persian_colors.rose, persian_colors.green, persian_colors.orange, persian_colors.indigo, persian_colors.blue, persian_colors.medium_blue);
}
