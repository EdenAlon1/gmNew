package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdq extends eyfy implements eyht {
    public static final sdq a;
    private static volatile eyhz d;
    public int b;
    public int c;
    private int e;

    static {
        sdq sdqVar = new sdq();
        a = sdqVar;
        eyfy.registerDefaultInstance(sdq.class, sdqVar);
    }

    private sdq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new sdq();
        }
        if (ordinal == 4) {
            return new sdp();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (sdq.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
