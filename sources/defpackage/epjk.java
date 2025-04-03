package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epjk extends eyfy implements eyht {
    public static final epjk a;
    private static volatile eyhz f;
    public int b;
    public epjq c;
    public boolean d;
    public epjm e;

    static {
        epjk epjkVar = new epjk();
        a = epjkVar;
        eyfy.registerDefaultInstance(epjk.class, epjkVar);
    }

    private epjk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new epjk();
        }
        if (ordinal == 4) {
            return new epjj();
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
        synchronized (epjk.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
