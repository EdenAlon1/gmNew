package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcio extends eyfy implements eyht {
    public static final fcio a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        fcio fcioVar = new fcio();
        a = fcioVar;
        eyfy.registerDefaultInstance(fcio.class, fcioVar);
    }

    private fcio() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0005\u0002\u0000\u0000\u0000\u0002\f\u0005Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fcio();
        }
        if (ordinal == 4) {
            return new fcin();
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
        synchronized (fcio.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
