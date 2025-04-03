package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aitj extends eyfy implements eyht {
    public static final aitj a;
    private static volatile eyhz d;
    public eygr b = eyfy.emptyProtobufList();
    public String c = "";

    static {
        aitj aitjVar = new aitj();
        a = aitjVar;
        eyfy.registerDefaultInstance(aitj.class, aitjVar);
    }

    private aitj() {
    }

    public final void a() {
        eygr eygrVar = this.b;
        if (eygrVar.c()) {
            return;
        }
        this.b = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new aitj();
        }
        if (ordinal == 4) {
            return new aiti();
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
        synchronized (aitj.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
