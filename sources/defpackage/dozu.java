package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dozu implements ffji {
    final /* synthetic */ dpaa a;
    final /* synthetic */ Uri b;
    final /* synthetic */ Bundle c;

    public dozu(dpaa dpaaVar, Uri uri, Bundle bundle) {
        this.a = dpaaVar;
        this.b = uri;
        this.c = bundle;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        Cursor query;
        String[] strArr = ((dpac) obj).a;
        query = this.a.a.getContentResolver().query(this.b, strArr, this.c, null);
        return query;
    }
}
