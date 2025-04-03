package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class fabh extends eyfy implements eyht {
    public static final fabh a;
    private static volatile eyhz e;
    public String b = "";
    public eygr c = eyfy.emptyProtobufList();
    public boolean d;

    static {
        fabh fabhVar = new fabh();
        a = fabhVar;
        eyfy.registerDefaultInstance(fabh.class, fabhVar);
    }

    private fabh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fabh();
        }
        if (ordinal == 4) {
            return new fabg();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fabh.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
