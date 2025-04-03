package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alkj extends eyfy implements eyht {
    public static final eygj a = new alkh();
    public static final alkj b;
    private static volatile eyhz h;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public eygi g = emptyIntList();

    static {
        alkj alkjVar = new alkj();
        b = alkjVar;
        eyfy.registerDefaultInstance(alkj.class, alkjVar);
    }

    private alkj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ࠬ", new Object[]{"c", "d", "e", "f", "g", alkk.a});
        }
        if (ordinal == 3) {
            return new alkj();
        }
        if (ordinal == 4) {
            return new alki();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (alkj.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
