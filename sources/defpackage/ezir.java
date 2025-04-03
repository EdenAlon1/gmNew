package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezir extends eyfy implements eyht {
    public static final ezir a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public String g = "";

    static {
        ezir ezirVar = new ezir();
        a = ezirVar;
        eyfy.registerDefaultInstance(ezir.class, ezirVar);
    }

    private ezir() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", ezim.a, "f", ezio.a, "g"});
        }
        if (ordinal == 3) {
            return new ezir();
        }
        if (ordinal == 4) {
            return new eziq();
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
        synchronized (ezir.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
