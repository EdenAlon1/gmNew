package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbkj implements erqj {
    final /* synthetic */ Uri a;
    final /* synthetic */ cbkm b;

    public cbkj(cbkm cbkmVar, Uri uri) {
        this.a = uri;
        this.b = cbkmVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cbkt cbktVar = (cbkt) this.b.c.a.remove(this.a);
        if (cbktVar != null) {
            final Uri uri = this.a;
            for (final cblo cbloVar : cbktVar.b) {
                cbktVar.c(new Runnable() { // from class: cbko
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            cblo.this.a(uri.toString());
                        } catch (RuntimeException e) {
                            cbkt.a.s("Error while calling #onCancel", e);
                        }
                    }
                });
            }
            cbktVar.b.clear();
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        enrr enrrVar = (enrr) cbkm.a.h();
        enrrVar.Y(new ensn(VCardConstants.PROPERTY_URL, Uri.class, false, false), this.a);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader$1", "onFailure", 234, "RichCardMediaDownloadServiceDownloader.java")).q("Failed to cancel download.");
        cbkt cbktVar = (cbkt) this.b.c.a.remove(this.a);
        if (cbktVar != null) {
            cbktVar.a(this.a, new RuntimeException(th));
        }
    }
}
