package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ervc extends eyfy implements eyht {
    public static final ervc a;
    private static volatile eyhz c;
    public boolean b;

    static {
        ervc ervcVar = new ervc();
        a = ervcVar;
        eyfy.registerDefaultInstance(ervc.class, ervcVar);
    }

    private ervc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0007", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new ervc();
        }
        if (ordinal == 4) {
            return new ervb();
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
        synchronized (ervc.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
