package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehl {
    public static final egm a;

    static {
        ehi ehiVar = new ehi();
        ffel ffelVar = ffel.a;
        dqs dqsVar = dqs.a;
        a = new egm(null, 0, false, 0.0f, ehiVar, 0.0f, false, ffsl.b(ffhe.a), new jzo(1.0f), 0, ehj.a, ffelVar, 0, 0, 0, dqsVar, 0, 0);
    }

    public static final ehh a(int i, hfd hfdVar, int i2) {
        if (1 == (i2 & 1)) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        hrh hrhVar = ehh.a;
        boolean B = hfdVar.B(i) | hfdVar.B(0);
        Object f = hfdVar.f();
        if (B || f == hfc.a) {
            f = new ehk(i);
            hfdVar.y(f);
        }
        return (ehh) hqr.c(objArr, hrhVar, (ffix) f, hfdVar, 0, 4);
    }
}
