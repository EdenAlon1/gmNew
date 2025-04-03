package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fagk extends eyfy implements eyht {
    public static final fagk a;
    private static volatile eyhz d;
    private eyhm e = eyhm.a;
    public String b = "";
    public String c = "";

    static {
        fagk fagkVar = new fagk();
        a = fagkVar;
        eyfy.registerDefaultInstance(fagk.class, fagkVar);
    }

    private fagk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"b", "c", "e", fagj.a});
        }
        if (ordinal == 3) {
            return new fagk();
        }
        if (ordinal == 4) {
            return new fagi();
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
        synchronized (fagk.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
