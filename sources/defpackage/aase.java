package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aase implements zqy {
    public final czxn a;
    public final ffix b;
    public final ffix c;
    private final MessageId d;
    private final String e;

    public aase(MessageId messageId, czxn czxnVar, ffix ffixVar, ffix ffixVar2) {
        this.d = messageId;
        this.a = czxnVar;
        this.b = ffixVar;
        this.c = ffixVar2;
        String a = messageId.a();
        a.getClass();
        this.e = a;
    }

    @Override // defpackage.zqy
    public final MessageId a() {
        return this.d;
    }

    @Override // defpackage.dnmw
    public final String b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aase)) {
            return false;
        }
        aase aaseVar = (aase) obj;
        return ffkj.e(this.d, aaseVar.d) && ffkj.e(this.a, aaseVar.a) && ffkj.e(this.b, aaseVar.b) && ffkj.e(this.c, aaseVar.c);
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        czxn czxnVar = this.a;
        return ((((hashCode + (czxnVar == null ? 0 : czxnVar.hashCode())) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BugleToolstoneUiData(messageId=" + this.d + ", contentUiData=" + this.a + ", onCloseClick=" + this.b + ", onLinkClick=" + this.c + ")";
    }
}
