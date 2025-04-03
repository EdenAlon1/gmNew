package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcbn extends eyfy implements eyht {
    public static final fcbn a;
    private static volatile eyhz g;
    public int b;
    public fcfo c;
    public String d = "";
    public fcbr e;
    public fcbm f;

    static {
        fcbn fcbnVar = new fcbn();
        a = fcbnVar;
        eyfy.registerDefaultInstance(fcbn.class, fcbnVar);
    }

    private fcbn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fcbn();
        }
        if (ordinal == 4) {
            return new fcbk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcbn.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
