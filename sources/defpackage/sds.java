package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sds extends eyfy implements eyht {
    public static final sds a;
    private static volatile eyhz f;
    public long b;
    public eygr c = emptyProtobufList();
    public eyev d;
    public float e;
    private int g;

    static {
        sds sdsVar = new sds();
        a = sdsVar;
        eyfy.registerDefaultInstance(sds.class, sdsVar);
    }

    private sds() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဃ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ခ\u0002", new Object[]{"g", "b", "c", sdq.class, "d", "e"});
        }
        if (ordinal == 3) {
            return new sds();
        }
        if (ordinal == 4) {
            return new sdr();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (sds.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
