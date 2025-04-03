package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezcg extends eyfy implements eyht {
    public static final ezcg a;
    private static volatile eyhz h;
    public int b;
    public eygr c = emptyProtobufList();
    public ezcq d;
    public eyja e;
    public eyja f;
    public int g;

    static {
        ezcg ezcgVar = new ezcg();
        a = ezcgVar;
        eyfy.registerDefaultInstance(ezcg.class, ezcgVar);
    }

    private ezcg() {
    }

    public final void a() {
        eygr eygrVar = this.c;
        if (eygrVar.c()) {
            return;
        }
        this.c = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005᠌\u0003", new Object[]{"b", "c", ezde.class, "d", "e", "f", "g", ezcf.a});
        }
        if (ordinal == 3) {
            return new ezcg();
        }
        if (ordinal == 4) {
            return new ezce();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezcg.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
