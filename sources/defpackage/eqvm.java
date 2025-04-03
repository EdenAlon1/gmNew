package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqvm extends eyfy implements eyht {
    public static final eqvm a;
    private static volatile eyhz h;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public boolean f;
    public int g;

    static {
        eqvm eqvmVar = new eqvm();
        a = eqvmVar;
        eyfy.registerDefaultInstance(eqvm.class, eqvmVar);
    }

    private eqvm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007᠌\u0002\b<\u0000", new Object[]{"d", "c", "b", "e", equv.a, "f", eqvf.class, eqvj.class, equz.class, eqvd.class, "g", eqvl.a, eqvb.class});
        }
        if (ordinal == 3) {
            return new eqvm();
        }
        if (ordinal == 4) {
            return new eqvk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqvm.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
