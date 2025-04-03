package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncb {
    public static void a(long j, luv luvVar, ndu[] nduVarArr) {
        int i;
        while (true) {
            if (luvVar.b() <= 1) {
                return;
            }
            int c = c(luvVar);
            int c2 = c(luvVar);
            int i2 = luvVar.b + c2;
            if (c2 == -1 || c2 > luvVar.b()) {
                luj.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i2 = luvVar.c;
            } else if (c == 4 && c2 >= 8) {
                int j2 = luvVar.j();
                int n = luvVar.n();
                if (n == 49) {
                    i = luvVar.e();
                    n = 49;
                } else {
                    i = 0;
                }
                int j3 = luvVar.j();
                if (n == 47) {
                    luvVar.L(1);
                    n = 47;
                }
                boolean z = j2 == 181 && (n == 49 || n == 47) && j3 == 3;
                if (n == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    b(j, luvVar, nduVarArr);
                }
            }
            luvVar.K(i2);
        }
    }

    public static void b(long j, luv luvVar, ndu[] nduVarArr) {
        int j2 = luvVar.j();
        if ((j2 & 64) != 0) {
            int i = j2 & 31;
            luvVar.L(1);
            int i2 = luvVar.b;
            for (ndu nduVar : nduVarArr) {
                int i3 = i * 3;
                luvVar.K(i2);
                nduVar.m(luvVar, i3);
                lti.c(j != -9223372036854775807L);
                nduVar.o(j, 1, i3, 0, null);
            }
        }
    }

    private static int c(luv luvVar) {
        int i = 0;
        while (luvVar.b() != 0) {
            int j = luvVar.j();
            i += j;
            if (j != 255) {
                return i;
            }
        }
        return -1;
    }
}
