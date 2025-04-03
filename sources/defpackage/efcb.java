package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcb {
    public static final Uri a(Uri.Builder builder, engr engrVar) {
        return builder.encodedFragment(efdg.a(engrVar.g())).build();
    }

    public static final void b(File file, Uri.Builder builder) {
        builder.path(file.getAbsolutePath());
    }
}
