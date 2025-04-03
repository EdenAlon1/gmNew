package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htu {
    public static final Integer a(hjq hjqVar, hfr hfrVar, int i, int i2) {
        Integer a;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int c = hjqVar.c(i) + i;
            if (hjqVar.y(i) && hjqVar.b(i) == 206 && ffkj.e(hjqVar.m(i), hfp.e)) {
                Object l = hjqVar.l(i, 0);
                hfe hfeVar = l instanceof hfe ? (hfe) l : null;
                if (hfeVar != null && ffkj.e(hfeVar.a, hfrVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (hjqVar.w(i) && (a = a(hjqVar, hfrVar, i + 1, c)) != null) {
                return Integer.valueOf(a.intValue());
            }
            i = c;
        }
    }

    public static final List b(hjq hjqVar, int i, Object obj) {
        ArrayList arrayList = new ArrayList();
        int e = hjqVar.e(i);
        hen g = hjqVar.g(i);
        while (i >= 0) {
            htt.a(hjqVar.a.b(i), obj);
            if (e >= 0) {
                hen henVar = g;
                g = hjqVar.g(e);
                i = e;
                e = hjqVar.e(e);
                obj = henVar;
            } else {
                i = e;
                obj = g;
            }
        }
        return arrayList;
    }

    public static final List d(hjv hjvVar, int i, Integer num) {
        int i2;
        cok cokVar;
        if (hjvVar.t || hjvVar.f() == 0) {
            return ffel.a;
        }
        ArrayList arrayList = new ArrayList();
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = hjvVar.s;
            if (i2 < 0) {
                i2 = hjvVar.l(i);
            }
        }
        int q = hjvVar.i - hjvVar.q(i);
        cnw cnwVar = hjvVar.p;
        int i3 = 0;
        if (cnwVar != null && (cokVar = (cok) cnwVar.a(i)) != null) {
            i3 = cokVar.c;
        }
        Object valueOf = Integer.valueOf(q + i3);
        while (i >= 0) {
            htt.a(hjvVar.t(i), valueOf);
            valueOf = hjvVar.r(i);
            if (i2 >= 0) {
                int i4 = i2;
                i2 = hjvVar.l(i2);
                i = i4;
            } else {
                i = i2;
            }
        }
        return arrayList;
    }
}
