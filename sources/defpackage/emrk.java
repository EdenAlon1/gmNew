package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emrk extends eyfy implements eyht {
    public static final emrk a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        emrk emrkVar = new emrk();
        a = emrkVar;
        eyfy.registerDefaultInstance(emrk.class, emrkVar);
    }

    private emrk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", emri.class});
        }
        if (ordinal == 3) {
            return new emrk();
        }
        if (ordinal == 4) {
            return new emrj();
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
        synchronized (emrk.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
