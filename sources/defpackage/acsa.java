package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.dittosatellite.intent.DittoAttachment;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class acsa extends DittoAttachment {
    public final Uri a;
    public final String b;

    public acsa(Uri uri, String str) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.a = uri;
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.b = str;
    }

    @Override // com.google.android.apps.messaging.dittosatellite.intent.DittoAttachment
    public final Uri a() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.dittosatellite.intent.DittoAttachment
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DittoAttachment) {
            DittoAttachment dittoAttachment = (DittoAttachment) obj;
            if (this.a.equals(dittoAttachment.a()) && this.b.equals(dittoAttachment.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DittoAttachment{uri=" + this.a.toString() + ", contentType=" + this.b + "}";
    }
}
