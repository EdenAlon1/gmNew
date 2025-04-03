package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbip extends eyfy implements eyht {
    public static final fbip a;
    private static volatile eyhz l;
    public int b;
    public fbim d;
    public fbig e;
    public fbia i;
    public fbji j;
    public eyhm f = eyhm.a;
    public String c = "";
    public eygr g = emptyProtobufList();
    public eygr h = emptyProtobufList();
    public String k = "";

    static {
        fbip fbipVar = new fbip();
        a = fbipVar;
        eyfy.registerDefaultInstance(fbip.class, fbipVar);
    }

    private fbip() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\n\t\u0001\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u00042\u0006\u001b\u0007\u001b\bဉ\u0002\tဉ\u0003\nȈ", new Object[]{"b", "c", "d", "e", "f", fbio.a, "g", fbiu.class, "h", fbiu.class, "i", "j", "k"});
        }
        if (ordinal == 3) {
            return new fbip();
        }
        if (ordinal == 4) {
            return new fbin();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbip.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
