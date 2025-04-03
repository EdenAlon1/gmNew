package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fatf extends eyfy implements eyht {
    public static final fatf a;
    private static volatile eyhz h;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public fata g;

    static {
        fatf fatfVar = new fatf();
        a = fatfVar;
        eyfy.registerDefaultInstance(fatf.class, fatfVar);
    }

    private fatf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\f\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fatf();
        }
        if (ordinal == 4) {
            return new fatd();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fatf.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
