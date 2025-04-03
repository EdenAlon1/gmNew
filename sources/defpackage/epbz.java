package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epbz extends eyfy implements eyht {
    public static final epbz a;
    private static volatile eyhz l;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;

    static {
        epbz epbzVar = new epbz();
        a = epbzVar;
        eyfy.registerDefaultInstance(epbz.class, epbzVar);
    }

    private epbz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006᠌\u0005\u0007ဇ\u0006\bဇ\u0007\tင\b", new Object[]{"b", "c", epbx.a, "d", "e", "f", "g", "h", epbw.a, "i", "j", "k"});
        }
        if (ordinal == 3) {
            return new epbz();
        }
        if (ordinal == 4) {
            return new epbv();
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
        synchronized (epbz.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
