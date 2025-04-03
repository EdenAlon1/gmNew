package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbvj extends eyfy implements eyht {
    public static final fbvj a;
    private static volatile eyhz h;
    public int b;
    public String c = "";
    public String d;
    public float e;
    public fauu f;
    public eygr g;

    static {
        fbvj fbvjVar = new fbvj();
        a = fbvjVar;
        eyfy.registerDefaultInstance(fbvj.class, fbvjVar);
    }

    private fbvj() {
        emptyIntList();
        this.d = "";
        this.g = eyfy.emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\t\u000e\u0005\u0000\u0001\u0000\tȈ\u000bȈ\f\u0001\rဉ\u0000\u000eȚ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fbvj();
        }
        if (ordinal == 4) {
            return new fbvi();
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
        synchronized (fbvj.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
