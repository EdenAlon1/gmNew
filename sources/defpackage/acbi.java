package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbi extends eyfy implements eyht {
    public static final acbi a;
    private static volatile eyhz g;
    public eygr b = emptyProtobufList();
    public String c = "";
    public String d = "";
    public String e = "";
    public long f;

    static {
        acbi acbiVar = new acbi();
        a = acbiVar;
        eyfy.registerDefaultInstance(acbi.class, acbiVar);
    }

    private acbi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0002", new Object[]{"b", acbk.class, "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new acbi();
        }
        if (ordinal == 4) {
            return new acbh();
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
        synchronized (acbi.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
