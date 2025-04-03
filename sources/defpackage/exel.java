package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exel extends eyfy implements eyht {
    public static final exel a;
    private static volatile eyhz f;
    public int b;
    public int c = 5;
    public exgs d;
    public exfi e;

    static {
        exel exelVar = new exel();
        a = exelVar;
        eyfy.registerDefaultInstance(exel.class, exelVar);
    }

    private exel() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", exfl.a, "d", "e"});
        }
        if (ordinal == 3) {
            return new exel();
        }
        if (ordinal == 4) {
            return new exek();
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
        synchronized (exel.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
