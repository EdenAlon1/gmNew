package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewnm extends eyfy implements eyht {
    public static final ewnm a;
    private static volatile eyhz f;
    public eygr b = eyfy.emptyProtobufList();
    public eygr c = eyfy.emptyProtobufList();
    public eygr d = eyfy.emptyProtobufList();
    public eygr e = eyfy.emptyProtobufList();

    static {
        ewnm ewnmVar = new ewnm();
        a = ewnmVar;
        eyfy.registerDefaultInstance(ewnm.class, ewnmVar);
    }

    private ewnm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0004\u0007\u0004\u0000\u0004\u0000\u0004Ț\u0005Ț\u0006Ț\u0007Ț", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ewnm();
        }
        if (ordinal == 4) {
            return new ewnl();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewnm.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
