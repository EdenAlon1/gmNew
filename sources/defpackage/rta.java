package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rta extends eyfy implements eyht {
    public static final rta a;
    private static volatile eyhz h;
    public int b;
    public long e;
    public rsu g;
    public String c = "";
    public String d = "";
    public eygr f = emptyProtobufList();

    static {
        rta rtaVar = new rta();
        a = rtaVar;
        eyfy.registerDefaultInstance(rta.class, rtaVar);
    }

    private rta() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဃ\u0004\u0006\u001b\u0007ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", rsw.class, "g"});
        }
        if (ordinal == 3) {
            return new rta();
        }
        if (ordinal == 4) {
            return new rsz();
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
        synchronized (rta.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
