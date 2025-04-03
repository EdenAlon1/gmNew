package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyxz extends eyfy implements eyht {
    public static final eyxz a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public String f = "";
    public eygr g = emptyProtobufList();
    public boolean h;
    public boolean i;
    public int j;

    static {
        eyxz eyxzVar = new eyxz();
        a = eyxzVar;
        eyfy.registerDefaultInstance(eyxz.class, eyxzVar);
    }

    private eyxz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005\u001b\nဇ\b\u000bဇ\t\rင\u000b", new Object[]{"b", "c", ezfh.a, "d", "e", ezff.a, "f", "g", eyxx.class, "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new eyxz();
        }
        if (ordinal == 4) {
            return new eyxy();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyxz.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
