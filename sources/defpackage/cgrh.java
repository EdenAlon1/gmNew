package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgrh extends eyfy implements eyht {
    public static final cgrh a;
    private static volatile eyhz c;
    public eygr b = eyfy.emptyProtobufList();

    static {
        cgrh cgrhVar = new cgrh();
        a = cgrhVar;
        eyfy.registerDefaultInstance(cgrh.class, cgrhVar);
    }

    private cgrh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new cgrh();
        }
        if (ordinal == 4) {
            return new cgrg();
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
        synchronized (cgrh.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
