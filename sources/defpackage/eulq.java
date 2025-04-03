package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eulq extends eyfy implements eyht {
    public static final eulq a;
    private static volatile eyhz n;
    public int b;
    public Object d;
    public Object f;
    public boolean h;
    public eyee j;
    public int k;
    public long l;
    public eyee m;
    public int c = 0;
    public int e = 0;
    public String g = "";
    public eygr i = eyfy.emptyProtobufList();

    static {
        eulq eulqVar = new eulq();
        a = eulqVar;
        eyfy.registerDefaultInstance(eulq.class, eulqVar);
    }

    private eulq() {
        emptyIntList();
        this.j = eyee.b;
        this.m = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u000b\u0002\u0001\u0001\u000f\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u00027\u0000\u0003\u001a\u0005ည\u0002\u0007;\u0001\t᠌\u0005\n;\u0001\u000bဇ\u0001\rဎ\u0007\u000eည\b\u000f5\u0000", new Object[]{"d", "c", "f", "e", "b", "g", "i", "j", "k", eulp.a, "h", "l", "m"});
        }
        if (ordinal == 3) {
            return new eulq();
        }
        if (ordinal == 4) {
            return new eulo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = n;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eulq.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
