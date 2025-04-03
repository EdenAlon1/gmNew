package defpackage;

import android.content.ContentProviderClient;

/* compiled from: PG */
/* loaded from: classes.dex */
final class krg {
    public static final void a(ContentProviderClient contentProviderClient) {
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }
}
