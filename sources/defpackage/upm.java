package defpackage;

import android.graphics.Rect;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class upm extends uvo {
    private final Uri a;
    private final Rect b;

    public upm(Uri uri, Rect rect) {
        this.a = uri;
        this.b = rect;
    }

    @Override // defpackage.uvo
    public final Rect a() {
        return this.b;
    }

    @Override // defpackage.uvo
    public final Uri b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uvo) {
            uvo uvoVar = (uvo) obj;
            if (this.a.equals(uvoVar.b()) && this.b.equals(uvoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Rect rect = this.b;
        return "MessageListImageAttachmentClickEvent{contentUri=" + this.a.toString() + ", imageBounds=" + rect.toString() + "}";
    }
}
