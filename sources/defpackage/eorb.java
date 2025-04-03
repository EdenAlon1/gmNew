package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eorb extends eyfy implements eyht {
    public static final eorb a;
    private static volatile eyhz j;
    public int b;
    public int c;
    public epjw d;
    public epju e;
    public epjk f;
    public epjs g;
    public epji h;
    public long i;

    static {
        eorb eorbVar = new eorb();
        a = eorbVar;
        eyfy.registerDefaultInstance(eorb.class, eorbVar);
    }

    private eorb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဂ\u0006", new Object[]{"b", "c", eoqy.a, "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new eorb();
        }
        if (ordinal == 4) {
            return new eora();
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
        synchronized (eorb.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
