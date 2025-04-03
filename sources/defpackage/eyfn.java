package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyfn extends eyfy implements eyht {
    public static final eyfn a;
    private static volatile eyhz c;
    public float b;

    static {
        eyfn eyfnVar = new eyfn();
        a = eyfnVar;
        eyfy.registerDefaultInstance(eyfn.class, eyfnVar);
    }

    private eyfn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new eyfn();
        }
        if (ordinal == 4) {
            return new eyfm();
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
        synchronized (eyfn.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
