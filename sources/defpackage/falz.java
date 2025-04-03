package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class falz extends eyfy implements eyht {
    public static final falz a;
    private static volatile eyhz b;

    static {
        falz falzVar = new falz();
        a = falzVar;
        eyfy.registerDefaultInstance(falz.class, falzVar);
    }

    private falz() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (ordinal == 3) {
            return new falz();
        }
        if (ordinal == 4) {
            return new faly();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (falz.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
