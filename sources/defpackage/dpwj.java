package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpwj implements dpwl {
    public final Bitmap a;
    private final dszq b;

    public dpwj(Bitmap bitmap, dszq dszqVar) {
        this.a = bitmap;
        this.b = dszqVar;
    }

    @Override // defpackage.dpwl
    public final dszq a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpwj)) {
            return false;
        }
        dpwj dpwjVar = (dpwj) obj;
        return ffkj.e(this.a, dpwjVar.a) && ffkj.e(this.b, dpwjVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dszq dszqVar = this.b;
        return hashCode + (dszqVar == null ? 0 : dszqVar.hashCode());
    }

    public final String toString() {
        return "BitmapIcon(bitmap=" + this.a + ", backgroundColor=" + this.b + ")";
    }
}
