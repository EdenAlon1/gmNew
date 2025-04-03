package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vxa implements ellh {
    final /* synthetic */ vvn a;

    public vxa(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        this.a.T(new Consumer() { // from class: vrx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
                ((ugg) obj).h(true);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vry
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                czgj czgjVar = (czgj) obj;
                enru enruVar = vvn.a;
                if (czgjVar != null) {
                    czgjVar.n(true);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}
