package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exst extends eyfy implements eyht {
    public static final exst a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public exrk d;
    public String e = "";

    static {
        exst exstVar = new exst();
        a = exstVar;
        eyfy.registerDefaultInstance(exst.class, exstVar);
    }

    private exst() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0005ဈ\u0003", new Object[]{"b", "c", exqf.a, "d", "e"});
        }
        if (ordinal == 3) {
            return new exst();
        }
        if (ordinal == 4) {
            return new exss();
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
        synchronized (exst.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
