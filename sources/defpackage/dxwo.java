package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxwo implements erqj {
    final /* synthetic */ dxwe a;
    final /* synthetic */ dxbq b;
    final /* synthetic */ dxwq c;

    public dxwo(dxwq dxwqVar, dxwe dxweVar, dxbq dxbqVar) {
        this.a = dxweVar;
        this.b = dxbqVar;
        this.c = dxwqVar;
    }

    @Override // defpackage.erqj
    public final /* synthetic */ void b(Object obj) {
        if (!((dxvz) this.a).d.g()) {
            this.c.d.e(((dxbp) this.b).a);
            return;
        }
        cbka cbkaVar = (cbka) ((dxvz) this.a).d.c();
        cbkc cbkcVar = cbkaVar.a;
        final Uri uri = cbkaVar.c;
        final Uri uri2 = cbkaVar.d;
        cbjw cbjwVar = cbkaVar.b;
        csjb c = cbkc.a.c();
        c.I("Download succeeded, notifying callback");
        c.N(VCardConstants.PROPERTY_URL, uri);
        c.N("fileUri", uri2);
        c.r();
        try {
            try {
                for (final cblo cbloVar : ((cbkt) cbjwVar).b) {
                    ((cbkt) cbjwVar).c(new Runnable() { // from class: cbkn
                        @Override // java.lang.Runnable
                        public final void run() {
                            cblo cbloVar2 = cblo.this;
                            Uri uri3 = uri;
                            try {
                                cbloVar2.e(uri3.toString(), uri2);
                            } catch (RuntimeException e) {
                                cbkt.a.s("Error while calling #onSuccess", e);
                            }
                        }
                    });
                }
                ((cbkt) cbjwVar).b.clear();
            } catch (RuntimeException e) {
                csjb b = cbkc.a.b();
                b.I("Download callback onSuccess error");
                b.s(e);
            }
            cbkcVar.c.a.remove(uri);
            csjb c2 = cbkc.a.c();
            c2.y("remainingDownloads", cbkcVar.c.a.size());
            c2.r();
            elfr.l(erre.a, new dxwn(this, this.a, this.b), this.c.a);
        } catch (Throwable th) {
            cbkcVar.c.a.remove(uri);
            csjb c3 = cbkc.a.c();
            c3.y("remainingDownloads", cbkcVar.c.a.size());
            c3.r();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [dxwr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [dxwr, java.lang.Object] */
    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dxth.k(th, "%s: Download Future failed", "DownloaderImp");
        try {
            try {
                if (((dxvz) this.a).d.g()) {
                    Object c = ((dxvz) this.a).d.c();
                    cbkc cbkcVar = ((cbka) c).a;
                    Uri uri = ((cbka) c).c;
                    cbjw cbjwVar = ((cbka) c).b;
                    csjb b = cbkc.a.b();
                    b.I("Download failed");
                    b.N(VCardConstants.PROPERTY_URL, uri);
                    b.A("exception", th.getClass().getName());
                    b.A("message", th.getMessage());
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        b.A("cause", cause.getClass().getName());
                        b.A("causeMessage", cause.getMessage());
                    }
                    b.r();
                    try {
                        try {
                            cbjwVar.a(uri, th);
                        } catch (RuntimeException e) {
                            csjb b2 = cbkc.a.b();
                            b2.I("Callback error: #onFailure");
                            b2.s(e);
                        }
                        cbkcVar.c.a.remove(uri);
                        csjb c2 = cbkc.a.c();
                        c2.y("remainingDownloads", cbkcVar.c.a.size());
                        c2.r();
                    } catch (Throwable th2) {
                        cbkcVar.c.a.remove(uri);
                        csjb c3 = cbkc.a.c();
                        c3.y("remainingDownloads", cbkcVar.c.a.size());
                        c3.r();
                        throw th2;
                    }
                }
            } catch (RuntimeException unused) {
                dxth.e(th, "%s: Download Listener onFailure failed", "DownloaderImp");
            }
        } finally {
            if (((dxvz) this.a).d.g() && this.c.b.g()) {
                this.c.b.c().f(((dxvz) this.a).a);
            }
            this.c.d.e(((dxbp) this.b).a);
        }
    }
}
