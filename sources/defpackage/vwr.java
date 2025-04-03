package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwr implements ellh {
    final /* synthetic */ vvn a;

    public vwr(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final akqr akqrVar = (akqr) ellfVar;
        final vvn vvnVar = this.a;
        vvnVar.bo.ifPresent(new Consumer() { // from class: vpg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                akqy.a(vvn.this.N, "SCHEDULED_MESSAGE_CONFIRM_DELETE_DIALOG_FRAGMENT_TAG");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        vvnVar.bj.ifPresent(new Consumer() { // from class: vph
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
                ((coja) obj).k(akqr.this.a());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}
