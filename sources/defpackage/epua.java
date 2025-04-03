package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epua extends eyfy implements eyht {
    public static final epua a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        epua epuaVar = new epua();
        a = epuaVar;
        eyfy.registerDefaultInstance(epua.class, epuaVar);
    }

    private epua() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", eptz.a, "d", epty.a, "e", epuh.a, "f", eptx.a});
        }
        if (ordinal == 3) {
            return new epua();
        }
        if (ordinal == 4) {
            return new eptw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epua.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
