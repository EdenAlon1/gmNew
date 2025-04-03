package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epai extends eyfy implements eyht {
    public static final epai a;
    private static volatile eyhz f;
    public int b;
    public int d;
    public String c = "";
    public String e = "";

    static {
        epai epaiVar = new epai();
        a = epaiVar;
        eyfy.registerDefaultInstance(epai.class, epaiVar);
    }

    private epai() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", epah.a, "e"});
        }
        if (ordinal == 3) {
            return new epai();
        }
        if (ordinal == 4) {
            return new epag();
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
        synchronized (epai.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
