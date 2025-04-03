package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etac extends eyfy implements eyht {
    public static final etac a;
    private static volatile eyhz h;
    public int b;
    public long d;
    public eygr g;
    public String c = "";
    public String e = "";
    public eygr f = eyfy.emptyProtobufList();

    static {
        etac etacVar = new etac();
        a = etacVar;
        eyfy.registerDefaultInstance(etac.class, etacVar);
    }

    private etac() {
        eyfy.emptyProtobufList();
        this.g = eyfy.emptyProtobufList();
        emptyIntList();
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
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u000e\u0006\u0000\u0002\u0000\u0001\f\u0002Ȉ\u0004\u0003\u0005Ȉ\bȚ\u000eȚ", new Object[]{"b", "c", "d", "e", "g", "f"});
        }
        if (ordinal == 3) {
            return new etac();
        }
        if (ordinal == 4) {
            return new etaa();
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
        synchronized (etac.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
