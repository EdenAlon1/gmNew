package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etxv extends eyfy implements eyht {
    public static final etxv a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public etxr d;
    public eyee e = eyee.b;
    public eyee f = eyee.b;

    static {
        etxv etxvVar = new etxv();
        a = etxvVar;
        eyfy.registerDefaultInstance(etxv.class, etxvVar);
    }

    private etxv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new etxv();
        }
        if (ordinal == 4) {
            return new etxu();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (etxv.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
