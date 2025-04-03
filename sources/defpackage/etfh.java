package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etfh extends eyfy implements eyht {
    public static final etfh a;
    private static volatile eyhz k;
    public etfj c;
    public int h;
    public eyev i;
    private int l;
    public String b = "";
    public eyee d = eyee.b;
    public eyee e = eyee.b;
    public eygr f = emptyProtobufList();
    public eyee g = eyee.b;
    public String j = "";

    static {
        etfh etfhVar = new etfh();
        a = etfhVar;
        eyfy.registerDefaultInstance(etfh.class, etfhVar);
    }

    private etfh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\n\u0004\n\u0005\u001b\u0006\n\u0007\u0004\bဉ\u0001\tȈ", new Object[]{"l", "b", "c", "d", "e", "f", etff.class, "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new etfh();
        }
        if (ordinal == 4) {
            return new etfg();
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
        synchronized (etfh.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
