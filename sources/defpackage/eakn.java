package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eakn extends eyfy implements eyht {
    public static final eygj a = new eakl();
    public static final eakn b;
    private static volatile eyhz d;
    public eygi c = emptyIntList();

    static {
        eakn eaknVar = new eakn();
        b = eaknVar;
        eyfy.registerDefaultInstance(eakn.class, eaknVar);
    }

    private eakn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"c", exyc.a});
        }
        if (ordinal == 3) {
            return new eakn();
        }
        if (ordinal == 4) {
            return new eakm();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eakn.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
