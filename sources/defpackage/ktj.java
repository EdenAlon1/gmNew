package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ktj implements ktk {
    private final ContentInfo a;

    public ktj(ContentInfo contentInfo) {
        ksw.h(contentInfo);
        this.a = contentInfo;
    }

    @Override // defpackage.ktk
    public final int a() {
        int flags;
        flags = this.a.getFlags();
        return flags;
    }

    @Override // defpackage.ktk
    public final int b() {
        int source;
        source = this.a.getSource();
        return source;
    }

    @Override // defpackage.ktk
    public final ClipData c() {
        ClipData clip;
        clip = this.a.getClip();
        return clip;
    }

    @Override // defpackage.ktk
    public final Uri d() {
        Uri linkUri;
        linkUri = this.a.getLinkUri();
        return linkUri;
    }

    @Override // defpackage.ktk
    public final Bundle e() {
        Bundle extras;
        extras = this.a.getExtras();
        return extras;
    }

    @Override // defpackage.ktk
    public final ContentInfo f() {
        return this.a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
