package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elzi extends eyfy implements eyht {
    public static final elzi a;
    private static volatile eyhz g;
    public String b = "";
    public eygr c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        elzi elziVar = new elzi();
        a = elziVar;
        eyfy.registerDefaultInstance(elzi.class, elziVar);
    }

    private elzi() {
        emptyProtobufList();
        this.c = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001Ȉ\u0003\u001b\u0004\u0007\u0005\u0007\u0006\u0007", new Object[]{"b", "c", elzl.class, "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new elzi();
        }
        if (ordinal == 4) {
            return new elzh();
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
        synchronized (elzi.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
