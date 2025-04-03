package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fglg extends eyfy implements eyht {
    public static final fglg a;
    private static volatile eyhz f;
    public int b;
    public eygr c = emptyProtobufList();
    public eygr d = emptyProtobufList();
    public fgle e;

    static {
        fglg fglgVar = new fglg();
        a = fglgVar;
        eyfy.registerDefaultInstance(fglg.class, fglgVar);
    }

    private fglg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"b", "c", fglm.class, "d", fglc.class, "e"});
        }
        if (ordinal == 3) {
            return new fglg();
        }
        if (ordinal == 4) {
            return new fglf();
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
        synchronized (fglg.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
