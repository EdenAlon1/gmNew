package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vvd implements ejwd<cymp> {
    final /* synthetic */ vvn a;

    public vvd(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        ensk j = vvn.a.j();
        j.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) j;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$3", "onError", 1874, "ConversationFragmentPeer.java")).q("ConversationFragment: Unable to load scale factor from data store: loading default scale factor");
        this.a.U.c("Bugle.ConversationScale.ConversationScaleLoadFailed.Count");
        ((Optional) this.a.bf.b()).ifPresent(new Consumer() { // from class: vun
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cync) obj).i(((Float) cync.b.e()).floatValue());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final cymp cympVar = (cymp) obj;
        if (((Boolean) ((cfup) cymy.a.get()).e()).booleanValue()) {
            ((Optional) this.a.bf.b()).ifPresent(new Consumer() { // from class: vul
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    cymp cympVar2 = cymp.this;
                    cync cyncVar = (cync) obj2;
                    if (cympVar2.d) {
                        cyncVar.i(cympVar2.c);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            ((Optional) this.a.bf.b()).ifPresent(new Consumer() { // from class: vum
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    ((cync) obj2).i(cymp.this.c);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
