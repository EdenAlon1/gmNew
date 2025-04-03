package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijj extends eijo {
    private eyee a;
    private ContentType b;

    @Override // defpackage.eijo
    public final eijp a() {
        ContentType contentType;
        eyee eyeeVar = this.a;
        if (eyeeVar != null && (contentType = this.b) != null) {
            return new eijk(eyeeVar, contentType);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" content");
        }
        if (this.b == null) {
            sb.append(" contentType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eijo
    public final void b(eyee eyeeVar) {
        if (eyeeVar == null) {
            throw new NullPointerException("Null content");
        }
        this.a = eyeeVar;
    }

    @Override // defpackage.eijo
    public final void c(ContentType contentType) {
        if (contentType == null) {
            throw new NullPointerException("Null contentType");
        }
        this.b = contentType;
    }
}
