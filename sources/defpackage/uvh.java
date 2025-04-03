package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uvh implements ellh {
    final /* synthetic */ uuy a;

    public uvh(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final wfr wfrVar = (wfr) ellfVar;
        this.a.R.ifPresent(new Consumer() { // from class: uti
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cfup cfupVar = uuy.a;
                ((wfv) obj).c(wfr.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}
