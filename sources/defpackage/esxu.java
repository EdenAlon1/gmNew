package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esxu extends eyfy implements eyht {
    public static final esxu a;
    private static volatile eyhz e;
    public int b;
    public etau c;
    public String d = "";

    static {
        esxu esxuVar = new esxu();
        a = esxuVar;
        eyfy.registerDefaultInstance(esxu.class, esxuVar);
    }

    private esxu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0000\u0000\u0001Ȉϧဉ\u0000", new Object[]{"b", "d", "c"});
        }
        if (ordinal == 3) {
            return new esxu();
        }
        if (ordinal == 4) {
            return new esxt();
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
        synchronized (esxu.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
