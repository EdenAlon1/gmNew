package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cjha {
    public abstract Context a();

    public abstract Uri b();

    public abstract cjia c();

    public abstract String d();

    public abstract String e();

    public final String f(int i) {
        String quantityString = a().getResources().getQuantityString(true != ((Boolean) cjja.c.e()).booleanValue() ? R.plurals.attachment_preview_photos_link_share_title_videos : R.plurals.attachment_preview_photos_link_share_title, i, Integer.valueOf(i));
        quantityString.getClass();
        return quantityString;
    }
}
