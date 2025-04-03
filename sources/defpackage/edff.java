package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edff extends eyfy implements eyht {
    public static final edff a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        edff edffVar = new edff();
        a = edffVar;
        eyfy.registerDefaultInstance(edff.class, edffVar);
    }

    private edff() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", edfq.class});
        }
        if (ordinal == 3) {
            return new edff();
        }
        if (ordinal == 4) {
            return new edfe();
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
        synchronized (edff.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
