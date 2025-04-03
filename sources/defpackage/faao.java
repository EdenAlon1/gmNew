package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class faao extends eyfy implements eyht {
    public static final faao a;
    private static volatile eyhz d;
    public int b;
    public faan c;

    static {
        faao faaoVar = new faao();
        a = faaoVar;
        eyfy.registerDefaultInstance(faao.class, faaoVar);
    }

    private faao() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new faao();
        }
        if (ordinal == 4) {
            return new faaf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (faao.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
