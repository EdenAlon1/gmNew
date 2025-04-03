package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbkk implements erqj {
    final /* synthetic */ Uri a;

    public cbkk(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        enrr enrrVar = (enrr) cbkm.a.h();
        enrrVar.Y(new ensn(VCardConstants.PROPERTY_URL, Uri.class, false, false), this.a);
        enrrVar.Y(new ensn("destination", Uri.class, false, false), (Uri) obj);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader$2", "onSuccess", 311, "RichCardMediaDownloadServiceDownloader.java")).q("RBM media has been downloaded.");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        enrr enrrVar = (enrr) ((enrr) cbkm.a.j()).g(th);
        enrrVar.Y(new ensn(VCardConstants.PROPERTY_URL, Uri.class, false, false), this.a);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader$2", "onFailure", 320, "RichCardMediaDownloadServiceDownloader.java")).q("RBM media has been downloaded.");
    }
}
