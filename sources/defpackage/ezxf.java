package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezxf extends eyfy implements eyht {
    public static final ezxf a;
    private static volatile eyhz m;
    public int b;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean j;
    public boolean k;
    public int l;
    public String c = "";
    public String d = "";
    public String i = "";

    static {
        ezxf ezxfVar = new ezxf();
        a = ezxfVar;
        eyfy.registerDefaultInstance(ezxf.class, ezxfVar);
    }

    private ezxf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဇ\u0007\tဇ\b\nင\t", new Object[]{"b", "c", "d", "e", ezxd.a, "f", "g", "h", "i", "j", "k", "l"});
        }
        if (ordinal == 3) {
            return new ezxf();
        }
        if (ordinal == 4) {
            return new ezxc();
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
        synchronized (ezxf.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
