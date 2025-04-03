package defpackage;

import android.content.ClipDescription;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyo {
    public final kyn a;

    public kyo(kyn kynVar) {
        this.a = kynVar;
    }

    public final ClipDescription a() {
        ClipDescription description;
        description = this.a.a.getDescription();
        return description;
    }

    public final Uri b() {
        Uri contentUri;
        contentUri = this.a.a.getContentUri();
        return contentUri;
    }

    public final void c() {
        this.a.a.requestPermission();
    }
}
