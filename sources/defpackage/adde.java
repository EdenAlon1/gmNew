package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adde extends eyfy implements eyht {
    public static final adde a;
    private static volatile eyhz h;
    public long b;
    public int c;
    public String d = "";
    public String e = "";
    public eygr f = emptyProtobufList();
    public String g = "";

    static {
        adde addeVar = new adde();
        a = addeVar;
        eyfy.registerDefaultInstance(adde.class, addeVar);
    }

    private adde() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0002\u0002\u0004\u0003Ȉ\u0004Ȉ\u0005\u001b\u0006Ȉ", new Object[]{"b", "c", "d", "e", "f", adco.class, "g"});
        }
        if (ordinal == 3) {
            return new adde();
        }
        if (ordinal == 4) {
            return new addd();
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
        synchronized (adde.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
