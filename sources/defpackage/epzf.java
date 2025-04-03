package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epzf extends eyfy implements eyht {
    public static final epzf a;
    private static volatile eyhz h;
    public int b;
    public eqad c;
    public epzq d;
    public int e;
    public int f;
    public int g;

    static {
        epzf epzfVar = new epzf();
        a = epzfVar;
        eyfy.registerDefaultInstance(epzf.class, epzfVar);
    }

    private epzf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = epze.a;
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", epzd.a, "f", eyggVar, "g", eyggVar});
        }
        if (ordinal == 3) {
            return new epzf();
        }
        if (ordinal == 4) {
            return new epzc();
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
        synchronized (epzf.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
