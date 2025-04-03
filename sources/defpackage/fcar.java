package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcar extends eyfy implements eyht {
    public static final fcar a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public boolean c;

    static {
        fcar fcarVar = new fcar();
        a = fcarVar;
        eyfy.registerDefaultInstance(fcar.class, fcarVar);
    }

    private fcar() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003\u0007", new Object[]{"b", fbzt.class, "c"});
        }
        if (ordinal == 3) {
            return new fcar();
        }
        if (ordinal == 4) {
            return new fcaq();
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
        synchronized (fcar.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
