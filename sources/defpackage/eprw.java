package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eprw extends eyfy implements eyht {
    public static final eprw a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public boolean d;

    static {
        eprw eprwVar = new eprw();
        a = eprwVar;
        eyfy.registerDefaultInstance(eprw.class, eprwVar);
    }

    private eprw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new eprw();
        }
        if (ordinal == 4) {
            return new eprv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eprw.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
