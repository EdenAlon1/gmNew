package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyfa implements dyda {
    final /* synthetic */ Uri a;
    final /* synthetic */ dyfb b;

    public dyfa(dyfb dyfbVar, Uri uri) {
        this.a = uri;
        this.b = dyfbVar;
    }

    @Override // defpackage.dyda
    public final void a() {
        this.b.a.b(this.a);
    }

    @Override // defpackage.dyda
    public final void b() {
        this.b.a.b(this.a);
    }
}
