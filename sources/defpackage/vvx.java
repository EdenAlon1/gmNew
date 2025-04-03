package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvx implements ellh {
    final /* synthetic */ vvn a;

    public vvx(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        if (ctjd.c()) {
            vvn vvnVar = this.a;
            if (!vvnVar.bO.isEmpty() && !vvnVar.bN.isEmpty() && !vvnVar.bQ.isEmpty()) {
                ((wnn) vvnVar.bS.get()).a(new ffix() { // from class: vqd
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        enru enruVar = vvn.a;
                        return ffcu.a;
                    }
                });
                ((wiw) vvnVar.bO.get()).a(new vuv(vvnVar));
                vvnVar.T(new Consumer() { // from class: vqf
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = vvn.a;
                        ((ugg) obj).r(ugo.MAGIC_COMPOSE, true, true);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: vqg
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
