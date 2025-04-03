package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dsrp {
    public static final /* synthetic */ int a = 0;

    static {
        int i = dsrr.e;
    }

    public static dbu a() {
        return cxu.c(300, 0, new cyh(0.0f, 0.0f, 0.0f, 1.0f), 2);
    }

    public static dbu b() {
        return cxu.c(150, 0, new cyh(0.3f, 0.0f, 0.8f, 0.15f), 2);
    }

    public static cue c(final hus husVar) {
        return ctt.k(a(), husVar, 12).a(ctt.e(a(), new ffji() { // from class: dsro
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                int intValue = ((Integer) obj).intValue();
                int i = dsrp.a;
                int i2 = huo.a;
                hus husVar2 = hus.this;
                if (ffkj.e(husVar2, hum.m)) {
                    intValue = -intValue;
                } else if (!ffkj.e(husVar2, hum.o)) {
                    intValue = 0;
                }
                return Integer.valueOf(intValue);
            }
        }));
    }

    public static cug d(final hus husVar) {
        return ctt.q(b(), husVar, 12).a(ctt.h(b(), new ffji() { // from class: dsrn
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                int intValue = ((Integer) obj).intValue();
                int i = dsrp.a;
                int i2 = huo.a;
                hus husVar2 = hus.this;
                if (ffkj.e(husVar2, hum.m)) {
                    intValue = -intValue;
                } else if (!ffkj.e(husVar2, hum.o)) {
                    intValue = 0;
                }
                return Integer.valueOf(intValue);
            }
        }));
    }
}
