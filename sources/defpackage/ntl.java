package defpackage;

import android.content.Context;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ntl {
    public static float a(engw engwVar, lqc lqcVar) {
        int i = lqcVar.y % 180;
        int i2 = i == 0 ? lqcVar.v : lqcVar.w;
        int i3 = i == 0 ? lqcVar.w : lqcVar.v;
        float f = 0.0f;
        for (int i4 = 0; i4 < engwVar.size(); i4++) {
            lpx lpxVar = (lpx) engwVar.get(i4);
            if (!(lpxVar instanceof mbd)) {
                return -1.0f;
            }
            mbd mbdVar = (mbd) lpxVar;
            if (lpxVar instanceof mcp) {
                mcp mcpVar = (mcp) lpxVar;
                float f2 = mcpVar.a;
                float f3 = mcpVar.b;
                float f4 = mcpVar.c;
                if (f4 % 90.0f != 0.0f) {
                    return -1.0f;
                }
                f += f4;
                float f5 = f % 180.0f;
                i2 = f5 == 0.0f ? lqcVar.v : lqcVar.w;
                i3 = f5 == 0.0f ? lqcVar.w : lqcVar.v;
            } else if (!mbdVar.c(i2, i3)) {
                return -1.0f;
            }
        }
        float f6 = f % 360.0f;
        if (f6 % 90.0f == 0.0f) {
            return f6;
        }
        return -1.0f;
    }

    public static int b(String str) {
        int b = lre.b(str);
        if (b == 4) {
            return 2;
        }
        return b;
    }

    public static lpo c(lpo lpoVar, boolean z) {
        return (z && lpo.i(lpoVar)) ? lpo.a : lpoVar;
    }

    public static lpo d(lpo lpoVar) {
        return (lpoVar == null || !lpoVar.g()) ? lpo.a : lpoVar;
    }

    public static String e(Context context, lqw lqwVar) {
        lqt lqtVar = lqwVar.b;
        if (lqtVar == null) {
            return null;
        }
        String str = lqtVar.b;
        if (str == null) {
            if (Objects.equals(lqtVar.a.getScheme(), "content")) {
                return context.getContentResolver().getType(lqtVar.a);
            }
            String path = lqtVar.a.getPath();
            if (path == null) {
                return null;
            }
            int lastIndexOf = path.lastIndexOf(".");
            if (lastIndexOf >= 0) {
                if (lastIndexOf < path.length() - 1) {
                    switch (emuz.c(path.substring(lastIndexOf + 1))) {
                        case "bmp":
                        case "dib":
                            return "image/bmp";
                        case "heif":
                            return "image/heif";
                        case "heic":
                            return "image/heic";
                        case "jpg":
                        case "jpeg":
                        case "jpe":
                        case "jif":
                        case "jfif":
                        case "jfi":
                            return "image/jpeg";
                        case "png":
                            return "image/png";
                        case "webp":
                            return "image/webp";
                        case "gif":
                            return "image/gif";
                        case "tiff":
                        case "tif":
                            return "image/tiff";
                        case "raw":
                        case "arw":
                        case "cr2":
                        case "k25":
                            return "image/raw";
                        case "svg":
                        case "svgz":
                            return "image/svg+xml";
                        case "ico":
                            return "image/x-icon";
                        case "avif":
                            return "image/avif";
                        default:
                            return null;
                    }
                }
            }
        }
        return str;
    }

    public static boolean f(Context context, lqw lqwVar) {
        String e = e(context, lqwVar);
        return e != null && lre.j(e);
    }
}
