package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esyw extends eyfy implements eyht {
    public static final esyw a;
    private static volatile eyhz k;
    public int b;
    public etau c;
    public String d = "";
    public eygr e;
    public int f;
    public String g;
    public String h;
    public boolean i;
    public eyja j;

    static {
        esyw esywVar = new esyw();
        a = esywVar;
        eyfy.registerDefaultInstance(esyw.class, esywVar);
    }

    private esyw() {
        emptyIntList();
        emptyIntList();
        eyfy.emptyProtobufList();
        this.e = eyfy.emptyProtobufList();
        this.g = "";
        this.h = "";
    }

    public final void a() {
        eygr eygrVar = this.e;
        if (eygrVar.c()) {
            return;
        }
        this.e = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0003ϧ\b\u0000\u0001\u0000\u0003Ȉ\u0006\u0004\u0007Ȉ\u000bȈ\fȚ\u000e\u0007\u0011ဉ\u0005ϧဉ\u0000", new Object[]{"b", "d", "f", "g", "h", "e", "i", "j", "c"});
        }
        if (ordinal == 3) {
            return new esyw();
        }
        if (ordinal == 4) {
            return new esyv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esyw.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
