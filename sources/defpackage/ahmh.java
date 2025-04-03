package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahmh extends eadn {
    final /* synthetic */ ahmc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahmh(ahmc ahmcVar, eadl eadlVar, dypu dypuVar) {
        super(eadlVar, dypuVar);
        this.a = ahmcVar;
    }

    @Override // defpackage.eadn
    public final void a(final boolean z) {
        ahmc ahmcVar = this.a;
        final dzja dzjaVar = ahmcVar.e;
        final dzpg a = ahmcVar.f.a();
        ejlp ejlpVar = new ejlp(erqt.n(new erog() { // from class: eadm
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dzdp dzdpVar = eadn.this.b.a;
                dyxa c = dyxb.c();
                c.b(dyxf.g);
                ((dyww) c).a = "set read receipt";
                dyxb a2 = c.a();
                dzoo dzooVar = new dzoo();
                dzooVar.b(z);
                dzsi a3 = dzooVar.a();
                engw r = engw.r(1);
                dzci dzciVar = dzdpVar.a;
                UUID randomUUID = UUID.randomUUID();
                dzja dzjaVar2 = dzjaVar;
                return erny.f(dzciVar.b(randomUUID, new dzgb(dzjaVar2, a, a3, r), dzdpVar.a.d.c(), dzjaVar2, a2, true), new emwl() { // from class: dypt
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return ((dzop) ((dyqx) obj).a()).a.c();
                    }
                }, erpp.a);
            }
        }, this.a.c));
        ejlm ejlmVar = new ejlm(Boolean.valueOf(z));
        ahmc ahmcVar2 = this.a;
        ahmcVar2.g.i(ejlpVar, ejlmVar, ahmcVar2.i);
    }
}
