package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evzr extends eyfy implements eyht {
    public static final evzr a;
    private static volatile eyhz t;
    public int b;
    public Object d;
    public faul e;
    public faul f;
    public faul g;
    public faul h;
    public faul i;
    public faul j;
    public faul k;
    public evxi p;
    public int q;
    public boolean s;
    public int c = 0;
    public eygr l = emptyProtobufList();
    public eygr m = emptyProtobufList();
    public String n = "";
    public String o = "";
    public float r = 1.0f;

    static {
        evzr evzrVar = new evzr();
        a = evzrVar;
        eyfy.registerDefaultInstance(evzr.class, evzrVar);
    }

    private evzr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0012\u0001\u0001\u0001\u0014\u0012\u0000\u0002\u0000\u0001;\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဈ\b\u0005ဈ\t\u0006ဉ\u0004\bဉ\n\n;\u0000\u000b7\u0000\fဉ\u0003\rဉ\u0005\u000eဉ\u0002\u000fဉ\u0006\u0010᠌\f\u0011ခ\r\u0012\u001b\u0013\u001b\u0014ဇ\u000e", new Object[]{"d", "c", "b", "e", "f", "n", "o", "i", "p", "h", "j", "g", "k", "q", evzp.a, "r", "l", evzn.class, "m", evzn.class, "s"});
        }
        if (ordinal == 3) {
            return new evzr();
        }
        if (ordinal == 4) {
            return new evzo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = t;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (evzr.class) {
            eyhzVar = t;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                t = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
