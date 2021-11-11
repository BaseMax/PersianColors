import QtQuick

Window {
    width: 640
    height: 480
    visible: true
    title: qsTr("persianColors")

    property var persianColors: {
        "red"        : "#c81d11",
        "plum"       : "#701c1c",
        "pink"       : "#f77fbe",
        "rose"       : "#fe28a2",
        "green"      : "#00a693",
        "orange"     : "#d99058",
        "indigo"     : "#32127a",
        "blue"       : "#1c39bb",
        "mediumBlue" : "#0067a5"
    }

    Component.onCompleted: {
        console.log(persianColors["red"])
    }
}
