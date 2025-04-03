package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyll implements cyky {
    public final ejvp a;
    public final croc b;
    public final cpbs c;
    public final errl d;
    public final bctx e;
    public bvvl f;
    public bsnz g;
    private final ejvb h;
    private final ffbr i;
    private dtrs j;
    private dtrs k;

    public cyll(ejvb ejvbVar, ejvp ejvpVar, bctx bctxVar, ffbr ffbrVar, croc crocVar, cpbs cpbsVar, errl errlVar) {
        this.h = ejvbVar;
        this.a = ejvpVar;
        this.e = bctxVar;
        this.i = ffbrVar;
        this.b = crocVar;
        this.c = cpbsVar;
        this.d = errlVar;
    }

    @Override // defpackage.cyky
    public final ejuh a(lkk lkkVar, final ConversationIdType conversationIdType) {
        bsnz bsnzVar = this.g;
        if (bsnzVar != null) {
            bsnzVar.P(this.k);
        }
        bsob e = bsom.e();
        e.z("setupConversationsQuery");
        e.g(new Function() { // from class: cyle
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bskp) obj).q;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.i(new Function() { // from class: cylf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                bsolVar.q(ConversationIdType.this);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.g = e.b();
        cylj cyljVar = new cylj(this, conversationIdType);
        this.k = cyljVar;
        this.g.M(lkkVar, cyljVar);
        bvvl bvvlVar = this.f;
        if (bvvlVar != null) {
            bvvlVar.P(this.j);
        }
        this.f = bcui.c(conversationIdType);
        cylk cylkVar = new cylk(this, conversationIdType);
        this.j = cylkVar;
        this.f.M(lkkVar, cylkVar);
        return new ejuy(this.h, new eros() { // from class: cyla
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                final cyll cyllVar = cyll.this;
                final elfl g = elfo.g(new Callable() { // from class: cylb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cyll cyllVar2 = cyll.this;
                        return cyllVar2.e.a(cyllVar2.f.y());
                    }
                }, cyllVar.d);
                final elfl g2 = elfo.g(new Callable() { // from class: cylc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return cyll.this.g.y();
                    }
                }, cyllVar.d);
                elfn k = elfo.k(g, g2);
                final ConversationIdType conversationIdType2 = conversationIdType;
                return new erph(k.b(new erog() { // from class: cyld
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final bctw bctwVar = (bctw) erqt.q(g);
                        final List list = (List) erqt.q(g2);
                        final cyll cyllVar2 = cyll.this;
                        final ConversationIdType conversationIdType3 = conversationIdType2;
                        return elfo.g(new Callable() { // from class: cylh
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                List list2;
                                int i;
                                ArrayList f = bctwVar.f();
                                if (f == null || f.isEmpty() || conversationIdType3.b() || (list2 = list) == null || list2.isEmpty()) {
                                    return new cykq(null, 5, byyt.UNARCHIVED);
                                }
                                bseh bsehVar = (bseh) list2.get(0);
                                boolean z = f.size() == 1;
                                byyt G = bsehVar.G();
                                boolean z2 = G == byyt.SPAM_FOLDER;
                                boolean z3 = z || z2;
                                ParticipantsTable.BindData a = crsg.a(f);
                                if (a == null) {
                                    if (z2) {
                                        i = 3;
                                        a = null;
                                    }
                                    i = 0;
                                } else if (z && a.Y()) {
                                    i = 1;
                                } else if (a.ab() && cuky.a(a.n()).c() && z3) {
                                    i = 2;
                                } else {
                                    if (a.ab() && z2) {
                                        i = 4;
                                    }
                                    i = 0;
                                }
                                if (i == 0) {
                                    return new cykq(null, 5, G);
                                }
                                if (i != 1 && z) {
                                    if (cyll.this.c.d(((ParticipantsTable.BindData) f.get(0)).U())) {
                                        return new cykq(null, 5, G);
                                    }
                                }
                                return new cykq(a, i, G);
                            }
                        }, cyllVar2.d);
                    }
                }, cyllVar.d));
            }
        }, "UNBLOCK_UNSPAM_BANNER_STATE_KEY".concat(String.valueOf(String.valueOf(conversationIdType))));
    }

    @Override // defpackage.cyky
    public final elfl b(final ConversationIdType conversationIdType) {
        return elfo.g(new Callable() { // from class: cykz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(cyll.this.b.a(conversationIdType, byyt.SPAM_FOLDER, eoko.CONVERSATION_FROM_UNSPAM_ACTION));
            }
        }, this.d);
    }

    @Override // defpackage.cyky
    public final elfl c(final ConversationIdType conversationIdType) {
        return elfo.g(new Callable() { // from class: cylg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(cyll.this.b.a(conversationIdType, byyt.UNARCHIVED, eoko.CONVERSATION_FROM_UNSPAM_ACTION));
            }
        }, this.d);
    }

    @Override // defpackage.cyky
    public final elfl d(ConversationIdType conversationIdType, eoko eokoVar, ParticipantsTable.BindData bindData, int i) {
        crse o;
        if (cubs.a().booleanValue()) {
            o = crsf.o();
            BugleConversationId bugleConversationId = new BugleConversationId(conversationIdType);
            crrr crrrVar = (crrr) o;
            crrrVar.e = bugleConversationId;
            crrrVar.f = bindData.S();
            crrrVar.a = false;
            crrrVar.b = false;
            crrrVar.h = eokoVar;
            crrrVar.j = 3;
            crrrVar.k = i;
        } else {
            o = crsf.o();
            crrr crrrVar2 = (crrr) o;
            crrrVar2.d = conversationIdType;
            crrrVar2.f = bindData.S();
            crrrVar2.a = false;
            crrrVar2.b = false;
            crrrVar2.h = eokoVar;
            crrrVar2.j = 3;
            crrrVar2.k = i;
        }
        return ((crrt) this.i.b()).a(o.a().n()).h(new emwl() { // from class: cyli
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                crsn crsnVar = (crsn) obj;
                return crsnVar == null ? crsn.a : crsnVar;
            }
        }, erpp.a);
    }

    @Override // defpackage.cyky
    public final elfl e(eoko eokoVar, crsn crsnVar, int i) {
        return ((crrt) this.i.b()).a(crsc.c(crsnVar, eokoVar, i));
    }
}
