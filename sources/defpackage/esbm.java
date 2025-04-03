package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esbm extends eyfy implements eyht {
    public static final esbm a;
    private static volatile eyhz e;
    public String b = "";
    public boolean c;
    public boolean d;

    static {
        esbm esbmVar = new esbm();
        a = esbmVar;
        eyfy.registerDefaultInstance(esbm.class, esbmVar);
    }

    private esbm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002Ȉ\u0003\u0007\u0004\u0007", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new esbm();
        }
        if (ordinal == 4) {
            return new esbl();
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
        synchronized (esbm.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
