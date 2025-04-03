package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fatc extends eyfy implements eyht {
    public static final fatc a;
    private static volatile eyhz g;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        fatc fatcVar = new fatc();
        a = fatcVar;
        eyfy.registerDefaultInstance(fatc.class, fatcVar);
    }

    private fatc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ\u0005ለ\u0000", new Object[]{"d", "c", "b", fatf.class, fasu.class, fati.class, "e", "f"});
        }
        if (ordinal == 3) {
            return new fatc();
        }
        if (ordinal == 4) {
            return new fatb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fatc.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
