package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capz extends eyfy implements eyht {
    public static final capz a;
    private static volatile eyhz g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public awui f;

    static {
        capz capzVar = new capz();
        a = capzVar;
        eyfy.registerDefaultInstance(capz.class, capzVar);
    }

    private capz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002;\u0000\u0003᠌\u0000\u0004ဉ\u0001", new Object[]{"d", "c", "b", capy.class, "e", eozm.a, "f"});
        }
        if (ordinal == 3) {
            return new capz();
        }
        if (ordinal == 4) {
            return new capw();
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
        synchronized (capz.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
