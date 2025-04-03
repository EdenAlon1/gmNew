package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cncz implements cncs {
    public static final entd a = entd.c("BugleReactions");
    public final cnbg b;
    public final cmql c;
    public final cmqm d;
    public final ffbr e;
    public final auqo f;
    public final auqp g;
    public final auqs h;
    public final fayv i;
    public bdhg j;
    public MessageIdType k = bdhb.a;
    public fbwv l;
    private final cncr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final String s;
    private final ConversationIdType t;
    private Boolean u;
    private cmrm v;
    private cmrl w;
    private boolean x;
    private boolean y;
    private boolean z;

    public cncz(cnbg cnbgVar, cncr cncrVar, cmql cmqlVar, cmqm cmqmVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, auqo auqoVar, auqp auqpVar, auqs auqsVar, String str, fayv fayvVar, ConversationIdType conversationIdType) {
        this.b = cnbgVar;
        this.m = cncrVar;
        this.c = cmqlVar;
        this.d = cmqmVar;
        this.n = ffbrVar;
        this.o = ffbrVar2;
        this.p = ffbrVar3;
        this.q = ffbrVar4;
        this.r = ffbrVar5;
        this.e = ffbrVar6;
        this.f = auqoVar;
        this.g = auqpVar;
        this.h = auqsVar;
        this.s = str;
        this.i = fayvVar;
        this.t = conversationIdType;
    }

    public static MessageIdType d(buxz buxzVar) {
        buxo d = MessagesTable.d();
        d.z("ReactionsRcsReceiverImpl#queryMessageId");
        d.c(MessagesTable.c.a);
        d.g(buxzVar);
        d.x(1);
        buuo buuoVar = (buuo) d.b().o();
        try {
            if (!buuoVar.moveToFirst()) {
                buuoVar.close();
                return bdhb.a;
            }
            MessageIdType q = buuoVar.q();
            buuoVar.close();
            return q;
        } catch (Throwable th) {
            try {
                buuoVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final fbwv k() {
        if (!this.y) {
            this.y = true;
            ((ctsa) this.p.b()).a(this.s).ifPresent(new Consumer() { // from class: cncv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cncz.this.l = (fbwv) obj;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return this.l;
    }

    @Override // defpackage.cncs
    public final String a() {
        if (this.g.a()) {
            if (!i()) {
                return null;
            }
        } else if (!b()) {
            return null;
        }
        MessageCoreData v = ((bdmq) this.n.b()).v(c());
        if (v == null) {
            return null;
        }
        return ((cndj) this.o.b()).a(g(), f(), cmtc.a(((MessageData) v).i));
    }

    @Override // defpackage.cncs
    public final boolean b() {
        if (!this.z && j()) {
            this.z = true;
            ensz enszVar = (ensz) a.h();
            enszVar.Y(cmsm.i, g());
            enszVar.Y(cmsm.g, e());
            enszVar.Y(cmsm.e, c());
            ensn ensnVar = cmsm.j;
            cmrv b = cmrv.b(f().e);
            if (b == null) {
                b = cmrv.UNRECOGNIZED;
            }
            enszVar.Y(ensnVar, Boolean.valueOf(b == cmrv.REACTION_TYPE_UNSPECIFIED));
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/reactions/transport/rcsfallback/receiver/ReactionsRcsReceiverImpl", "isReaction", 149, "ReactionsRcsReceiverImpl.java")).q("ReactionsRcsReceiverImpl#isReaction");
        }
        return this.g.a() ? j() : i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MessageIdType c() {
        if (!this.x) {
            this.x = true;
            if (!e().i()) {
                e().g(new Consumer() { // from class: cncy
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        bdhg bdhgVar = (bdhg) obj;
                        String[] strArr = MessagesTable.a;
                        buxz buxzVar = new buxz();
                        buxzVar.G(bdhgVar);
                        buxzVar.B(false);
                        MessageIdType d = cncz.d(buxzVar);
                        cncz cnczVar = cncz.this;
                        cnczVar.k = d;
                        if (cnczVar.k.c()) {
                            buxz buxzVar2 = new buxz();
                            buxzVar2.O(bdhgVar);
                            buxzVar2.B(false);
                            cnczVar.k = cncz.d(buxzVar2);
                        }
                        if (((Boolean) cnczVar.e.b()).booleanValue() && cnczVar.k.c()) {
                            cnczVar.k = cmkc.a(cnczVar.e());
                        }
                        if (cnczVar.k.c()) {
                            buxz buxzVar3 = new buxz();
                            buxzVar3.G(bdhgVar);
                            cnczVar.k = cncz.d(buxzVar3);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return this.k;
            }
            if (h().booleanValue()) {
                return bdhb.a;
            }
            fbwv k = k();
            if (k != null) {
                engw a2 = cndf.a(this.t, (k.b == 2 ? (fbvt) k.c : fbvt.a).c, ((Integer) cmsk.d.e()).intValue());
                if (a2.size() == 1) {
                    this.k = (MessageIdType) a2.get(0);
                }
            }
        }
        return this.k;
    }

    public final bdhg e() {
        bdhg bdhgVar = this.j;
        if (bdhgVar != null) {
            return bdhgVar;
        }
        if (h().booleanValue()) {
            clbe.a(this.i).ifPresent(new Consumer() { // from class: cncw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cncz.this.j = bdhg.a((String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            clbh.a(this.i, clbg.REACTIONS_NAMESPACE, "In-Reply-To-Message-Id").ifPresent(new Consumer() { // from class: cncx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cncz.this.j = bdhg.a((String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (this.j == null) {
            this.j = bdhg.a;
        }
        return this.j;
    }

    public final cmrl f() {
        cmrl a2;
        cmrl cmrlVar = this.w;
        if (cmrlVar != null) {
            return cmrlVar;
        }
        if (!h().booleanValue()) {
            fbwv k = k();
            if (k != null) {
                this.w = cnee.a(k.b == 2 ? (fbvt) k.c : fbvt.a, (cmrq) this.q.b(), this.r);
            }
            if (this.w == null) {
                if (clbh.a(this.i, clbg.REACTIONS_NAMESPACE, "Message-Reply-Type").isPresent()) {
                    cncr cncrVar = this.m;
                    String str = this.s;
                    if (str == null) {
                        a2 = cmrq.a(cmrv.REACTION_TYPE_UNSPECIFIED);
                    } else {
                        cmrl a3 = cncrVar.a(str, (char) 8203);
                        cmrv b = cmrv.b(a3.e);
                        if (b == null) {
                            b = cmrv.UNRECOGNIZED;
                        }
                        a2 = b != cmrv.REACTION_TYPE_UNSPECIFIED ? a3 : cncrVar.a(str, (char) 8204);
                    }
                } else {
                    a2 = cmrq.a(cmrv.REACTION_TYPE_UNSPECIFIED);
                }
                this.w = a2;
            }
        } else if (emxe.c(this.s)) {
            this.w = cmrq.a(cmrv.REACTION_TYPE_UNSPECIFIED);
        } else {
            this.w = ((cmrq) this.q.b()).b(this.s);
        }
        return this.w;
    }

    public final cmrm g() {
        cmrm cmrmVar = this.v;
        if (cmrmVar != null) {
            return cmrmVar;
        }
        if (h().booleanValue()) {
            cmrm a2 = cncq.a(this.i);
            this.v = a2;
            return a2;
        }
        Optional a3 = clbh.a(this.i, clbg.REACTIONS_NAMESPACE, "Message-Reply-Type");
        if (!a3.isPresent()) {
            fbwv k = k();
            if (k != null) {
                this.v = cnee.b(k.b == 2 ? (fbvt) k.c : fbvt.a);
            }
        } else if ("message-reaction-add".equals(a3.get())) {
            this.v = cmrm.ADD_REACTION;
        } else if ("message-reaction-remove".equals(a3.get())) {
            this.v = cmrm.REMOVE_REACTION;
        }
        if (this.v == null) {
            this.v = cmrm.REACTION_ACTION_UNSPECIFIED;
        }
        return this.v;
    }

    public final Boolean h() {
        Boolean bool = this.u;
        if (bool != null) {
            return bool;
        }
        boolean z = false;
        if (!this.f.a()) {
            this.u = false;
            return false;
        }
        Optional b = clbe.b(this.i);
        if (b.isPresent() && (((String) b.get()).equals("+Reaction") || ((String) b.get()).equals("-Reaction"))) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.u = valueOf;
        return valueOf;
    }

    public final boolean i() {
        cmrv b = cmrv.b(f().e);
        if (b == null) {
            b = cmrv.UNRECOGNIZED;
        }
        return (b == cmrv.REACTION_TYPE_UNSPECIFIED || g() == cmrm.REACTION_ACTION_UNSPECIFIED || c().c()) ? false : true;
    }

    public final boolean j() {
        cmrv b = cmrv.b(f().e);
        if (b == null) {
            b = cmrv.UNRECOGNIZED;
        }
        return (b == cmrv.REACTION_TYPE_UNSPECIFIED && g() == cmrm.REACTION_ACTION_UNSPECIFIED && !e().k()) ? false : true;
    }
}
