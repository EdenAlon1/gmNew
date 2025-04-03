package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deyb extends eyfy implements eyht {
    public static final deyb a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public eygr f = emptyProtobufList();

    static {
        deyb deybVar = new deyb();
        a = deybVar;
        eyfy.registerDefaultInstance(deyb.class, deybVar);
    }

    private deyb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", dexv.class});
        }
        if (ordinal == 3) {
            return new deyb();
        }
        if (ordinal == 4) {
            return new deya();
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
        synchronized (deyb.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
