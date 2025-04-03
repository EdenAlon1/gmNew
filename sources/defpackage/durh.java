package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class durh extends duuf {
    static final int a = 3095175;
    final String b;

    public durh(int i, int i2) {
        super(c(a, i, i2));
        this.b = "";
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
        if (!(obj instanceof durh)) {
            return false;
        }
        durh durhVar = (durh) obj;
        return super.equals(obj) && this.h == durhVar.h && this.b.equals(durhVar.b);
    }

    @Override // defpackage.duuf
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.b});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.g("id", this.h);
        b.b("categoryName", this.b);
        return b.toString();
    }
}
