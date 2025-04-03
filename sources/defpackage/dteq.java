package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dteq extends eyfy implements eyht {
    public static final dteq a;
    private static volatile eyhz c;
    public eygi b = emptyIntList();

    static {
        dteq dteqVar = new dteq();
        a = dteqVar;
        eyfy.registerDefaultInstance(dteq.class, dteqVar);
    }

    private dteq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new dteq();
        }
        if (ordinal == 4) {
            return new dtep();
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
        synchronized (dteq.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
