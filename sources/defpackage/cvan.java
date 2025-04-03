package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvan extends eyfy implements eyht {
    public static final cvan a;
    private static volatile eyhz g;
    public long c;
    public int f;
    public eygr b = emptyProtobufList();
    public eyee d = eyee.b;
    public String e = "";

    static {
        cvan cvanVar = new cvan();
        a = cvanVar;
        eyfy.registerDefaultInstance(cvan.class, cvanVar);
    }

    private cvan() {
    }

    public final void a() {
        eygr eygrVar = this.b;
        if (eygrVar.c()) {
            return;
        }
        this.b = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u0002\u0003\n\u0004Ȉ\u0005\f", new Object[]{"b", cvbt.class, "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new cvan();
        }
        if (ordinal == 4) {
            return new cval();
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
        synchronized (cvan.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
