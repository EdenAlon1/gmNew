package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awtv extends eyfy implements eyht {
    public static final awtv a;
    private static volatile eyhz g;
    public int b;
    public awwf c;
    public eygr d = emptyProtobufList();
    public eyee e = eyee.b;
    public awui f;

    static {
        awtv awtvVar = new awtv();
        a = awtvVar;
        eyfy.registerDefaultInstance(awtv.class, awtvVar);
    }

    private awtv() {
    }

    public final void a() {
        eygr eygrVar = this.d;
        if (eygrVar.c()) {
            return;
        }
        this.d = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ည\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", awui.class, "e", "f"});
        }
        if (ordinal == 3) {
            return new awtv();
        }
        if (ordinal == 4) {
            return new awtu();
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
        synchronized (awtv.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
