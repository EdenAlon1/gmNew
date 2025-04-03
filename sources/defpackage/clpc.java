package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clpc extends eyfy implements eyht {
    public static final eygj a = new clpa();
    public static final clpc b;
    private static volatile eyhz l;
    public int c;
    public clqx d;
    public clqv e;
    public clqv f;
    public eyja h;
    public fayv i;
    public boolean j;
    public eygr g = emptyProtobufList();
    public eygi k = emptyIntList();

    static {
        clpc clpcVar = new clpc();
        b = clpcVar;
        eyfy.registerDefaultInstance(clpc.class, clpcVar);
    }

    private clpc() {
    }

    public final void a() {
        eygr eygrVar = this.g;
        if (eygrVar.c()) {
            return;
        }
        this.g = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဇ\u0005\bࠬ", new Object[]{"c", "d", "e", "f", "g", clpk.class, "h", "i", "j", "k", clob.a});
        }
        if (ordinal == 3) {
            return new clpc();
        }
        if (ordinal == 4) {
            return new clpb();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (clpc.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
