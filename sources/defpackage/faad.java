package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class faad extends eyfy implements eyht {
    public static final faad a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public eygi d = emptyIntList();
    public String e = "";
    public String f = "";

    static {
        faad faadVar = new faad();
        a = faadVar;
        eyfy.registerDefaultInstance(faad.class, faadVar);
    }

    private faad() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003+\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new faad();
        }
        if (ordinal == 4) {
            return new faac();
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
        synchronized (faad.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
