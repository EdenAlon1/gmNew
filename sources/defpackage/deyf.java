package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deyf extends eyfy implements eyht {
    public static final deyf a;
    private static volatile eyhz h;
    public int b;
    public String c = "";
    public String d = "";
    public eygr e = eyfy.emptyProtobufList();
    public eygr f = emptyProtobufList();
    public boolean g;

    static {
        deyf deyfVar = new deyf();
        a = deyfVar;
        eyfy.registerDefaultInstance(deyf.class, deyfVar);
    }

    private deyf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003Ț\u0004\u001b\u0005ဇ\u0002", new Object[]{"b", "c", "d", "e", "f", dexv.class, "g"});
        }
        if (ordinal == 3) {
            return new deyf();
        }
        if (ordinal == 4) {
            return new deye();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (deyf.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
