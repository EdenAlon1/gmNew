package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fain extends eyfy implements eyht {
    public static final fain a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        fain fainVar = new fain();
        a = fainVar;
        eyfy.registerDefaultInstance(fain.class, fainVar);
    }

    private fain() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", "d", faim.class, faid.class, faih.class, faif.class});
        }
        if (ordinal == 3) {
            return new fain();
        }
        if (ordinal == 4) {
            return new faib();
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
        synchronized (fain.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
