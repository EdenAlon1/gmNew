package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adda extends eyfy implements eyht {
    public static final adda a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        adda addaVar = new adda();
        a = addaVar;
        eyfy.registerDefaultInstance(adda.class, addaVar);
    }

    private adda() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", addc.class});
        }
        if (ordinal == 3) {
            return new adda();
        }
        if (ordinal == 4) {
            return new adcz();
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
        synchronized (adda.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
