package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cndv implements cndo {
    public static final entd a = entd.c("BugleReactions");
    public final errl b;
    public final errl c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final bcsf i;
    public final akzt j;
    public final cmsl k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final cndx p;
    public final ffbr q;
    public final atky r;

    public cndv(errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcsf bcsfVar, akzt akztVar, cmsl cmslVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, cndx cndxVar, ffbr ffbrVar10, atky atkyVar) {
        this.b = errlVar;
        this.c = errlVar2;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = bcsfVar;
        this.j = akztVar;
        this.k = cmslVar;
        this.l = ffbrVar6;
        this.m = ffbrVar7;
        this.n = ffbrVar8;
        this.o = ffbrVar9;
        this.p = cndxVar;
        this.q = ffbrVar10;
        this.r = atkyVar;
    }

    @Override // defpackage.cndo
    public final elfl a(final MessageIdType messageIdType, final cmrl cmrlVar, final cmrm cmrmVar, final eprt eprtVar, final int i) {
        return elfo.h(new erog() { // from class: cnds
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final bcse e;
                boolean z;
                elfl i2;
                final cmrl cmrlVar2;
                final cndh cndhVar;
                final cmrm cmrmVar2;
                elfl h;
                final cndv cndvVar = cndv.this;
                final MessageIdType messageIdType2 = messageIdType;
                final boolean z2 = true;
                if (cndvVar.r.a()) {
                    bifu bifuVar = (bifu) ((bcsy) cndvVar.o.b()).f(new MessageIdType[]{messageIdType2}).o();
                    try {
                        e = bifuVar.moveToFirst() ? cndvVar.i.c(bifuVar) : null;
                        bifuVar.close();
                    } finally {
                    }
                } else {
                    bjjd bjjdVar = (bjjd) ((bcsq) cndvVar.n.b()).g(new MessageIdType[]{messageIdType2}).o();
                    try {
                        e = bjjdVar.moveToFirst() ? cndvVar.i.e(bjjdVar) : null;
                        bjjdVar.close();
                    } finally {
                    }
                }
                if (e == null) {
                    ensz a2 = cndv.a.a(Level.WARNING);
                    a2.Y(cmsm.d, messageIdType2.b());
                    ((ensz) a2.h("com/google/android/apps/messaging/shared/reactions/transport/sender/proxy/ReactionsSenderProxyImpl", "sendReaction", 142, "ReactionsSenderProxyImpl.java")).q("Proxy could not send reaction due to missing ConversationMessageData.");
                    cndvVar.j.e("Bugle.MessageReactions.SenderProxy.Error.Type", 1);
                    return elfo.e(false);
                }
                bseh b = bsom.b(e.t());
                if (b == null) {
                    ensz a3 = cndv.a.a(Level.WARNING);
                    a3.Y(csux.o, e.t().toString());
                    a3.Y(cmsm.d, messageIdType2.b());
                    ((ensz) a3.h("com/google/android/apps/messaging/shared/reactions/transport/sender/proxy/ReactionsSenderProxyImpl", "sendReaction", 158, "ReactionsSenderProxyImpl.java")).q("Proxy could not send reaction due to missing conversation data.");
                    cndvVar.j.e("Bugle.MessageReactions.SenderProxy.Error.Type", 2);
                    return elfo.e(false);
                }
                boolean z3 = ((bzqc) cndvVar.g.b()).g() && b.l() != 0;
                int i3 = i;
                ConversationIdType C = b.C();
                SelfIdentityId g = ((bdtd) cndvVar.q.b()).g(i3).g();
                bdhg v = e.v().k() ? e.v() : e.w();
                final eprt eprtVar2 = eprtVar;
                final cndh cndhVar2 = new cndh(C, i3, g, new cmsw(e.u(), v, cmtc.a(e.g)), new cmqi(eprtVar2, z3));
                int r = b.r();
                boolean z4 = ((ckds) cndvVar.e.b()).J(i3) && !(r == 1 || r == 2);
                boolean x = ((djrv) cndvVar.f.b()).x(i3);
                if (b.k() == 2 || (z4 && x)) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                final cmrm cmrmVar3 = cmrmVar;
                final cmrl cmrlVar3 = cmrlVar;
                if (b.k() != 2 || b.m() == 0) {
                    final ConversationIdType C2 = b.C();
                    if (b.k() != 0) {
                        if (b.k() != 2) {
                            z = false;
                        }
                        i2 = elfo.e(Boolean.valueOf(z));
                    } else {
                        i2 = elfo.g(new Callable() { // from class: cndp
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cndv cndvVar2 = cndv.this;
                                List L = ((bczy) cndvVar2.h.b()).L(C2);
                                emxf.b(((enou) L).c == 1, "Conversation has more than one participant.");
                                return ((aolr) cndvVar2.l.b()).q((ParticipantsTable.BindData) L.get(0));
                            }
                        }, cndvVar.b).i(new eroh() { // from class: cndt
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                Optional e2 = ((aoku) obj).e();
                                if (e2.isEmpty()) {
                                    return elfo.e(false);
                                }
                                cndv cndvVar2 = cndv.this;
                                return ((azaw) cndvVar2.m.b()).d((awui) e2.get()).h(new emwl() { // from class: cndu
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        return Boolean.valueOf(((avlk) obj2).g());
                                    }
                                }, cndvVar2.c);
                            }
                        }, cndvVar.c);
                    }
                    elfl elflVar = i2;
                    emwl emwlVar = new emwl() { // from class: cndr
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            Boolean bool = (Boolean) obj;
                            boolean z5 = false;
                            if (z2 && bool.booleanValue()) {
                                z5 = true;
                            }
                            cndi cndiVar = cndhVar2;
                            if (z5 && ((cmsw) ((cndh) cndiVar).d).b.i()) {
                                return Optional.empty();
                            }
                            if (!z5 && !e.ar()) {
                                return Optional.empty();
                            }
                            cmrm cmrmVar4 = cmrmVar3;
                            return Optional.ofNullable(cndv.this.p.a(z5, cndiVar, cmrlVar3, cmrmVar4).b);
                        }
                    };
                    cmrlVar2 = cmrlVar3;
                    cndhVar = cndhVar2;
                    cmrmVar2 = cmrmVar3;
                    h = elflVar.h(emwlVar, cndvVar.b);
                } else {
                    h = elfo.e(Optional.empty());
                    cmrlVar2 = cmrlVar3;
                    cmrmVar2 = cmrmVar3;
                    cndhVar = cndhVar2;
                }
                final bcse bcseVar = e;
                return h.h(new emwl() { // from class: cndq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        boolean z5;
                        Optional optional = (Optional) obj;
                        boolean isEmpty = optional.isEmpty();
                        cndv cndvVar2 = cndv.this;
                        if (isEmpty) {
                            bcse bcseVar2 = bcseVar;
                            MessageIdType messageIdType3 = messageIdType2;
                            ensz a4 = cndv.a.a(Level.WARNING);
                            a4.Y(csux.o, bcseVar2.t().toString());
                            a4.Y(cmsm.d, messageIdType3.b());
                            ((ensz) a4.h("com/google/android/apps/messaging/shared/reactions/transport/sender/proxy/ReactionsSenderProxyImpl", "sendReactionInternal", 206, "ReactionsSenderProxyImpl.java")).q("Proxy could not send reaction due to unknown transport.");
                            cndvVar2.j.e("Bugle.MessageReactions.SenderProxy.Error.Type", 3);
                            z5 = false;
                        } else {
                            cndi cndiVar = cndhVar;
                            cmrm cmrmVar4 = cmrmVar2;
                            ensz a5 = cndv.a.a(cndvVar2.k.a());
                            a5.Y(cmsm.q, (cndn) optional.get());
                            ((ensz) a5.h("com/google/android/apps/messaging/shared/reactions/transport/sender/proxy/ReactionsSenderProxyImpl", "sendReactionInternal", 216, "ReactionsSenderProxyImpl.java")).q("Ditto reaction send transport type. ");
                            if (cndvVar2.k.b()) {
                                eprt eprtVar3 = eprtVar2;
                                cmtd cmtdVar = ((cndh) cndiVar).d;
                                ensz a6 = cndv.a.a(cndvVar2.k.a());
                                cmsw cmswVar = (cmsw) cmtdVar;
                                a6.Y(cmsm.d, cmswVar.a.toString());
                                a6.Y(cmsm.f, cmswVar.b.f());
                                a6.Y(cmsm.h, eprtVar3);
                                a6.Y(cmsm.i, cmrmVar4);
                                ((ensz) a6.h("com/google/android/apps/messaging/shared/reactions/transport/sender/proxy/ReactionsSenderProxyImpl", "sendReactionInternal", 230, "ReactionsSenderProxyImpl.java")).q("Proxy initiating reaction sending.");
                            }
                            ((cndk) cndvVar2.d.b()).a((cndn) optional.get(), cndiVar, cmrlVar2, cmrmVar4);
                            z5 = true;
                        }
                        return Boolean.valueOf(z5);
                    }
                }, cndvVar.b);
            }
        }, this.b);
    }
}
