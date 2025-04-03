package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class escg extends eyfy implements eyht {
    public static final escg a;
    private static volatile eyhz j;
    public int b;
    public String c = "";
    public eygr d = emptyProtobufList();
    public ervg e;
    public esba f;
    public erua g;
    public erty h;
    public ertw i;
    private boolean k;

    static {
        escg escgVar = new escg();
        a = escgVar;
        eyfy.registerDefaultInstance(escg.class, escgVar);
    }

    private escg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0002\n\b\u0000\u0001\u0000\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u0007\u0007\bဉ\u0003\tဉ\u0004\nဉ\u0005", new Object[]{"b", "d", escy.class, "e", "f", "c", "k", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new escg();
        }
        if (ordinal == 4) {
            return new escf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (escg.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
