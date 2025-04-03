package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ampu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ampx b;
    final /* synthetic */ BugleConversation c;
    final /* synthetic */ ampp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ampu(ampx ampxVar, BugleConversation bugleConversation, ampp amppVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ampxVar;
        this.c = bugleConversation;
        this.d = amppVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ampu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final ampx ampxVar = this.b;
            final BugleConversation bugleConversation = this.c;
            final ampp amppVar = this.d;
            ampxVar.d.b("RichThemeControllerImpl#outgoingRichThemeUpdate", new Runnable() { // from class: ampt
                @Override // java.lang.Runnable
                public final void run() {
                    BugleConversation bugleConversation2 = bugleConversation;
                    ampp amppVar2 = amppVar;
                    ampx.f(bugleConversation2, amppVar2);
                    ampx ampxVar2 = ampx.this;
                    ffbr ffbrVar = ampxVar2.c;
                    ((cbup) ffbrVar.b()).d(ampx.e(bugleConversation2), ampxVar2.d(amppVar2));
                }
            });
            ampx ampxVar2 = this.b;
            BugleConversation bugleConversation2 = this.c;
            ampp amppVar2 = this.d;
            this.a = 1;
            Object a = ffra.a(ekxi.a(ampxVar2.b), new ampv(null, bugleConversation2, ampxVar2, amppVar2), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ampu(this.b, this.c, this.d, ffguVar);
    }
}
