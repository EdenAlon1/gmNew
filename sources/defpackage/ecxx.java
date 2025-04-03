package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecxx extends eyfy implements eyht {
    public static final eygj a = new ecxv();
    public static final ecxx b;
    private static volatile eyhz n;
    public int c;
    public boolean e;
    public long g;
    public ecyc k;
    public boolean l;
    public boolean m;
    public eyee d = eyee.b;
    public String f = "";
    public eygr h = eyfy.emptyProtobufList();
    public eygr i = eyfy.emptyProtobufList();
    public eygi j = emptyIntList();

    static {
        ecxx ecxxVar = new ecxx();
        b = ecxxVar;
        eyfy.registerDefaultInstance(ecxx.class, ecxxVar);
    }

    private ecxx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\n\u0000\u0001\u0001\u000b\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", eulk.a, "k", "l", "m"});
        }
        if (ordinal == 3) {
            return new ecxx();
        }
        if (ordinal == 4) {
            return new ecxw();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = n;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ecxx.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
