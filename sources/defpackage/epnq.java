package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epnq extends eyfy implements eyht {
    public static final epnq a;
    public static final eyfw b;
    private static volatile eyhz h;
    public int c;
    public epnl d;
    public epng e;
    public epno f;
    public epne g;

    static {
        epnq epnqVar = new epnq();
        a = epnqVar;
        eyfy.registerDefaultInstance(epnq.class, epnqVar);
        b = eyfy.newSingularGeneratedExtension(epoa.a, epnqVar, epnqVar, null, 571, eyjr.MESSAGE, epnq.class);
    }

    private epnq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0007ဉ\u0006", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new epnq();
        }
        if (ordinal == 4) {
            return new epnp();
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
        synchronized (epnq.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
