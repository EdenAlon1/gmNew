package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdz extends eyfy implements eyht {
    public static final erdz a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        erdz erdzVar = new erdz();
        a = erdzVar;
        eyfy.registerDefaultInstance(erdz.class, erdzVar);
    }

    private erdz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002<\u0000", new Object[]{"d", "c", "b", "e", erek.class});
        }
        if (ordinal == 3) {
            return new erdz();
        }
        if (ordinal == 4) {
            return new erdx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (erdz.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
