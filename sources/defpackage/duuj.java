package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duuj extends duuf {
    static final int a = 3095270;

    public duuj(int i, int i2) {
        super(c(a, i, i2));
    }

    @Override // defpackage.duuf
    public final int a() {
        return a;
    }

    @Override // defpackage.duuf
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof duuj) {
            return super.equals(obj) && this.h == ((duuj) obj).h;
        }
        return false;
    }

    @Override // defpackage.duuf
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode())});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.g("id", this.h);
        return b.toString();
    }
}
