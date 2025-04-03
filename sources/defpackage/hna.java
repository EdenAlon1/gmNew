package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class hna {
    public final cop a;

    public /* synthetic */ hna(cop copVar) {
        this.a = copVar;
    }

    public static final Object a(cop copVar, Object obj) {
        Object f = copVar.f(obj);
        if (f == null) {
            return null;
        }
        if (!(f instanceof cok)) {
            copVar.b(obj);
            return f;
        }
        cok cokVar = (cok) f;
        if (cokVar.o()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = cokVar.c - 1;
        Object l = cokVar.l(i);
        cokVar.a(i);
        l.getClass();
        if (cokVar.o()) {
            copVar.b(obj);
        }
        if (cokVar.c != 1) {
            return l;
        }
        copVar.e(obj, cokVar.k());
        return l;
    }

    public static final void b(cop copVar, Object obj, Object obj2) {
        int a = copVar.a(obj);
        boolean z = a < 0;
        Object obj3 = z ? null : copVar.c[a];
        if (obj3 != null) {
            if (obj3 instanceof cok) {
                cok cokVar = (cok) obj3;
                cokVar.h(obj2);
                obj2 = cokVar;
            } else {
                obj2 = coz.a(obj3, obj2);
            }
        }
        if (!z) {
            copVar.c[a] = obj2;
            return;
        }
        int i = ~a;
        copVar.b[i] = obj;
        copVar.c[i] = obj2;
    }

    public static final void c(cop copVar, Object obj, ffji ffjiVar) {
        Object f = copVar.f(obj);
        if (f != null) {
            if (!(f instanceof cok)) {
                if (((Boolean) ffjiVar.invoke(f)).booleanValue()) {
                    copVar.b(obj);
                    return;
                }
                return;
            }
            cok cokVar = (cok) f;
            int i = cokVar.c;
            Object[] objArr = cokVar.b;
            int i2 = 0;
            ffmj q = ffmk.q(0, cokVar.c);
            int i3 = q.a;
            int i4 = q.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) ffjiVar.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            ffdo.d(objArr, null, i - i2, i);
            cokVar.c -= i2;
            if (cokVar.o()) {
                copVar.b(obj);
            }
            if (cokVar.c == 0) {
                copVar.e(obj, cokVar.k());
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hna) && ffkj.e(this.a, ((hna) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
