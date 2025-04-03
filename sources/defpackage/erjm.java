package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erjm extends eyfy implements eyht {
    public static final erjm a;
    private static volatile eyhz k;
    public int b;
    public eygr c = emptyProtobufList();
    public eygl d = emptyLongList();
    public eygl e = emptyLongList();
    public eygl f = emptyLongList();
    public eygl g = emptyLongList();
    public long h;
    public long i;
    public int j;

    static {
        erjm erjmVar = new erjm();
        a = erjmVar;
        eyfy.registerDefaultInstance(erjm.class, erjmVar);
    }

    private erjm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0005\u0000\u0001\u001b\u0002\u0015\u0003\u0015\u0004ဃ\u0000\u0005ဃ\u0001\u0006င\u0002\u0007&\b&", new Object[]{"b", "c", erie.class, "d", "f", "h", "i", "j", "e", "g"});
        }
        if (ordinal == 3) {
            return new erjm();
        }
        if (ordinal == 4) {
            return new erjl();
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
        synchronized (erjm.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
