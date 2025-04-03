package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fckf extends eyfy implements eyht {
    public static final fckf a;
    private static volatile eyhz d;
    public String b = "";
    public eyee c = eyee.b;

    static {
        fckf fckfVar = new fckf();
        a = fckfVar;
        eyfy.registerDefaultInstance(fckf.class, fckfVar);
    }

    private fckf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fckf();
        }
        if (ordinal == 4) {
            return new fcke();
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
        synchronized (fckf.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
