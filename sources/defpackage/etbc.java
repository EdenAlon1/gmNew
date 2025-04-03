package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etbc extends eyfy implements eyht {
    public static final etbc a;
    private static volatile eyhz f;
    public int b;
    public etau c;
    public eswr d;
    public eyfh e;

    static {
        etbc etbcVar = new etbc();
        a = etbcVar;
        eyfy.registerDefaultInstance(etbc.class, etbcVar);
    }

    private etbc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001ϧ\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002ϧဉ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (ordinal == 3) {
            return new etbc();
        }
        if (ordinal == 4) {
            return new etbb();
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
        synchronized (etbc.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
