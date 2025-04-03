package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dibt implements dfri, dfrl {
    public final OutputStream a;
    private final Status b;

    public dibt(Status status, OutputStream outputStream) {
        dfwv.n(status);
        this.b = status;
        this.a = outputStream;
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.b;
    }

    @Override // defpackage.dfri
    public final void b() {
        OutputStream outputStream = this.a;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
