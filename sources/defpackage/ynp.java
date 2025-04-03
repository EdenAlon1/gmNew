package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ynp implements ffxy {
    final /* synthetic */ you a;

    public ynp(you youVar) {
        this.a = youVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        if (((Number) obj).intValue() != this.a.k.get()) {
            return ffcu.a;
        }
        ensk e = you.a.e();
        e.Y(ente.a, "BugleComposeRow2");
        enrr enrrVar = (enrr) e;
        enrrVar.W(5, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$2$1", "emit", 324, "DraftTextUiAdapterImpl.kt")).q("Sending start typing notification");
        Object c = fgfz.c(this.a.c().b(), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }
}
