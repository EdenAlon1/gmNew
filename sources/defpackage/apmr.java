package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import j$.util.Objects;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apmr {
    private static final entd a = entd.c("BugleMapi");
    private final ctud b;
    private final Context c;

    public apmr(Context context, ctud ctudVar) {
        this.c = context;
        this.b = ctudVar;
    }

    public final Uri a(Uri uri, Uri uri2) {
        if (uri2 != null && Objects.equals(uri2.getScheme(), "file") && this.b.s()) {
            String path = uri2.getPath();
            if (path != null) {
                File file = new File(path);
                if (file.exists()) {
                    try {
                        Context context = this.c;
                        uri = FileProvider.a(context, apms.a(context), file);
                    } catch (RuntimeException e) {
                        ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/message/content/AttachmentContentUriProvider", "getAccessibleUri", 73, "AttachmentContentUriProvider.java")).D("Can't convert file uri to content uri %s %s.", uri2, e.getMessage());
                    }
                } else {
                    ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/message/content/AttachmentContentUriProvider", "getAccessibleUri", 77, "AttachmentContentUriProvider.java")).t("File does not exist, original uri file path: %s, fallback to content uri", file);
                }
            } else {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/message/content/AttachmentContentUriProvider", "getAccessibleUri", 81, "AttachmentContentUriProvider.java")).q("originalUri.getPath() is null, fallback to content uri");
            }
        } else if (uri2 == null) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/message/content/AttachmentContentUriProvider", "getAccessibleUri", 51, "AttachmentContentUriProvider.java")).q("Original uri is null, fallback to content uri");
        } else if (Objects.equals(uri2.getScheme(), "file")) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/message/content/AttachmentContentUriProvider", "getAccessibleUri", 57, "AttachmentContentUriProvider.java")).q("Does not have storage permission to resolve original file uri, fallback to content uri");
        } else {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/message/content/AttachmentContentUriProvider", "getAccessibleUri", 53, "AttachmentContentUriProvider.java")).D("Original uri scheme %s is not %s, fallback to content uri", uri2.getScheme(), "file");
        }
        return uri != null ? uri : Uri.EMPTY;
    }
}
