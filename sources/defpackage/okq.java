package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class okq {
    public static final int a(oko okoVar, okn oknVar, oko okoVar2, int i) {
        int a;
        okoVar.getClass();
        oknVar.getClass();
        okoVar2.getClass();
        if (!oknVar.b) {
            return ffmk.h(i, ffmk.q(0, okoVar2.f()));
        }
        int e = i - okoVar.e();
        int a2 = okoVar.a();
        if (e >= 0 && e < a2) {
            for (int i2 = 0; i2 < 30; i2++) {
                int i3 = ((i2 / 2) * (i2 % 2 == 1 ? -1 : 1)) + e;
                if (i3 >= 0 && i3 < okoVar.a() && (a = oknVar.a.a(i3)) != -1) {
                    return a + okoVar2.e();
                }
            }
        }
        return ffmk.h(i, ffmk.q(0, okoVar2.f()));
    }

    public static final okn b(oko okoVar, oko okoVar2, mr mrVar) {
        okoVar.getClass();
        okoVar2.getClass();
        mq a = mv.a(new okp(okoVar, okoVar2, mrVar, okoVar.a(), okoVar2.a()));
        boolean z = false;
        ffev it = ffmk.q(0, okoVar.a()).iterator();
        while (true) {
            if (!((ffmi) it).a) {
                break;
            }
            if (a.a(it.a()) != -1) {
                z = true;
                break;
            }
        }
        return new okn(a, z);
    }

    public static final void c(oko okoVar, mw mwVar, oko okoVar2, okn oknVar) {
        okoVar.getClass();
        mwVar.getClass();
        okoVar2.getClass();
        oknVar.getClass();
        if (!oknVar.b) {
            int max = Math.max(okoVar.e(), okoVar2.e());
            int min = Math.min(okoVar.e() + okoVar.a(), okoVar2.e() + okoVar2.a());
            int i = min - max;
            if (i > 0) {
                mwVar.d(max, i);
                mwVar.b(max, i);
            }
            int min2 = Math.min(max, min);
            int max2 = Math.max(max, min);
            oea.a(mwVar, min2, max2, ffmk.g(okoVar.e(), okoVar2.f()), ffmk.g(okoVar.e() + okoVar.a(), okoVar2.f()), odz.a);
            oea.a(mwVar, min2, max2, ffmk.g(okoVar2.e(), okoVar.f()), ffmk.g(okoVar2.e() + okoVar2.a(), okoVar.f()), odz.b);
            int f = okoVar2.f() - okoVar.f();
            if (f > 0) {
                mwVar.b(okoVar.f(), f);
                return;
            } else {
                if (f < 0) {
                    mwVar.d(okoVar.f() + f, -f);
                    return;
                }
                return;
            }
        }
        ogi ogiVar = new ogi(okoVar, okoVar2, mwVar);
        oknVar.a.b(ogiVar);
        int min3 = Math.min(ogiVar.a.e(), ogiVar.d);
        int e = ogiVar.b.e() - ogiVar.d;
        if (e > 0) {
            if (min3 > 0) {
                ogiVar.c.a(0, min3, odz.c);
            }
            ogiVar.c.b(0, e);
        } else if (e < 0) {
            ogiVar.c.d(0, -e);
            int i2 = min3 + e;
            if (i2 > 0) {
                ogiVar.c.a(0, i2, odz.c);
            }
        }
        ogiVar.d = ogiVar.b.e();
        int min4 = Math.min(ogiVar.a.d(), ogiVar.e);
        int d = ogiVar.b.d();
        int i3 = ogiVar.e;
        int i4 = d - i3;
        int i5 = ogiVar.d + ogiVar.f + i3;
        int i6 = i5 - min4;
        int f2 = ogiVar.a.f() - min4;
        if (i4 > 0) {
            ogiVar.c.b(i5, i4);
        } else if (i4 < 0) {
            ogiVar.c.d(i5 + i4, -i4);
            min4 += i4;
        }
        if (min4 > 0 && i6 != f2) {
            ogiVar.c.a(i6, min4, odz.c);
        }
        ogiVar.e = ogiVar.b.d();
    }
}
