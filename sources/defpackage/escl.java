package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class escl extends eyfy implements eyht {
    public static final escl a;
    private static volatile eyhz g;
    public int b;
    public esal c;
    public int d;
    public int e;
    public crsn f;

    static {
        escl esclVar = new escl();
        a = esclVar;
        eyfy.registerDefaultInstance(escl.class, esclVar);
    }

    private escl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\f\u0004ဉ\u0001", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new escl();
        }
        if (ordinal == 4) {
            return new escj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (escl.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
