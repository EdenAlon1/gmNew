package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhx extends eyfy implements eyht {
    public static final cvhx a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        cvhx cvhxVar = new cvhx();
        a = cvhxVar;
        eyfy.registerDefaultInstance(cvhx.class, cvhxVar);
    }

    private cvhx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", cvgp.class});
        }
        if (ordinal == 3) {
            return new cvhx();
        }
        if (ordinal == 4) {
            return new cvhw();
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
        synchronized (cvhx.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
