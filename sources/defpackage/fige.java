package defpackage;

import android.os.ParcelFileDescriptor;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fige implements figg {
    final /* synthetic */ ParcelFileDescriptor a;

    public fige(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.figg
    public final FileChannel a() {
        if (this.a.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(this.a).getChannel();
        }
        this.a.close();
        throw new IllegalArgumentException("Not a file: ".concat(String.valueOf(String.valueOf(this.a))));
    }
}
