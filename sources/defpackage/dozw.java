package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dozw implements ffji {
    final /* synthetic */ dpaa a;
    final /* synthetic */ Uri b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;

    public dozw(dpaa dpaaVar, Uri uri, String str, String str2) {
        this.a = dpaaVar;
        this.b = uri;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        String[] strArr = ((dpac) obj).a;
        return this.a.a.getContentResolver().query(this.b, strArr, this.c, null, this.d);
    }
}
