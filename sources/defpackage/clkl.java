package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clkl {
    public static clns a(awui awuiVar, String str) {
        clnp clnpVar = (clnp) clns.a.createBuilder();
        clqv b = cllk.b(awuiVar);
        clnpVar.copyOnWrite();
        clns clnsVar = (clns) clnpVar.instance;
        b.getClass();
        clnsVar.d = b;
        int i = 2;
        clnsVar.b |= 2;
        clqr clqrVar = (clqr) clqs.a.createBuilder();
        clqrVar.copyOnWrite();
        clqs clqsVar = (clqs) clqrVar.instance;
        str.getClass();
        clqsVar.b |= 1;
        clqsVar.c = str;
        clnpVar.copyOnWrite();
        clns clnsVar2 = (clns) clnpVar.instance;
        clqs clqsVar2 = (clqs) clqrVar.build();
        clqsVar2.getClass();
        clnsVar2.e = clqsVar2;
        clnsVar2.b |= 4;
        awuh b2 = awuh.b(awuiVar.c);
        if (b2 == null) {
            b2 = awuh.UNKNOWN_TYPE;
        }
        int ordinal = b2.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i = 3;
                } else if (ordinal == 3) {
                    i = 4;
                } else if (ordinal == 4) {
                    throw new UnsupportedOperationException("ConversationType cannot be converted from an EMERGENCY ChatEndpoint type.");
                }
            }
            clnpVar.copyOnWrite();
            clns clnsVar3 = (clns) clnpVar.instance;
            clnsVar3.c = i - 1;
            clnsVar3.b |= 1;
            return (clns) clnpVar.build();
        }
        i = 1;
        clnpVar.copyOnWrite();
        clns clnsVar32 = (clns) clnpVar.instance;
        clnsVar32.c = i - 1;
        clnsVar32.b |= 1;
        return (clns) clnpVar.build();
    }
}
