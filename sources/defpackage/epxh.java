package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxh extends eyfy implements eyht {
    public static final epxh a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        epxh epxhVar = new epxh();
        a = epxhVar;
        eyfy.registerDefaultInstance(epxh.class, epxhVar);
    }

    private epxh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new epxh();
        }
        if (ordinal == 4) {
            return new epxg();
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
        synchronized (epxh.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
