package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fauj extends eyfy implements eyht {
    public static final fauj a;
    private static volatile eyhz h;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public faui g;

    static {
        fauj faujVar = new fauj();
        a = faujVar;
        eyfy.registerDefaultInstance(fauj.class, faujVar);
    }

    private fauj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0004\f\u0005\f\tဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fauj();
        }
        if (ordinal == 4) {
            return new faug();
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
        synchronized (fauj.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
