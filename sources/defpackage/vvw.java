package defpackage;

import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvw implements ellh {
    final /* synthetic */ vvn a;

    public vvw(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        if (ctjd.c()) {
            final vvn vvnVar = this.a;
            if (!vvnVar.bP.isEmpty() && !vvnVar.bS.isEmpty() && !vvnVar.bO.isEmpty()) {
                ((wiw) vvnVar.bO.get()).c(new vuv(vvnVar));
                ((wnn) vvnVar.bS.get()).a(new ffix() { // from class: vnn
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        final vvn vvnVar2 = vvn.this;
                        ((czrq) vvnVar2.bP.get()).a(vvnVar2.M, new ffji() { // from class: vkl
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                final vvn vvnVar3 = vvn.this;
                                vvnVar3.aM((String) obj);
                                vvnVar3.S(new Consumer() { // from class: vqr
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj2) {
                                        ((uav) obj2).f(vvn.this.cC.ag());
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                }, new Consumer() { // from class: vqs
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj2) {
                                        enru enruVar = vvn.a;
                                        ((ComposeMessageView) obj2).H().F();
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                vvnVar3.T(new Consumer() { // from class: vqt
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj2) {
                                        ugg uggVar = (ugg) obj2;
                                        if (vvn.this.ch) {
                                            uggVar.r(ugo.IME, false, false);
                                        }
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                }, null);
                                return ffcu.a;
                            }
                        });
                        return ffcu.a;
                    }
                });
                vvnVar.T(new Consumer() { // from class: vno
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = vvn.a;
                        ((ugg) obj).r(ugo.MAGIC_COMPOSE, true, true);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: vnq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = vvn.a;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return elli.a;
            }
        }
        return elli.a;
    }
}
