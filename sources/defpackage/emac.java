package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emac extends eyfy implements eyht {
    public static final emac a;
    private static volatile eyhz f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        emac emacVar = new emac();
        a = emacVar;
        eyfy.registerDefaultInstance(emac.class, emacVar);
    }

    private emac() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȼ\u0000\u0003:\u0000\u00043\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", eyiw.class});
        }
        if (ordinal == 3) {
            return new emac();
        }
        if (ordinal == 4) {
            return new emab();
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
        synchronized (emac.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
