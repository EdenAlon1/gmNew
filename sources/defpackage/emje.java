package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emje extends eyfy implements eyht {
    public static final emje a;
    private static volatile eyhz c;
    public boolean b = true;
    private int d;

    static {
        emje emjeVar = new emje();
        a = emjeVar;
        eyfy.registerDefaultInstance(emje.class, emjeVar);
    }

    private emje() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new emje();
        }
        if (ordinal == 4) {
            return new emjd();
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
        synchronized (emje.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
