package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cetw extends eyfy implements eyht {
    public static final cetw a;
    private static volatile eyhz b;

    static {
        cetw cetwVar = new cetw();
        a = cetwVar;
        eyfy.registerDefaultInstance(cetw.class, cetwVar);
    }

    private cetw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (ordinal == 3) {
            return new cetw();
        }
        if (ordinal == 4) {
            return new cetv();
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
        synchronized (cetw.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
