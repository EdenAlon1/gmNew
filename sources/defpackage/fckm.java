package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fckm extends eyfy implements eyht {
    public static final fckm a;
    private static volatile eyhz b;

    static {
        fckm fckmVar = new fckm();
        a = fckmVar;
        eyfy.registerDefaultInstance(fckm.class, fckmVar);
    }

    private fckm() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new fckm();
        }
        if (ordinal == 4) {
            return new fckl();
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
        synchronized (fckm.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
