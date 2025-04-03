package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwtm extends eyfy implements eyht {
    public static final dwtm a;
    private static volatile eyhz h;
    public int b;
    public boolean f;
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        dwtm dwtmVar = new dwtm();
        a = dwtmVar;
        eyfy.registerDefaultInstance(dwtm.class, dwtmVar);
    }

    private dwtm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0005ဈ\u0002\u0006ဈ\u0004", new Object[]{"b", "c", "d", "f", "e", "g"});
        }
        if (ordinal == 3) {
            return new dwtm();
        }
        if (ordinal == 4) {
            return new dwtl();
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
        synchronized (dwtm.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
