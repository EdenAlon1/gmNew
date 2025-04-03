package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbsc extends eyfy implements eyht {
    public static final cbsc a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        cbsc cbscVar = new cbsc();
        a = cbscVar;
        eyfy.registerDefaultInstance(cbsc.class, cbscVar);
    }

    private cbsc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new cbsc();
        }
        if (ordinal == 4) {
            return new cbsb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cbsc.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
