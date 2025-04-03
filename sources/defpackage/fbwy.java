package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbwy extends eyfy implements eyht {
    public static final eygj a = new fbww();
    public static final fbwy b;
    private static volatile eyhz s;
    public int c;
    public int d;
    public int e;
    public float f;
    public int g;
    public fbuc i;
    public fbxk j;
    public int l;
    public long p;
    public fbvz r;
    public eygi h = emptyIntList();
    public String k = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String q = "";

    static {
        fbwy fbwyVar = new fbwy();
        b = fbwyVar;
        eyfy.registerDefaultInstance(fbwy.class, fbwyVar);
    }

    private fbwy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0000\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0001\u0000\u0001\f\u0002\u0001\u0003\f\u0004ဉ\u0000\u0005ဉ\u0001\u0006Ȉ\u0007\f\bȈ\tȈ\nȈ\u000b\u0002\f\f\rȈ\u000eဉ\u0002\u0010,", new Object[]{"c", "d", "f", "g", "i", "j", "k", "l", "m", "n", "o", "p", "e", "q", "r", "h"});
        }
        if (ordinal == 3) {
            return new fbwy();
        }
        if (ordinal == 4) {
            return new fbwx();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = s;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbwy.class) {
            eyhzVar = s;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                s = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
