package j$.util;

/* renamed from: j$.util.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
class C0186v extends C0049m implements java.util.Set, Set {
    private static final long serialVersionUID = -9215047833775013803L;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || this.a.equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }
}
