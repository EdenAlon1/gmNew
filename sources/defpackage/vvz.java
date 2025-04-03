package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvz implements ellh {
    final /* synthetic */ vvn a;

    public vvz(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        if (!ctjd.c()) {
            return elli.a;
        }
        this.a.T(new Consumer() { // from class: voq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
                ((ugg) obj).h(true);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, null);
        return elli.a;
    }
}
