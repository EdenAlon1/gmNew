package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqe extends eyfy implements eyht {
    public static final ceqe a;
    private static volatile eyhz g;
    public String b = "";
    public long c;
    public boolean d;
    public int e;
    public int f;

    static {
        ceqe ceqeVar = new ceqe();
        a = ceqeVar;
        eyfy.registerDefaultInstance(ceqe.class, ceqeVar);
    }

    private ceqe() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0007\u0004\u0004\u0005\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ceqe();
        }
        if (ordinal == 4) {
            return new ceqd();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ceqe.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
