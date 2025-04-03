package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sma implements ellf {
    public final MessageIdType a;
    public final String b;
    public final Uri c;

    public sma(MessageIdType messageIdType, String str, Uri uri) {
        this.a = messageIdType;
        this.b = str;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sma)) {
            return false;
        }
        sma smaVar = (sma) obj;
        return ffkj.e(this.a, smaVar.a) && ffkj.e(this.b, smaVar.b) && ffkj.e(this.c, smaVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TranscribeButtonClickEvent(messageId=" + this.a + ", partId=" + this.b + ", audioUri=" + this.c + ")";
    }
}
