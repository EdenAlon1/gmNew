package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class hmw {
    public static final void a(hmx hmxVar, int i, Object obj) {
        hmxVar.e[(hmxVar.f - hmxVar.a[hmxVar.b - 1].c) + i] = obj;
    }

    public static final void b(hmx hmxVar, int i, Object obj, int i2, Object obj2) {
        int i3 = hmxVar.f - hmxVar.a[hmxVar.b - 1].c;
        Object[] objArr = hmxVar.e;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void c(hmx hmxVar, Object obj, Object obj2, Object obj3) {
        int i = hmxVar.f - hmxVar.a[hmxVar.b - 1].c;
        Object[] objArr = hmxVar.e;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
