package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezhr extends eyfy implements eyht {
    public static final eygj a = new ezhp();
    public static final ezhr b;
    private static volatile eyhz n;
    public int c;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int m;
    public eygi d = emptyIntList();
    public String e = "";
    public String j = "";
    public String k = "";
    public String l = "";

    static {
        ezhr ezhrVar = new ezhr();
        b = ezhrVar;
        eyfy.registerDefaultInstance(ezhr.class, ezhrVar);
    }

    private ezhr() {
    }

    public final void a() {
        eygi eygiVar = this.d;
        if (eygiVar.c()) {
            return;
        }
        this.d = eyfy.mutableCopy(eygiVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003᠌\u0001\u0004᠌\u0002\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\t᠌\u0003\nင\b", new Object[]{"c", "d", ezia.a, "e", "f", eziu.a, "g", eziw.a, "i", "j", "k", "l", "h", eziy.a, "m"});
        }
        if (ordinal == 3) {
            return new ezhr();
        }
        if (ordinal == 4) {
            return new ezhq();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = n;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezhr.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
