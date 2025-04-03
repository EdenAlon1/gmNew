package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxq extends eyfy implements eyht {
    public static final eygj a = new epxb();
    public static final epxq b;
    private static volatile eyhz s;
    public int c;
    public long e;
    public int f;
    public eyev g;
    public int j;
    public int k;
    public boolean l;
    public int n;
    public int o;
    public epxk p;
    public int q;
    public epyb r;
    public String d = "";
    public eygi h = emptyIntList();
    public eygr i = emptyProtobufList();
    public String m = "";

    static {
        epxq epxqVar = new epxq();
        b = epxqVar;
        eyfy.registerDefaultInstance(epxq.class, epxqVar);
    }

    private epxq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0002\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ࠬ\u0006\u001b\u0007ဌ\u0004\bင\u0005\tဇ\u0006\nለ\u0007\u000bဌ\b\fင\t\rဉ\n\u000eဌ\u000b\u000fဉ\f", new Object[]{"c", "d", "e", "f", epxd.a, "g", "h", epxo.a, "i", epxn.class, "j", "k", "l", "m", "n", "o", "p", "q", "r"});
        }
        if (ordinal == 3) {
            return new epxq();
        }
        if (ordinal == 4) {
            return new epxc();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = s;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epxq.class) {
            eyhzVar = s;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                s = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
