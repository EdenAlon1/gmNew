package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyhf extends eyfy implements eyht {
    public static final eyhf a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        eyhf eyhfVar = new eyhf();
        a = eyhfVar;
        eyfy.registerDefaultInstance(eyhf.class, eyhfVar);
    }

    private eyhf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eyjq.class});
        }
        if (ordinal == 3) {
            return new eyhf();
        }
        if (ordinal == 4) {
            return new eyhe();
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
        synchronized (eyhf.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
