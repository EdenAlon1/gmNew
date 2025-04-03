package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvif extends eyfy implements eyht {
    public static final cvif a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        cvif cvifVar = new cvif();
        a = cvifVar;
        eyfy.registerDefaultInstance(cvif.class, cvifVar);
    }

    private cvif() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", cvgt.class});
        }
        if (ordinal == 3) {
            return new cvif();
        }
        if (ordinal == 4) {
            return new cvie();
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
        synchronized (cvif.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
