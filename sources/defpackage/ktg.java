package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktg implements kth {
    private final ContentInfo.Builder a;

    public ktg(ClipData clipData, int i) {
        this.a = new ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.kth
    public final ktm a() {
        ContentInfo build;
        build = this.a.build();
        return new ktm(new ktj(build));
    }

    @Override // defpackage.kth
    public final void b(ClipData clipData) {
        this.a.setClip(clipData);
    }

    @Override // defpackage.kth
    public final void c(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.kth
    public final void d(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.kth
    public final void e(Uri uri) {
        this.a.setLinkUri(uri);
    }

    public ktg(ktm ktmVar) {
        this.a = new ContentInfo.Builder(ktmVar.f());
    }
}
