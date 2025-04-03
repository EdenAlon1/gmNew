package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjmt extends cjmu {
    public final eyhs a;
    public final ffmo b;
    private final ContentType c;

    public cjmt(eyhs eyhsVar, ffmo ffmoVar, ContentType contentType) {
        eyhsVar.getClass();
        this.a = eyhsVar;
        this.b = ffmoVar;
        this.c = contentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjmt)) {
            return false;
        }
        cjmt cjmtVar = (cjmt) obj;
        return ffkj.e(this.a, cjmtVar.a) && ffkj.e(this.b, cjmtVar.b) && ffkj.e(this.c, cjmtVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        ContentType contentType = this.c;
        return (hashCode * 31) + (contentType == null ? 0 : contentType.hashCode());
    }

    public final String toString() {
        return "ProtoMessage(payload=" + this.a + ", clazz=" + this.b + ", contentType=" + this.c + ")";
    }
}
