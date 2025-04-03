package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evpr extends eyfy implements eyht {
    public static final evpr a;
    private static volatile eyhz k;
    public int b;
    public String c = "";
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    static {
        evpr evprVar = new evpr();
        a = evprVar;
        eyfy.registerDefaultInstance(evpr.class, evprVar);
    }

    private evpr() {
        emptyProtobufList();
        this.d = true;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0002\n\b\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဇ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new evpr();
        }
        if (ordinal == 4) {
            return new evpq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (evpr.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
