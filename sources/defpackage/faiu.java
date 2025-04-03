package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faiu extends eyfy implements eyht {
    public static final faiu a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public eyev e;

    static {
        faiu faiuVar = new faiu();
        a = faiuVar;
        eyfy.registerDefaultInstance(faiu.class, faiuVar);
    }

    private faiu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", fait.class, faip.class, fahz.class, fain.class, fair.class});
        }
        if (ordinal == 3) {
            return new faiu();
        }
        if (ordinal == 4) {
            return new fahx();
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
        synchronized (faiu.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
