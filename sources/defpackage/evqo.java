package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evqo extends eyfy implements eyht {
    public static final evqo a;
    private static volatile eyhz y;
    public int b;
    public evqs c;
    public evqs d;
    public evqs e;
    public evqs f;
    public evqs g;
    public evqs h;
    public evqs i;
    public evqs j;
    public evqs k;
    public evqs l;
    public evqs m;
    public int o;
    public boolean u;
    private byte z = 2;
    public String n = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String t = "";
    public eygr v = emptyProtobufList();
    public eygr w = emptyProtobufList();
    public String x = "";

    static {
        evqo evqoVar = new evqo();
        a = evqoVar;
        eyfy.registerDefaultInstance(evqo.class, evqoVar);
    }

    private evqo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.z);
            case 1:
                this.z = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0016\u0000\u0001\u0001\u001c\u0016\u0000\u0002\u0003\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tᔈ\u0011\nင\u0012\u000bဈ\u0013\rဈ\u0016\u000fဈ\u0017\u0010ဈ\u0018\u0011ဈ\u0014\u0012ဇ\u0019\u0013Л\u0014Л\u0015ဉ\b\u0017ဈ\u001b\u0019ဉ\t\u001cဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "n", "o", "p", "r", "s", "t", "q", "u", "v", evqh.class, "w", evqh.class, "k", "x", "l", "m"});
            case 3:
                return new evqo();
            case 4:
                return new evqn();
            case 5:
                return a;
            case 6:
                eyhz eyhzVar2 = y;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (evqo.class) {
                    eyhzVar = y;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        y = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
