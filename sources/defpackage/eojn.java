package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eojn extends eyfy implements eyht {
    public static final eojn a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public int d;
    public eojt e;
    public eojz f;
    public eojx g;
    public eojr h;
    public eojv i;
    public eojp j;

    static {
        eojn eojnVar = new eojn();
        a = eojnVar;
        eyfy.registerDefaultInstance(eojn.class, eojnVar);
    }

    private eojn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"b", "c", eojl.a, "d", eojm.a, "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new eojn();
        }
        if (ordinal == 4) {
            return new eojk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eojn.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
