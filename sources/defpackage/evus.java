package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evus extends eyfy implements eyht {
    public static final evus a;
    private static volatile eyhz e;
    public int b;
    public eygr c = emptyProtobufList();
    public String d = "";

    static {
        evus evusVar = new evus();
        a = evusVar;
        eyfy.registerDefaultInstance(evus.class, evusVar);
    }

    private evus() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0001\u0000\u0004\u001b\u0006ဈ\u0004", new Object[]{"b", "c", evuz.class, "d"});
        }
        if (ordinal == 3) {
            return new evus();
        }
        if (ordinal == 4) {
            return new evur();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (evus.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
