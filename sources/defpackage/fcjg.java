package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcjg extends eyfy implements eyht {
    public static final fcjg a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        fcjg fcjgVar = new fcjg();
        a = fcjgVar;
        eyfy.registerDefaultInstance(fcjg.class, fcjgVar);
    }

    private fcjg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fcjg();
        }
        if (ordinal == 4) {
            return new fcjf();
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
        synchronized (fcjg.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
