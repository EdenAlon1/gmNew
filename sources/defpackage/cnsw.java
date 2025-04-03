package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnsw extends eyfy implements eyht {
    public static final cnsw a;
    private static volatile eyhz h;
    public int b;
    public cnso c;
    public eygr d = emptyProtobufList();
    public eyja e;
    public cnue f;
    public int g;

    static {
        cnsw cnswVar = new cnsw();
        a = cnswVar;
        eyfy.registerDefaultInstance(cnsw.class, cnswVar);
    }

    private cnsw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဌ\u0003", new Object[]{"b", "c", "d", cnsv.class, "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new cnsw();
        }
        if (ordinal == 4) {
            return new cnst();
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
        synchronized (cnsw.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
