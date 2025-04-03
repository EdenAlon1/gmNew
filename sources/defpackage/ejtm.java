package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejtm implements efka {
    final /* synthetic */ Uri a;
    final /* synthetic */ String[] b;
    final /* synthetic */ String c;
    final /* synthetic */ String[] d;
    final /* synthetic */ String e;
    final /* synthetic */ ejtr f;

    public ejtm(ejtr ejtrVar, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.a = uri;
        this.b = strArr;
        this.c = str;
        this.d = strArr2;
        this.e = str2;
        this.f = ejtrVar;
    }

    @Override // defpackage.efka
    public final Cursor a(CancellationSignal cancellationSignal) {
        return this.f.a.c(this.a, this.b, this.c, this.d, this.e, cancellationSignal);
    }

    @Override // defpackage.efka
    public final String b() {
        return ejno.f(this.b, this.a, this.c, this.e);
    }

    @Override // defpackage.efka
    public final void c() {
    }
}
