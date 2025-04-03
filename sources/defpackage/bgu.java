package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bgu {
    public static int d(int i) {
        if (i == 35) {
            return 2;
        }
        if (i == 256) {
            return 3;
        }
        if (i == 4101) {
            return 4;
        }
        return i == 32 ? 5 : 1;
    }

    public static bgu e(int i, Size size, bgv bgvVar) {
        bgt bgtVar = bgt.NOT_SUPPORT;
        int a = blz.a(size);
        bbs bbsVar = (bbs) bgvVar;
        if (a <= blz.a(bbsVar.a)) {
            bgtVar = bgt.VGA;
        } else if (a <= blz.a(bbsVar.c)) {
            bgtVar = bgt.PREVIEW;
        } else if (a <= blz.a(bbsVar.e)) {
            bgtVar = bgt.RECORD;
        } else {
            Size h = bgvVar.h(i);
            Size size2 = (Size) bbsVar.g.get(Integer.valueOf(i));
            if (h == null || a <= blz.a(h)) {
                bgtVar = bgt.MAXIMUM;
            } else if (size2 != null && a <= blz.a(size2)) {
                bgtVar = bgt.ULTRA_MAXIMUM;
            }
        }
        return new bbr(d(i), bgtVar, 0L);
    }

    public abstract long a();

    public abstract bgt b();

    public abstract int c();
}
