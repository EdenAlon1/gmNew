package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esmn extends eyfy implements eyht {
    public static final esmn a;
    private static volatile eyhz b;

    static {
        esmn esmnVar = new esmn();
        a = esmnVar;
        eyfy.registerDefaultInstance(esmn.class, esmnVar);
    }

    private esmn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (ordinal == 3) {
            return new esmn();
        }
        if (ordinal == 4) {
            return new esmm();
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
        synchronized (esmn.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
