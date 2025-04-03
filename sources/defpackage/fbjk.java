package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbjk extends eyfy implements eyht {
    public static final fbjk a;
    private static volatile eyhz d;
    public String b = "";
    public eygr c = emptyProtobufList();

    static {
        fbjk fbjkVar = new fbjk();
        a = fbjkVar;
        eyfy.registerDefaultInstance(fbjk.class, fbjkVar);
    }

    private fbjk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", fbjm.class});
        }
        if (ordinal == 3) {
            return new fbjk();
        }
        if (ordinal == 4) {
            return new fbjj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbjk.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
