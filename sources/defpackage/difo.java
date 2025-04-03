package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class difo implements Callable {
    final /* synthetic */ ParcelFileDescriptor a;
    final /* synthetic */ byte[] b;

    public difo(ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.a = parcelFileDescriptor;
        this.b = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (Log.isLoggable("WearableClient", 3)) {
            Log.d("WearableClient", "processAssets: writing data to FD : ".concat(String.valueOf(String.valueOf(this.a))));
        }
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.a);
        try {
            try {
                autoCloseOutputStream.write(this.b);
                autoCloseOutputStream.flush();
                if (Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "processAssets: wrote data: " + String.valueOf(this.a));
                }
                try {
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.a));
                    }
                    autoCloseOutputStream.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } finally {
                try {
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.a));
                    }
                    autoCloseOutputStream.close();
                } catch (IOException unused2) {
                }
            }
        } catch (IOException unused3) {
            Log.w("WearableClient", "processAssets: writing data failed: " + String.valueOf(this.a));
            return false;
        }
    }
}
