package defpackage;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wch implements wbh {
    public final Context a;
    public final errl b;
    public final errl c;
    public final ejvp d;
    public final cubr e;
    public final bctx f;
    public final ffbr g;
    public final ffbr h;
    public final cthz i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    private final bzac o;
    private final ejvb p;
    private final ffbr q;
    private final ffbr r;
    private final atbw s;

    public wch(Context context, bzac bzacVar, ejvb ejvbVar, ejvp ejvpVar, cubr cubrVar, errl errlVar, errl errlVar2, bctx bctxVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cthz cthzVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, atbw atbwVar) {
        this.a = context;
        this.o = bzacVar;
        this.b = errlVar;
        this.d = ejvpVar;
        this.p = ejvbVar;
        this.e = cubrVar;
        this.c = errlVar2;
        this.f = bctxVar;
        this.q = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = cthzVar;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
        this.l = ffbrVar6;
        this.m = ffbrVar7;
        this.n = ffbrVar8;
        this.r = ffbrVar9;
        this.s = atbwVar;
    }

    @Override // defpackage.wbh
    public final ejuh a(lkk lkkVar, final ConversationIdType conversationIdType) {
        bsob e = bsom.e();
        e.z("getNameDataSource");
        e.f(new Function() { // from class: wbq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bskp bskpVar = (bskp) obj;
                return new bskq[]{bskpVar.c, bskpVar.O};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.i(new Function() { // from class: wbr
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
        return this.o.a(e.b(), new byzu() { // from class: wbs
            @Override // defpackage.byzu
            public final elfl a(Object obj) {
                final bsnz bsnzVar = (bsnz) obj;
                return elfo.g(eldl.m(new Callable() { // from class: wbu
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bseh bsehVar = (bseh) ((bskr) bsnz.this.o()).cS();
                        if (bsehVar == null || bsehVar.X() == null) {
                            return Optional.empty();
                        }
                        return Optional.of(byyr.b(bsehVar.k()) ? bsehVar.X() : cuxh.b(bsehVar.X()));
                    }
                }), wch.this.b);
            }
        }, "NAME_KEY".concat(String.valueOf(String.valueOf(conversationIdType))), lkkVar);
    }

    @Override // defpackage.wbh
    public final ejuh b(lkk lkkVar, final ConversationIdType conversationIdType) {
        bsob e = bsom.e();
        e.z("getOptionsListDataSource");
        e.i(new Function() { // from class: wbn
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
        final bsnz b = e.b();
        b.M(lkkVar, new wce(this));
        bcui.e(conversationIdType).M(lkkVar, new wcf(this));
        final Conversation a = this.s.a() ? ((alxl) this.r.b()).a(new RbmConversationId(conversationIdType), alxk.FOR_DISPLAY) : null;
        final bsdl b2 = bcui.a(conversationIdType).b();
        b2.M(lkkVar, new wcg(this));
        return new ejuy(this.p, new eros() { // from class: wbo
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                elfl e2;
                elfl e3;
                final wch wchVar = wch.this;
                bdfp bdfpVar = (bdfp) wchVar.l.b();
                final ConversationIdType conversationIdType2 = conversationIdType;
                elfl b3 = bdfpVar.b(conversationIdType2);
                final bsdl bsdlVar = b2;
                final elfl i = b3.i(new eroh() { // from class: wcd
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final engw engwVar = (engw) obj;
                        elfl w = bsdlVar.w();
                        final wch wchVar2 = wch.this;
                        return w.h(new emwl() { // from class: wbv
                            /* JADX WARN: Type inference failed for: r3v0, types: [fazb, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r4v0, types: [fazb, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r5v0, types: [fazb, java.lang.Object] */
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                bctx bctxVar = wch.this.f;
                                engw engwVar2 = (engw) obj2;
                                ?? b4 = bctxVar.a.b();
                                b4.getClass();
                                ?? b5 = bctxVar.b.b();
                                b5.getClass();
                                ?? b6 = bctxVar.c.b();
                                b6.getClass();
                                engw engwVar3 = engwVar;
                                engwVar3.getClass();
                                engwVar2.getClass();
                                return new bctw(b4, b5, b6, engwVar3, engwVar2);
                            }
                        }, wchVar2.c);
                    }
                }, wchVar.b);
                final bsnz bsnzVar = b;
                final elfl g = elfo.g(new Callable() { // from class: wbw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bseh bsehVar = (bseh) ((bskr) bsnz.this.o()).cS();
                        if (bsehVar != null) {
                            return bsehVar;
                        }
                        String[] strArr = bsom.a;
                        return new bsem().a();
                    }
                }, wchVar.b);
                final ListenableFuture k = elfr.k(i, new eroh() { // from class: wbx
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final ArrayList f = ((bctw) obj).f();
                        final wch wchVar2 = wch.this;
                        final ConversationIdType conversationIdType3 = conversationIdType2;
                        return wchVar2.b.submit(eldl.m(new Callable() { // from class: wbt
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cubr cubrVar = wch.this.e;
                                MessageCoreData i2 = ((bdmq) cubrVar.b.b()).i(conversationIdType3);
                                ParticipantsTable.BindData bindData = null;
                                if (i2 != null) {
                                    String aA = i2.aA();
                                    if (!TextUtils.isEmpty(aA)) {
                                        List<ParticipantsTable.BindData> list = f;
                                        if (list != null) {
                                            for (ParticipantsTable.BindData bindData2 : list) {
                                                if (aA.equals(bindData2.S())) {
                                                    bindData = bindData2;
                                                    break;
                                                }
                                            }
                                        }
                                        bindData = ((bdrr) cubrVar.a.b()).b(aA);
                                    }
                                }
                                if (bindData != null) {
                                    return bindData;
                                }
                                String[] strArr = ParticipantsTable.a;
                                return new bvpp().a();
                            }
                        }));
                    }
                }, erpp.a);
                final elfl i2 = g.i(new eroh() { // from class: wbm
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        wch wchVar2 = wch.this;
                        return ((bzqb) wchVar2.h.b()).b(((bseh) obj).aa()).h(new emwl() { // from class: wbp
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return Boolean.valueOf(((Optional) obj2).isPresent());
                            }
                        }, wchVar2.c);
                    }
                }, wchVar.c);
                final elfl e4 = conversationIdType2 == null ? elfo.e(null) : ((crsl) wchVar.g.b()).a(conversationIdType2);
                Conversation conversation = a;
                final elfl i3 = g.i(new eroh() { // from class: wby
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final bseh bsehVar = (bseh) obj;
                        final wch wchVar2 = wch.this;
                        return elfo.g(eldl.m(new Callable() { // from class: wbi
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Ringtone ringtone;
                                bseh bsehVar2 = bsehVar;
                                wch wchVar3 = wch.this;
                                Uri a2 = wchVar3.i.a(bsehVar2.Y());
                                return (a2 == null || (ringtone = RingtoneManager.getRingtone(wchVar3.a, a2)) == null) ? Optional.empty() : Optional.of(ringtone.getTitle(wchVar3.a));
                            }
                        }), wchVar2.b);
                    }
                }, erpp.a);
                final elfl i4 = g.i(new eroh() { // from class: wbz
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        wch wchVar2 = wch.this;
                        bseh bsehVar = (bseh) obj;
                        if (!((bzqa) wchVar2.k.b()).j()) {
                            return elfo.e(Optional.empty());
                        }
                        ParticipantsTable.BindData b4 = ((bdrr) wchVar2.m.b()).b(bsehVar.S());
                        if (b4 == null) {
                            throw new IllegalStateException("The current self id must exist and it must reflect a participant.");
                        }
                        awui awuiVar = (awui) ((aolr) wchVar2.n.b()).q(b4).e().orElseThrow();
                        ConversationIdType C = bsehVar.C();
                        capw capwVar = (capw) capz.a.createBuilder();
                        String a2 = C.a();
                        capwVar.copyOnWrite();
                        capz capzVar = (capz) capwVar.instance;
                        a2.getClass();
                        capzVar.c = 2;
                        capzVar.d = a2;
                        capwVar.copyOnWrite();
                        capz capzVar2 = (capz) capwVar.instance;
                        awuiVar.getClass();
                        capzVar2.f = awuiVar;
                        capzVar2.b |= 2;
                        return ((capp) wchVar2.j.b()).b((capz) capwVar.build()).h(new emwl() { // from class: wbj
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return Optional.ofNullable((caqb) obj2);
                            }
                        }, wchVar2.c);
                    }
                }, wchVar.b);
                if (conversation != null) {
                    e2 = conversation.g().b().h(new emwl() { // from class: wca
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return Optional.of((engw) obj);
                        }
                    }, erpp.a);
                    e3 = conversation.h().b().h(new emwl() { // from class: wcb
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            aqux f = ((alxj) obj).f();
                            return f == null ? Optional.empty() : Optional.of(f);
                        }
                    }, erpp.a);
                } else {
                    e2 = elfo.e(Optional.empty());
                    e3 = elfo.e(Optional.empty());
                }
                final elfl elflVar = e2;
                final elfl elflVar2 = e3;
                return new erph(elfo.k(g, i, k, i4, e4, i2, i3, elflVar, elflVar2).a(new Callable() { // from class: wcc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bseh bsehVar = (bseh) erqt.q(elfl.this);
                        bctw bctwVar = (bctw) erqt.q(i);
                        Optional optional = (Optional) erqt.q(i4);
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) erqt.q(k);
                        ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) erqt.q(e4);
                        boolean booleanValue = ((Boolean) erqt.q(i2)).booleanValue();
                        Optional optional2 = (Optional) erqt.q(i3);
                        Optional optional3 = (Optional) erqt.q(elflVar);
                        Optional optional4 = (Optional) erqt.q(elflVar2);
                        byyt G = bsehVar.G();
                        if (G == null) {
                            G = byyt.UNARCHIVED;
                        }
                        return new bcqj(bsehVar, bctwVar, optional, bindData, bindData2, booleanValue, G, optional2, optional3, optional4);
                    }
                }, erpp.a));
            }
        }, "OPTIONS_LIST_KEY");
    }

    @Override // defpackage.wbh
    public final elfl c(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData) {
        if (!cubs.a().booleanValue()) {
            crrt crrtVar = (crrt) this.q.b();
            crse o = crsf.o();
            crrr crrrVar = (crrr) o;
            crrrVar.d = conversationIdType;
            crrrVar.f = bindData.S();
            crrrVar.a = false;
            crrrVar.b = false;
            crrrVar.h = eoko.CONVERSATION_FROM_UNBLOCK_ACTION;
            crrrVar.j = 3;
            crrrVar.k = 6;
            return crrtVar.a(o.a().n()).h(new emwl() { // from class: wbl
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return null;
                }
            }, erpp.a);
        }
        crrt crrtVar2 = (crrt) this.q.b();
        crse o2 = crsf.o();
        BugleConversationId bugleConversationId = new BugleConversationId(conversationIdType);
        crrr crrrVar2 = (crrr) o2;
        crrrVar2.e = bugleConversationId;
        crrrVar2.f = bindData.S();
        crrrVar2.a = false;
        crrrVar2.b = false;
        crrrVar2.h = eoko.CONVERSATION_FROM_UNBLOCK_ACTION;
        crrrVar2.j = 3;
        crrrVar2.k = 6;
        return crrtVar2.a(o2.a().n()).h(new emwl() { // from class: wbk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }
}
