package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class fbea extends eyfy implements eyht {
    public static final fbea a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public fbei d;

    static {
        fbea fbeaVar = new fbea();
        a = fbeaVar;
        eyfy.registerDefaultInstance(fbea.class, fbeaVar);
    }

    private fbea() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fbea();
        }
        if (ordinal == 4) {
            return new fbdz();
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
        synchronized (fbea.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
