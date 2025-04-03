package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjwc extends eyfy implements eyht {
    public static final cjwc a;
    private static volatile eyhz k;
    public int b;
    public cjvw c;
    public cjvz d;
    public String e = "";
    public cjwg f;
    public boolean g;
    public boolean h;
    public boolean i;
    public eyja j;

    static {
        cjwc cjwcVar = new cjwc();
        a = cjwcVar;
        eyfy.registerDefaultInstance(cjwc.class, cjwcVar);
    }

    private cjwc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ለ\u0003\u0006ဉ\u0004\bဇ\u0006\tဇ\u0007\u000bဇ\t\fဉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new cjwc();
        }
        if (ordinal == 4) {
            return new cjwb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cjwc.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
