package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewab extends eyfy implements eyht {
    public static final ewab a;
    private static volatile eyhz m;
    public int b;
    public Object d;
    public faul e;
    public faul f;
    public evxi j;
    public int k;
    public int l;
    public int c = 0;
    public String g = "";
    public String h = "";
    public eygr i = emptyProtobufList();

    static {
        ewab ewabVar = new ewab();
        a = ewabVar;
        eyfy.registerDefaultInstance(ewab.class, ewabVar);
    }

    private ewab() {
    }

    public final void a() {
        eygr eygrVar = this.i;
        if (eygrVar.c()) {
            return;
        }
        this.i = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001;\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဉ\u0004\u0007᠌\u0005\b;\u0000\t7\u0000\n\u001b\u000b᠌\u0006", new Object[]{"d", "c", "b", "e", "f", "g", "h", "j", "k", evzy.a, "i", evzn.class, "l", evzs.a});
        }
        if (ordinal == 3) {
            return new ewab();
        }
        if (ordinal == 4) {
            return new evzx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = m;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewab.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
