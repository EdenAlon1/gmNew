package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cepi extends eyfy implements eyht {
    public static final cepi a;
    private static volatile eyhz c;
    public eygr b = eyfy.emptyProtobufList();

    static {
        cepi cepiVar = new cepi();
        a = cepiVar;
        eyfy.registerDefaultInstance(cepi.class, cepiVar);
    }

    private cepi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new cepi();
        }
        if (ordinal == 4) {
            return new ceph();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cepi.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
