package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emsl extends eyfy implements eyht {
    public static final emsl a;
    private static volatile eyhz e;
    public Object c;
    public int b = 0;
    public eyee d = eyee.b;

    static {
        emsl emslVar = new emsl();
        a = emslVar;
        eyfy.registerDefaultInstance(emsl.class, emslVar);
    }

    private emsl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0001\u0000\t✐\b\u0000\u0000\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000ϩ\n✐<\u0000", new Object[]{"c", "b", emtk.class, emsa.class, emrw.class, emtg.class, emsr.class, emti.class, "d", emte.class});
        }
        if (ordinal == 3) {
            return new emsl();
        }
        if (ordinal == 4) {
            return new emsk();
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
        synchronized (emsl.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
