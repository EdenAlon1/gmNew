package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ruu extends eyfy implements eyht {
    public static final ruu a;
    private static volatile eyhz c;
    public ruo b;
    private int d;

    static {
        ruu ruuVar = new ruu();
        a = ruuVar;
        eyfy.registerDefaultInstance(ruu.class, ruuVar);
    }

    private ruu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new ruu();
        }
        if (ordinal == 4) {
            return new rut();
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
        synchronized (ruu.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
