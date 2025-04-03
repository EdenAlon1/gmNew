package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbnf extends eyfy implements eyht {
    public static final fbnf a;
    private static volatile eyhz h;
    public int b;
    public fbnr d;
    public boolean g;
    public String c = "";
    public eygr e = emptyProtobufList();
    public eygr f = emptyProtobufList();

    static {
        fbnf fbnfVar = new fbnf();
        a = fbnfVar;
        eyfy.registerDefaultInstance(fbnf.class, fbnfVar);
    }

    private fbnf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004\u001b\u0005\u0007", new Object[]{"b", "c", "d", "e", fbnp.class, "f", fbnh.class, "g"});
        }
        if (ordinal == 3) {
            return new fbnf();
        }
        if (ordinal == 4) {
            return new fbne();
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
        synchronized (fbnf.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
