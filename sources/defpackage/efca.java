package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efca {
    public static Pair a(final ParcelFileDescriptor parcelFileDescriptor) {
        return Pair.create(new Uri.Builder().scheme("fd").opaquePart(String.valueOf(parcelFileDescriptor.getFd())).build(), new Closeable() { // from class: efbz
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                parcelFileDescriptor.close();
            }
        });
    }
}
