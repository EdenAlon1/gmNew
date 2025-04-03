package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egad {
    private final Context a;

    public egad(Context context) {
        this.a = context;
    }

    public final Uri a(String str) {
        String format = String.format("%s.%s", this.a.getPackageName(), "photopicker_images");
        Context context = this.a;
        if (!context.getCacheDir().exists()) {
            context.getCacheDir().mkdirs();
        }
        File file = new File(context.getCacheDir(), "photopicker_images");
        if (!file.exists()) {
            file.mkdirs();
        }
        return FileProvider.a(this.a, format, new File(file, str));
    }
}
