package defpackage;

import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djfk implements djaw {
    private eifa a = new eidy();
    private String b;
    private final engr c;

    public djfk(engr engrVar) {
        this.c = engrVar;
    }

    @Override // defpackage.djaw
    public final void a() {
        this.a = new eidy();
    }

    @Override // defpackage.djaw
    public final void b(byte[] bArr) {
        try {
            eifa eifaVar = this.a;
            eifaVar.c(ContentType.e(this.b));
            eifaVar.b(eyee.x(bArr));
        } catch (NullPointerException e) {
            throw new IOException("Error parsing content type in multi part CPIM message", e);
        }
    }

    @Override // defpackage.djaw
    public final void c() {
        this.c.h(AutoOneOf_Message_MessageContent.a(this.a.a()));
        this.a = new eidy();
        this.b = "";
    }

    @Override // defpackage.djaw
    public final void d(djax djaxVar) {
        if (emuz.e(djaxVar.a, fhpi.a)) {
            this.b = djaxVar.b;
        }
    }
}
