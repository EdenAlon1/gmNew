package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exjg extends eyfy implements eyht {
    public static final exjg a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        exjg exjgVar = new exjg();
        a = exjgVar;
        eyfy.registerDefaultInstance(exjg.class, exjgVar);
    }

    private exjg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȼ\u0000\u0004<\u0000\u0005Ȼ\u0000", new Object[]{"c", "b", exhn.class, exgx.class, exje.class});
        }
        if (ordinal == 3) {
            return new exjg();
        }
        if (ordinal == 4) {
            return new exjf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exjg.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
