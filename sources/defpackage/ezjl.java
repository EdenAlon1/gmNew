package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezjl extends eyfy implements eyht {
    public static final ezjl a;
    private static volatile eyhz g;
    public int b;
    public fcfo c;
    public fbik d;
    public fblh e;
    public fbje f;

    static {
        ezjl ezjlVar = new ezjl();
        a = ezjlVar;
        eyfy.registerDefaultInstance(ezjl.class, ezjlVar);
    }

    private ezjl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ezjl();
        }
        if (ordinal == 4) {
            return new ezjk();
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
        synchronized (ezjl.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
