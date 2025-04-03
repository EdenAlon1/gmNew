package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
enum rny {
    CLASS,
    clip,
    clip_path,
    clipPathUnits,
    clip_rule,
    color,
    cx,
    cy,
    direction,
    dx,
    dy,
    fx,
    fy,
    d,
    display,
    fill,
    fill_rule,
    fill_opacity,
    font,
    font_family,
    font_size,
    font_weight,
    font_style,
    gradientTransform,
    gradientUnits,
    height,
    href,
    id,
    marker,
    marker_start,
    marker_mid,
    marker_end,
    markerHeight,
    markerUnits,
    markerWidth,
    mask,
    maskContentUnits,
    maskUnits,
    media,
    offset,
    opacity,
    orient,
    overflow,
    pathLength,
    patternContentUnits,
    patternTransform,
    patternUnits,
    points,
    preserveAspectRatio,
    r,
    refX,
    refY,
    requiredFeatures,
    requiredExtensions,
    requiredFormats,
    requiredFonts,
    rx,
    ry,
    solid_color,
    solid_opacity,
    spreadMethod,
    startOffset,
    stop_color,
    stop_opacity,
    stroke,
    stroke_dasharray,
    stroke_dashoffset,
    stroke_linecap,
    stroke_linejoin,
    stroke_miterlimit,
    stroke_opacity,
    stroke_width,
    style,
    systemLanguage,
    text_anchor,
    text_decoration,
    transform,
    type,
    vector_effect,
    version,
    viewBox,
    width,
    x,
    y,
    x1,
    y1,
    x2,
    y2,
    viewport_fill,
    viewport_fill_opacity,
    visibility,
    UNSUPPORTED;

    private static final Map aO = new HashMap();

    public static rny a(String str) {
        Map map = aO;
        rny rnyVar = (rny) map.get(str);
        if (rnyVar != null) {
            return rnyVar;
        }
        if (str.equals("class")) {
            rny rnyVar2 = CLASS;
            map.put(str, rnyVar2);
            return rnyVar2;
        }
        if (str.indexOf(95) != -1) {
            rny rnyVar3 = UNSUPPORTED;
            map.put(str, rnyVar3);
            return rnyVar3;
        }
        try {
            rny rnyVar4 = (rny) Enum.valueOf(rny.class, str.replace('-', '_'));
            if (rnyVar4 != CLASS) {
                map.put(str, rnyVar4);
                return rnyVar4;
            }
        } catch (IllegalArgumentException unused) {
        }
        Map map2 = aO;
        rny rnyVar5 = UNSUPPORTED;
        map2.put(str, rnyVar5);
        return rnyVar5;
    }
}
