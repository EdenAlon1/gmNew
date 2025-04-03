package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpxs implements cpdd {
    private final Context a;
    private final cpxt b;

    public cpxs(Context context, cpxt cpxtVar) {
        context.getClass();
        this.a = context;
        this.b = cpxtVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Uri uri) {
        if (this.b.a() != null) {
            cpxt cpxtVar = this.b;
            akuv d = akuv.d("GOOGLE_MESSAGES_ARCHIVAL_UPDATE");
            String a = cpxtVar.a();
            a.getClass();
            d.f(a);
            Intent a2 = d.a();
            a2.getClass();
            if (uri != null) {
                a2.putExtra("com.google.android.apps.messaging.EXTRA_ARCHIVAL_URI", uri);
            }
            this.a.startService(a2);
        }
    }

    @Override // defpackage.cpdd
    public final void a(Uri uri, String str, String[] strArr, int i) {
        l(uri);
    }

    @Override // defpackage.cpdd
    public final void b(cpxu cpxuVar) {
        l(null);
    }

    @Override // defpackage.cpdd
    public final void c(Uri uri, UUID uuid) {
        l(uri);
    }

    @Override // defpackage.cpdd
    public final void d(cpxu cpxuVar) {
        l(null);
    }

    @Override // defpackage.cpdd
    public final void e(cpxu cpxuVar) {
        l(null);
    }

    @Override // defpackage.cpdd
    public final void f(Uri uri, UUID uuid) {
        l(uri);
    }

    @Override // defpackage.cpdd
    public final void g(Uri uri, UUID uuid) {
        l(uri);
    }

    @Override // defpackage.cpdd
    public final void h(Uri uri, String str, String[] strArr, int i) {
        l(uri);
    }

    @Override // defpackage.cpdd
    public final void i(Uri uri, int i, UUID uuid) {
        l(uri);
    }

    @Override // defpackage.cpdd
    public final void j(Uri uri, int i, UUID uuid) {
        l(uri);
    }
}
