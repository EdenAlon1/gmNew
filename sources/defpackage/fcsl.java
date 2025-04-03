package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcsl extends eyfy implements eyht {
    public static final fcsl a;
    private static volatile eyhz d;
    public String b = "";
    public int c;

    static {
        fcsl fcslVar = new fcsl();
        a = fcslVar;
        eyfy.registerDefaultInstance(fcsl.class, fcslVar);
    }

    private fcsl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\f", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fcsl();
        }
        if (ordinal == 4) {
            return new fcsk();
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
        synchronized (fcsl.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
