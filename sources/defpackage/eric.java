package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eric extends eyfy implements eyht {
    public static final eric a;
    private static volatile eyhz e;
    public int b;
    public int c = -1;
    public String d = "";

    static {
        eric ericVar = new eric();
        a = ericVar;
        eyfy.registerDefaultInstance(eric.class, ericVar);
    }

    private eric() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new eric();
        }
        if (ordinal == 4) {
            return new erib();
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
        synchronized (eric.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
