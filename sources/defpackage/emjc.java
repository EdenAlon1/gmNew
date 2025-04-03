package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emjc extends eyfy implements eyht {
    public static final emjc a;
    private static volatile eyhz k;
    public int b;
    public emhv c;
    public int f;
    public emje h;
    public int i;
    public boolean j;
    public eygr d = emptyProtobufList();
    public eygr e = emptyProtobufList();
    public int g = 1;

    static {
        emjc emjcVar = new emjc();
        a = emjcVar;
        eyfy.registerDefaultInstance(emjc.class, emjcVar);
    }

    private emjc() {
    }

    public final void a() {
        eygr eygrVar = this.e;
        if (eygrVar.c()) {
            return;
        }
        this.e = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001\u0005᠌\u0002\u0006ဉ\u0003\bင\u0005\tဇ\u0006", new Object[]{"b", "c", "d", emiz.class, "e", emjb.class, "f", "g", emjf.a, "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new emjc();
        }
        if (ordinal == 4) {
            return new emix();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (emjc.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
