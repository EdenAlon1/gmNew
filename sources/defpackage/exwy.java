package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exwy extends eyfy implements eyht {
    public static final exwy a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        exwy exwyVar = new exwy();
        a = exwyVar;
        eyfy.registerDefaultInstance(exwy.class, exwyVar);
    }

    private exwy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", exxb.class});
        }
        if (ordinal == 3) {
            return new exwy();
        }
        if (ordinal == 4) {
            return new exwx();
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
        synchronized (exwy.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
