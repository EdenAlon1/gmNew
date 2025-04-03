package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qst extends qsr {
    public final Drawable a;
    private final qsx b;

    public qst(qsx qsxVar, Drawable drawable) {
        qsxVar.getClass();
        this.b = qsxVar;
        this.a = drawable;
        int ordinal = qsxVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return;
        }
        if (ordinal == 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (ordinal != 3) {
            throw new ffcd();
        }
    }

    @Override // defpackage.qsr
    public final qsx a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qst)) {
            return false;
        }
        qst qstVar = (qst) obj;
        return this.b == qstVar.b && ffkj.e(this.a, qstVar.a);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Drawable drawable = this.a;
        return hashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "Placeholder(status=" + this.b + ", placeholder=" + this.a + ")";
    }
}
