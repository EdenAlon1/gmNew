package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esky extends eyfy implements eyht {
    public static final esky a;
    private static volatile eyhz c;
    private eyhm d = eyhm.a;
    public eyee b = eyee.b;

    static {
        esky eskyVar = new esky();
        a = eskyVar;
        eyfy.registerDefaultInstance(esky.class, eskyVar);
    }

    private esky() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\n\u00022", new Object[]{"b", "d", eskw.a});
        }
        if (ordinal == 3) {
            return new esky();
        }
        if (ordinal == 4) {
            return new eskx();
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
        synchronized (esky.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
