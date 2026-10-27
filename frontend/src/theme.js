export const THEMES = {
  dark: {
    bg: "#0B0D12", panel: "#12151C", panelAlt: "#171A22", border: "#23262F",
    text: "#F4F4F5", muted: "#9AA3B2", faint: "#5B6472",
    amber: "#F5A623", amberDark: "#8A5A0F", amberTint: "#241C0C", amberHover: "#F5A62355",
    green: "#34D399", greenBg: "#122A20", greenBorder: "#1F4B37",
    red: "#F87171", redBg: "#2E1418", redBorder: "#4B1E22",
  },
  light: {
    bg: "#F6F7F9", panel: "#FFFFFF", panelAlt: "#F1F3F6", border: "#E2E5EB",
    text: "#14161B", muted: "#566070", faint: "#8A93A2",
    amber: "#D98A0B", amberDark: "#7A4D06", amberTint: "#FFF3DC", amberHover: "#D98A0B66",
    green: "#059669", greenBg: "#E6F7F0", greenBorder: "#B7E6D2",
    red: "#DC2626", redBg: "#FDECEC", redBorder: "#F5C2C2",
  },
};
// Components use C.x; each value is a CSS variable set by the active theme.
export const C = Object.fromEntries(Object.keys(THEMES.dark).map((k) => [k, `var(--c-${k})`]));
C.onAmber = "#0B0D12"; // text on amber buttons, same in both themes
export function themeVars(name) {
  return Object.fromEntries(Object.entries(THEMES[name]).map(([k, v]) => [`--c-${k}`, v]));
}
