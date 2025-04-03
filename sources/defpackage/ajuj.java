package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajuj {
    public static final void a(final String str, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        hviVar.getClass();
        hfd b = hfdVar.b(-1092720414);
        if ((i & 6) == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != b.D(hviVar) ? 128 : 256;
        }
        int i4 = i3 | 3072;
        if ((i4 & 1171) == 1170 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            Uri parse = Uri.parse(str);
            int i5 = inp.a;
            hfdVar2 = b;
            dnac.a(parse, "", hviVar, null, null, null, ino.a, null, 0.0f, null, null, null, null, null, null, null, hfdVar2, (i4 & 896) | 12582912, (i4 << 6) & 458752, 491384);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: ajui
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i6 = i;
                    ajuj.a(str2, hviVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
