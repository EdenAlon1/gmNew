package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqyd extends eyfy implements eyht {
    public static final eqyd a;
    private static volatile eyhz h;
    public int b;
    public int d;
    public boolean g;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        eqyd eqydVar = new eqyd();
        a = eqydVar;
        eyfy.registerDefaultInstance(eqyd.class, eqydVar);
    }

    private eqyd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eqyd();
        }
        if (ordinal == 4) {
            return new eqyc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqyd.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
