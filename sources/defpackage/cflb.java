package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cflb extends eyfy implements eyht {
    public static final cflb a;
    private static volatile eyhz e;
    public int b;
    public eygr c = emptyProtobufList();
    public eygr d = eyfy.emptyProtobufList();

    static {
        cflb cflbVar = new cflb();
        a = cflbVar;
        eyfy.registerDefaultInstance(cflb.class, cflbVar);
    }

    private cflb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\f\u0002\u001b\u0003Ț", new Object[]{"b", "c", cfkz.class, "d"});
        }
        if (ordinal == 3) {
            return new cflb();
        }
        if (ordinal == 4) {
            return new cfkx();
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
        synchronized (cflb.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
