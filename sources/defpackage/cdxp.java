package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdxp extends eyfy implements eyht {
    public static final cdxp a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d = 1;
    public int e;

    static {
        cdxp cdxpVar = new cdxp();
        a = cdxpVar;
        eyfy.registerDefaultInstance(cdxp.class, cdxpVar);
    }

    private cdxp() {
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001င\u0000\u0003᠌\u0002\u0007᠌\u0005", new Object[]{"b", "c", "d", cdxo.a, "e", csgl.a});
        }
        if (ordinal == 3) {
            return new cdxp();
        }
        if (ordinal == 4) {
            return new cdxn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cdxp.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
