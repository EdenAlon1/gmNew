package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwrl extends eyfy implements eyht {
    public static final dwrl a;
    public static final eyfw b;
    private static volatile eyhz g;
    public int c;
    public eyhm f = eyhm.a;
    public eygr d = emptyProtobufList();
    public int e = 1;

    static {
        dwrl dwrlVar = new dwrl();
        a = dwrlVar;
        eyfy.registerDefaultInstance(dwrl.class, dwrlVar);
        b = eyfy.newSingularGeneratedExtension(ezit.a, dwrlVar, dwrlVar, null, 329110223, eyjr.MESSAGE, dwrl.class);
    }

    private dwrl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0001\u0000\u0001\u001b\u0002င\u0000\u00032", new Object[]{"c", "d", dwro.class, "e", "f", dwrk.a});
        }
        if (ordinal == 3) {
            return new dwrl();
        }
        if (ordinal == 4) {
            return new dwrh();
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
        synchronized (dwrl.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
