package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoyj extends eyfy implements eyht {
    public static final eoyj a;
    private static volatile eyhz l;
    public int b;
    public int c;
    public int e;
    public long f;
    public long g;
    public int h;
    public int i;
    public int j;
    public String d = "";
    public String k = "";

    static {
        eoyj eoyjVar = new eoyj();
        a = eoyjVar;
        eyfy.registerDefaultInstance(eoyj.class, eoyjVar);
    }

    private eoyj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဈ\b", new Object[]{"b", "c", eoyi.a, "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (ordinal == 3) {
            return new eoyj();
        }
        if (ordinal == 4) {
            return new eoyh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eoyj.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
