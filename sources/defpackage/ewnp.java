package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewnp extends eyfy implements eyht {
    public static final ewnp a;
    private static volatile eyhz i;
    public int c;
    public ewmw d;
    public eygr h;
    private int j;
    public String b = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        ewnp ewnpVar = new ewnp();
        a = ewnpVar;
        eyfy.registerDefaultInstance(ewnp.class, ewnpVar);
    }

    private ewnp() {
        eyfy.emptyProtobufList();
        eyfy.emptyProtobufList();
        this.h = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u0013\u0007\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0006Ȉ\u0007Ȉ\bȈ\u0011\u001b\u0013ဉ\u0001", new Object[]{"j", "b", "c", "e", "f", "g", "h", ewnk.class, "d"});
        }
        if (ordinal == 3) {
            return new ewnp();
        }
        if (ordinal == 4) {
            return new ewnn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewnp.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
