package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esao extends eyfy implements eyht {
    public static final esao a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        esao esaoVar = new esao();
        a = esaoVar;
        eyfy.registerDefaultInstance(esao.class, esaoVar);
    }

    private esao() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new esao();
        }
        if (ordinal == 4) {
            return new esam();
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
        synchronized (esao.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
