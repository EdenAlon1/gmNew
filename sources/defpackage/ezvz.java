package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezvz extends eyfy implements eyht {
    public static final ezvz a;
    private static volatile eyhz c;
    public int b;
    private int d;

    static {
        ezvz ezvzVar = new ezvz();
        a = ezvzVar;
        eyfy.registerDefaultInstance(ezvz.class, ezvzVar);
    }

    private ezvz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new ezvz();
        }
        if (ordinal == 4) {
            return new ezvy();
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
        synchronized (ezvz.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
