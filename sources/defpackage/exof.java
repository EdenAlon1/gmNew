package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exof extends eyfy implements eyht {
    public static final exof a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        exof exofVar = new exof();
        a = exofVar;
        eyfy.registerDefaultInstance(exof.class, exofVar);
    }

    private exof() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", euky.class, euks.class, eukq.class, eukw.class, euku.class});
        }
        if (ordinal == 3) {
            return new exof();
        }
        if (ordinal == 4) {
            return new exoe();
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
        synchronized (exof.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
