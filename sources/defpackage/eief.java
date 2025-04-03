package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eief extends eifm {
    private final ContentType a;
    private final Uri b;

    public eief(ContentType contentType, Uri uri) {
        this.a = contentType;
        this.b = uri;
    }

    @Override // defpackage.eifm
    public final Uri a() {
        return this.b;
    }

    @Override // defpackage.eifm
    public final ContentType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eifm) {
            eifm eifmVar = (eifm) obj;
            if (this.a.equals(eifmVar.b()) && this.b.equals(eifmVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
