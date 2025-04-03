package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cubl extends eyfy implements eyht {
    public static final eygj a = new cubi();
    public static final eygj b = new cubj();
    public static final cubl c;
    private static volatile eyhz h;
    public eygr d = eyfy.emptyProtobufList();
    public eygr e = eyfy.emptyProtobufList();
    public eygi f = emptyIntList();
    public eygi g = emptyIntList();

    static {
        cubl cublVar = new cubl();
        c = cublVar;
        eyfy.registerDefaultInstance(cubl.class, cublVar);
    }

    private cubl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(c, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001Ț\u0002Ț\u0003,\u0004,", new Object[]{"d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new cubl();
        }
        if (ordinal == 4) {
            return new cubk();
        }
        if (ordinal == 5) {
            return c;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cubl.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(c);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
