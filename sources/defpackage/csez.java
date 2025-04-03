package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csez extends eyfy implements eyht {
    public static final csez a;
    private static volatile eyhz f;
    public String b = "";
    public long c;
    public long d;
    public long e;

    static {
        csez csezVar = new csez();
        a = csezVar;
        eyfy.registerDefaultInstance(csez.class, csezVar);
    }

    private csez() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new csez();
        }
        if (ordinal == 4) {
            return new csey();
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
        synchronized (csez.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
