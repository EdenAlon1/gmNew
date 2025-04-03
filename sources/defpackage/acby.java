package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acby extends eyfy implements eyht {
    public static final acby a;
    private static volatile eyhz f;
    public eygr b = emptyProtobufList();
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        acby acbyVar = new acby();
        a = acbyVar;
        eyfy.registerDefaultInstance(acby.class, acbyVar);
    }

    private acby() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"b", acbk.class, "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new acby();
        }
        if (ordinal == 4) {
            return new acbx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (acby.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
