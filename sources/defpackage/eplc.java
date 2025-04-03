package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eplc extends eyfy implements eyht {
    public static final eplc a;
    private static volatile eyhz l;
    public int b;
    public int c;
    public int d;
    public int e;
    public eygr f = emptyProtobufList();
    public eyev g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        eplc eplcVar = new eplc();
        a = eplcVar;
        eyfy.registerDefaultInstance(eplc.class, eplcVar);
    }

    private eplc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eppm.a;
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004\u001b\u0005ဉ\u0003\u0006᠌\u0004\u0007᠌\u0006\b᠌\u0007\t᠌\u0005", new Object[]{"b", "c", epla.a, "d", eyggVar, "e", eyggVar, "f", eplh.class, "g", "h", epky.a, "j", eyggVar, "k", eyggVar, "i", epkz.a});
        }
        if (ordinal == 3) {
            return new eplc();
        }
        if (ordinal == 4) {
            return new epkx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eplc.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
