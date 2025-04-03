package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epbj extends eyfy implements eyht {
    public static final epbj a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public int d;
    public epbc e;
    public epbi f;

    static {
        epbj epbjVar = new epbj();
        a = epbjVar;
        eyfy.registerDefaultInstance(epbj.class, epbjVar);
    }

    private epbj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0005ဉ\u0003\u0006ဉ\u0004\u0007င\u0002", new Object[]{"b", "c", "e", "f", "d"});
        }
        if (ordinal == 3) {
            return new epbj();
        }
        if (ordinal == 4) {
            return new epay();
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
        synchronized (epbj.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
