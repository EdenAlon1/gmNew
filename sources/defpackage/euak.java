package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euak extends eyfy implements eyht {
    public static final euak a;
    private static volatile eyhz f;
    public int b;
    public euam c;
    public int d;
    public eyee e = eyee.b;

    static {
        euak euakVar = new euak();
        a = euakVar;
        eyfy.registerDefaultInstance(euak.class, euakVar);
    }

    private euak() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new euak();
        }
        if (ordinal == 4) {
            return new euaj();
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
        synchronized (euak.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
