package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akcd extends eyfy implements eyht {
    public static final akcd a;
    private static volatile eyhz h;
    public int b;
    public long c;
    public String d = "";
    public eyja e;
    public long f;
    public long g;

    static {
        akcd akcdVar = new akcd();
        a = akcdVar;
        eyfy.registerDefaultInstance(akcd.class, akcdVar);
    }

    private akcd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new akcd();
        }
        if (ordinal == 4) {
            return new akcc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (akcd.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
