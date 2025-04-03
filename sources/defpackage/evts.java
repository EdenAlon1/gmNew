package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evts extends eyfy implements eyht {
    public static final evts a;
    private static volatile eyhz l;
    public int b;
    public evub c;
    public evwq d;
    public ewaj e;
    public evzd f;
    public int g;
    public evsp h;
    public eyja i;
    public evtz j;
    public long k;

    static {
        evts evtsVar = new evts();
        a = evtsVar;
        eyfy.registerDefaultInstance(evts.class, evtsVar);
    }

    private evts() {
        eyee eyeeVar = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u0004\bဉ\u0005\tဉ\u0006\u000bဉ\b\rဂ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (ordinal == 3) {
            return new evts();
        }
        if (ordinal == 4) {
            return new evtr();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (evts.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
