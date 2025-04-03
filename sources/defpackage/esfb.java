package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esfb extends eyfy implements eyht {
    public static final esfb a;
    private static volatile eyhz l;
    public Object c;
    public long d;
    public long e;
    public long f;
    public long h;
    public int i;
    public int b = 0;
    public String g = "";
    public String j = "";
    public String k = "";

    static {
        esfb esfbVar = new esfb();
        a = esfbVar;
        eyfy.registerDefaultInstance(esfb.class, esfbVar);
    }

    private esfb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\f\u0007<\u0000\bȈ\t<\u0000\n<\u0000\u000bȈ", new Object[]{"c", "b", "d", "e", "f", "g", "h", "i", esen.class, "j", esep.class, eser.class, "k"});
        }
        if (ordinal == 3) {
            return new esfb();
        }
        if (ordinal == 4) {
            return new esfa();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esfb.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
