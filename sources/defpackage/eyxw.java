package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyxw extends eyfy implements eyht {
    public static final eyxw a;
    private static volatile eyhz f;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        eyxw eyxwVar = new eyxw();
        a = eyxwVar;
        eyfy.registerDefaultInstance(eyxw.class, eyxwVar);
    }

    private eyxw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new eyxw();
        }
        if (ordinal == 4) {
            return new eyxv();
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
        synchronized (eyxw.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
