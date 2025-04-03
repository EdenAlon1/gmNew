package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rrz extends eyfy implements eyht {
    public static final rrz a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public eygr f = emptyProtobufList();

    static {
        rrz rrzVar = new rrz();
        a = rrzVar;
        eyfy.registerDefaultInstance(rrz.class, rrzVar);
    }

    private rrz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", rry.class});
        }
        if (ordinal == 3) {
            return new rrz();
        }
        if (ordinal == 4) {
            return new rrs();
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
        synchronized (rrz.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
