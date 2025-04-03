package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzrc extends eyfy implements eyht {
    public static final bzrc a;
    private static volatile eyhz d;
    public String b = "";
    public eygr c = emptyProtobufList();

    static {
        bzrc bzrcVar = new bzrc();
        a = bzrcVar;
        eyfy.registerDefaultInstance(bzrc.class, bzrcVar);
    }

    private bzrc() {
    }

    public final void a() {
        eygr eygrVar = this.c;
        if (eygrVar.c()) {
            return;
        }
        this.c = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", awui.class});
        }
        if (ordinal == 3) {
            return new bzrc();
        }
        if (ordinal == 4) {
            return new bzrb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (bzrc.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
