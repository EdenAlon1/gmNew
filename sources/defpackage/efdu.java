package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdu implements efbi {
    public static final ParcelFileDescriptor b(efbh efbhVar) {
        Pair b = efbhVar.b.b(efbhVar.f);
        try {
            if (efbhVar.b()) {
                throw new efcy(a.C(efbhVar.e, "Accessing file descriptor directly would skip transforms for "));
            }
            Uri uri = (Uri) b.first;
            if (!uri.getScheme().equals("fd")) {
                throw new efcv("Scheme must be 'fd'");
            }
            try {
                return ParcelFileDescriptor.fromFd(Integer.parseInt(uri.getSchemeSpecificPart()));
            } catch (NumberFormatException e) {
                throw new efcv(e);
            }
        } finally {
            ((Closeable) b.second).close();
        }
    }

    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        return b(efbhVar);
    }
}
