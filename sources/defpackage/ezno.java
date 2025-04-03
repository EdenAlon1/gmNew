package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezno extends eyfy implements eyht {
    public static final ezno a;
    private static volatile eyhz g;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        ezno eznoVar = new ezno();
        a = eznoVar;
        eyfy.registerDefaultInstance(ezno.class, eznoVar);
    }

    private ezno() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bለ\u0001", new Object[]{"d", "c", "b", "e", eznw.class, eznq.class, ezns.class, eznu.class, eznm.class, ezny.class, "f"});
        }
        if (ordinal == 3) {
            return new ezno();
        }
        if (ordinal == 4) {
            return new eznn();
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
        synchronized (ezno.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
