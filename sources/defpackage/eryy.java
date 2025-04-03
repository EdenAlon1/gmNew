package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eryy extends eyfy implements eyht {
    public static final eryy a;
    private static volatile eyhz c;
    public eygr b = eyfy.emptyProtobufList();

    static {
        eryy eryyVar = new eryy();
        a = eryyVar;
        eyfy.registerDefaultInstance(eryy.class, eryyVar);
    }

    private eryy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new eryy();
        }
        if (ordinal == 4) {
            return new eryx();
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
        synchronized (eryy.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
