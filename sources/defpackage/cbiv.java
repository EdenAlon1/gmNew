package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbiv extends eyfy implements eyht {
    public static final cbiv a;
    private static volatile eyhz e;
    public int b;
    public cbiy c;
    public awup d;

    static {
        cbiv cbivVar = new cbiv();
        a = cbivVar;
        eyfy.registerDefaultInstance(cbiv.class, cbivVar);
    }

    private cbiv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new cbiv();
        }
        if (ordinal == 4) {
            return new cbiu();
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
        synchronized (cbiv.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
