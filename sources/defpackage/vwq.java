package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwq implements ellh {
    final /* synthetic */ vvn a;

    public vwq(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final akqs akqsVar = (akqs) ellfVar;
        final vvn vvnVar = this.a;
        vvnVar.bo.ifPresent(new Consumer() { // from class: vkr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ea eaVar = vvn.this.N;
                akqx a = akqsVar.a();
                akqy.a(eaVar, "SCHEDULED_MESSAGE_DIALOG_FRAGMENT_TAG");
                akqo akqoVar = new akqo();
                fbae.e(akqoVar);
                ekku.a(akqoVar, a);
                akqy.b(eaVar, akqoVar, "SCHEDULED_MESSAGE_CONFIRM_DELETE_DIALOG_FRAGMENT_TAG");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}
