package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uvj implements ellh {
    final /* synthetic */ uuy a;

    public uvj(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final cztm cztmVar = (cztm) ellfVar;
        final uuy uuyVar = this.a;
        uuyVar.S.ifPresent(new Consumer() { // from class: usu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((czto) obj).a(cztmVar, uuy.this.e);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}
