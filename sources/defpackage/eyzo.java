package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyzo extends eyfy implements eyht {
    public static final eyzo a;
    private static volatile eyhz j;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;
    public long g;
    public long h;
    public long i;

    static {
        eyzo eyzoVar = new eyzo();
        a = eyzoVar;
        eyfy.registerDefaultInstance(eyzo.class, eyzoVar);
    }

    private eyzo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"b", "c", eyzm.a, "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new eyzo();
        }
        if (ordinal == 4) {
            return new eyzn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyzo.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
