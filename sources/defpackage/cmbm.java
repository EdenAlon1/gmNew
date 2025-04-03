package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmbm extends eyfy implements eyht {
    public static final cmbm a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        cmbm cmbmVar = new cmbm();
        a = cmbmVar;
        eyfy.registerDefaultInstance(cmbm.class, cmbmVar);
    }

    private cmbm() {
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
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", clzf.class});
        }
        if (ordinal == 3) {
            return new cmbm();
        }
        if (ordinal == 4) {
            return new cmbl();
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
        synchronized (cmbm.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
