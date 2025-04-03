package defpackage;

import android.text.SpannableString;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aduv extends adux {
    private final SpannableString a;
    private final long b;
    private final MessageIdType c;

    public aduv(SpannableString spannableString, long j, MessageIdType messageIdType) {
        this.a = spannableString;
        this.b = j;
        this.c = messageIdType;
    }

    @Override // defpackage.adux
    public final long a() {
        return this.b;
    }

    @Override // defpackage.adux
    public final SpannableString b() {
        return this.a;
    }

    @Override // defpackage.adux
    public final MessageIdType c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adux) {
            adux aduxVar = (adux) obj;
            if (this.a.equals(aduxVar.b()) && this.b == aduxVar.a() && this.c.equals(aduxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        MessageIdType messageIdType = this.c;
        return "ProblematicMessage{displayText=" + this.a.toString() + ", timestamp=" + this.b + ", messageId=" + messageIdType.toString() + "}";
    }
}
