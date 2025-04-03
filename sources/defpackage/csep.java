package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csep extends eyfy implements eyht {
    public static final csep a;
    private static volatile eyhz f;
    public int b;
    public int d;
    public String c = "";
    public String e = "";

    static {
        csep csepVar = new csep();
        a = csepVar;
        eyfy.registerDefaultInstance(csep.class, csepVar);
    }

    private csep() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001\u0003ለ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new csep();
        }
        if (ordinal == 4) {
            return new cseo();
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
        synchronized (csep.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
