package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfd extends eyfy implements eyht {
    public static final dtfd a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public eygr d = emptyProtobufList();
    public dtev e;

    static {
        dtfd dtfdVar = new dtfd();
        a = dtfdVar;
        eyfy.registerDefaultInstance(dtfd.class, dtfdVar);
    }

    private dtfd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"b", "c", "d", dtet.class, "e"});
        }
        if (ordinal == 3) {
            return new dtfd();
        }
        if (ordinal == 4) {
            return new dtfc();
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
        synchronized (dtfd.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
