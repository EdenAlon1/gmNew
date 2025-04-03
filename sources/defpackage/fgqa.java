package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgqa extends eyfy implements eyht {
    public static final fgqa a;
    private static volatile eyhz h;
    public eygl b = emptyLongList();
    public eygl c = emptyLongList();
    public eygi d = emptyIntList();
    public eygi e = emptyIntList();
    public eygi f = emptyIntList();
    public eygr g = eyfy.emptyProtobufList();

    static {
        fgqa fgqaVar = new fgqa();
        a = fgqaVar;
        eyfy.registerDefaultInstance(fgqa.class, fgqaVar);
    }

    private fgqa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001%\u0002%\u0003'\u0004'\u0005'\u0006\u001a", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fgqa();
        }
        if (ordinal == 4) {
            return new fgpz();
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
        synchronized (fgqa.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
