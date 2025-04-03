package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epct extends eyfy implements eyht {
    public static final epct a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        epct epctVar = new epct();
        a = epctVar;
        eyfy.registerDefaultInstance(epct.class, epctVar);
    }

    private epct() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"b", "c", epcs.a, "d", epcr.a, "e"});
        }
        if (ordinal == 3) {
            return new epct();
        }
        if (ordinal == 4) {
            return new epcq();
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
        synchronized (epct.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
