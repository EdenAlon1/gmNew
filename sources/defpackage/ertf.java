package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ertf extends eyfy implements eyht {
    public static final ertf a;
    private static volatile eyhz d;
    public String b = "";
    public String c = "";

    static {
        ertf ertfVar = new ertf();
        a = ertfVar;
        eyfy.registerDefaultInstance(ertf.class, ertfVar);
    }

    private ertf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0004\u0005\u0002\u0000\u0000\u0000\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ertf();
        }
        if (ordinal == 4) {
            return new erte();
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
        synchronized (ertf.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
