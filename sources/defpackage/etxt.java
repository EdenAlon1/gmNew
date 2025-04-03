package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etxt extends eyfy implements eyht {
    public static final etxt a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public etxv d;
    public eyee e = eyee.b;

    static {
        etxt etxtVar = new etxt();
        a = etxtVar;
        eyfy.registerDefaultInstance(etxt.class, etxtVar);
    }

    private etxt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new etxt();
        }
        if (ordinal == 4) {
            return new etxs();
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
        synchronized (etxt.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
