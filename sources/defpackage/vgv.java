package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgv extends eyfy implements eyht {
    public static final vgv a;
    private static volatile eyhz k;
    public int b;
    public cmrl c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public boolean h;
    public boolean i;
    public boolean j;

    static {
        vgv vgvVar = new vgv();
        a = vgvVar;
        eyfy.registerDefaultInstance(vgv.class, vgvVar);
    }

    private vgv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new vgv();
        }
        if (ordinal == 4) {
            return new vgu();
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
        synchronized (vgv.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
