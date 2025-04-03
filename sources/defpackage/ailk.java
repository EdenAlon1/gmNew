package defpackage;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ailk {
    private static final enru a = enru.c("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper");

    public static final ainw a(ade adeVar) {
        adeVar.getClass();
        if (adeVar.a != -1) {
            ((enrr) a.e().h("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper", "convertActivityResultToTypedUri", 21, "MediaViewerHelper.kt")).r("Skipping MediaViewer activity result because of resultCode %s", adeVar.a);
            return null;
        }
        Intent intent = adeVar.b;
        if (intent == null) {
            ((enrr) a.h().h("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper", "convertActivityResultToTypedUri", 28, "MediaViewerHelper.kt")).q("Skipping MediaViewer activity result because of null intent");
            return null;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        if (uri == null) {
            ((enrr) a.j().h("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper", "convertActivityResultToTypedUri", 34, "MediaViewerHelper.kt")).q("Skipping MediaViewer activity result because of null uri");
            return null;
        }
        String type = intent.getType();
        if (type != null) {
            return new ainw(type, uri);
        }
        ((enrr) a.j().h("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper", "convertActivityResultToTypedUri", 39, "MediaViewerHelper.kt")).q("Skipping MediaViewer activity result because of null type");
        return null;
    }
}
