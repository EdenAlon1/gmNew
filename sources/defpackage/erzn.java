package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erzn extends eyfy implements eyht {
    public static final erzn a;
    private static volatile eyhz x;
    public int b;
    public erve f;
    public erzz g;
    public long h;
    public erzp i;
    public int l;
    public erzr m;
    public boolean o;
    public boolean p;
    public int q;
    public boolean s;
    public ajso t;
    public erzm u;
    public esof v;
    public esoj w;
    public String c = "";
    public String d = "";
    public String e = "";
    public String j = "";
    public eygr k = emptyProtobufList();
    public String n = "";
    public eygr r = emptyProtobufList();

    static {
        erzn erznVar = new erzn();
        a = erznVar;
        eyfy.registerDefaultInstance(erzn.class, erznVar);
    }

    private erzn() {
    }

    public final void a() {
        eygr eygrVar = this.k;
        if (eygrVar.c()) {
            return;
        }
        this.k = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0015\u0000\u0001\u0001\u0018\u0015\u0000\u0002\u0000\u0001Ȉ\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u0002\u0006ဉ\u0003\u0007Ȉ\tȈ\n\u001b\u000b\f\fȈ\rဉ\u0004\u000eȈ\u000f\u0007\u0010\u0007\u0012\f\u0013\u001b\u0014\u0007\u0015ဉ\u0006\u0016ဉ\u0007\u0017ဉ\b\u0018ဉ\t", new Object[]{"b", "c", "f", "g", "h", "i", "j", "e", "k", erzk.class, "l", "d", "m", "n", "o", "p", "q", "r", esbc.class, "s", "t", "u", "v", "w"});
        }
        if (ordinal == 3) {
            return new erzn();
        }
        if (ordinal == 4) {
            return new erzd();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = x;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (erzn.class) {
            eyhzVar = x;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                x = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
