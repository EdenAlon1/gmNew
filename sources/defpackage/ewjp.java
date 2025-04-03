package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewjp extends eyfy implements eyht {
    public static final ewjp a;
    private static volatile eyhz h;
    public int b;
    public ewjg c;
    public long d;
    public eyee e = eyee.b;
    public int f = 100;
    public ewiq g;

    static {
        ewjp ewjpVar = new ewjp();
        a = ewjpVar;
        eyfy.registerDefaultInstance(ewjp.class, ewjpVar);
    }

    private ewjp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ည\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new ewjp();
        }
        if (ordinal == 4) {
            return new ewjo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewjp.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
