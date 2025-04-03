package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewhw extends eyfy implements eyht {
    public static final ewhw a;
    private static volatile eyhz c;
    public String b = "";
    private int d;

    static {
        ewhw ewhwVar = new ewhw();
        a = ewhwVar;
        eyfy.registerDefaultInstance(ewhw.class, ewhwVar);
    }

    private ewhw() {
    }

    public static /* synthetic */ void a(ewhw ewhwVar) {
        ewhwVar.d |= 1;
        ewhwVar.b = "upi-mvp";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new ewhw();
        }
        if (ordinal == 4) {
            return new ewhv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewhw.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
