package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceml extends eyfy implements eyht {
    public static final ceml a;
    private static volatile eyhz d;
    public int b;
    public long c;

    static {
        ceml cemlVar = new ceml();
        a = cemlVar;
        eyfy.registerDefaultInstance(ceml.class, cemlVar);
    }

    private ceml() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0002", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ceml();
        }
        if (ordinal == 4) {
            return new cemk();
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
        synchronized (ceml.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
