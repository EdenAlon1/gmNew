package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ectw extends eyfy implements eyht {
    public static final ectw a;
    public static final eyfw b;
    private static volatile eyhz k;
    public int c;
    public boolean e;
    public boolean i;
    public String d = "";
    public String f = "";
    public String g = "";
    public eygi h = emptyIntList();
    public eygr j = eyfy.emptyProtobufList();

    static {
        ectw ectwVar = new ectw();
        a = ectwVar;
        eyfy.registerDefaultInstance(ectw.class, ectwVar);
        b = eyfy.newSingularGeneratedExtension(ectl.a, ectwVar, ectwVar, null, 334728578, eyjr.MESSAGE, ectw.class);
    }

    private ectw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006'\u0007ဇ\u0004\b\u001a", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new ectw();
        }
        if (ordinal == 4) {
            return new ectv();
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
        synchronized (ectw.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
