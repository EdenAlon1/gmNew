package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvw extends eyfy implements eyht {
    public static final tvw a;
    private static volatile eyhz c;
    public int b;

    static {
        tvw tvwVar = new tvw();
        a = tvwVar;
        eyfy.registerDefaultInstance(tvw.class, tvwVar);
    }

    private tvw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new tvw();
        }
        if (ordinal == 4) {
            return new tvv();
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
        synchronized (tvw.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
