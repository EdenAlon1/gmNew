package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxj implements doue {
    final /* synthetic */ zxk a;
    final /* synthetic */ Uri b;
    final /* synthetic */ sme c;
    final /* synthetic */ MessageId d;

    public zxj(zxk zxkVar, Uri uri, sme smeVar, MessageId messageId) {
        this.a = zxkVar;
        this.b = uri;
        this.c = smeVar;
        this.d = messageId;
    }

    @Override // defpackage.doue
    public final void a(boolean z) {
        this.a.h.put(this.b, Boolean.valueOf(z));
        this.c.a(z);
        if (!z) {
            ((akzt) this.a.d.b()).c("Bugle.Vmt.HideTranscript.Click.Count");
            return;
        }
        ((akzt) this.a.d.b()).c("Bugle.Vmt.ViewTranscript.Click.Count");
        zxk zxkVar = this.a;
        axol.k(zxkVar.g, null, new zxi(zxkVar, null), 3);
    }

    @Override // defpackage.doue
    public final void b() {
        this.a.b.h(new aioj());
        ((akzt) this.a.d.b()).c("Bugle.Vmt.OpenSettingsPage.Click.Count");
    }

    @Override // defpackage.doue
    public final void c() {
        Optional optional = (Optional) this.a.c.b();
        if (!optional.isPresent()) {
            throw new IllegalStateException("ManualTranscriptionController not provided.");
        }
        ((sjb) optional.get()).a(this.d);
        ((akzt) this.a.d.b()).c("Bugle.Vmt.ManualTriggerTranscribe.Click.Count");
    }
}
