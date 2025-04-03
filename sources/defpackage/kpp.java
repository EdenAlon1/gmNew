package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpp {
    private static final ThreadLocal c = new ThreadLocal();
    public static final WeakHashMap a = new WeakHashMap(0);
    public static final Object b = new Object();

    public static float a(Resources resources, int i) {
        float f;
        if (Build.VERSION.SDK_INT >= 29) {
            f = resources.getFloat(i);
            return f;
        }
        TypedValue c2 = c();
        resources.getValue(i, c2, true);
        if (c2.type == 4) {
            return c2.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(c2.type) + " is not valid");
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return e(context, i, new TypedValue(), 0, null, false, false);
    }

    public static TypedValue c() {
        ThreadLocal threadLocal = c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static void d(Context context, int i, kpn kpnVar) {
        if (context.isRestricted()) {
            kpnVar.c(-4);
        } else {
            e(context, i, new TypedValue(), 0, kpnVar, false, false);
        }
    }

    public static Typeface e(Context context, int i, TypedValue typedValue, int i2, kpn kpnVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface f = f(context, resources, typedValue, i, i2, kpnVar, z, z2);
        if (f != null || kpnVar != null || z2) {
            return f;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01dc, code lost:
    
        if (r37 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c9, code lost:
    
        if (r3.equals(r6) == false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199 A[Catch: IOException -> 0x0263, XmlPullParserException -> 0x0266, TryCatch #7 {IOException -> 0x0263, XmlPullParserException -> 0x0266, blocks: (B:53:0x0083, B:57:0x00ae, B:59:0x00b5, B:61:0x00b9, B:63:0x00bf, B:64:0x00c9, B:66:0x0199, B:68:0x01a0, B:70:0x01a5, B:72:0x01ab, B:74:0x01b1, B:77:0x01b8, B:79:0x01c5, B:83:0x01d1, B:86:0x01d7, B:91:0x01e3, B:92:0x01e7, B:94:0x01f5, B:95:0x0214, B:97:0x0234, B:99:0x0207, B:104:0x021c, B:107:0x022a, B:108:0x022e, B:110:0x00d9, B:111:0x00de, B:113:0x00e5, B:120:0x00ec, B:122:0x00f8, B:125:0x010c, B:128:0x011c, B:131:0x0128, B:134:0x0131, B:137:0x013a, B:140:0x014d, B:141:0x0158, B:143:0x015f, B:145:0x0163, B:152:0x016e, B:154:0x017a, B:158:0x0181, B:160:0x0190, B:20:0x0246), top: B:18:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a5 A[Catch: IOException -> 0x0263, XmlPullParserException -> 0x0266, TryCatch #7 {IOException -> 0x0263, XmlPullParserException -> 0x0266, blocks: (B:53:0x0083, B:57:0x00ae, B:59:0x00b5, B:61:0x00b9, B:63:0x00bf, B:64:0x00c9, B:66:0x0199, B:68:0x01a0, B:70:0x01a5, B:72:0x01ab, B:74:0x01b1, B:77:0x01b8, B:79:0x01c5, B:83:0x01d1, B:86:0x01d7, B:91:0x01e3, B:92:0x01e7, B:94:0x01f5, B:95:0x0214, B:97:0x0234, B:99:0x0207, B:104:0x021c, B:107:0x022a, B:108:0x022e, B:110:0x00d9, B:111:0x00de, B:113:0x00e5, B:120:0x00ec, B:122:0x00f8, B:125:0x010c, B:128:0x011c, B:131:0x0128, B:134:0x0131, B:137:0x013a, B:140:0x014d, B:141:0x0158, B:143:0x015f, B:145:0x0163, B:152:0x016e, B:154:0x017a, B:158:0x0181, B:160:0x0190, B:20:0x0246), top: B:18:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface f(android.content.Context r32, android.content.res.Resources r33, android.util.TypedValue r34, int r35, int r36, defpackage.kpn r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpp.f(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, kpn, boolean, boolean):android.graphics.Typeface");
    }
}
