package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elzf extends eyfy implements eyht {
    public static final elzf a;
    private static volatile eyhz g;
    public emag e;
    private int h;
    public String b = "";
    public String c = "";
    public eygr d = emptyProtobufList();
    public eygr f = emptyProtobufList();

    static {
        elzf elzfVar = new elzf();
        a = elzfVar;
        eyfy.registerDefaultInstance(elzf.class, elzfVar);
    }

    private elzf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\b\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0004\u001b\u0006ဉ\u0001\b\u001b", new Object[]{"h", "b", "c", "d", elzi.class, "e", "f", emae.class});
        }
        if (ordinal == 3) {
            return new elzf();
        }
        if (ordinal == 4) {
            return new elze();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (elzf.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
