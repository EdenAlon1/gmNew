package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdab extends eyfy implements eyht {
    public static final fdab a;
    private static volatile eyhz e;
    public eygr b = eyfy.emptyProtobufList();
    public eygr c = eyfy.emptyProtobufList();
    public String d = "";
    private int f;

    static {
        fdab fdabVar = new fdab();
        a = fdabVar;
        eyfy.registerDefaultInstance(fdab.class, fdabVar);
    }

    private fdab() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002Ț\u0003Ț\u0004ለ\u0001", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fdab();
        }
        if (ordinal == 4) {
            return new fdaa();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fdab.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
