package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epcg extends eyfy implements eyht {
    public static final epcg a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public int d;

    static {
        epcg epcgVar = new epcg();
        a = epcgVar;
        eyfy.registerDefaultInstance(epcg.class, epcgVar);
    }

    private epcg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", epcf.a});
        }
        if (ordinal == 3) {
            return new epcg();
        }
        if (ordinal == 4) {
            return new epce();
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
        synchronized (epcg.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
