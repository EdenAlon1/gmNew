package defpackage;

import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehvu extends ehvx {
    private final PendingIntent a;
    private final boolean b;

    public ehvu(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.a = pendingIntent;
        this.b = z;
    }

    @Override // defpackage.ehvx
    public final PendingIntent a() {
        return this.a;
    }

    @Override // defpackage.ehvx
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehvx) {
            ehvx ehvxVar = (ehvx) obj;
            if (this.a.equals(ehvxVar.a()) && this.b == ehvxVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.a.toString() + ", isNoOp=" + this.b + "}";
    }
}
