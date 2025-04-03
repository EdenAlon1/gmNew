package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rug extends eyfy implements eyht {
    public static final rug a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        rug rugVar = new rug();
        a = rugVar;
        eyfy.registerDefaultInstance(rug.class, rugVar);
    }

    private rug() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ewfc.class});
        }
        if (ordinal == 3) {
            return new rug();
        }
        if (ordinal == 4) {
            return new ruf();
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
        synchronized (rug.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
