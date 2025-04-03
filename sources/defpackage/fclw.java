package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fclw extends eyfy implements eyht {
    public static final fclw a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public int c;

    static {
        fclw fclwVar = new fclw();
        a = fclwVar;
        eyfy.registerDefaultInstance(fclw.class, fclwVar);
    }

    private fclw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"b", fcek.class, "c"});
        }
        if (ordinal == 3) {
            return new fclw();
        }
        if (ordinal == 4) {
            return new fclv();
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
        synchronized (fclw.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
