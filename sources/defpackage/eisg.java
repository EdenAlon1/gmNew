package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eisg extends eyfy implements eyht {
    public static final eisg a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        eisg eisgVar = new eisg();
        a = eisgVar;
        eyfy.registerDefaultInstance(eisg.class, eisgVar);
    }

    private eisg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0006\u0005ဈ\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new eisg();
        }
        if (ordinal == 4) {
            return new eisf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eisg.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
