package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drqr extends eyfy implements eyht {
    public static final drqr a;
    private static volatile eyhz j;
    public int b;
    public int c;
    public int g;
    public int h;
    public long i;
    public eyhm f = eyhm.a;
    public String d = "";
    public String e = "";

    static {
        drqr drqrVar = new drqr();
        a = drqrVar;
        eyfy.registerDefaultInstance(drqr.class, drqrVar);
    }

    private drqr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u00042\u0005င\u0003\u0006င\u0004\u0007ဂ\u0005", new Object[]{"b", "c", "d", "e", "f", drqp.a, "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new drqr();
        }
        if (ordinal == 4) {
            return new drqo();
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
        synchronized (drqr.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
