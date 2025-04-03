package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtex extends eyfy implements eyht {
    public static final dtex a;
    private static volatile eyhz e;
    public long b;
    public long c;
    public float d;
    private int f;

    static {
        dtex dtexVar = new dtex();
        a = dtexVar;
        eyfy.registerDefaultInstance(dtex.class, dtexVar);
    }

    private dtex() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ခ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new dtex();
        }
        if (ordinal == 4) {
            return new dtew();
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
        synchronized (dtex.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
