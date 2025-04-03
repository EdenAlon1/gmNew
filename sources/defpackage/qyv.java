package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qyv implements rao {
    private final AssetManager a;
    private final qys b;

    public qyv(AssetManager assetManager, qys qysVar) {
        this.a = assetManager;
        this.b = qysVar;
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        Uri uri = (Uri) obj;
        return new ran(new rjn(uri), this.b.a(this.a, uri.toString().substring(22)));
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
