package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edpc implements Parcelable, Comparable {
    public static edpc c(int i, int i2) {
        try {
            ednl ednlVar = new ednl(i, i2);
            int i3 = ednlVar.a;
            emxf.n(enop.c(0, 23).a(Integer.valueOf(i3)), "Hours must not be out-of-range: 0 to 23, but was: %s.", i3);
            int i4 = ednlVar.b;
            emxf.n(enop.c(0, 59).a(Integer.valueOf(i4)), "Minutes must not be out-of-range: 0 to 59, but was: %s.", i4);
            return ednlVar;
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int a();

    public abstract int b();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int a;
        int a2;
        edpc edpcVar = (edpc) obj;
        edpcVar.getClass();
        if (this == edpcVar) {
            return 0;
        }
        if (a() == edpcVar.a()) {
            a = b();
            a2 = edpcVar.b();
        } else {
            a = a();
            a2 = edpcVar.a();
        }
        return a - a2;
    }
}
