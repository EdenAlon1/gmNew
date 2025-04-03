package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emsd extends eyfy implements eyht {
    public static final emsd a;
    private static volatile eyhz c;
    public int b;

    static {
        emsd emsdVar = new emsd();
        a = emsdVar;
        eyfy.registerDefaultInstance(emsd.class, emsdVar);
    }

    private emsd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\f", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new emsd();
        }
        if (ordinal == 4) {
            return new emsc();
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
        synchronized (emsd.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
