package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgpy extends eyfy implements eyht {
    public static final fgpy a;
    private static volatile eyhz e;
    public int b;
    public eygr c = eyfy.emptyProtobufList();
    public fgpx d;

    static {
        fgpy fgpyVar = new fgpy();
        a = fgpyVar;
        eyfy.registerDefaultInstance(fgpy.class, fgpyVar);
    }

    private fgpy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fgpy();
        }
        if (ordinal == 4) {
            return new fgpv();
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
        synchronized (fgpy.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
