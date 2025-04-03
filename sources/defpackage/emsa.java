package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emsa extends eyfy implements eyht {
    public static final emsa a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        emsa emsaVar = new emsa();
        a = emsaVar;
        eyfy.registerDefaultInstance(emsa.class, emsaVar);
    }

    private emsa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", emrz.class});
        }
        if (ordinal == 3) {
            return new emsa();
        }
        if (ordinal == 4) {
            return new emrx();
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
        synchronized (emsa.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
