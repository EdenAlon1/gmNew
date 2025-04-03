package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecym extends eyfy implements eyht {
    public static final ecym a;
    private static volatile eyhz c;
    public eyhm b = eyhm.a;

    static {
        ecym ecymVar = new ecym();
        a = ecymVar;
        eyfy.registerDefaultInstance(ecym.class, ecymVar);
    }

    private ecym() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", ecyk.a});
        }
        if (ordinal == 3) {
            return new ecym();
        }
        if (ordinal == 4) {
            return new ecyl();
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
        synchronized (ecym.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
