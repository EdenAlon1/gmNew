package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqrd extends ffhv implements ffjm {
    final /* synthetic */ aqre a;
    final /* synthetic */ engw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqrd(aqre aqreVar, engw engwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqreVar;
        this.b = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqrd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk e = aqre.a.e();
        e.Y(ente.a, "BugleRecipientSync");
        ((enrr) e.h("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl$onRecipientsUpdatedFromContacts$1", "invokeSuspend", 56, "RecipientContactSyncListenerImpl.kt")).q("Starting onRecipientsUpdatedFromContacts");
        final engw engwVar = this.b;
        aqre aqreVar = this.a;
        if (aqreVar.f.a()) {
            Optional optional = aqreVar.c;
            final ffji ffjiVar = new ffji() { // from class: aqqy
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    ffbr ffbrVar = (ffbr) obj2;
                    ffbrVar.getClass();
                    ((cvfy) ffbrVar.b()).c(engw.this);
                    return ffcu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: aqqz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    ffji.this.invoke(obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            Optional optional2 = aqreVar.b;
            final ffji ffjiVar2 = new ffji() { // from class: aqra
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    ffbr ffbrVar = (ffbr) obj2;
                    ffbrVar.getClass();
                    ((cvfe) ffbrVar.b()).e(engw.this);
                    return ffcu.a;
                }
            };
            optional2.ifPresent(new Consumer() { // from class: aqrb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    ffji.this.invoke(obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        ensk e2 = aqre.a.e();
        e2.Y(ente.a, "BugleRecipientSync");
        ((enrr) e2.h("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl$onRecipientsUpdatedFromContacts$1", "invokeSuspend", 58, "RecipientContactSyncListenerImpl.kt")).q("Finished onRecipientsUpdatedFromContacts");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqrd(this.a, this.b, ffguVar);
    }
}
