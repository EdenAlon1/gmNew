package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqxw extends eyfy implements eyht {
    public static final eqxw a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public int f;
    public boolean g;

    static {
        eqxw eqxwVar = new eqxw();
        a = eqxwVar;
        eyfy.registerDefaultInstance(eqxw.class, eqxwVar);
    }

    private eqxw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005ဇ\u0004", new Object[]{"b", "c", eqxv.a, "d", "e", "f", eqwe.a, "g"});
        }
        if (ordinal == 3) {
            return new eqxw();
        }
        if (ordinal == 4) {
            return new eqxu();
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
        synchronized (eqxw.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
