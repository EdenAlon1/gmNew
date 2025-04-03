package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emao extends eyfy implements eyht {
    public static final emao a;
    private static volatile eyhz d;
    public int b;
    private eyhm e = eyhm.a;
    private eyhm f = eyhm.a;
    public String c = "";

    static {
        emao emaoVar = new emao();
        a = emaoVar;
        eyfy.registerDefaultInstance(emao.class, emaoVar);
    }

    private emao() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0002\u0000\u0000\u00012\u0002ဈ\u0000\u00032", new Object[]{"b", "e", eman.a, "c", "f", emal.a});
        }
        if (ordinal == 3) {
            return new emao();
        }
        if (ordinal == 4) {
            return new emam();
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
        synchronized (emao.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
