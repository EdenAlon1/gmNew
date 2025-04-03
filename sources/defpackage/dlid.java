package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlid extends eyfy implements eyht {
    public static final dlid a;
    private static volatile eyhz o;
    public int b;
    public long c;
    public long d;
    public eyja e;
    public eyee f = eyee.b;
    public eyee g;
    public long h;
    public long i;
    public boolean j;
    public eyee k;
    public boolean l;
    public String m;
    public boolean n;

    static {
        dlid dlidVar = new dlid();
        a = dlidVar;
        eyfy.registerDefaultInstance(dlid.class, dlidVar);
    }

    private dlid() {
        eyee eyeeVar = eyee.b;
        this.g = eyeeVar;
        this.k = eyeeVar;
        this.m = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ည\u0003\u0005ဂ\u0005\u0006ဂ\u0006\u0007ည\u0004\nဇ\u0007\u000bည\b\fဇ\t\rဈ\n\u000eဇ\u000b", new Object[]{"b", "c", "d", "e", "f", "h", "i", "g", "j", "k", "l", "m", "n"});
        }
        if (ordinal == 3) {
            return new dlid();
        }
        if (ordinal == 4) {
            return new dlic();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = o;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dlid.class) {
            eyhzVar = o;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                o = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
