package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fedm {
    private final Status a;
    private final Object b;

    public fedm(Status status, Object obj) {
        this.a = status;
        this.b = obj;
    }

    public static fedm b(Status status) {
        status.getClass();
        fedm fedmVar = new fedm(status, null);
        emxf.f(!status.f(), "cannot use OK status: %s", status);
        return fedmVar;
    }

    public final Status a() {
        Status status = this.a;
        return status == null ? Status.b : status;
    }

    public final Object c() {
        if (this.a == null) {
            return this.b;
        }
        throw new IllegalStateException("No value present.");
    }

    public final boolean d() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fedm)) {
            return false;
        }
        fedm fedmVar = (fedm) obj;
        if (d() == fedmVar.d()) {
            return d() ? emxb.a(this.b, fedmVar.b) : emxb.a(this.a, fedmVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        Status status = this.a;
        if (status == null) {
            b.b(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, this.b);
        } else {
            b.b("error", status);
        }
        return b.toString();
    }
}
