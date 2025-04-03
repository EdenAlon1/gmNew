package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emro extends eyfy implements eyht {
    public static final emro a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        emro emroVar = new emro();
        a = emroVar;
        eyfy.registerDefaultInstance(emro.class, emroVar);
    }

    private emro() {
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0001\u0000\u0005\u001b", new Object[]{"b", emrq.class});
        }
        if (ordinal == 3) {
            return new emro();
        }
        if (ordinal == 4) {
            return new emrn();
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
        synchronized (emro.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
