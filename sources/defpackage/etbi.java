package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etbi extends eyfy implements eyht {
    public static final etbi a;
    private static volatile eyhz f;
    public int b;
    public etau c;
    public etah d;
    public eyfh e;

    static {
        etbi etbiVar = new etbi();
        a = etbiVar;
        eyfy.registerDefaultInstance(etbi.class, etbiVar);
    }

    private etbi() {
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
            return new etbi();
        }
        if (ordinal == 4) {
            return new etbh();
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
        synchronized (etbi.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
