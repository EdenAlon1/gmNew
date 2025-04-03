package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
enum rnz {
    svg,
    a,
    circle,
    clipPath,
    defs,
    desc,
    ellipse,
    g,
    image,
    line,
    linearGradient,
    marker,
    mask,
    path,
    pattern,
    polygon,
    polyline,
    radialGradient,
    rect,
    solidColor,
    stop,
    style,
    SWITCH,
    symbol,
    text,
    textPath,
    title,
    tref,
    tspan,
    use,
    view,
    UNSUPPORTED;

    private static final Map G = new HashMap();

    public static rnz a(String str) {
        Map map = G;
        rnz rnzVar = (rnz) map.get(str);
        if (rnzVar != null) {
            return rnzVar;
        }
        if (str.equals("switch")) {
            rnz rnzVar2 = SWITCH;
            map.put(str, rnzVar2);
            return rnzVar2;
        }
        try {
            rnz rnzVar3 = (rnz) Enum.valueOf(rnz.class, str);
            if (rnzVar3 != SWITCH) {
                map.put(str, rnzVar3);
                return rnzVar3;
            }
        } catch (IllegalArgumentException unused) {
        }
        Map map2 = G;
        rnz rnzVar4 = UNSUPPORTED;
        map2.put(str, rnzVar4);
        return rnzVar4;
    }
}
