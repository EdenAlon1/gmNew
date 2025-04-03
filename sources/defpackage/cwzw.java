package defpackage;

import defpackage.cwvn;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwzw implements ellh {
    final /* synthetic */ cwzu a;

    public cwzw(cwzu cwzuVar) {
        this.a = cwzuVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        cwzu cwzuVar = this.a;
        cxan b = cwzuVar.b();
        comc comcVar = b.b;
        final boolean z = ((cwvn.a) ellfVar).a;
        elfl j = comcVar.j(new emwl() { // from class: cxai
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cwzz cwzzVar = (cwzz) obj;
                int i = cxan.d;
                cwzzVar.getClass();
                cwzy builder = cwzzVar.toBuilder();
                builder.copyOnWrite();
                cwzz cwzzVar2 = (cwzz) builder.instance;
                cwzzVar2.b |= 64;
                cwzzVar2.i = z;
                return builder.build();
            }
        });
        b.j(j);
        cwzuVar.V.i(ejlp.b(j), new ejlm(cwzuVar.l), cwzuVar.v);
        return elli.a;
    }
}
