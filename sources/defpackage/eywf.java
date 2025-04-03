package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eywf extends eyfy implements eyht {
    public static final eywf a;
    private static volatile eyhz g;
    public eygi b;
    public eygi c;
    public eygi d;
    public eygi e;
    public eygi f;

    static {
        eywf eywfVar = new eywf();
        a = eywfVar;
        eyfy.registerDefaultInstance(eywf.class, eywfVar);
    }

    private eywf() {
        eyfy.emptyProtobufList();
        this.b = emptyIntList();
        eyfy.emptyProtobufList();
        this.c = emptyIntList();
        eyfy.emptyProtobufList();
        this.d = emptyIntList();
        this.e = emptyIntList();
        this.f = emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eyuc.a;
            return newMessageInfo(a, "\u0001\u0005\u0000\u0000\u0004\b\u0005\u0000\u0005\u0000\u0004ࠞ\u0005ࠞ\u0006ࠞ\u0007ࠞ\bࠞ", new Object[]{"b", eyggVar, "c", eyggVar, "d", eyggVar, "e", eyggVar, "f", eyggVar});
        }
        if (ordinal == 3) {
            return new eywf();
        }
        if (ordinal == 4) {
            return new eywe();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eywf.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
