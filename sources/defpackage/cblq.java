package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cblq {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/richcard/common/RichCardMediaFileProviderUtil");

    public static final boolean a(Uri uri, Context context) {
        context.getClass();
        return ffkj.e(uri.getScheme(), "content") && ffkj.e(uri.getAuthority(), String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.richcard.RichCardMediaFileProvider")) && csum.g(uri.getPath());
    }

    public static final File b(Context context, String str, String str2) {
        str.getClass();
        File c = c(context);
        if (str2 != null && str2.length() != 0) {
            str = a.w(str2, str, ".");
        }
        File file = new File(c, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            canonicalPath.getClass();
            String canonicalPath2 = c(context).getCanonicalPath();
            canonicalPath2.getClass();
            if (ffpc.t(canonicalPath, canonicalPath2)) {
                return file;
            }
            ensk i = a.i();
            i.Y(ente.a, "Bugle");
            ((enrr) i.h("com/google/android/apps/messaging/shared/datamodel/richcard/common/RichCardMediaFileProviderUtil", "getFileWithExtension", 58, "RichCardMediaFileProviderUtil.kt")).D("getFile: path %s does not start with %s", file.getCanonicalPath(), c(context).getCanonicalPath());
            return null;
        } catch (IOException e) {
            ensk i2 = a.i();
            i2.Y(ente.a, "Bugle");
            ((enrr) i2.h("com/google/android/apps/messaging/shared/datamodel/richcard/common/RichCardMediaFileProviderUtil", "getFileWithExtension", 66, "RichCardMediaFileProviderUtil.kt")).t("getCanonicalPath failed.", e);
            return null;
        }
    }

    private static final File c(Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.getClass();
        return cacheDir;
    }
}
