package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.auto.MessagingTemplateScreenServiceModule;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snt extends cfp {
    final /* synthetic */ MessagingTemplateScreenServiceModule c;

    public snt(MessagingTemplateScreenServiceModule messagingTemplateScreenServiceModule) {
        this.c = messagingTemplateScreenServiceModule;
    }

    @Override // defpackage.cfp
    public final cfl c() {
        ensk e = MessagingTemplateScreenServiceModule.c.e();
        e.Y(ente.a, "BugleAppOnAuto");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/auto/MessagingTemplateScreenServiceModule$1", "onCreateScreen", 73, "MessagingTemplateScreenServiceModule.java")).q("CarAppService onCreateScreen");
        MessagingTemplateScreenServiceModule messagingTemplateScreenServiceModule = this.c;
        snq snqVar = (snq) messagingTemplateScreenServiceModule.d.b();
        ffbr ffbrVar = snqVar.a;
        cex a = a();
        Context context = (Context) ffbrVar.b();
        context.getClass();
        ffbr ffbrVar2 = snqVar.b;
        errl errlVar = (errl) snqVar.c.b();
        errlVar.getClass();
        messagingTemplateScreenServiceModule.h = new snp(context, ffbrVar2, errlVar, snqVar.d, snqVar.e, snqVar.f, snqVar.g, snqVar.h, snqVar.i, snqVar.j, a);
        return this.c.h;
    }
}
