package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.reactions.ui.selection.ReactionSelectionRecyclerView;
import com.google.android.apps.messaging.conversation.reactions.ui.summary.ReactionsSummaryRecyclerView;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfs implements vfq {
    public static final entd a = entd.c("BugleReactions");
    public final cndk b;
    public final cmsl c;
    public final cndx d;
    private final vit e;
    private final vio f;
    private final vgj g;
    private final errl h;
    private final cyfw i;
    private elfl j;
    private vgb k;

    public vfs(vit vitVar, vio vioVar, cndk cndkVar, vgj vgjVar, cmsl cmslVar, errl errlVar, cndx cndxVar, cyfw cyfwVar) {
        this.e = vitVar;
        this.f = vioVar;
        this.b = cndkVar;
        this.g = vgjVar;
        this.c = cmslVar;
        this.h = errlVar;
        this.d = cndxVar;
        this.i = cyfwVar;
    }

    @Override // defpackage.vfq
    public final vgb a(bcse bcseVar) {
        return this.g.a(bcseVar);
    }

    @Override // defpackage.vfq
    public final elli b(vfi vfiVar, ejlq ejlqVar, ejlr ejlrVar, bcqs bcqsVar) {
        elfl g;
        if (this.c.b()) {
            ensz a2 = a.a(this.c.a());
            a2.Y(cmsm.d, ((cmsw) ((vfw) vfiVar.a()).a).a.toString());
            a2.Y(cmsm.f, ((cmsw) ((vfw) vfiVar.a()).a).b.f());
            ((ensz) a2.h("com/google/android/apps/messaging/conversation/reactions/ui/handler/ReactionsUiHandlerImpl", "onReactionBadgeClicked", 167, "ReactionsUiHandlerImpl.java")).q("Reaction badge clicked.");
        }
        elfl elflVar = this.j;
        if (elflVar != null) {
            elflVar.cancel(true);
        }
        this.k = vfiVar.a();
        if (bcqsVar.f) {
            aztg d = bcqsVar.d(vfiVar.b());
            if (d == null) {
                d = bcqsVar.h.e();
            }
            final vit vitVar = this.e;
            final cmrf c = vfiVar.c();
            final bctw bctwVar = bcqsVar.g;
            final ParticipantsTable.BindData a3 = d.a();
            g = Collection.EL.stream(c.b).flatMap(new Function() { // from class: viq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Collection.EL.stream(((cmro) obj).d);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).anyMatch(new Predicate() { // from class: vir
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    cmrs cmrsVar = (cmrs) obj;
                    if ((cmrsVar.b & 1) == 0) {
                        return false;
                    }
                    cmri cmriVar = cmrsVar.c;
                    if (cmriVar == null) {
                        cmriVar = cmri.a;
                    }
                    if (cmriVar.c) {
                        return false;
                    }
                    cmri cmriVar2 = cmrsVar.c;
                    if (cmriVar2 == null) {
                        cmriVar2 = cmri.a;
                    }
                    return bctw.this.b(cmriVar2.b) == null;
                }
            }) ? elfo.g(new Callable() { // from class: vis
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return vit.this.a(c, bctwVar, a3);
                }
            }, vitVar.a) : elfo.e(vitVar.a(c, bctwVar, a3));
        } else {
            int i = engw.d;
            g = elfo.e(enou.a);
        }
        this.j = g;
        ejlqVar.g(new ejlp(erny.f(g, new emwl() { // from class: ejln
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ProtoParsers.InternalDontUse(null, (eyhs) it.next()));
                }
                return arrayList;
            }
        }, erpp.a)), ejlrVar);
        return elli.a;
    }

    @Override // defpackage.vfq
    public final elli c(cmtd cmtdVar, final cmrl cmrlVar, eprt eprtVar, final cmrm cmrmVar, final boolean z, boolean z2, ConversationIdType conversationIdType, int i, SelfIdentityId selfIdentityId, Runnable runnable, ejlq ejlqVar, ejlr ejlrVar) {
        if (this.c.b()) {
            ensz a2 = a.a(this.c.a());
            cmsw cmswVar = (cmsw) cmtdVar;
            a2.Y(cmsm.d, cmswVar.a.toString());
            a2.Y(cmsm.f, cmswVar.b.f());
            a2.Y(cmsm.h, eprtVar);
            a2.Y(cmsm.i, cmrmVar);
            ((ensz) a2.h("com/google/android/apps/messaging/conversation/reactions/ui/handler/ReactionsUiHandlerImpl", "onReactionSelected", 118, "ReactionsUiHandlerImpl.java")).q("Reaction selected.");
        }
        vip vipVar = (vip) this.f;
        vjb vjbVar = vipVar.d;
        if (vjbVar != null && vjbVar.isShowing()) {
            vipVar.d.b();
        }
        final cndh cndhVar = new cndh(conversationIdType, i, selfIdentityId, cmtdVar, new cmqi(eprtVar, z2));
        ejlqVar.g(ejlp.a(elfo.g(new Callable() { // from class: vfr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                vfs vfsVar = vfs.this;
                cndx cndxVar = vfsVar.d;
                boolean z3 = z;
                cndi cndiVar = cndhVar;
                cmrl cmrlVar2 = cmrlVar;
                cmrm cmrmVar2 = cmrmVar;
                cndy a3 = cndxVar.a(z3, cndiVar, cmrlVar2, cmrmVar2);
                cndn cndnVar = a3.b;
                if (vfsVar.c.b()) {
                    ensz a4 = vfs.a.a(vfsVar.c.a());
                    a4.Y(cmsm.d, ((cmsw) ((cndh) cndiVar).d).a.b());
                    a4.Y(cmsm.n, Boolean.valueOf(z3));
                    a4.Y(cmsm.p, a3.a);
                    a4.Y(cmsm.q, cndnVar);
                    ((ensz) a4.h("com/google/android/apps/messaging/conversation/reactions/ui/handler/ReactionsUiHandlerImpl", "sendReactionAsync", 309, "ReactionsUiHandlerImpl.java")).q("Transport selection result for reaction message");
                }
                if (cndnVar != null) {
                    vfsVar.b.a(cndnVar, cndiVar, cmrlVar2, cmrmVar2);
                }
                cndz createBuilder = cneb.a.createBuilder();
                cnea cneaVar = a3.a;
                createBuilder.copyOnWrite();
                ((cneb) createBuilder.instance).b = cneaVar.a();
                return createBuilder.build();
            }
        }, this.h)), ejlrVar);
        axnw.h(this.i.a(((cmsw) cmtdVar).a, conversationIdType));
        runnable.run();
        return elli.a;
    }

    @Override // defpackage.vfq
    public final void d(ea eaVar, View view, View view2, bcse bcseVar, SelfIdentityId selfIdentityId, boolean z, boolean z2, Runnable runnable) {
        vgl vglVar = (vgl) this.g;
        if (vglVar.b.b()) {
            ensz a2 = vgl.a.a(vglVar.b.a());
            a2.Y(cmsm.d, bcseVar.u().b());
            a2.Y(cmsm.f, bcseVar.w().f());
            ((ensz) a2.h("com/google/android/apps/messaging/conversation/reactions/ui/selection/ReactionSelectionDisplayerImpl", "showReactions", 68, "ReactionSelectionDisplayerImpl.java")).q("Show reactions selection bar.");
        }
        eg egVar = (eg) ddzb.e(view.getContext());
        if (egVar == null || egVar.isFinishing()) {
            return;
        }
        fr I = eaVar.I();
        if (I.ai()) {
            return;
        }
        final vgu vguVar = (vgu) vgv.a.createBuilder();
        String b = bcseVar.u().b();
        vguVar.copyOnWrite();
        vgv vgvVar = (vgv) vguVar.instance;
        b.getClass();
        vgvVar.b |= 2;
        vgvVar.d = b;
        String f = bcseVar.v().k() ? bcseVar.v().f() : bcseVar.w().f();
        vguVar.copyOnWrite();
        vgv vgvVar2 = (vgv) vguVar.instance;
        vgvVar2.b |= 4;
        vgvVar2.e = f;
        String a3 = bcseVar.t().a();
        vguVar.copyOnWrite();
        vgv vgvVar3 = (vgv) vguVar.instance;
        a3.getClass();
        vgvVar3.b |= 8;
        vgvVar3.f = a3;
        String b2 = selfIdentityId.b();
        vguVar.copyOnWrite();
        vgv vgvVar4 = (vgv) vguVar.instance;
        vgvVar4.b |= 16;
        vgvVar4.g = b2;
        vguVar.copyOnWrite();
        vgv vgvVar5 = (vgv) vguVar.instance;
        vgvVar5.b |= 64;
        vgvVar5.i = z2;
        vguVar.copyOnWrite();
        vgv vgvVar6 = (vgv) vguVar.instance;
        vgvVar6.b |= 32;
        vgvVar6.h = z;
        boolean az = bcseVar.az();
        vguVar.copyOnWrite();
        vgv vgvVar7 = (vgv) vguVar.instance;
        vgvVar7.b |= 128;
        vgvVar7.j = az;
        ((vfw) vglVar.a(bcseVar)).b.ifPresent(new Consumer() { // from class: vgk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                vgu vguVar2 = vgu.this;
                cmrl cmrlVar = (cmrl) obj;
                vguVar2.copyOnWrite();
                vgv vgvVar8 = (vgv) vguVar2.instance;
                vgv vgvVar9 = vgv.a;
                cmrlVar.getClass();
                vgvVar8.c = cmrlVar;
                vgvVar8.b |= 1;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        vgt vgtVar = (vgt) I.h("com.google.android.apps.messaging.conversation.reactions.ui.selection.ReactionsSelectionDialogFragmentPeer");
        if (vgtVar != null) {
            vgtVar.hw();
        }
        vgv vgvVar8 = (vgv) vguVar.build();
        vgt vgtVar2 = new vgt();
        fbae.e(vgtVar2);
        ekku.a(vgtVar2, vgvVar8);
        vgtVar2.t(I, "com.google.android.apps.messaging.conversation.reactions.ui.selection.ReactionsSelectionDialogFragmentPeer");
        vgtVar2.H().w = runnable;
        final vhe H = vgtVar2.H();
        H.c();
        H.v = view2;
        H.t = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: vgz
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                vhe.this.d();
            }
        };
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = H.t;
        onGlobalLayoutListener.getClass();
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        H.d();
        ddwu ddwuVar = H.h;
        View view3 = H.u;
        final cmqs cmqsVar = H.f;
        ddwuVar.a(view3, new Runnable() { // from class: vha
            @Override // java.lang.Runnable
            public final void run() {
                cmqs.this.c();
            }
        }, "ReactionsSelectionDialogFragmentPeer_setAnchorView");
    }

    @Override // defpackage.vfq
    public final void e(Context context, final RecyclerView recyclerView, List list) {
        vgb vgbVar = this.k;
        vgbVar.getClass();
        Stream map = Collection.EL.stream(list).map(new Function() { // from class: vjh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new vji((vjg) ((eyjv) obj).a(vjg.a, eyfc.a()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        engw engwVar = (engw) map.collect(endq.a);
        if (engwVar.isEmpty()) {
            return;
        }
        vip vipVar = (vip) this.f;
        vjb vjbVar = vipVar.d;
        if (vjbVar == null || !vjbVar.isShowing()) {
            if (vipVar.c.b()) {
                ensz a2 = vip.a.a(vipVar.c.a());
                vfw vfwVar = (vfw) vgbVar;
                a2.Y(cmsm.d, ((cmsw) vfwVar.a).a.toString());
                a2.Y(cmsm.f, ((cmsw) vfwVar.a).b.f());
                ((ensz) a2.h("com/google/android/apps/messaging/conversation/reactions/ui/summary/ReactionSummaryDisplayerImpl", "showReactionSummary", 53, "ReactionSummaryDisplayerImpl.java")).q("Show reactions summary view.");
            }
            vjc vjcVar = vipVar.b;
            ddwu ddwuVar = (ddwu) vjcVar.a.b();
            ddwuVar.getClass();
            cmqt cmqtVar = (cmqt) vjcVar.b.b();
            cmqtVar.getClass();
            cmqy cmqyVar = (cmqy) vjcVar.c.b();
            cmqyVar.getClass();
            cmsl cmslVar = (cmsl) vjcVar.d.b();
            cmslVar.getClass();
            elbx elbxVar = (elbx) vjcVar.e.b();
            elbxVar.getClass();
            vgbVar.getClass();
            vipVar.d = new vjb(ddwuVar, cmqtVar, cmqyVar, cmslVar, elbxVar, context, vgbVar);
            final vjb vjbVar2 = vipVar.d;
            if (vjbVar2.e.b()) {
                ensz a3 = vjb.a.a(vjbVar2.e.a());
                a3.Y(cmsm.d, ((cmsw) ((vfw) vjbVar2.f).a).a.toString());
                a3.Y(cmsm.f, ((cmsw) ((vfw) vjbVar2.f).a).b.f());
                ((ensz) a3.h("com/google/android/apps/messaging/conversation/reactions/ui/summary/ReactionsSummaryPopupWindow", "initialize", 103, "ReactionsSummaryPopupWindow.java")).q("Reactions summary view initializing.");
            }
            vjbVar2.d.d();
            vjbVar2.setWidth(-1);
            vjbVar2.setHeight(-2);
            vjbVar2.setAnimationStyle(R.style.ReactionSummaryPopupWindowAnimationStyle);
            vjbVar2.setFocusable(true);
            vjbVar2.setBackgroundDrawable(null);
            vjbVar2.setOutsideTouchable(true);
            vjbVar2.h = vjbVar2.b.inflate(R.layout.reactions_summary_popup_window_with_scrollable_reaction_selection_recycler_view_with_add_reactions_button, (ViewGroup) null);
            vjbVar2.setContentView(vjbVar2.h);
            vjbVar2.h.setOnClickListener(new View.OnClickListener() { // from class: viv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vjb.this.dismiss();
                }
            });
            vgb vgbVar2 = vjbVar2.f;
            View findViewById = vjbVar2.h.findViewById(R.id.reactions_summary_scroll_view);
            if (cmsk.a() || !((cmsw) ((vfw) vgbVar2).a).b.i()) {
                final ReactionSelectionRecyclerView reactionSelectionRecyclerView = (ReactionSelectionRecyclerView) vjbVar2.h.findViewById(R.id.reactions_selection_recycler_view);
                eprt eprtVar = eprt.SUMMARY_VIEW_SELECTION_BAR;
                reactionSelectionRecyclerView.ah = recyclerView;
                vfw vfwVar2 = (vfw) vgbVar2;
                reactionSelectionRecyclerView.ai = vfwVar2.a;
                reactionSelectionRecyclerView.aj = vfwVar2.b;
                reactionSelectionRecyclerView.ak = eprtVar;
                reactionSelectionRecyclerView.getContext();
                GridLayoutManager gridLayoutManager = new GridLayoutManager(1, 0);
                vgo vgoVar = new vgo(reactionSelectionRecyclerView, reactionSelectionRecyclerView.aj);
                reactionSelectionRecyclerView.ap(gridLayoutManager);
                reactionSelectionRecyclerView.am(vgoVar);
                View findViewById2 = vjbVar2.h.findViewById(R.id.reaction_selection_background_panel);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(reactionSelectionRecyclerView.getResources().getDimensionPixelSize(R.dimen.reactions_selection_bar_corner_radius));
                gradientDrawable.setColor(cwoj.b(reactionSelectionRecyclerView.getContext()));
                findViewById2.setBackground(gradientDrawable);
                findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: viz
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        entd entdVar = vjb.a;
                        int i2 = 0;
                        while (true) {
                            ReactionSelectionRecyclerView reactionSelectionRecyclerView2 = ReactionSelectionRecyclerView.this;
                            if (i2 >= reactionSelectionRecyclerView2.getChildCount()) {
                                return false;
                            }
                            vgq vgqVar = (vgq) reactionSelectionRecyclerView2.k(reactionSelectionRecyclerView2.getChildAt(i2));
                            vgqVar.w.ad.b(vgqVar.v);
                            i2++;
                        }
                    }
                });
            } else {
                findViewById.setVisibility(8);
            }
            ReactionsSummaryRecyclerView reactionsSummaryRecyclerView = (ReactionsSummaryRecyclerView) vjbVar2.h.findViewById(R.id.reactions_summary_recycler_view);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(vjbVar2.h.getResources().getDimensionPixelSize(R.dimen.reaction_summary_corner_radius));
            gradientDrawable2.setColor(cwoj.b(vjbVar2.a().getContext()));
            reactionsSummaryRecyclerView.setBackground(gradientDrawable2);
            if (engwVar.isEmpty()) {
                ensk j = ReactionsSummaryRecyclerView.ac.j();
                j.Y(ente.a, "BugleReactions");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/conversation/reactions/ui/summary/ReactionsSummaryRecyclerView", "bind", 38, "ReactionsSummaryRecyclerView.java")).q("Unable to show reaction summary as participantsAndData is empty");
                reactionsSummaryRecyclerView.setVisibility(8);
            } else {
                reactionsSummaryRecyclerView.am(reactionsSummaryRecyclerView.ad);
                reactionsSummaryRecyclerView.getContext();
                reactionsSummaryRecyclerView.ap(new LinearLayoutManager());
                reactionsSummaryRecyclerView.w(new viu(reactionsSummaryRecyclerView.getResources()));
                vjd vjdVar = reactionsSummaryRecyclerView.ad;
                vjdVar.a = engwVar;
                vjdVar.p();
            }
            vjbVar2.h.findViewById(R.id.add_reactions_button).setOnClickListener(new elay(vjbVar2.g, "ReactionsSummaryPopupWindow#setupAddReactionsButton", new View.OnClickListener() { // from class: viy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final vjb vjbVar3 = vjb.this;
                    eg egVar = (eg) ddzb.f(vjbVar3.h);
                    if (egVar == null || egVar.isFinishing()) {
                        return;
                    }
                    fr a4 = egVar.a();
                    if (a4.ai()) {
                        return;
                    }
                    final View view2 = recyclerView;
                    vfw vfwVar3 = (vfw) vjbVar3.f;
                    vhp a5 = vij.a(vfwVar3.b, Optional.ofNullable(((cmsw) vfwVar3.a).a.b()));
                    a5.t(a4, "CustomReactionSelectionDialogFragment");
                    a5.H().i = new ffjm() { // from class: vix
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            vgb vgbVar3 = vjb.this.f;
                            eprt eprtVar2 = eprt.CUSTOM_REACTION_SELECTION_EMOJI_PICKER;
                            ellj.g(new vfy(((vfw) vgbVar3).a, (cmrl) obj, (cmrm) obj2, eprtVar2), view2);
                            return ffcu.a;
                        }
                    };
                }
            }));
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) vjbVar2.h.findViewById(R.id.reactions_summary_scroll_view);
            horizontalScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new vja(horizontalScrollView));
            vjbVar2.c.a(vjbVar2.h, new Runnable() { // from class: viw
                @Override // java.lang.Runnable
                public final void run() {
                    vjb.this.c();
                }
            }, "ReactionsSummaryPopupWindow_initialize");
            vipVar.d.showAtLocation(recyclerView, 80, 0, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #2 {all -> 0x00e7, blocks: (B:3:0x0006, B:5:0x000e, B:8:0x008e, B:13:0x009b, B:17:0x0098, B:18:0x009c, B:20:0x00a3, B:24:0x00a9, B:26:0x00af, B:28:0x00b5, B:30:0x00bb, B:33:0x00d6, B:35:0x00dc, B:38:0x00c2, B:41:0x00c9, B:43:0x00cf, B:7:0x0014, B:12:0x0093), top: B:2:0x0006, inners: #0, #1 }] */
    @Override // defpackage.vfq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.bcse r8, defpackage.bcqs r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ReactionsUiHandler::canShowReactionsSelectionBar"
            ekzz r0 = defpackage.eleg.f(r0)
            cmsl r1 = r7.c     // Catch: java.lang.Throwable -> Le7
            boolean r1 = r1.b()     // Catch: java.lang.Throwable -> Le7
            if (r1 == 0) goto L9c
            java.lang.String r1 = "ReactionsUiHandler::canShowReactionsSelectionBar::log"
            ekzz r1 = defpackage.eleg.f(r1)     // Catch: java.lang.Throwable -> Le7
            entd r2 = defpackage.vfs.a     // Catch: java.lang.Throwable -> L92
            cmsl r3 = r7.c     // Catch: java.lang.Throwable -> L92
            java.util.logging.Level r3 = r3.a()     // Catch: java.lang.Throwable -> L92
            ensz r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L92
            ensn r3 = defpackage.cmsm.d     // Catch: java.lang.Throwable -> L92
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r4 = r8.u()     // Catch: java.lang.Throwable -> L92
            java.lang.String r4 = r4.b()     // Catch: java.lang.Throwable -> L92
            r2.Y(r3, r4)     // Catch: java.lang.Throwable -> L92
            ensn r3 = defpackage.cmsm.f     // Catch: java.lang.Throwable -> L92
            bdhg r4 = r8.w()     // Catch: java.lang.Throwable -> L92
            java.lang.String r4 = r4.f()     // Catch: java.lang.Throwable -> L92
            r2.Y(r3, r4)     // Catch: java.lang.Throwable -> L92
            ensn r3 = defpackage.cmsm.k     // Catch: java.lang.Throwable -> L92
            int r4 = r8.f()     // Catch: java.lang.Throwable -> L92
            java.lang.String r4 = defpackage.axuh.a(r4)     // Catch: java.lang.Throwable -> L92
            r2.Y(r3, r4)     // Catch: java.lang.Throwable -> L92
            ensn r3 = defpackage.cmsm.l     // Catch: java.lang.Throwable -> L92
            boolean r4 = r8.aM()     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L92
            r2.Y(r3, r4)     // Catch: java.lang.Throwable -> L92
            ensn r3 = defpackage.cmsm.m     // Catch: java.lang.Throwable -> L92
            boolean r4 = r9.n()     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L92
            r2.Y(r3, r4)     // Catch: java.lang.Throwable -> L92
            ensn r3 = defpackage.cmsm.n     // Catch: java.lang.Throwable -> L92
            boolean r4 = r9.q()     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L92
            r2.Y(r3, r4)     // Catch: java.lang.Throwable -> L92
            ensn r3 = defpackage.cmsm.o     // Catch: java.lang.Throwable -> L92
            boolean r4 = r8.ar()     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L92
            r2.Y(r3, r4)     // Catch: java.lang.Throwable -> L92
            java.lang.String r3 = "com/google/android/apps/messaging/conversation/reactions/ui/handler/ReactionsUiHandlerImpl"
            java.lang.String r4 = "canShowReactionsSelectionBar"
            java.lang.String r5 = "ReactionsUiHandlerImpl.java"
            r6 = 254(0xfe, float:3.56E-43)
            ensk r2 = r2.h(r3, r4, r6, r5)     // Catch: java.lang.Throwable -> L92
            ensz r2 = (defpackage.ensz) r2     // Catch: java.lang.Throwable -> L92
            java.lang.String r3 = "State to determine reaction selection bar visibility."
            r2.q(r3)     // Catch: java.lang.Throwable -> L92
            r1.close()     // Catch: java.lang.Throwable -> Le7
            goto L9c
        L92:
            r8 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L97
            goto L9b
        L97:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> Le7
        L9b:
            throw r8     // Catch: java.lang.Throwable -> Le7
        L9c:
            boolean r1 = r8.az()     // Catch: java.lang.Throwable -> Le7
            r2 = 0
            if (r1 != 0) goto La9
            boolean r1 = r8.aU()     // Catch: java.lang.Throwable -> Le7
            if (r1 == 0) goto Le3
        La9:
            boolean r1 = r8.aw()     // Catch: java.lang.Throwable -> Le7
            if (r1 != 0) goto Le3
            boolean r1 = defpackage.cmsk.a()     // Catch: java.lang.Throwable -> Le7
            if (r1 == 0) goto Lc9
            boolean r1 = r9.q()     // Catch: java.lang.Throwable -> Le7
            if (r1 == 0) goto Lc2
            boolean r8 = r8.aM()     // Catch: java.lang.Throwable -> Le7
            if (r8 == 0) goto Le3
            goto Ld6
        Lc2:
            boolean r8 = r8.ar()     // Catch: java.lang.Throwable -> Le7
            if (r8 != 0) goto Ld6
            goto Le3
        Lc9:
            boolean r1 = r9.q()     // Catch: java.lang.Throwable -> Le7
            if (r1 == 0) goto Le3
            boolean r8 = r8.aM()     // Catch: java.lang.Throwable -> Le7
            if (r8 != 0) goto Ld6
            goto Le3
        Ld6:
            boolean r8 = r9.n()     // Catch: java.lang.Throwable -> Le7
            if (r8 == 0) goto Le3
            boolean r8 = r9.p()     // Catch: java.lang.Throwable -> Le7
            if (r8 != 0) goto Le3
            r2 = 1
        Le3:
            r0.close()
            return r2
        Le7:
            r8 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lec
            goto Lf0
        Lec:
            r9 = move-exception
            r8.addSuppressed(r9)
        Lf0:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vfs.f(bcse, bcqs):boolean");
    }
}
