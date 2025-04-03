package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uvi implements ellh {
    final /* synthetic */ uuy a;

    public uvi(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final wfg wfgVar = (wfg) ellfVar;
        this.a.R.ifPresent(new Consumer() { // from class: utd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cfup cfupVar = uuy.a;
                ((wfv) obj).b(wfg.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}
