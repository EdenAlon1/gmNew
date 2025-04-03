package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depq extends eyfy implements eyht {
    public static final depq a;
    private static volatile eyhz j;
    public dept f;
    public int h;
    public boolean i;
    private int k;
    public eygr b = emptyProtobufList();
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        depq depqVar = new depq();
        a = depqVar;
        eyfy.registerDefaultInstance(depq.class, depqVar);
    }

    private depq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0003\u0006ဈ\u0004\u0007င\u0005\bဇ\u0006", new Object[]{"k", "b", depo.class, "c", "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new depq();
        }
        if (ordinal == 4) {
            return new depp();
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
        synchronized (depq.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
