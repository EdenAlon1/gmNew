package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fckq extends eyfy implements eyht {
    public static final fckq a;
    private static volatile eyhz b;
    private int c;
    private fcey d;

    static {
        fckq fckqVar = new fckq();
        a = fckqVar;
        eyfy.registerDefaultInstance(fckq.class, fckqVar);
    }

    private fckq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "d"});
        }
        if (ordinal == 3) {
            return new fckq();
        }
        if (ordinal == 4) {
            return new fckp();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fckq.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
