package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhiy implements dhgg {
    private final Status a;
    private final ParcelFileDescriptor b;

    public dhiy(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = status;
        this.b = parcelFileDescriptor;
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.dfri
    public final void b() {
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.dhgg
    public final ParcelFileDescriptor c() {
        return this.b;
    }
}
