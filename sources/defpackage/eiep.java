package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_MessageClass;
import com.google.android.rcs.client.messaging.data.MessageClass;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiep extends eign {
    private eigp a;
    private eigo b;
    private boolean c;
    private boolean d;
    private byte e;

    @Override // defpackage.eign
    public final MessageClass a() {
        if (this.e == 3 && this.a != null && this.b != null) {
            return new AutoValue_MessageClass(this.a, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" messageSource");
        }
        if (this.b == null) {
            sb.append(" messagePriority");
        }
        if ((this.e & 1) == 0) {
            sb.append(" interworkingSupported");
        }
        if ((this.e & 2) == 0) {
            sb.append(" dispositionNotificationRequired");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eign
    public final void b(boolean z) {
        this.d = z;
        this.e = (byte) (this.e | 2);
    }

    @Override // defpackage.eign
    public final void c(boolean z) {
        this.c = z;
        this.e = (byte) (this.e | 1);
    }

    @Override // defpackage.eign
    public final void d(eigo eigoVar) {
        if (eigoVar == null) {
            throw new NullPointerException("Null messagePriority");
        }
        this.b = eigoVar;
    }

    @Override // defpackage.eign
    public final void e(eigp eigpVar) {
        if (eigpVar == null) {
            throw new NullPointerException("Null messageSource");
        }
        this.a = eigpVar;
    }
}
