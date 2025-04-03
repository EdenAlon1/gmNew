package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jzw {
    public static float a(jzx jzxVar, long j) {
        float a;
        float ed;
        if (!kam.b(kak.c(j), 4294967296L)) {
            jzy.b("Only Sp can convert to Px");
        }
        int i = kaq.a;
        if (kaq.a(jzxVar.ed())) {
            kap b = kaq.b(jzxVar.ed());
            if (b != null) {
                return b.b(kak.a(j));
            }
            a = kak.a(j);
            ed = jzxVar.ed();
        } else {
            a = kak.a(j);
            ed = jzxVar.ed();
        }
        return a * ed;
    }

    public static long b(jzx jzxVar, float f) {
        int i = kaq.a;
        if (!kaq.a(jzxVar.ed())) {
            return kal.b(f / jzxVar.ed());
        }
        kap b = kaq.b(jzxVar.ed());
        return kal.b(b != null ? b.a(f) : f / jzxVar.ed());
    }
}
