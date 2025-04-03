package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evux extends eyfy implements eyht {
    public static final evux a;
    private static volatile eyhz j;
    public int b;
    public evuz c;
    public long d;
    public int e;
    public exst f;
    public String g = "";
    public String h = "";
    public eyee i = eyee.b;

    static {
        evux evuxVar = new evux();
        a = evuxVar;
        eyfy.registerDefaultInstance(evux.class, evuxVar);
    }

    private evux() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bည\u0007", new Object[]{"b", "c", "d", "e", evvj.a, "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new evux();
        }
        if (ordinal == 4) {
            return new evuw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (evux.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
