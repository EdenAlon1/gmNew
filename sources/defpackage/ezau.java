package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezau extends eyfy implements eyht {
    public static final ezau a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public int e;
    public ezan f;
    public int h;
    public int i;
    public int j;
    public String d = "";
    public String g = "";

    static {
        ezau ezauVar = new ezau();
        a = ezauVar;
        eyfy.registerDefaultInstance(ezau.class, ezauVar);
    }

    private ezau() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = ezas.a;
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0006ဉ\u0005\u0007ဈ\u0006\b᠌\u0007\tင\b\nင\t", new Object[]{"b", "c", ezaq.a, "d", "e", eyggVar, "f", "g", "h", eyggVar, "i", "j"});
        }
        if (ordinal == 3) {
            return new ezau();
        }
        if (ordinal == 4) {
            return new ezal();
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
        synchronized (ezau.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
