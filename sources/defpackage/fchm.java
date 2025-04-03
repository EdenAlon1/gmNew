package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fchm extends eyfy implements eyht {
    public static final fchm a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        fchm fchmVar = new fchm();
        a = fchmVar;
        eyfy.registerDefaultInstance(fchm.class, fchmVar);
    }

    private fchm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"b", fcho.class});
        }
        if (ordinal == 3) {
            return new fchm();
        }
        if (ordinal == 4) {
            return new fchl();
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
        synchronized (fchm.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
