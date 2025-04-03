package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eorl extends eyfy implements eyht {
    public static final eorl a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;

    static {
        eorl eorlVar = new eorl();
        a = eorlVar;
        eyfy.registerDefaultInstance(eorl.class, eorlVar);
    }

    private eorl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005᠌\u0004", new Object[]{"b", "c", eork.a, "d", "e", "f", "g", eorj.a});
        }
        if (ordinal == 3) {
            return new eorl();
        }
        if (ordinal == 4) {
            return new eori();
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
        synchronized (eorl.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
