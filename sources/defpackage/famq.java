package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class famq extends eyfy implements eyht {
    public static final famq a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public famn d;
    public eygr e = emptyProtobufList();

    static {
        famq famqVar = new famq();
        a = famqVar;
        eyfy.registerDefaultInstance(famq.class, famqVar);
    }

    private famq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004\u001b", new Object[]{"b", "c", famo.a, "d", "e", famf.class});
        }
        if (ordinal == 3) {
            return new famq();
        }
        if (ordinal == 4) {
            return new famp();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (famq.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
