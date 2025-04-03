package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewan extends eyfy implements eyht {
    public static final ewan a;
    private static volatile eyhz e;
    public int b;
    public eygi c = emptyIntList();
    public int d;

    static {
        ewan ewanVar = new ewan();
        a = ewanVar;
        eyfy.registerDefaultInstance(ewan.class, ewanVar);
    }

    private ewan() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0016\u0002᠌\u0000", new Object[]{"b", "c", "d", ewak.a});
        }
        if (ordinal == 3) {
            return new ewan();
        }
        if (ordinal == 4) {
            return new ewam();
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
        synchronized (ewan.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
