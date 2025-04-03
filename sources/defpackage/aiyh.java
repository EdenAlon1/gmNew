package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiyh {
    public static final Exception a(emeb emebVar) {
        int c = emebVar.c();
        int i = c - 1;
        if (c == 0) {
            throw null;
        }
        if (i == 1 || i == 2) {
            int c2 = emebVar.c();
            String a = emdz.a(c2);
            if (c2 != 0) {
                return new aizg(a, emebVar);
            }
            throw null;
        }
        if (i == 5) {
            return new aiyi(((emdx) emebVar).a);
        }
        switch (i) {
            case 8:
                int c3 = emebVar.c();
                String a2 = emdz.a(c3);
                if (c3 != 0) {
                    return new aiyd(a2, emebVar);
                }
                throw null;
            case 9:
                return new aiyf(emebVar);
            case 10:
                int c4 = emebVar.c();
                String a3 = emdz.a(c4);
                if (c4 != 0) {
                    return new aizg(a3, emebVar);
                }
                throw null;
            default:
                return new aizn(emebVar);
        }
    }
}
