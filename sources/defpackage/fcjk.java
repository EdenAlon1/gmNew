package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcjk extends eyfy implements eyht {
    public static final fcjk a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public String d = "";
    public eylw e;

    static {
        fcjk fcjkVar = new fcjk();
        a = fcjkVar;
        eyfy.registerDefaultInstance(fcjk.class, fcjkVar);
    }

    private fcjk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002\f\u0004Ȉ\u0005ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new fcjk();
        }
        if (ordinal == 4) {
            return new fcjj();
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
        synchronized (fcjk.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
