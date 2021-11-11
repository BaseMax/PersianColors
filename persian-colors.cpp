#include <iostream>
#include <map>
#include <string>

using ColorType = std::map<std::string, std::string>;

const ColorType persianColors = {
    {"red"        , "#c81d11"},
    {"plum"       , "#701c1c"},
    {"pink"       , "#f77fbe"},
    {"rose"       , "#fe28a2"},
    {"green"      , "#00a693"},
    {"orange"     , "#d99058"},
    {"indigo"     , "#32127a"},
    {"blue"       , "#1c39bb"},
    {"mediumBlue" , "#0067a5"}
};


int main() {
    for (const auto& c : persianColors) {
        std::cout << c.first << ":" << c.second << std::endl;
    }
    return 0;
}
