package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axkv extends eyfy implements eyht {
    public static final axkv a;
    private static volatile eyhz h;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;

    static {
        axkv axkvVar = new axkv();
        a = axkvVar;
        eyfy.registerDefaultInstance(axkv.class, axkvVar);
    }

    private axkv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new axkv();
        }
        if (ordinal == 4) {
            return new axku();
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
        synchronized (axkv.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
