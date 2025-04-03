package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eosx extends eyfy implements eyht {
    public static final eosx a;
    private static volatile eyhz m;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;
    public String i = "";
    public long j;
    public eowt k;
    public eysq l;

    static {
        eosx eosxVar = new eosx();
        a = eosxVar;
        eyfy.registerDefaultInstance(eosx.class, eosxVar);
    }

    private eosx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eosv.a;
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဂ\u0007\tဉ\b\u000bဉ\n", new Object[]{"b", "c", eyggVar, "d", eyggVar, "e", eqwe.a, "f", "g", "h", "i", "j", "k", "l"});
        }
        if (ordinal == 3) {
            return new eosx();
        }
        if (ordinal == 4) {
            return new eosu();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = m;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eosx.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
