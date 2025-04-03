package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emsj extends eyfy implements eyht {
    public static final emsj a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public eygr d = emptyProtobufList();
    public int e;
    public String f;
    public emsd g;
    public eygr h;
    private int j;

    static {
        emsj emsjVar = new emsj();
        a = emsjVar;
        eyfy.registerDefaultInstance(emsj.class, emsjVar);
    }

    private emsj() {
        emptyIntList();
        this.f = "";
        this.h = emptyProtobufList();
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
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0004\u0019\u0007\u0000\u0002\u0000\u0004\u000b\u0005\f\n\f\u000bဉ\u0001\f\u001b\u0010\u001b\u0019Ȉ", new Object[]{"j", "b", "c", "e", "g", "h", emtc.class, "d", emsh.class, "f"});
        }
        if (ordinal == 3) {
            return new emsj();
        }
        if (ordinal == 4) {
            return new emsb();
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
        synchronized (emsj.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
