package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fahu extends eyfy implements eyht {
    public static final fahu a;
    private static volatile eyhz d;
    public eyev b;
    public eyev c;
    private int e;

    static {
        fahu fahuVar = new fahu();
        a = fahuVar;
        eyfy.registerDefaultInstance(fahu.class, fahuVar);
    }

    private fahu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new fahu();
        }
        if (ordinal == 4) {
            return new faht();
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
        synchronized (fahu.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
