package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erzg extends eyfy implements eyht {
    public static final erzg a;
    private static volatile eyhz p;
    public int b;
    public int c;
    public String d = "";
    public String e;
    public long f;
    public esbq g;
    public eyee h;
    public boolean i;
    public String j;
    public boolean k;
    public eyee l;
    public eyee m;
    public long n;
    public String o;

    static {
        erzg erzgVar = new erzg();
        a = erzgVar;
        eyfy.registerDefaultInstance(erzg.class, erzgVar);
    }

    private erzg() {
        eyee eyeeVar = eyee.b;
        this.e = "";
        eyee eyeeVar2 = eyee.b;
        this.h = eyeeVar2;
        this.j = "";
        this.l = eyeeVar2;
        this.m = eyeeVar2;
        this.o = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0004Ȉ\u0005\u0002\u0006ဉ\u0000\u0007\n\b\u0007\tȈ\n\u0007\u000b\n\f\n\r\u0002\u000eȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        }
        if (ordinal == 3) {
            return new erzg();
        }
        if (ordinal == 4) {
            return new erze();
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
        synchronized (erzg.class) {
            eyhzVar = p;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                p = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
