package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxk extends eyfy implements eyht {
    public static final epxk a;
    private static volatile eyhz h;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;
    public int g;

    static {
        epxk epxkVar = new epxk();
        a = epxkVar;
        eyfy.registerDefaultInstance(epxk.class, epxkVar);
    }

    private epxk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", epxh.class, epxj.class});
        }
        if (ordinal == 3) {
            return new epxk();
        }
        if (ordinal == 4) {
            return new epxf();
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
        synchronized (epxk.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
