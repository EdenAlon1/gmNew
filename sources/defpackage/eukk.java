package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eukk extends eyfy implements eyht {
    public static final eukk a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        eukk eukkVar = new eukk();
        a = eukkVar;
        eyfy.registerDefaultInstance(eukk.class, eukkVar);
    }

    private eukk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u001b", new Object[]{"b", euka.class});
        }
        if (ordinal == 3) {
            return new eukk();
        }
        if (ordinal == 4) {
            return new eukj();
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
        synchronized (eukk.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
