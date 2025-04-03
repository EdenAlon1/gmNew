package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ereq extends eyfy implements eyht {
    public static final ereq a;
    private static volatile eyhz m;
    public int b;
    public Object d;
    public eyee f;
    public eyee g;
    public erec h;
    public erem i;
    public erex j;
    public eree k;
    public erei l;
    public int c = 0;
    public eyee e = eyee.b;

    static {
        ereq ereqVar = new ereq();
        a = ereqVar;
        eyfy.registerDefaultInstance(ereq.class, ereqVar);
    }

    private ereq() {
        eyee eyeeVar = eyee.b;
        this.f = eyeeVar;
        this.g = eyeeVar;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004<\u0000\u0006<\u0000\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005\nဉ\u0007\u000bဉ\u0006", new Object[]{"d", "c", "b", "e", "f", "g", erdw.class, erff.class, "h", "i", "j", "l", "k"});
        }
        if (ordinal == 3) {
            return new ereq();
        }
        if (ordinal == 4) {
            return new ereo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = m;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ereq.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
