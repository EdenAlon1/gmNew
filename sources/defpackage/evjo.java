package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evjo extends eyfy implements eyht {
    public static final evjo a;
    private static volatile eyhz f;
    public int b;
    public long c;
    public eygl d;
    public eygr e;

    static {
        evjo evjoVar = new evjo();
        a = evjoVar;
        eyfy.registerDefaultInstance(evjo.class, evjoVar);
    }

    private evjo() {
        eyfy.emptyProtobufList();
        this.d = emptyLongList();
        this.e = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"b", "e", evjn.class, "c", "d"});
        }
        if (ordinal == 3) {
            return new evjo();
        }
        if (ordinal == 4) {
            return new evjh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (evjo.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
