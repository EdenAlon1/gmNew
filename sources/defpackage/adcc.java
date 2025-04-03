package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcc extends eyfy implements eyht {
    public static final adcc a;
    private static volatile eyhz c;
    public eygl b = emptyLongList();

    static {
        adcc adccVar = new adcc();
        a = adccVar;
        eyfy.registerDefaultInstance(adcc.class, adccVar);
    }

    private adcc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new adcc();
        }
        if (ordinal == 4) {
            return new adcb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (adcc.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
