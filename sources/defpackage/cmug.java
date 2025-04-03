package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmug implements cmtj {
    public static final entd a = entd.c("BugleReactions");
    public final ffbr b;
    public final MessageCoreData c;
    public final ffbz d;
    public final boolean f;
    private final ffbr g;
    private final ffsk h;
    private final ffbz i = ffca.a(new ffix() { // from class: cmtv
        @Override // defpackage.ffix
        public final Object invoke() {
            cmug cmugVar = cmug.this;
            boolean z = false;
            if (((auqo) cmugVar.b.b()).a() && clbe.b(cmugVar.c.aa()).isPresent()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    });
    private final ffbz j = ffca.a(new ffix() { // from class: cmtw
        @Override // defpackage.ffix
        public final Object invoke() {
            cmug cmugVar = cmug.this;
            if (cmugVar.g()) {
                Optional b = clbe.b(cmugVar.c.aa());
                final ffji ffjiVar = new ffji() { // from class: cmtn
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        entd entdVar = cmug.a;
                        if (str != null) {
                            int hashCode = str.hashCode();
                            if (hashCode != -1237286534) {
                                if (hashCode == 2036612408 && str.equals("-Custom-Reaction")) {
                                    return cmrm.REMOVE_REACTION;
                                }
                            } else if (str.equals("+Custom-Reaction")) {
                                return cmrm.ADD_REACTION;
                            }
                        }
                        return cmrm.REACTION_ACTION_UNSPECIFIED;
                    }
                };
                return (cmrm) b.map(new Function() { // from class: cmto
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        entd entdVar = cmug.a;
                        return ffji.this.invoke(obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(cmrm.REACTION_ACTION_UNSPECIFIED);
            }
            Optional a2 = clbh.a(cmugVar.c.aa(), clbg.EMOTIFY_REACTIONS_NAMESPACE, "Message-Reply-Type");
            final ffji ffjiVar2 = new ffji() { // from class: cmtp
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    entd entdVar = cmug.a;
                    if (str != null) {
                        int hashCode = str.hashCode();
                        if (hashCode != -1867304189) {
                            if (hashCode == 45320930 && str.equals("message-reaction-remove")) {
                                return cmrm.REMOVE_REACTION;
                            }
                        } else if (str.equals("message-reaction-add")) {
                            return cmrm.ADD_REACTION;
                        }
                    }
                    return cmrm.REACTION_ACTION_UNSPECIFIED;
                }
            };
            return (cmrm) a2.map(new Function() { // from class: cmtq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    entd entdVar = cmug.a;
                    return ffji.this.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(cmrm.REACTION_ACTION_UNSPECIFIED);
        }
    });
    private final ffbz k = ffca.a(new ffix() { // from class: cmtx
        @Override // defpackage.ffix
        public final Object invoke() {
            cmug cmugVar = cmug.this;
            Optional a2 = cmugVar.g() ? clbe.a(cmugVar.c.aa()) : clbh.a(cmugVar.c.aa(), clbg.EMOTIFY_REACTIONS_NAMESPACE, "In-Reply-To-Message-Id");
            final cmuf cmufVar = cmuf.a;
            Object orElse = a2.map(new Function() { // from class: cmtr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    entd entdVar = cmug.a;
                    return ffji.this.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(bdhg.a);
            orElse.getClass();
            final bdhg bdhgVar = (bdhg) orElse;
            if (!cmugVar.g() || cmugVar.d() != cmrm.REMOVE_REACTION || !bdhgVar.k()) {
                return bdhgVar;
            }
            bdhg bdhgVar2 = null;
            try {
                buxo d = MessagesTable.d();
                d.z("EmotifyReactionsRcsReceiverImpl#reactedRcsMessageId");
                d.v(MessagesTable.c.a);
                bueb a3 = bueg.a();
                a3.u();
                buxo d2 = MessagesTable.d();
                d2.u();
                dtvy i = dtvz.i(d2.b(), MessagesTable.c.a, bueg.c.b);
                ((dtrd) i).e = "reaction_message";
                dtvy i2 = dtvz.i(((bueb) a3.j(i)).b(), bueg.c.d, MessagesTable.c.a);
                ((dtrd) i2).e = "reacted_message";
                d.D(i2.g());
                d.h(new Function() { // from class: cmud
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        entd entdVar = cmug.a;
                        buxzVar.as(new dtzq("$V{J:reaction_message} = $V", new Object[]{MessagesTable.c.C, bdhg.this.b}));
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                d.f(new Function() { // from class: cmtm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        entd entdVar = cmug.a;
                        return ((buum) obj).C;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                MessagesTable.BindData bindData = (MessagesTable.BindData) ((buuo) d.b().o()).cS();
                if (bindData != null) {
                    bdhgVar2 = bindData.G();
                }
            } catch (IllegalStateException e) {
                ensz enszVar = (ensz) ((ensz) cmug.a.j()).g(e);
                enszVar.Y(csux.p, cmugVar.c.z());
                enszVar.Y(csux.m, cmugVar.c.aA());
                enszVar.Y(cmsm.c, bdhgVar);
                enszVar.Y(cmsm.a, cmugVar.c.B());
                enszVar.Y(cmsm.t, cmugVar.f());
                enszVar.q("Unable to find reacted RCS message ID for reaction.");
            }
            return bdhgVar2 == null ? bdhg.a : bdhgVar2;
        }
    });
    private final ffbz l = ffca.a(new ffix() { // from class: cmty
        @Override // defpackage.ffix
        public final Object invoke() {
            final cmug cmugVar = cmug.this;
            if (cmugVar.c().i()) {
                return bdhb.a;
            }
            cmugVar.c().getClass();
            MessageIdType h = cmug.h("EmotifyReactionsRcsReceiverImpl#getReactedMessageId_original", new ffji() { // from class: cmtt
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    buxzVar.getClass();
                    buxzVar.G(cmug.this.c());
                    buxzVar.B(false);
                    return buxzVar;
                }
            });
            if (h != null) {
                return h;
            }
            cmugVar.c().getClass();
            MessageIdType h2 = cmug.h("EmotifyReactionsRcsReceiverImpl#getReactedMessageId", new ffji() { // from class: cmtu
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    buxzVar.getClass();
                    buxzVar.O(cmug.this.c());
                    buxzVar.B(false);
                    return buxzVar;
                }
            });
            return h2 == null ? bdhb.a : h2;
        }
    });
    private final ffbz m = ffca.a(new ffix() { // from class: cmtz
        @Override // defpackage.ffix
        public final Object invoke() {
            return (String) fflm.b(clbh.a(cmug.this.c.aa(), clbg.EMOTIFY_REACTIONS_NAMESPACE, "Reaction-Emotify-Id"));
        }
    });
    private final ffbz n = ffca.a(new ffix() { // from class: cmua
        @Override // defpackage.ffix
        public final Object invoke() {
            cmug cmugVar = cmug.this;
            boolean z = false;
            if (cmugVar.g() && cmugVar.d() != cmrm.REACTION_ACTION_UNSPECIFIED) {
                z = true;
            }
            return (cmugVar.f() == null && z) ? UUID.randomUUID().toString() : cmugVar.f();
        }
    });
    public final ffbz e = ffca.a(new ffix() { // from class: cmub
        @Override // defpackage.ffix
        public final Object invoke() {
            cmug cmugVar = cmug.this;
            boolean z = false;
            if (cmugVar.d() != cmrm.REACTION_ACTION_UNSPECIFIED && !cmugVar.b().c() && cmugVar.e() != null) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    });

    public cmug(ffbr ffbrVar, final ffbr ffbrVar2, ffsk ffskVar, ffbr ffbrVar3, MessageCoreData messageCoreData) {
        this.g = ffbrVar;
        this.h = ffskVar;
        this.b = ffbrVar3;
        this.c = messageCoreData;
        this.d = ffca.a(new ffix() { // from class: cmtl
            @Override // defpackage.ffix
            public final Object invoke() {
                entd entdVar = cmug.a;
                Object b = ffbr.this.b();
                b.getClass();
                return (dqze) fflm.b((Optional) b);
            }
        });
        boolean z = true;
        if (d() != cmrm.ADD_REACTION && d() != cmrm.REPLACE_REACTION) {
            z = false;
        }
        this.f = z;
    }

    public static final MessageIdType h(String str, final ffji ffjiVar) {
        buxo d = MessagesTable.d();
        d.z(str);
        d.c(MessagesTable.c.a);
        d.h(new Function() { // from class: cmuc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                entd entdVar = cmug.a;
                buxzVar.getClass();
                return (buxz) ffji.this.invoke(buxzVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.x(1);
        dtsu o = d.b().o();
        try {
            buuo buuoVar = (buuo) o;
            if (!buuoVar.moveToFirst()) {
                ffig.a(o, null);
                return null;
            }
            MessageIdType q = buuoVar.q();
            ffig.a(o, null);
            return q;
        } finally {
        }
    }

    @Override // defpackage.cmtj
    public final void a() {
        Object obj;
        cmrs cmrsVar;
        String str;
        cmrs cmrsVar2 = null;
        if (d() == cmrm.REMOVE_REACTION) {
            ensz enszVar = (ensz) a.h();
            enszVar.Y(csux.p, this.c.z());
            enszVar.Y(csux.m, this.c.aA());
            enszVar.Y(cmsm.a, this.c.B());
            enszVar.Y(cmsm.i, d());
            enszVar.Y(cmsm.t, f());
            enszVar.q("Processing incoming Emotify reaction.");
            cnbg cnbgVar = (cnbg) this.g.b();
            ConversationIdType z = this.c.z();
            MessageIdType b = b();
            MessageCoreData messageCoreData = this.c;
            cmrl cmrlVar = cmrl.a;
            String aA = messageCoreData.aA();
            if (aA != null) {
                cmrr cmrrVar = (cmrr) cmrs.a.createBuilder();
                cmrrVar.getClass();
                cmrh cmrhVar = (cmrh) cmri.a.createBuilder();
                cmrhVar.getClass();
                cmrj.c(aA, cmrhVar);
                cmrt.b(cmrj.a(cmrhVar), cmrrVar);
                cmrsVar2 = cmrt.a(cmrrVar);
            }
            cnbgVar.a(cnbs.a(z, b, cmrlVar, cmrsVar2, d(), null), this.c.B());
            return;
        }
        Iterator it = this.c.ab().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (le.n(((MessagePartCoreData) obj).V())) {
                    break;
                }
            }
        }
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
        if (messagePartCoreData != null) {
            ensz enszVar2 = (ensz) a.h();
            enszVar2.Y(csux.p, this.c.z());
            enszVar2.Y(csux.m, this.c.aA());
            enszVar2.Y(cmsm.a, this.c.B());
            enszVar2.Y(cmsm.i, d());
            enszVar2.Y(cmsm.s, String.valueOf(messagePartCoreData.t()));
            enszVar2.Y(cmsm.t, f());
            enszVar2.q("Processing incoming Emotify reaction.");
            if (e() == null || messagePartCoreData.t() == null) {
                return;
            }
            cnbg cnbgVar2 = (cnbg) this.g.b();
            ConversationIdType z2 = this.c.z();
            MessageIdType b2 = b();
            String e = e();
            e.getClass();
            Uri t = messagePartCoreData.t();
            t.getClass();
            String aa = messagePartCoreData.aa();
            String uri = t.toString();
            uri.getClass();
            draj h = dran.h(new dqzc(e, uri, aa, false, null, null, null, 0, 0, 0L, null, null, 4088));
            cmrk cmrkVar = (cmrk) cmrl.a.createBuilder();
            cmrkVar.getClass();
            cmru.c(h.c, cmrkVar);
            cmru.d(cmrv.EMOTIFY, cmrkVar);
            cmru.b(h, cmrkVar);
            MessageCoreData messageCoreData2 = this.c;
            cmrl a2 = cmru.a(cmrkVar);
            String aA2 = messageCoreData2.aA();
            if (aA2 != null) {
                cmrr cmrrVar2 = (cmrr) cmrs.a.createBuilder();
                cmrrVar2.getClass();
                if (((auqo) this.b.b()).a() && (str = this.c.E().b) != null) {
                    cmrt.c(str, cmrrVar2);
                }
                cmrh cmrhVar2 = (cmrh) cmri.a.createBuilder();
                cmrhVar2.getClass();
                cmrj.c(aA2, cmrhVar2);
                cmrt.b(cmrj.a(cmrhVar2), cmrrVar2);
                cmrsVar = cmrt.a(cmrrVar2);
            } else {
                cmrsVar = null;
            }
            cnbgVar2.a(cnbs.a(z2, b2, a2, cmrsVar, d(), null), this.c.B());
            axol.k(this.h, null, new cmue(this, messagePartCoreData, null), 3);
        }
    }

    public final MessageIdType b() {
        return (MessageIdType) this.l.a();
    }

    public final bdhg c() {
        return (bdhg) this.k.a();
    }

    public final cmrm d() {
        return (cmrm) this.j.a();
    }

    public final String e() {
        return (String) this.n.a();
    }

    public final String f() {
        return (String) this.m.a();
    }

    public final boolean g() {
        return ((Boolean) this.i.a()).booleanValue();
    }
}
