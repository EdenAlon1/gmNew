package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eywr extends eyfy implements eyht {
    public static final eywr a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public long e;
    public eygr f = emptyProtobufList();

    static {
        eywr eywrVar = new eywr();
        a = eywrVar;
        eyfy.registerDefaultInstance(eywr.class, eywrVar);
    }

    private eywr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001b\u0004ဂ\u0002", new Object[]{"b", "c", eywl.a, "d", "f", eywq.class, "e"});
        }
        if (ordinal == 3) {
            return new eywr();
        }
        if (ordinal == 4) {
            return new eywk();
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
        synchronized (eywr.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
