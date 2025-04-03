package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqwo extends eyfy implements eyht {
    public static final eqwo a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public eqpc d;

    static {
        eqwo eqwoVar = new eqwo();
        a = eqwoVar;
        eyfy.registerDefaultInstance(eqwo.class, eqwoVar);
    }

    private eqwo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"b", "c", eqwe.a, "d"});
        }
        if (ordinal == 3) {
            return new eqwo();
        }
        if (ordinal == 4) {
            return new eqwn();
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
        synchronized (eqwo.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
