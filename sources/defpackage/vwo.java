package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwo implements ellh {
    final /* synthetic */ vvn a;

    public vwo(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final akpu akpuVar = (akpu) ellfVar;
        final vvn vvnVar = this.a;
        vvnVar.bo.ifPresent(new Consumer() { // from class: vny
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ea eaVar = vvn.this.N;
                akqx a = akpuVar.a();
                akqy.a(eaVar, "SCHEDULED_MESSAGE_CONFIRM_DELETE_DIALOG_FRAGMENT_TAG");
                akqy.a(eaVar, "OVERWRITE_DRAFT_DIALOG_FRAGMENT_TAG");
                akqt akqtVar = new akqt();
                fbae.e(akqtVar);
                ekku.a(akqtVar, a);
                akqy.b(eaVar, akqtVar, "SCHEDULED_MESSAGE_DIALOG_FRAGMENT_TAG");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}
