package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erkq extends eyfy implements eyht {
    public static final erkq a;
    private static volatile eyhz c;
    public int b;
    private int d;

    static {
        erkq erkqVar = new erkq();
        a = erkqVar;
        eyfy.registerDefaultInstance(erkq.class, erkqVar);
    }

    private erkq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", erko.a});
        }
        if (ordinal == 3) {
            return new erkq();
        }
        if (ordinal == 4) {
            return new erkn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (erkq.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
