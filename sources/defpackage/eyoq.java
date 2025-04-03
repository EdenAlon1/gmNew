package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyoq extends eyfy implements eyht {
    public static final eyoq a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public eygr d = emptyProtobufList();

    static {
        eyoq eyoqVar = new eyoq();
        a = eyoqVar;
        eyfy.registerDefaultInstance(eyoq.class, eyoqVar);
    }

    private eyoq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"b", "c", eyoo.a, "d", eync.class});
        }
        if (ordinal == 3) {
            return new eyoq();
        }
        if (ordinal == 4) {
            return new eyon();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyoq.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
