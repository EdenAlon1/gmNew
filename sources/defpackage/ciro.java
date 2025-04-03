package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ciro extends eyfy implements eyht {
    public static final ciro a;
    private static volatile eyhz d;
    public eygr b = eyfy.emptyProtobufList();
    public boolean c;
    private int e;

    static {
        ciro ciroVar = new ciro();
        a = ciroVar;
        eyfy.registerDefaultInstance(ciro.class, ciroVar);
    }

    private ciro() {
    }

    public static /* synthetic */ void b(ciro ciroVar) {
        ciroVar.e |= 1;
        ciroVar.c = true;
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
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဇ\u0000", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new ciro();
        }
        if (ordinal == 4) {
            return new cirn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ciro.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
