package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awvt extends eyfy implements eyht {
    public static final eygj a = new awvq();
    public static final eygj b = new awvr();
    public static final awvt c;
    private static volatile eyhz u;
    public int d;
    public boolean k;
    public boolean m;
    public awui o;
    public awxf p;
    public awvn q;
    public awui r;
    public axaf s;
    public awvv t;
    public String e = "";
    public String f = "";
    public eygr g = emptyProtobufList();
    public eygr h = emptyProtobufList();
    public eygi i = emptyIntList();
    public eygi j = emptyIntList();
    public String l = "";
    public String n = "";

    static {
        awvt awvtVar = new awvt();
        c = awvtVar;
        eyfy.registerDefaultInstance(awvt.class, awvtVar);
    }

    private awvt() {
    }

    public final void a() {
        eygr eygrVar = this.g;
        if (eygrVar.c()) {
            return;
        }
        this.g = eyfy.mutableCopy(eygrVar);
    }

    public final void b() {
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
            eygg eyggVar = awvg.a;
            return newMessageInfo(c, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0004\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ࠞ\u0005ࠞ\u0006ဇ\u0002\u0007ဈ\u0003\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\fဇ\u0004\rဈ\u0005\u000eဈ\u0001\u000fဉ\n\u0010ဉ\u000b", new Object[]{"d", "e", "g", awui.class, "h", awui.class, "i", eyggVar, "j", eyggVar, "k", "l", "o", "p", "q", "r", "m", "n", "f", "s", "t"});
        }
        if (ordinal == 3) {
            return new awvt();
        }
        if (ordinal == 4) {
            return new awvs();
        }
        if (ordinal == 5) {
            return c;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = u;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (awvt.class) {
            eyhzVar = u;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(c);
                u = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
