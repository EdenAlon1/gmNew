package defpackage;

import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edpb implements Parcelable, Comparable {
    public static edpb e(int i, int i2, int i3) {
        ednj ednjVar = new ednj(i, i2, i3);
        int i4 = ednjVar.b;
        enop c = enop.c(1, 12);
        Integer valueOf = Integer.valueOf(i4);
        emxf.d(c.a(valueOf), "Month must not be out of range of 1 to 12, but was: %s.", i4);
        int i5 = ednjVar.c;
        enop c2 = enop.c(1, 31);
        Integer valueOf2 = Integer.valueOf(i5);
        emxf.d(c2.a(valueOf2), "Day must not be out of range of 1 to 31, but was: %s.", i5);
        if (Arrays.asList(4, 6, 9, 11).contains(valueOf)) {
            emxf.g(enop.c(1, 30).a(valueOf2), "%s is not a valid day for month %s.", i5, i4);
        }
        if (i4 == 2) {
            int i6 = ednjVar.a;
            emxf.j(enop.c(1, Integer.valueOf(i6 % 4 == 0 ? 29 : 28)).a(valueOf2), "%s is not a valid day for month %s in year %s.", valueOf2, 2, Integer.valueOf(i6));
        }
        return ednjVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(edpb edpbVar) {
        int a;
        int a2;
        edpbVar.getClass();
        if (this == edpbVar) {
            return 0;
        }
        if (c() != edpbVar.c()) {
            a = c();
            a2 = edpbVar.c();
        } else if (b() != edpbVar.b()) {
            a = b();
            a2 = edpbVar.b();
        } else {
            a = a();
            a2 = edpbVar.a();
        }
        return a - a2;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "%s-%s-%s", Integer.valueOf(c()), String.format(Locale.getDefault(), "%02d", Integer.valueOf(b())), String.format(Locale.getDefault(), "%02d", Integer.valueOf(a())));
    }
}
