package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anzd extends eyfy implements eyht {
    public static final anzd a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public eygr d = eyfy.emptyProtobufList();
    public anww e;
    public double f;

    static {
        anzd anzdVar = new anzd();
        a = anzdVar;
        eyfy.registerDefaultInstance(anzd.class, anzdVar);
    }

    private anzd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0003Ț\u0004ဉ\u0002\u0005က\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new anzd();
        }
        if (ordinal == 4) {
            return new anzc();
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
        synchronized (anzd.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
