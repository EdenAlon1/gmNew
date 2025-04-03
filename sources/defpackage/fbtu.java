package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbtu extends eyfy implements eyht {
    public static final fbtu a;
    private static volatile eyhz g;
    public eygr b = emptyProtobufList();
    public eygi c = emptyIntList();
    public String d = "";
    public String e = "";
    public int f;

    static {
        fbtu fbtuVar = new fbtu();
        a = fbtuVar;
        eyfy.registerDefaultInstance(fbtu.class, fbtuVar);
    }

    private fbtu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0002\u0000\u0002\u001b\u0003'\u0004Ȉ\u0005Ȉ\u0006\f", new Object[]{"b", fbxa.class, "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fbtu();
        }
        if (ordinal == 4) {
            return new fbtt();
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
        synchronized (fbtu.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
