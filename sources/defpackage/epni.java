package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epni extends eyfy implements eyht {
    public static final epni a;
    public static final eyfw b;
    private static volatile eyhz e;
    public int c;
    public epng d;

    static {
        epni epniVar = new epni();
        a = epniVar;
        eyfy.registerDefaultInstance(epni.class, epniVar);
        b = eyfy.newSingularGeneratedExtension(epmc.a, epniVar, epniVar, null, 118, eyjr.MESSAGE, epni.class);
    }

    private epni() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (ordinal == 3) {
            return new epni();
        }
        if (ordinal == 4) {
            return new epnh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epni.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
