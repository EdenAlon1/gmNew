package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbgc extends eyfy implements eyht {
    public static final fbgc a;
    private static volatile eyhz g;
    public int e;
    public String b = "";
    public String c = "";
    public eygr d = emptyProtobufList();
    public String f = "";

    static {
        fbgc fbgcVar = new fbgc();
        a = fbgcVar;
        eyfy.registerDefaultInstance(fbgc.class, fbgcVar);
    }

    private fbgc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004\u001b\u0005\f\u0007Ȉ", new Object[]{"b", "c", "d", fbga.class, "e", "f"});
        }
        if (ordinal == 3) {
            return new fbgc();
        }
        if (ordinal == 4) {
            return new fbgb();
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
        synchronized (fbgc.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
