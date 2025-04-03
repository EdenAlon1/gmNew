package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwra extends eyfy implements eyht {
    public static final dwra a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public eyee d = eyee.b;

    static {
        dwra dwraVar = new dwra();
        a = dwraVar;
        eyfy.registerDefaultInstance(dwra.class, dwraVar);
    }

    private dwra() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new dwra();
        }
        if (ordinal == 4) {
            return new dwqz();
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
        synchronized (dwra.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
