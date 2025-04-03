package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fams extends eyfy implements eyht {
    public static final fams a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        fams famsVar = new fams();
        a = famsVar;
        eyfy.registerDefaultInstance(fams.class, famsVar);
    }

    private fams() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", famh.class});
        }
        if (ordinal == 3) {
            return new fams();
        }
        if (ordinal == 4) {
            return new famr();
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
        synchronized (fams.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
