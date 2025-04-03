package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijk extends eijp {
    public final eyee a;
    public final ContentType b;

    public eijk(eyee eyeeVar, ContentType contentType) {
        this.a = eyeeVar;
        this.b = contentType;
    }

    @Override // defpackage.eijp
    public final ContentType a() {
        return this.b;
    }

    @Override // defpackage.eijp
    public final eyee b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eijp) {
            eijp eijpVar = (eijp) obj;
            if (this.a.equals(eijpVar.b()) && this.b.equals(eijpVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ContentType contentType = this.b;
        return "Content{content=" + this.a.toString() + ", contentType=" + contentType.toString() + "}";
    }
}
