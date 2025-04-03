package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smr implements doue {
    final /* synthetic */ String a;
    final /* synthetic */ sme b;
    final /* synthetic */ sms c;
    final /* synthetic */ crly d;
    final /* synthetic */ MessageIdType e;
    final /* synthetic */ Uri f;
    final /* synthetic */ smu g;

    public smr(smu smuVar, String str, sme smeVar, sms smsVar, crly crlyVar, MessageIdType messageIdType, Uri uri) {
        this.g = smuVar;
        this.a = str;
        this.b = smeVar;
        this.c = smsVar;
        this.d = crlyVar;
        this.e = messageIdType;
        this.f = uri;
    }

    @Override // defpackage.doue
    public final void a(boolean z) {
        this.g.a.put(this.a, Boolean.valueOf(z));
        this.b.a(z);
        if (!z) {
            ((akzt) this.c.c.b()).c("Bugle.Vmt.HideTranscript.Click.Count");
            return;
        }
        ((akzt) this.c.c.b()).c("Bugle.Vmt.ViewTranscript.Click.Count");
        sms smsVar = this.c;
        axol.k(smsVar.f, null, new smq(smsVar, null), 3);
    }

    @Override // defpackage.doue
    public final void b() {
        Context context = ((ComposeView) this.d.b()).getContext();
        context.getClass();
        smv.b(context);
        ((akzt) this.c.c.b()).c("Bugle.Vmt.OpenSettingsPage.Click.Count");
    }

    @Override // defpackage.doue
    public final void c() {
        MessageIdType messageIdType = this.e;
        sms smsVar = this.c;
        elbx elbxVar = smsVar.b;
        String str = this.a;
        ekzm b = elbxVar.b("TranscriptionUiController#transcribeAction");
        try {
            ellj.g(new sma(messageIdType, str, this.f), this.d.b());
            ((akzt) smsVar.c.b()).c("Bugle.Vmt.ManualTriggerTranscribe.Click.Count");
            ffig.a(b, null);
        } finally {
        }
    }
}
