package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewnk extends eyfy implements eyht {
    public static final ewnk a;
    private static volatile eyhz i;
    public int b;
    public int d;
    public ewmw e;
    public ewmw f;
    public ewmw g;
    public String c = "";
    public String h = "";

    static {
        ewnk ewnkVar = new ewnk();
        a = ewnkVar;
        eyfy.registerDefaultInstance(ewnk.class, ewnkVar);
    }

    private ewnk() {
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
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u000bဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "h", "g"});
        }
        if (ordinal == 3) {
            return new ewnk();
        }
        if (ordinal == 4) {
            return new ewnj();
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
        synchronized (ewnk.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
