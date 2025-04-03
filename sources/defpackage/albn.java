package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class albn extends eyfy implements eyht {
    public static final albn a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public int d;
    private int f;

    static {
        albn albnVar = new albn();
        a = albnVar;
        eyfy.registerDefaultInstance(albn.class, albnVar);
    }

    private albn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u083f\u0000\u0002\u083f\u0000\u0003င\u0000", new Object[]{"c", "b", "f", eols.a, epyv.a, "d"});
        }
        if (ordinal == 3) {
            return new albn();
        }
        if (ordinal == 4) {
            return new albm();
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
        synchronized (albn.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
