package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emku extends eyfy implements eyht {
    public static final emku a;
    private static volatile eyhz e;
    public boolean b = true;
    public boolean c = true;
    public boolean d = true;
    private int f;

    static {
        emku emkuVar = new emku();
        a = emkuVar;
        eyfy.registerDefaultInstance(emku.class, emkuVar);
    }

    private emku() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new emku();
        }
        if (ordinal == 4) {
            return new emkt();
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
        synchronized (emku.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
