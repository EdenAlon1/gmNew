package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dozy implements ffji {
    final /* synthetic */ dpaa a;
    final /* synthetic */ Uri b;

    public dozy(dpaa dpaaVar, Uri uri) {
        this.a = dpaaVar;
        this.b = uri;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        return this.a.a.getContentResolver().query(this.b, ((dpac) obj).a, null, null, null);
    }
}
