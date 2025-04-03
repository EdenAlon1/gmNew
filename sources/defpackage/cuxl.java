package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuxl extends eyfy implements eyht {
    public static final cuxl a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        cuxl cuxlVar = new cuxl();
        a = cuxlVar;
        eyfy.registerDefaultInstance(cuxl.class, cuxlVar);
    }

    private cuxl() {
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
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", cuxk.class});
        }
        if (ordinal == 3) {
            return new cuxl();
        }
        if (ordinal == 4) {
            return new cuxi();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cuxl.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
