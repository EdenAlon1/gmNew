package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fajr extends eyfy implements eyht {
    public static final fajr a;
    private static volatile eyhz l;
    public int b;
    public Object d;
    public int e;
    public int i;
    public boolean j;
    public fajp k;
    public int c = 0;
    public String f = "";
    public String g = "";
    public eygr h = emptyProtobufList();

    static {
        fajr fajrVar = new fajr();
        a = fajrVar;
        eyfy.registerDefaultInstance(fajr.class, fajrVar);
    }

    private fajr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b\u000bဉ\u0000", new Object[]{"d", "c", "b", "e", "f", "i", fakn.class, faja.class, fajw.class, fajc.class, "j", "g", "h", faks.class, "k"});
        }
        if (ordinal == 3) {
            return new fajr();
        }
        if (ordinal == 4) {
            return new fajn();
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
        synchronized (fajr.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
