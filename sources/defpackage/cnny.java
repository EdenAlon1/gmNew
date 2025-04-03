package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnny {
    public static final cnue a(derl derlVar) {
        cnuc cnucVar = (cnuc) cnue.a.createBuilder();
        cnucVar.getClass();
        derk b = derk.b(derlVar.b);
        if (b == null) {
            b = derk.UNRECOGNIZED;
        }
        int ordinal = b.ordinal();
        int i = 2;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 3;
            } else if (ordinal == 2) {
                i = 4;
            } else {
                if (ordinal != 3) {
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(b))));
                }
                i = 1;
            }
        }
        cnuf.b(i, cnucVar);
        return cnuf.a(cnucVar);
    }
}
