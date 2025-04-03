package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwu implements ellh {
    final /* synthetic */ vvn a;

    public vwu(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final akre akreVar = (akre) ellfVar;
        final vvn vvnVar = this.a;
        vvnVar.bo.ifPresent(new Consumer() { // from class: vju
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                akqy.c(vvn.this.N);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        vvnVar.bj.ifPresent(new Consumer() { // from class: vob
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                akre akreVar2 = akreVar;
                ejlp ejlpVar = new ejlp(((coja) obj).f(akreVar2.a()));
                ejlm ejlmVar = new ejlm(akreVar2.a());
                vvn vvnVar2 = vvn.this;
                vvnVar2.aL.i(ejlpVar, ejlmVar, vvnVar2.m);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}
