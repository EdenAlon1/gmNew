package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eync extends eyfy implements eyht {
    public static final eync a;
    private static volatile eyhz e;
    public int b;
    public long c;
    public String d = "";

    static {
        eync eyncVar = new eync();
        a = eyncVar;
        eyfy.registerDefaultInstance(eync.class, eyncVar);
    }

    private eync() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new eync();
        }
        if (ordinal == 4) {
            return new eynb();
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
        synchronized (eync.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
