package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eszz extends eyfy implements eyht {
    public static final eszz a;
    private static volatile eyhz p;
    public int b;
    public int e;
    public eszh f;
    public etao i;
    public long j;
    public eyja n;
    public eyja o;
    public eyhm g = eyhm.a;
    public String c = "";
    public String d = "";
    public eygr h = eyfy.emptyProtobufList();
    public String k = "";
    public String l = "";
    public String m = "";

    static {
        eszz eszzVar = new eszz();
        a = eszzVar;
        eyfy.registerDefaultInstance(eszz.class, eszzVar);
    }

    private eszz() {
    }

    public final void a() {
        eygr eygrVar = this.h;
        if (eygrVar.c()) {
            return;
        }
        this.h = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\r\u0000\u0001\u0001\u0011\r\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004ဉ\u0000\u00062\u0007ဉ\u0002\b\u0003\tȈ\nȈ\u000bȈ\u000eဉ\u0005\u0010Ț\u0011ဉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", eszx.a, "i", "j", "k", "l", "m", "n", "h", "o"});
        }
        if (ordinal == 3) {
            return new eszz();
        }
        if (ordinal == 4) {
            return new eszy();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = p;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eszz.class) {
            eyhzVar = p;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                p = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
