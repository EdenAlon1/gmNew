package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwsk extends eyfy implements eyht {
    public static final dwsk a;
    private static volatile eyhz j;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;

    static {
        dwsk dwskVar = new dwsk();
        a = dwskVar;
        eyfy.registerDefaultInstance(dwsk.class, dwskVar);
    }

    private dwsk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new dwsk();
        }
        if (ordinal == 4) {
            return new dwsj();
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
        synchronized (dwsk.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
