package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eosl extends eyfy implements eyht {
    public static final eosl a;
    private static volatile eyhz s;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;

    static {
        eosl eoslVar = new eosl();
        a = eoslVar;
        eyfy.registerDefaultInstance(eosl.class, eoslVar);
    }

    private eosl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eoxb.a;
            return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0002\u0012\u0010\u0000\u0000\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\t᠌\b\n᠌\t\u000bင\n\fင\u000b\u000eဇ\r\u000f᠌\u000e\u0010᠌\u000f\u0011᠌\u0010\u0012᠌\u0011", new Object[]{"b", "c", eqwe.a, "d", eosq.a, "e", eovf.a, "f", eyggVar, "g", eyggVar, "h", eyggVar, "i", eyggVar, "j", eyggVar, "k", eyggVar, "l", "m", "n", "o", eqmz.a, "p", eyggVar, "q", eyggVar, "r", eyggVar});
        }
        if (ordinal == 3) {
            return new eosl();
        }
        if (ordinal == 4) {
            return new eosk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = s;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eosl.class) {
            eyhzVar = s;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                s = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
