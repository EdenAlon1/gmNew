package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewuy extends eyfy implements eyht {
    public static final ewuy a;
    private static volatile eyhz n;
    public int b;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public emao l;
    public eygr c = emptyProtobufList();
    public eyee k = eyee.b;
    public String m = "";

    static {
        ewuy ewuyVar = new ewuy();
        a = ewuyVar;
        eyfy.registerDefaultInstance(ewuy.class, ewuyVar);
    }

    private ewuy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\nည\u0007\u000bဉ\b\rဈ\n", new Object[]{"b", "c", ewux.class, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (ordinal == 3) {
            return new ewuy();
        }
        if (ordinal == 4) {
            return new ewuv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = n;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewuy.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
