package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezwi extends eyfy implements eyht {
    public static final ezwi a;
    private static volatile eyhz d;
    public int b;
    public ezwf c;
    private int e;

    static {
        ezwi ezwiVar = new ezwi();
        a = ezwiVar;
        eyfy.registerDefaultInstance(ezwi.class, ezwiVar);
    }

    private ezwi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"e", "b", ezia.a, "c"});
        }
        if (ordinal == 3) {
            return new ezwi();
        }
        if (ordinal == 4) {
            return new ezwh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezwi.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
