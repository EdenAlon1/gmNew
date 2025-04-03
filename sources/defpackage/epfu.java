package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epfu extends eyfy implements eyht {
    public static final epfu a;
    private static volatile eyhz j;
    public int b;
    public int d;
    public int e;
    public int f;
    public boolean h;
    public int i;
    public String c = "";
    public eygr g = emptyProtobufList();

    static {
        epfu epfuVar = new epfu();
        a = epfuVar;
        eyfy.registerDefaultInstance(epfu.class, epfuVar);
    }

    private epfu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005\u001b\u0006ဇ\u0004\u0007င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", epgb.class, "h", "i"});
        }
        if (ordinal == 3) {
            return new epfu();
        }
        if (ordinal == 4) {
            return new epft();
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
        synchronized (epfu.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
