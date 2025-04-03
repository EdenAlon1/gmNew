package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eybq extends eyfy implements eyht {
    public static final eybq a;
    private static volatile eyhz j;
    public int b;
    public int g;
    public int i;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public eygr h = emptyProtobufList();

    static {
        eybq eybqVar = new eybq();
        a = eybqVar;
        eyfy.registerDefaultInstance(eybq.class, eybqVar);
    }

    private eybq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006\u001b\u0007င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", eybo.a, "h", eycl.class, "i"});
        }
        if (ordinal == 3) {
            return new eybq();
        }
        if (ordinal == 4) {
            return new eybn();
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
        synchronized (eybq.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
