package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfjy extends eyfy implements eyht {
    public static final dfjy a;
    private static volatile eyhz f;
    public int b;
    public Object d;
    public int c = 0;
    public eyee e = eyee.b;

    static {
        dfjy dfjyVar = new dfjy();
        a = dfjyVar;
        eyfy.registerDefaultInstance(dfjy.class, dfjyVar);
    }

    private dfjy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ည\u0000", new Object[]{"d", "c", "b", dfkb.class, dfjw.class, "e"});
        }
        if (ordinal == 3) {
            return new dfjy();
        }
        if (ordinal == 4) {
            return new dfjx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dfjy.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
