package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eifm {
    public abstract Uri a();

    public abstract ContentType b();

    public final String toString() {
        return "FileMessageContent {contentType=" + dktx.GENERIC.c(b()) + ", contentUri=" + dktx.URI.c(a());
    }
}
