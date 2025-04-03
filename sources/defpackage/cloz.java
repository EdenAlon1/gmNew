package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cloz extends eyfy implements eyht {
    public static final cloz a;
    private static volatile eyhz h;
    public int b;
    public String c = "";
    public clqv d;
    public clqv e;
    public boolean f;
    public int g;

    static {
        cloz clozVar = new cloz();
        a = clozVar;
        eyfy.registerDefaultInstance(cloz.class, clozVar);
    }

    private cloz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", "g", clox.a});
        }
        if (ordinal == 3) {
            return new cloz();
        }
        if (ordinal == 4) {
            return new clow();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cloz.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
