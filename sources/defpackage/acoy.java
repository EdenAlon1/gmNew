package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acoy implements adf {
    final /* synthetic */ acow a;

    public acoy(acow acowVar) {
        this.a = acowVar;
    }

    @Override // defpackage.adf
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            acow.a.r("fileDownloadCallback received null uri result; aborting download");
            return;
        }
        acow acowVar = this.a;
        if (acowVar.t == null) {
            acow.a.r("saveAttachmentTaskFactory is null; aborting download");
            return;
        }
        if (acowVar.D == null) {
            acow.a.r("fileDownloadUri is null; aborting download");
        }
        if (this.a.E == null) {
            acow.a.r("activeFileDownloadType is null; aborting download");
        }
        sfx a = ((sfy) this.a.t.b()).a("Bugle.Satellite.Attachment.Save.Duration");
        a.c(this.a.D, (Uri) optional.get(), this.a.E);
        a.e(new Void[0]);
    }
}
