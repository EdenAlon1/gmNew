package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyjd implements cyiw {
    public final ejvp a;
    public final cucf b;
    public final bctx c;
    public final cubo d;
    public final errl e;
    public bvvl f;
    private final ejvb g;
    private dtrs h;

    public cyjd(ejvb ejvbVar, ejvp ejvpVar, cucf cucfVar, bctx bctxVar, cubo cuboVar, errl errlVar) {
        this.g = ejvbVar;
        this.a = ejvpVar;
        this.b = cucfVar;
        this.c = bctxVar;
        this.d = cuboVar;
        this.e = errlVar;
    }

    @Override // defpackage.cyiw
    public final ejuh a(lkk lkkVar, final ConversationIdType conversationIdType) {
        bvvl bvvlVar = this.f;
        if (bvvlVar != null) {
            bvvlVar.P(this.h);
        }
        this.f = bcui.c(conversationIdType);
        cyjc cyjcVar = new cyjc(this, conversationIdType);
        this.h = cyjcVar;
        this.f.M(lkkVar, cyjcVar);
        return new ejuy(this.g, new eros() { // from class: cyix
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                final cyjd cyjdVar = cyjd.this;
                final bvvl bvvlVar2 = cyjdVar.f;
                elfl g = elfo.g(new Callable() { // from class: cyiz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return cyjd.this.c.a(bvvlVar2.y());
                    }
                }, cyjdVar.e);
                final ConversationIdType conversationIdType2 = conversationIdType;
                return new erph(g.i(new eroh() { // from class: cyja
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final bctw bctwVar = (bctw) obj;
                        final cyjd cyjdVar2 = cyjd.this;
                        final ConversationIdType conversationIdType3 = conversationIdType2;
                        return elfo.g(new Callable() { // from class: cyiy
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ArrayList f = bctwVar.f();
                                int size = f.size();
                                return new cyio(engw.n(cyjd.this.d.a(conversationIdType3, f)), size > 1, !r0.isEmpty());
                            }
                        }, cyjdVar2.e);
                    }
                }, erpp.a));
            }
        }, "SPAM_BANNER_STATE_KEY".concat(String.valueOf(String.valueOf(conversationIdType))));
    }

    @Override // defpackage.cyiw
    public final elfl b(final ConversationIdType conversationIdType, final String str, final boolean z, final erfe erfeVar) {
        return elfo.g(new Callable() { // from class: cyjb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                erfe erfeVar2 = erfe.UNKNOWN_USER_ACTION_TYPE;
                cukx cukxVar = cukx.b;
                eoko eokoVar = eoko.CONVERSATION_FROM_UNSPAM_ACTION;
                erfe erfeVar3 = erfeVar;
                erfe erfeVar4 = erfeVar3 != erfeVar2 ? erfeVar3 : null;
                cyjd.this.b.b(cuch.a(false, conversationIdType, str, cukxVar, z, false, eokoVar, null, erfeVar4, 3, 11, 2));
                return null;
            }
        }, this.e);
    }
}
