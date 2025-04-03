package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epqw extends eyfy implements eyht {
    public static final epqw a;
    private static volatile eyhz d;
    public int b;
    public boolean c;

    static {
        epqw epqwVar = new epqw();
        a = epqwVar;
        eyfy.registerDefaultInstance(epqw.class, epqwVar);
    }

    private epqw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new epqw();
        }
        if (ordinal == 4) {
            return new epqv();
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
        synchronized (epqw.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
