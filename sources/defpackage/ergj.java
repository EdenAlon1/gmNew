package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergj extends eyfy implements eyht {
    public static final ergj a;
    private static volatile eyhz r;
    public int b;
    public int c;
    public erfh e;
    public ergy f;
    public ergt g;
    public ergq h;
    public erfv i;
    public boolean j;
    public String k;
    public int l;
    public String m;
    public int n;
    public int o;
    public ezoi p;
    public boolean q;
    private erfl s;
    private erfz t;
    private byte u = 2;
    public int d = 1;

    static {
        ergj ergjVar = new ergj();
        a = ergjVar;
        eyfy.registerDefaultInstance(ergj.class, ergjVar);
    }

    private ergj() {
        emptyProtobufList();
        emptyProtobufList();
        this.k = "";
        this.m = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0002\u0001&\u0010\u0000\u0000\u0003\u0001᠌\u0001\u0002ဉ\u0002\u0003ᐉ\u0003\u0005ᐉ\u0006\bᐉ\b\fဉ\t\u000eဉ\n\u0018ဉ\u0017\u001bဇ\u0018\u001eဈ\u001b ᠌\u001d!ဈ\u001e\"᠌\u001f#᠌ $ဉ!&ဇ#", new Object[]{"b", "c", "d", ergf.a, "e", "s", "f", "t", "g", "h", "i", "j", "k", "l", ergi.a, "m", "n", ergh.a, "o", ergg.a, "p", "q"});
            case 3:
                return new ergj();
            case 4:
                return new erge();
            case 5:
                return a;
            case 6:
                eyhz eyhzVar2 = r;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ergj.class) {
                    eyhzVar = r;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        r = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
