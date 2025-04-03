package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cukw {
    public static final cukx a(int i) {
        ffdb ffdbVar = new ffdb(cukx.m);
        while (ffdbVar.hasNext()) {
            cukx cukxVar = (cukx) ffdbVar.next();
            if (cukxVar.l == i) {
                return cukxVar;
            }
        }
        return cukx.a;
    }

    public static final cukx b(int i) {
        switch (i - 2) {
            case 0:
                return cukx.a;
            case 1:
                return cukx.c;
            case 2:
                return cukx.e;
            case 3:
                return cukx.d;
            case 4:
                return cukx.f;
            case 5:
                return cukx.g;
            case 6:
                return cukx.h;
            case 7:
                return cukx.i;
            case 8:
                return cukx.j;
            case 9:
                return cukx.k;
            default:
                return cukx.a;
        }
    }
}
