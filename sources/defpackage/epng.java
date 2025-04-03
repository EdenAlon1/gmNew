package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epng extends eyfy implements eyht {
    public static final epng a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        epng epngVar = new epng();
        a = epngVar;
        eyfy.registerDefaultInstance(epng.class, epngVar);
    }

    private epng() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0001", new Object[]{"b", "c", ezoy.a});
        }
        if (ordinal == 3) {
            return new epng();
        }
        if (ordinal == 4) {
            return new epnf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epng.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
