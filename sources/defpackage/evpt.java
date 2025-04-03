package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evpt extends eyfy implements eyht {
    public static final evpt a;
    private static volatile eyhz h;
    public int b;
    public boolean c;
    public boolean f;
    private boolean i;
    public eygr d = eyfy.emptyProtobufList();
    public long e = -1;
    public String g = "";

    static {
        evpt evptVar = new evpt();
        a = evptVar;
        eyfy.registerDefaultInstance(evpt.class, evptVar);
    }

    private evpt() {
    }

    public static /* synthetic */ void a(evpt evptVar) {
        evptVar.b |= 8;
        evptVar.i = true;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a\u0003ဂ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "i", "g"});
        }
        if (ordinal == 3) {
            return new evpt();
        }
        if (ordinal == 4) {
            return new evps();
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
        synchronized (evpt.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
