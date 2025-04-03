package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxok extends cxop {
    private final Uri a;

    public cxok(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.cxop
    public final Uri a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxop) {
            return this.a.equals(((cxop) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "VideoAttachmentInlineFullScreenButtonClickedEvent{videoSource=" + this.a.toString() + "}";
    }
}
