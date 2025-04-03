package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoze extends eyfy implements eyht {
    public static final eygj a = new eoyw();
    public static final eoze b;
    private static volatile eyhz g;
    public int c;
    public int d;
    public eygi e = emptyIntList();
    public int f;

    static {
        eoze eozeVar = new eoze();
        b = eozeVar;
        eyfy.registerDefaultInstance(eoze.class, eozeVar);
    }

    private eoze() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002ࠞ\u0003᠌\u0001", new Object[]{"c", "d", eozc.a, "e", eoza.a, "f", eoyy.a});
        }
        if (ordinal == 3) {
            return new eoze();
        }
        if (ordinal == 4) {
            return new eoyx();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eoze.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
