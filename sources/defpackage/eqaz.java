package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqaz extends eyfy implements eyht {
    public static final eqaz a;
    private static volatile eyhz e;
    public int b;
    public long c;
    public int d;

    static {
        eqaz eqazVar = new eqaz();
        a = eqazVar;
        eyfy.registerDefaultInstance(eqaz.class, eqazVar);
    }

    private eqaz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", eqay.a});
        }
        if (ordinal == 3) {
            return new eqaz();
        }
        if (ordinal == 4) {
            return new eqax();
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
        synchronized (eqaz.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
