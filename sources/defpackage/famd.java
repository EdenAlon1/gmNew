package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class famd extends eyfy implements eyht {
    public static final famd a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        famd famdVar = new famd();
        a = famdVar;
        eyfy.registerDefaultInstance(famd.class, famdVar);
    }

    private famd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဈ\u0003\u0004ဈ\u0004", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new famd();
        }
        if (ordinal == 4) {
            return new famc();
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
        synchronized (famd.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
