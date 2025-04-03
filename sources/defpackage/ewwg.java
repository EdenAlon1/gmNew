package defpackage;

import android.content.res.AssetFileDescriptor;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewwg extends AssetFileDescriptor implements Closeable {
    private ewwg() {
        super(null, 0L, 0L);
    }

    public static ewwg a(AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor == null) {
            return null;
        }
        return new ewwg(assetFileDescriptor);
    }

    private ewwg(AssetFileDescriptor assetFileDescriptor) {
        super(assetFileDescriptor.getParcelFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
