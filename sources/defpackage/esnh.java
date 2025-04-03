package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esnh extends eyfy implements eyht {
    public static final esnh a;
    private static volatile eyhz f;
    public boolean b;
    public int c;
    public String d = "";
    public boolean e;

    static {
        esnh esnhVar = new esnh();
        a = esnhVar;
        eyfy.registerDefaultInstance(esnh.class, esnhVar);
    }

    private esnh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003Ȉ\u0004\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new esnh();
        }
        if (ordinal == 4) {
            return new esng();
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
        synchronized (esnh.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
