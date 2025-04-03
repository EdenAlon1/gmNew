package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzg {
    public final int a;
    public final CharSequence b;

    static {
        ffew.f(new ffcf(5, 5), new ffcf(12, 12), new ffcf(1, 1), new ffcf(7, 7), new ffcf(9, 9), new ffcf(11, 11), new ffcf(14, 14), new ffcf(4, 4), new ffcf(15, 15), new ffcf(3, 3), new ffcf(2, 2), new ffcf(10, 10), new ffcf(8, 8));
    }

    public kzg(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kzg) {
            kzg kzgVar = (kzg) obj;
            if (this.a == kzgVar.a && ffkj.e(this.b, kzgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }
}
