package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dicm implements dfrl, dfri {
    public volatile ParcelFileDescriptor a;
    public volatile InputStream b;
    public volatile boolean c = false;
    private final Status d;

    public dicm(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.d = status;
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.d;
    }

    @Override // defpackage.dfri
    public final void b() {
        if (this.a == null) {
            return;
        }
        if (this.c) {
            throw new IllegalStateException("releasing an already released result.");
        }
        try {
            if (this.b != null) {
                this.b.close();
            } else {
                this.a.close();
            }
            this.c = true;
            this.a = null;
            this.b = null;
        } catch (IOException unused) {
        }
    }
}
