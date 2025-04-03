package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbfr extends eyfy implements eyht {
    public static final fbfr a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public String c = "";

    static {
        fbfr fbfrVar = new fbfr();
        a = fbfrVar;
        eyfy.registerDefaultInstance(fbfr.class, fbfrVar);
    }

    private fbfr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003Ȉ", new Object[]{"b", fbhy.class, "c"});
        }
        if (ordinal == 3) {
            return new fbfr();
        }
        if (ordinal == 4) {
            return new fbfq();
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
        synchronized (fbfr.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
