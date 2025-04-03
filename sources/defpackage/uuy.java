package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.messagelist.MessageListRecyclerView;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.etouffee.util.LinkTextUtil;
import com.google.android.apps.messaging.ui.common.PinnedLinearLayoutManager;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageBubbleView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.suggestions.shortcuts.SuggestionShortcutView;
import com.google.android.material.appbar.AppBarLayout;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiPredicate$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uuy implements czic, urj {
    public static final cfup a = cfvl.e(cfvl.b, "num_message_threshold_to_be_close_to_end_of_scroll", 4);
    public static final emyl b;
    private static final engw be;
    public static final Duration c;
    public final cqtw A;
    public final ffbr B;
    public final wgh C;
    public final ejwl D;
    public final Optional E;
    public final ecmt F;
    public final ffbr G;
    public final fazb H;
    public final uqo I;
    public final ffbr J;
    public final errm K;
    public final ejlq L;
    public final ejxn M;
    public final elhn N;
    public final Optional O;
    public final elbx P;
    public final Optional Q;
    public final Optional R;
    public final Optional S;
    public final fazb T;
    public final ffbr U;
    public final ffbr V;
    public final ffbr W;
    public final ffbr X;
    public final fazb Z;
    public PinnedLinearLayoutManager aA;
    public upx aB;
    public uqc aC;
    public uqy aD;
    public czqa aE;
    public wc aF;
    public boolean aG;
    public MessagePartCoreData aJ;
    public ArrayList aK;
    public int aM;
    public ValueAnimator aN;
    public int aU;
    public Uri aV;
    public boolean aW;
    public MessageIdType aX;
    public Menu aY;
    public final fazb aa;
    public final adgn ab;
    public final ffbr ac;
    public final ffbr ad;
    public final ejwd ae;
    public final ejwd af;
    public final ejwd ag;
    public final ejlr ah;
    public final ejlr ai;
    public final ejlr aj;
    public final ejlr ak;
    public final ejlr al;
    public final ejlr am;
    public final ejlr an;
    public final ActionMode.Callback ao;
    public final ConversationIdType ap;
    public final ConversationId aq;
    public final ffbr aw;
    public final ffbr ax;
    public uuw ay;
    public MessageListRecyclerView az;
    public final asix ba;
    public final bajc bc;
    public final cxom bd;
    private final Optional bf;
    private final altk bg;
    private final deaj bh;
    private final ctud bi;
    private final ffbr bj;
    private final axul bk;
    private final bzqa bl;
    private final ddxs bm;
    private final sfy bn;
    private final Optional bo;
    private final ffbr bp;
    private final uaj bq;
    private final ffbr br;
    private final Optional bs;
    private final fazb bt;
    private final ffbr bu;
    private final ffbr bv;
    private List bw;
    public Parcelable d;
    public final ea e;
    public final eisx f;
    public final czlc g;
    public final uxa h;
    public final czkq i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final upy m;
    public final alrv n;
    public final cuxz o;
    public final cuxh p;
    public final urm q;
    public final ctwb r;
    public final cqoh s;
    public final ffbr t;
    public final Optional u;
    public final vyw v;
    public final Optional w;
    public final uqd x;
    public final urn y;
    public final awti z;
    public final List Y = new ArrayList();
    public final crlv ar = new crlv("enableSafeUrlOnClickCheck", new ffix() { // from class: usc
        @Override // defpackage.ffix
        public final Object invoke() {
            cfup cfupVar = uuy.a;
            return (Boolean) ((cfup) cubs.q.get()).e();
        }
    });
    public final crlv as = new crlv("enableSaveOtpUi", new ffix() { // from class: usd
        @Override // defpackage.ffix
        public final Object invoke() {
            return Boolean.valueOf(aewg.i());
        }
    });
    public final crlv at = new crlv("enableConversationScaleSetting", new ffix() { // from class: use
        @Override // defpackage.ffix
        public final Object invoke() {
            cfup cfupVar = uuy.a;
            return (Boolean) ((cfup) cymy.a.get()).e();
        }
    });
    public final crlv au = new crlv("hasShownSuggestionShortcutsDialog", new ffix() { // from class: usf
        @Override // defpackage.ffix
        public final Object invoke() {
            cfup cfupVar = uuy.a;
            return false;
        }
    });
    public final crlv av = new crlv("hasShownStarToolstone", new ffix() { // from class: usg
        @Override // defpackage.ffix
        public final Object invoke() {
            cfup cfupVar = uuy.a;
            return false;
        }
    });
    public cpn aH = new cpn();
    public Set aI = new cmj();
    public bcpw aL = new bcpw(new bcpt());
    public boolean aO = false;
    public boolean aP = true;
    public final cpn aQ = new cpn();
    public final ConcurrentHashMap aR = new ConcurrentHashMap();
    public final Map aS = new HashMap();
    public final Map aT = new HashMap();
    public Optional aZ = Optional.empty();
    public final dqku bb = new dqku(new uty(this), new utz(this));

    static {
        cfvl.e(cfvl.b, "typing_indicator_timeout_ms", 20000);
        b = cfvl.v(172415650);
        be = engw.y(Integer.valueOf(R.id.save_attachment), Integer.valueOf(R.id.copy_text), Integer.valueOf(R.id.action_delete_message), Integer.valueOf(R.id.share_message_menu), Integer.valueOf(R.id.forward_message_menu), Integer.valueOf(R.id.details_menu), Integer.valueOf(R.id.action_send), Integer.valueOf(R.id.action_download));
        c = Duration.ofSeconds(1L);
    }

    public uuy(eisx eisxVar, ea eaVar, czlc czlcVar, Optional optional, altk altkVar, uxa uxaVar, deaj deajVar, czkq czkqVar, upy upyVar, alrv alrvVar, cuxz cuxzVar, cuxh cuxhVar, urm urmVar, ctud ctudVar, ffbr ffbrVar, ctwb ctwbVar, cqoh cqohVar, ffbr ffbrVar2, axul axulVar, Optional optional2, vyw vywVar, bzqa bzqaVar, Optional optional3, ejwl ejwlVar, ddxs ddxsVar, bajc bajcVar, uqd uqdVar, sfy sfyVar, urn urnVar, Optional optional4, awti awtiVar, cqtw cqtwVar, errm errmVar, ejlq ejlqVar, ejxn ejxnVar, elhn elhnVar, Optional optional5, Optional optional6, Optional optional7, elbx elbxVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, cxom cxomVar, ffbr ffbrVar6, fazb fazbVar, ecmt ecmtVar, wgh wghVar, uqp uqpVar, Optional optional8, Optional optional9, ffbr ffbrVar7, uaj uajVar, ffbr ffbrVar8, fazb fazbVar2, fazb fazbVar3, ffbr ffbrVar9, adgn adgnVar, ffbr ffbrVar10, fazb fazbVar4, Optional optional10, fazb fazbVar5, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, String str, asix asixVar, ffbr ffbrVar20) {
        this.f = eisxVar;
        this.ap = bdgq.b(str);
        this.aq = new BugleConversationId(bdgq.b(str));
        this.e = eaVar;
        this.aw = ffbrVar15;
        this.g = czlcVar;
        this.bf = optional;
        this.bg = altkVar;
        this.h = uxaVar;
        this.bh = deajVar;
        this.i = czkqVar;
        this.m = upyVar;
        this.n = alrvVar;
        this.o = cuxzVar;
        this.p = cuxhVar;
        this.q = urmVar;
        this.bi = ctudVar;
        this.bj = ffbrVar;
        this.r = ctwbVar;
        this.s = cqohVar;
        this.t = ffbrVar2;
        this.bk = axulVar;
        this.u = optional2;
        this.v = vywVar;
        this.bl = bzqaVar;
        this.w = optional3;
        this.D = ejwlVar;
        this.bm = ddxsVar;
        this.bc = bajcVar;
        this.x = uqdVar;
        this.bn = sfyVar;
        this.y = urnVar;
        this.bo = optional4;
        this.z = awtiVar;
        this.A = cqtwVar;
        this.K = errmVar;
        this.L = ejlqVar;
        this.M = ejxnVar;
        this.N = elhnVar;
        this.Q = optional5;
        this.O = optional6;
        this.P = elbxVar;
        this.E = optional7;
        this.j = ffbrVar3;
        this.k = ffbrVar4;
        this.l = ffbrVar5;
        this.bd = cxomVar;
        this.B = ffbrVar6;
        this.H = fazbVar;
        this.F = ecmtVar;
        this.G = ffbrVar9;
        this.ab = adgnVar;
        this.C = wghVar;
        this.R = optional8;
        this.S = optional9;
        this.T = fazbVar4;
        this.U = ffbrVar11;
        this.V = ffbrVar12;
        this.W = ffbrVar13;
        this.X = ffbrVar14;
        this.br = ffbrVar20;
        fr frVar = eaVar.B;
        errl errlVar = (errl) uqpVar.a.b();
        errlVar.getClass();
        errm errmVar2 = (errm) uqpVar.b.b();
        errmVar2.getClass();
        wpk wpkVar = (wpk) uqpVar.c.b();
        wpkVar.getClass();
        aqgi aqgiVar = (aqgi) uqpVar.d.b();
        aqgiVar.getClass();
        bzqa bzqaVar2 = (bzqa) uqpVar.e.b();
        bzqaVar2.getClass();
        this.I = new uqo(errlVar, errmVar2, wpkVar, aqgiVar, bzqaVar2, uqpVar.f, frVar);
        this.bp = ffbrVar7;
        this.bq = uajVar;
        this.J = ffbrVar8;
        this.Z = fazbVar2;
        this.aa = fazbVar3;
        this.ac = ffbrVar10;
        this.bs = optional10;
        this.bt = fazbVar5;
        this.ax = ffbrVar16;
        this.ad = ffbrVar17;
        this.bu = ffbrVar18;
        this.bv = ffbrVar19;
        this.ba = asixVar;
        this.ae = new uuj(this);
        this.ag = new uum(this);
        this.af = new uun(this);
        this.ah = new uuo(this);
        this.ai = new uuq(this);
        this.aj = new uur(this);
        this.ak = new uut(this);
        this.al = new vfv(eaVar, new Runnable() { // from class: vft
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        this.am = new uuu(this);
        this.an = new uuv(this);
        this.ao = new uuk(this);
    }

    private final void M(bcse bcseVar, MessagePartCoreData messagePartCoreData) {
        View view = this.e.Q;
        if (view == null) {
            throw new IllegalStateException("Fragment has no layout when selecting message.");
        }
        if (bcseVar == null) {
            this.v.d();
        } else {
            this.v.i(bcseVar);
        }
        if (this.v.f()) {
            this.ay.l();
            this.aJ = null;
            return;
        }
        if (bcseVar != null) {
            ellj.g(new uwj(), view);
        }
        this.aJ = messagePartCoreData;
        ea eaVar = this.e;
        vyw vywVar = this.v;
        final String quantityString = eaVar.B().getQuantityString(R.plurals.selected_count, vywVar.a(), Integer.valueOf(vywVar.a()));
        if (this.ao.equals(((cwpv) this.e.fe()).V())) {
            this.ay.j().ifPresent(new Consumer() { // from class: utv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ActionMode actionMode = (ActionMode) obj;
                    actionMode.setTitle(quantityString);
                    uuy uuyVar = uuy.this;
                    uuyVar.aY.clear();
                    uuyVar.ao.onCreateActionMode(actionMode, uuyVar.aY);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        uuw uuwVar = this.ay;
        ActionMode.Callback callback = this.ao;
        vvn vvnVar = (vvn) uuwVar;
        MenuItem menuItem = vvnVar.p;
        if (menuItem != null) {
            menuItem.collapseActionView();
        }
        AppBarLayout appBarLayout = (AppBarLayout) vvnVar.p().findViewById(R.id.appBarLayout);
        if (appBarLayout != null) {
            vvnVar.c = appBarLayout.e;
            appBarLayout.e = false;
            appBarLayout.r(true);
        }
        vvnVar.cC.h(callback, view, quantityString);
        this.ay.j().ifPresent(new Consumer() { // from class: utw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cfup cfupVar = uuy.a;
                ((ActionMode) obj).setTitle(quantityString);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    private final void N(boolean z, final bcse bcseVar) {
        if (!z) {
            this.bh.a();
            return;
        }
        ejlq ejlqVar = this.L;
        final uqo uqoVar = this.I;
        final BiPredicate biPredicate = new BiPredicate() { // from class: ury
            public final /* synthetic */ BiPredicate and(BiPredicate biPredicate2) {
                return BiPredicate$CC.$default$and(this, biPredicate2);
            }

            public final /* synthetic */ BiPredicate negate() {
                return BiPredicate$CC.$default$negate(this);
            }

            public final /* synthetic */ BiPredicate or(BiPredicate biPredicate2) {
                return BiPredicate$CC.$default$or(this, biPredicate2);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                bcse bcseVar2 = (bcse) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                cfup cfupVar = uuy.a;
                return booleanValue || (bcseVar2.aT() || MessageData.cU(bcseVar2.f()));
            }
        };
        final elfl b2 = ((tzj) uqoVar.c.a(tzj.class)).b().b();
        final ConversationIdType t = bcseVar.t();
        final elfl g = elfo.g(new Callable() { // from class: uqm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(uqo.this.d.d(t));
            }
        }, uqoVar.a);
        final elfl b3 = ((tzj) uqoVar.c.a(tzj.class)).a().b();
        ejlqVar.g(ejlp.a(elfo.k(b2, g, b3).a(new Callable() { // from class: uqn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean test;
                ParticipantsTable.BindData a2 = ((bctw) erqt.q(b2)).a();
                Boolean bool = (Boolean) erqt.q(g);
                bool.booleanValue();
                Optional optional = (Optional) erqt.q(b3);
                if (!optional.isPresent()) {
                    throw new IllegalStateException("Unable to fetch conversation metadata.");
                }
                uqo uqoVar2 = uqo.this;
                boolean z2 = uqoVar2.e.m() && ((bejf) optional.get()).g() != 0;
                String a3 = a2 == null ? "" : ((bdrt) uqoVar2.f.b()).a(a2, false);
                BiPredicate biPredicate2 = biPredicate;
                bcse bcseVar2 = bcseVar;
                test = biPredicate2.test(bcseVar2, bool);
                SelfIdentityId s = bcseVar2.s();
                String str = s != null ? ((SelfIdentityIdImpl) s).a : "";
                uqq createBuilder = uqr.a.createBuilder();
                int f = bcseVar2.f();
                createBuilder.copyOnWrite();
                uqr uqrVar = (uqr) createBuilder.instance;
                uqrVar.b |= 1;
                uqrVar.c = f;
                String b4 = bcseVar2.u().b();
                createBuilder.copyOnWrite();
                uqr uqrVar2 = (uqr) createBuilder.instance;
                b4.getClass();
                uqrVar2.b |= 2;
                uqrVar2.d = b4;
                createBuilder.copyOnWrite();
                uqr uqrVar3 = (uqr) createBuilder.instance;
                a3.getClass();
                uqrVar3.b |= 4;
                uqrVar3.e = a3;
                boolean av = bcseVar2.av();
                createBuilder.copyOnWrite();
                uqr uqrVar4 = (uqr) createBuilder.instance;
                uqrVar4.b |= 8;
                uqrVar4.f = av;
                int b5 = bcseVar2.b();
                createBuilder.copyOnWrite();
                uqr uqrVar5 = (uqr) createBuilder.instance;
                uqrVar5.b |= 2048;
                uqrVar5.n = b5;
                boolean ax = bcseVar2.ax();
                createBuilder.copyOnWrite();
                uqr uqrVar6 = (uqr) createBuilder.instance;
                uqrVar6.b |= 16;
                uqrVar6.g = ax;
                createBuilder.copyOnWrite();
                uqr uqrVar7 = (uqr) createBuilder.instance;
                uqrVar7.b |= 32;
                uqrVar7.h = test;
                createBuilder.copyOnWrite();
                uqr uqrVar8 = (uqr) createBuilder.instance;
                uqrVar8.b |= 64;
                uqrVar8.i = str;
                createBuilder.copyOnWrite();
                uqr uqrVar9 = (uqr) createBuilder.instance;
                uqrVar9.b |= 128;
                uqrVar9.j = z2;
                boolean aK = bcseVar2.aK();
                createBuilder.copyOnWrite();
                uqr uqrVar10 = (uqr) createBuilder.instance;
                uqrVar10.b |= 256;
                uqrVar10.k = aK;
                boolean bc = bcseVar2.bc();
                createBuilder.copyOnWrite();
                uqr uqrVar11 = (uqr) createBuilder.instance;
                uqrVar11.b |= 512;
                uqrVar11.l = bc;
                boolean z3 = bcseVar2.f() == 21;
                createBuilder.copyOnWrite();
                uqr uqrVar12 = (uqr) createBuilder.instance;
                uqrVar12.b |= 1024;
                uqrVar12.m = z3;
                return createBuilder.build();
            }
        }, uqoVar.b)), this.am);
    }

    public final void A() {
        MessageIdType messageIdType;
        Uri uri;
        final String stringExtra;
        Intent intent = this.e.fe().getIntent();
        if (intent != null) {
            messageIdType = bdhb.b(intent.getStringExtra("message_id"));
            intent.removeExtra("message_id");
            uri = (Uri) intent.getParcelableExtra("target_uri");
            intent.removeExtra("target_uri");
            if (ddjr.c() && intent.getBooleanExtra("via_reminder_view", false) && (stringExtra = intent.getStringExtra("viewed_reminder_id")) != null) {
                ((Optional) this.bu.b()).ifPresent(new Consumer() { // from class: usl
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((cnla) obj).i(uuy.this.aq, stringExtra);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        } else {
            messageIdType = bdhb.a;
            uri = null;
        }
        upx upxVar = this.aB;
        ConversationIdType conversationIdType = this.ap;
        ura uraVar = upxVar.c;
        uwi uwiVar = uraVar.l;
        Context context = uraVar.a;
        mz mzVar = uraVar.d;
        mzVar.getClass();
        int intValue = ((Integer) uvp.a.e()).intValue();
        int intValue2 = ((Integer) uvp.b.e()).intValue();
        int intValue3 = ((Integer) uvp.c.e()).intValue();
        uwn uwnVar = (uwn) uwiVar.a.b();
        uwnVar.getClass();
        ffbr ffbrVar = uwiVar.b;
        ffbr ffbrVar2 = uwiVar.c;
        ffbr ffbrVar3 = uwiVar.d;
        elbx elbxVar = (elbx) uwiVar.e.b();
        elbxVar.getClass();
        ffbr ffbrVar4 = uwiVar.f;
        azei azeiVar = (azei) uwiVar.g.b();
        azeiVar.getClass();
        ffbr ffbrVar5 = uwiVar.h;
        errl errlVar = (errl) uwiVar.i.b();
        errlVar.getClass();
        conversationIdType.getClass();
        uraVar.f = new uwh(uwnVar, ffbrVar, ffbrVar2, ffbrVar3, elbxVar, ffbrVar4, azeiVar, ffbrVar5, errlVar, context, conversationIdType, mzVar, intValue, intValue2, intValue3);
        elfl I = uraVar.I(messageIdType);
        erqj a2 = axou.a(new uuh(this, messageIdType, uri));
        Handler handler = cslq.a;
        I.k(a2, new cslo());
    }

    public final void B(List list) {
        uqi uqiVar = this.aB.b;
        uqiVar.a = list;
        uqiVar.F();
    }

    public final void C(ConversationMessageView conversationMessageView) {
        bcqs bcqsVar = (bcqs) this.aL.a();
        if (!this.Q.isPresent() || ((vfq) this.Q.get()).f(conversationMessageView.e, bcqsVar)) {
            if (this.v.f() && this.Q.isPresent()) {
                vfa vfaVar = (vfa) this.B.b();
                vfaVar.d.a(vfaVar.c.j(new emwl() { // from class: vet
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ejui ejuiVar = vfa.a;
                        ver verVar = (ver) ((ves) obj).toBuilder();
                        verVar.copyOnWrite();
                        ves vesVar = (ves) verVar.instance;
                        vesVar.b |= 4;
                        vesVar.e = true;
                        return (ves) verVar.build();
                    }
                }), vfa.a);
                vfq vfqVar = (vfq) this.Q.get();
                ea eaVar = this.e;
                ConversationMessageBubbleView conversationMessageBubbleView = conversationMessageView.g;
                bcse bcseVar = conversationMessageView.e;
                SelfIdentityId i = this.ay.i();
                boolean q = bcqsVar.q();
                boolean z = ((typ) bcqsVar.d).d;
                uuw uuwVar = this.ay;
                uuwVar.getClass();
                vfqVar.d(eaVar, conversationMessageView, conversationMessageBubbleView, bcseVar, i, q, z, new urr(uuwVar));
                return;
            }
            if (this.v.a() == 1 && this.v.g(conversationMessageView.e)) {
                return;
            }
            k();
            if (this.Q.isPresent()) {
                vfq vfqVar2 = (vfq) this.Q.get();
                ea eaVar2 = this.e;
                ConversationMessageBubbleView conversationMessageBubbleView2 = conversationMessageView.g;
                bcse bcseVar2 = conversationMessageView.e;
                SelfIdentityId i2 = this.ay.i();
                boolean q2 = bcqsVar.q();
                boolean z2 = ((typ) bcqsVar.d).d;
                uuw uuwVar2 = this.ay;
                uuwVar2.getClass();
                vfqVar2.d(eaVar2, conversationMessageView, conversationMessageBubbleView2, bcseVar2, i2, q2, z2, new urr(uuwVar2));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ajud, java.lang.Object] */
    public final void D(final ConversationMessageView conversationMessageView) {
        crly crlyVar;
        this.bs.isPresent();
        boolean a2 = this.bs.get().a((bcqs) this.aL.a(), conversationMessageView.e);
        boolean f = this.v.f();
        if (a2) {
            if (f) {
                if (conversationMessageView.k == null) {
                    return;
                }
                if (((Boolean) ((cfup) czur.a.get()).e()).booleanValue() && conversationMessageView.j.i() && ((SuggestionShortcutView) conversationMessageView.j.b()).H().d) {
                    View b2 = conversationMessageView.j.b();
                    crly crlyVar2 = conversationMessageView.k;
                    crlyVar2.getClass();
                    ConversationMessageView.x(b2, crlyVar2.b());
                } else {
                    crly crlyVar3 = conversationMessageView.k;
                    crlyVar3.getClass();
                    ((ComposeView) crlyVar3.b()).setVisibility(0);
                }
                if (ddjr.a() && (crlyVar = conversationMessageView.f) != null && crlyVar.a() == 0) {
                    conversationMessageView.f.g(8);
                }
                conversationMessageView.l.ifPresent(new Consumer() { // from class: czjw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((ajtv) obj).a(ConversationMessageView.this.e.u());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            f = false;
        }
        csjy.j("BugleReplies", "updateReplyButtonSelectionState: canShowReplyButton %b, hasNoSelectedMessages %b", Boolean.valueOf(a2), Boolean.valueOf(f));
    }

    final boolean E(int i) {
        upk upkVar;
        int i2;
        boolean z;
        ksp kspVar;
        MessagePartCoreData messagePartCoreData;
        if (this.v.a() == 0) {
            csjy.j("Bugle", "Handling action %d with empty selectedMessages", Integer.valueOf(i));
            return false;
        }
        final ArrayList arrayList = new ArrayList(this.v.b());
        ksp kspVar2 = new ksp() { // from class: utc
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                ((uxi) uuy.this.U.b()).b(arrayList, (eonx) obj);
            }
        };
        if (this.v.a() > 1) {
            if (i != R.id.action_delete_message) {
                return false;
            }
            j(this.v);
            kspVar2.accept(eonx.DELETE);
            return true;
        }
        final bcse bcseVar = (bcse) this.v.b().iterator().next();
        if (i == R.id.save_attachment) {
            List Y = bcseVar.Y();
            engw engwVar = bdjs.a;
            Iterator it = Y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    csjy.i("Bugle", "Save attachment action started");
                    if (this.bi.s() || ctid.c) {
                        r(bcseVar.Y());
                        kspVar2.accept(eonx.SAVE_ATTACHMENT);
                    } else {
                        ((ctuk) this.bj.b()).k(new uul(this));
                    }
                } else if (!le.u(((MessagePartCoreData) it.next()).V())) {
                    this.bw = bcseVar.Y();
                    s();
                    break;
                }
            }
            return true;
        }
        if (i == R.id.copy_text) {
            emxf.a(bcseVar.ar());
            String V = bcseVar.V(this.e.fe());
            if (V != null) {
                this.o.b(V, this.e.B().getString(R.string.message_context_menu_text_copied_toast_text));
                this.ay.l();
                kspVar2.accept(eonx.COPY);
            }
            return true;
        }
        if (i == R.id.action_delete_message) {
            j(this.v);
            kspVar2.accept(eonx.DELETE);
            return true;
        }
        if (i != R.id.share_message_menu) {
            if (i == R.id.forward_message_menu) {
                MessageCoreData b2 = ((ambs) this.j.b()).b(this.e.B(), bcseVar);
                if (!((Optional) this.bv.b()).isPresent()) {
                    ((akvg) this.t.b()).D(this.e.fe(), b2, equr.FORWARD);
                } else if (((atdn) this.br.b()).a()) {
                    ((ahtu) ((Optional) this.bv.b()).get()).b(this.e.fe(), this.f, ((ambs) this.j.b()).a(this.e.A(), bcseVar), equr.FORWARD);
                } else {
                    ((ahtu) ((Optional) this.bv.b()).get()).a(this.e.fe(), this.f, b2, equr.FORWARD);
                }
                this.ay.l();
                kspVar2.accept(eonx.FORWARD);
                return true;
            }
            if (i == R.id.details_menu) {
                final aztg d = ((bcqs) this.aL.a()).d(bcseVar.s());
                if (d == null) {
                    throw new IllegalStateException("getSubscriptionBySelfParticipantId returned null when processing details menu click.");
                }
                ejlq ejlqVar = this.L;
                final uqv uqvVar = (uqv) this.bp.b();
                final elfl b3 = ((tzj) uqvVar.b.a(tzj.class)).b().b();
                final elfl h = ((tzj) uqvVar.b.a(tzj.class)).a().b().h(new emwl() { // from class: uqu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return Long.valueOf(((bejf) ((Optional) obj).get()).j());
                    }
                }, uqvVar.a);
                ejlqVar.g(new ejlp(elfo.k(b3, h).a(new Callable() { // from class: uqt
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return uqv.this.c.a(bcseVar, (bctw) erqt.q(b3), d, ((Long) erqt.q(h)).longValue());
                    }
                }, uqvVar.a)), this.an);
                this.ay.l();
                kspVar2.accept(eonx.VIEW_DETAILS);
                return true;
            }
            if (i == R.id.action_send) {
                this.ay.m(bcseVar.u());
                this.ay.l();
                kspVar2.accept(eonx.RETRY_SEND);
                return true;
            }
            if (i == R.id.action_download) {
                q(bcseVar);
                this.ay.l();
                kspVar2.accept(eonx.DOWNLOAD);
                return true;
            }
            this.u.isPresent();
            Iterator it2 = ((upl) this.u.get()).a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    upkVar = null;
                    break;
                }
                upk upkVar2 = (upk) it2.next();
                if (i == upkVar2.a()) {
                    upkVar = upkVar2;
                    break;
                }
            }
            if (upkVar == null) {
                return false;
            }
            upkVar.h(bcseVar);
            l();
            return true;
        }
        bcseVar.getClass();
        String V2 = bcseVar.V(this.e.fe());
        String c2 = ((cpdg) this.bt.b()).c(this.e.B(), bcseVar.H());
        ffbr ffbrVar = this.t;
        List Y2 = bcseVar.Y();
        Context z2 = this.e.z();
        z2.getClass();
        csix.l(Y2);
        boolean i3 = cuxt.i(V2);
        boolean i4 = cuxt.i(c2);
        int size = ((i3 && i4) ? 0 : 1) + Y2.size();
        if (size <= 0) {
            throw new IllegalArgumentException("No parts to share");
        }
        Intent intent = new Intent();
        if (size == 1) {
            intent.setAction("android.intent.action.SEND");
            if (Y2.isEmpty()) {
                intent.setType("text/plain");
                if (!i3) {
                    intent.putExtra("android.intent.extra.TEXT", V2);
                }
                if (!i4) {
                    intent.putExtra("android.intent.extra.SUBJECT", c2);
                    intent.putExtra("extra_subject_mandatory", true);
                }
                kspVar = kspVar2;
                i2 = 1;
                z = i4;
            } else {
                MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) Y2.get(0);
                i2 = 1;
                Uri u = akvg.u(z2, messagePartCoreData2);
                if (u != null) {
                    z = i4;
                    if (le.q(messagePartCoreData2.V())) {
                        u = akvg.v(z2, u, messagePartCoreData2.V());
                    }
                    intent.putExtra("android.intent.extra.STREAM", u);
                    intent.setType(messagePartCoreData2.bB() ? "text/plain" : messagePartCoreData2.V());
                } else {
                    z = i4;
                }
                kspVar = kspVar2;
            }
        } else {
            i2 = 1;
            z = i4;
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(Y2.size());
            ArrayList arrayList3 = new ArrayList(size);
            Iterator it3 = Y2.iterator();
            while (it3.hasNext()) {
                Iterator it4 = it3;
                MessagePartCoreData messagePartCoreData3 = (MessagePartCoreData) it3.next();
                ksp kspVar3 = kspVar2;
                Uri u2 = akvg.u(z2, messagePartCoreData3);
                if (u2 != null) {
                    if (le.q(messagePartCoreData3.V())) {
                        messagePartCoreData = messagePartCoreData3;
                        u2 = akvg.v(z2, u2, messagePartCoreData.V());
                    } else {
                        messagePartCoreData = messagePartCoreData3;
                    }
                    arrayList2.add(u2);
                    String V3 = messagePartCoreData.V();
                    if (messagePartCoreData.bA()) {
                        arrayList3.add("text/plain");
                    } else if (V3 != null) {
                        arrayList3.add(V3);
                    }
                }
                kspVar2 = kspVar3;
                it3 = it4;
            }
            kspVar = kspVar2;
            String[] strArr = le.a;
            Iterator it5 = arrayList3.iterator();
            String str = "*/*";
            if (it5.hasNext()) {
                String[] C = le.C((String) it5.next());
                char c3 = 0;
                String str2 = C[0];
                String str3 = C[1];
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    String[] C2 = le.C((String) it5.next());
                    Iterator it6 = it5;
                    if (!str2.equalsIgnoreCase(C2[c3])) {
                        str2 = null;
                        break;
                    }
                    if (str3 == null || str3.equalsIgnoreCase(C2[1])) {
                        it5 = it6;
                    } else {
                        it5 = it6;
                        str3 = null;
                    }
                    c3 = 0;
                }
                if (str2 != null) {
                    if (str3 == null) {
                        str = str2.concat("/*");
                    } else {
                        str = str2 + "/" + str3;
                    }
                }
            }
            intent.setType(str);
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList2);
        }
        if (Y2.size() == i2 && ((MessagePartCoreData) Y2.get(0)).bt()) {
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            if (!i3) {
                intent.putExtra("android.intent.extra.TEXT", V2);
            }
            if (!z) {
                intent.putExtra("android.intent.extra.SUBJECT", c2);
                intent.putExtra("extra_subject_mandatory", true);
            }
        }
        eldl.p(this.e.fe(), Intent.createChooser(intent, this.e.B().getText(R.string.action_share)));
        this.ay.l();
        kspVar.accept(eonx.SHARE);
        return true;
    }

    public final boolean F(long j) {
        return c(j) < 0;
    }

    public final boolean G() {
        if (this.az.getChildCount() == 0) {
            return true;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.az.o;
        if (linearLayoutManager != null) {
            return linearLayoutManager.K() == 0;
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager during isScrolledToBottom().");
    }

    @Override // defpackage.czic
    public final boolean H(czid czidVar, final MessagePartCoreData messagePartCoreData, Rect rect, boolean z) {
        if (!z) {
            I(czidVar.c(), 1);
        }
        if (z && (czidVar instanceof ConversationMessageView)) {
            ConversationMessageView conversationMessageView = (ConversationMessageView) czidVar;
            C(conversationMessageView);
            D(conversationMessageView);
        }
        if (z || !this.v.f()) {
            M(czidVar.c(), messagePartCoreData);
            return true;
        }
        if (!czidVar.c().aI()) {
            bcse c2 = czidVar.c();
            if ((((bcqs) this.aL.a()).d.y() || !c2.bc()) && !czidVar.c().aG() && !czidVar.c().aK() && !czidVar.c().aj()) {
                if (messagePartCoreData.be()) {
                    this.bo.ifPresent(new Consumer() { // from class: usy
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            cfup cfupVar = uuy.a;
                            MessagePartCoreData messagePartCoreData2 = MessagePartCoreData.this;
                            ((cdlx) obj).a(messagePartCoreData2.A(), messagePartCoreData2.B(), messagePartCoreData2.aa());
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return false;
                }
                Uri t = messagePartCoreData.t();
                if (t == null) {
                    csjy.n("Bugle", "Cannot click attachment with null contentUri");
                } else if (messagePartCoreData.bo()) {
                    ellj.f(new upm(t, rect), this.e);
                    this.bg.T(2);
                } else if (messagePartCoreData.bC()) {
                    this.bk.c(this.e.fe(), t);
                } else {
                    if (messagePartCoreData.bd()) {
                        Context z2 = this.e.z();
                        z2.getClass();
                        final Uri b2 = cbgl.b(z2, t, messagePartCoreData.Y(), messagePartCoreData.V(), messagePartCoreData.p());
                        this.bg.av(messagePartCoreData.B().b(), true == czidVar.c().az() ? 4 : 3);
                        if (messagePartCoreData.bn()) {
                            akvg akvgVar = (akvg) this.t.b();
                            Context z3 = this.e.z();
                            z3.getClass();
                            akvgVar.C(z3, b2, messagePartCoreData.V());
                        } else {
                            this.bf.ifPresent(new Consumer() { // from class: usz
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    Context z4 = uuy.this.e.z();
                                    z4.getClass();
                                    ((tap) obj).b(z4, b2);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                    } else if (messagePartCoreData.bz()) {
                        String a2 = le.a(messagePartCoreData.V());
                        Context z4 = this.e.z();
                        z4.getClass();
                        Uri b3 = cbgl.b(z4, t, messagePartCoreData.Y(), a2, messagePartCoreData.p());
                        this.bg.aA(messagePartCoreData.bP(), messagePartCoreData.B().b(), true == czidVar.c().az() ? 4 : 3);
                        akvg akvgVar2 = (akvg) this.t.b();
                        Context z5 = this.e.z();
                        z5.getClass();
                        akvgVar2.C(z5, b3, a2);
                    } else if (messagePartCoreData.bk()) {
                        final ddxs ddxsVar = this.bm;
                        ddxs.c(this.e.fe(), new DialogInterface.OnClickListener() { // from class: ddxp
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ((akvg) ddxs.this.f.b()).O(messagePartCoreData);
                            }
                        });
                    }
                }
                return false;
            }
        }
        o(czidVar);
        return true;
    }

    public final void I(bcse bcseVar, int i) {
        if (this.v.f()) {
            final uxa uxaVar = this.h;
            if (bcseVar.aM() && bcseVar.ap()) {
                axnw.h(uxaVar.a(bcseVar, i, new Consumer() { // from class: uwv
                    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void o(java.lang.Object r8) {
                        /*
                            r7 = this;
                            uwz r8 = (defpackage.uwz) r8
                            bcse r0 = r8.a()
                            boolean r1 = r8.b()
                            r2 = 0
                            r3 = -1
                            if (r1 == 0) goto L4c
                            boolean r1 = r0.aT()
                            if (r1 == 0) goto L18
                            java.lang.String r1 = "Bugle.Message.Tap.Area.Sending.Counts"
                        L16:
                            r2 = r1
                            goto L3b
                        L18:
                            boolean r1 = r8.c()
                            if (r1 == 0) goto L21
                            java.lang.String r1 = "Bugle.Message.Tap.Area.Failed.Counts"
                            goto L16
                        L21:
                            int r1 = r0.f()
                            boolean r1 = defpackage.bdjs.o(r1)
                            if (r1 == 0) goto L2e
                            java.lang.String r1 = "Bugle.Message.Tap.Area.Delivered.Counts"
                            goto L16
                        L2e:
                            int r1 = r0.f()
                            boolean r1 = defpackage.bdjs.m(r1)
                            if (r1 == 0) goto L3b
                            java.lang.String r1 = "Bugle.Message.Tap.Area.Sent.Counts"
                            goto L16
                        L3b:
                            int r1 = r8.d()
                            r4 = 1
                            if (r1 != r4) goto L44
                            r3 = 0
                            goto L4c
                        L44:
                            int r8 = r8.d()
                            r1 = 2
                            if (r8 != r1) goto L4c
                            r3 = r4
                        L4c:
                            if (r2 == 0) goto L58
                            if (r3 < 0) goto L58
                            uxa r8 = defpackage.uxa.this
                            akzt r8 = r8.b
                            r8.e(r2, r3)
                            return
                        L58:
                            entd r8 = defpackage.uxa.a
                            ensk r8 = r8.n()
                            java.lang.String r1 = "logAttachmentMessageTapOriginInternal"
                            r4 = 191(0xbf, float:2.68E-43)
                            java.lang.String r5 = "com/google/android/apps/messaging/conversation/messagelist/logging/MessageListMetricsLogger"
                            java.lang.String r6 = "MessageListMetricsLogger.java"
                            ensk r8 = r8.h(r5, r1, r4, r6)
                            ensz r8 = (defpackage.ensz) r8
                            bdhg r0 = r0.w()
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                            java.lang.String r3 = "failed to logAttachmentMessageTapOrigin id:%s counterName:%s histogramKey:%d"
                            r8.J(r3, r0, r2, r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwv.o(java.lang.Object):void");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }));
            }
        }
    }

    @Override // defpackage.czic
    public final List K(List list, int i) {
        engw engwVar;
        cpfu cpfuVar;
        if (!dkta.a(list)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SuggestionData suggestionData = (SuggestionData) it.next();
                if ((suggestionData instanceof SmartSuggestionData) && ((SmartSuggestionData) suggestionData).w()) {
                    MessageIdType x = suggestionData.x();
                    cpn cpnVar = this.aH;
                    if (cpnVar != null && !x.c() && cpnVar.containsKey(x)) {
                        csjy.i("Bugle", "Not showing reminder SmartAction for message which already has a reminder set.");
                        arrayList.add(suggestionData);
                    }
                }
            }
            list.removeAll(arrayList);
        }
        final vvn vvnVar = (vvn) this.ay;
        bcqs bcqsVar = (bcqs) vvnVar.cA.a();
        cztl cztlVar = vvnVar.aC;
        bdud bdudVar = vvnVar.ba;
        ffix ffixVar = new ffix() { // from class: vok
            @Override // defpackage.ffix
            public final Object invoke() {
                return Boolean.valueOf(((bcvr) vvn.this.cM.a()).X());
            }
        };
        cpdg cpdgVar = (cpdg) vvnVar.bH.b();
        cvfe cvfeVar = (cvfe) vvnVar.Y.b();
        cpdgVar.getClass();
        cvfeVar.getClass();
        vxw vxwVar = new vxw(bcqsVar, bdudVar, cvfeVar, ffixVar);
        if (list == null || list.isEmpty()) {
            int i2 = engw.d;
            engwVar = enou.a;
            engwVar.getClass();
        } else {
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((SuggestionData) it2.next()) instanceof RbmSuggestionData) {
                        cpfuVar = cztlVar.d;
                        break;
                    }
                }
            }
            cpfuVar = cztlVar.c;
            engwVar = cpfuVar.a(list, vxwVar, i);
        }
        vvnVar.cz = engwVar;
        return vvnVar.cz;
    }

    final void L(final MessageIdType messageIdType, final Uri uri) {
        if (messageIdType.c()) {
            csjy.c("Bugle", "no message id, load return.");
        } else {
            cslq.c(new Runnable() { // from class: usv
                @Override // java.lang.Runnable
                public final void run() {
                    uuy uuyVar = uuy.this;
                    upx upxVar = uuyVar.aB;
                    MessageIdType messageIdType2 = messageIdType;
                    int g = upxVar.g(messageIdType2);
                    uuyVar.aU = g;
                    uuyVar.aV = uri;
                    if (!aewg.h()) {
                        if (g >= 0) {
                            uuyVar.v(g);
                        }
                    } else {
                        if (g < 0 || uuyVar.az.getChildCount() == 0) {
                            return;
                        }
                        int g2 = uuyVar.aB.g(messageIdType2);
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) uuyVar.az.o;
                        if (linearLayoutManager == null || linearLayoutManager.K() > g2 || linearLayoutManager.M() < g2) {
                            uuyVar.v(g);
                        }
                    }
                }
            }, 300L);
        }
    }

    @Override // defpackage.czic
    public final int a() {
        ParticipantsTable.BindData a2;
        vvn vvnVar = (vvn) this.ay;
        if (!vvnVar.cA.g() || (a2 = ((bcqs) vvnVar.cA.a()).g.a()) == null) {
            return vvnVar.cB;
        }
        int i = bdqo.a(a2).c;
        return i != 0 ? i : vvnVar.cB;
    }

    @Override // defpackage.czic
    public final int b() {
        return ((vvn) this.ay).cB;
    }

    public final long c(long j) {
        return j - this.s.f().toEpochMilli();
    }

    @Override // defpackage.czic
    public final bctw d() {
        if (this.aL.g() && ((bcqs) this.aL.a()).f) {
            return ((bcqs) this.aL.a()).g;
        }
        return null;
    }

    @Override // defpackage.czic
    public final bcxq e(SelfIdentityId selfIdentityId) {
        if (selfIdentityId == null || !this.aL.g()) {
            return null;
        }
        return ((bcqs) this.aL.a()).e(selfIdentityId);
    }

    public final Optional f() {
        View view = this.e.Q;
        return view == null ? Optional.empty() : Optional.of(view.findViewById(R.id.flash_conversation));
    }

    @Override // defpackage.czic
    public final Optional g(MessageIdType messageIdType) {
        return Optional.ofNullable((cqpu) this.aS.get(messageIdType));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final ArrayList h(final Menu menu) {
        final ArrayList arrayList = new ArrayList();
        engw engwVar = be;
        int i = ((enou) engwVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            MenuItem findItem = menu.findItem(((Integer) engwVar.get(i2)).intValue());
            if (findItem != null && findItem.isVisible()) {
                arrayList.add(findItem);
            }
        }
        this.u.ifPresent(new Consumer() { // from class: urs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Set set = ((upl) obj).a;
                cfup cfupVar = uuy.a;
                Stream stream = Collection.EL.stream(set);
                final Menu menu2 = menu;
                final ArrayList arrayList2 = arrayList;
                stream.forEach(new Consumer() { // from class: urz
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        cfup cfupVar2 = uuy.a;
                        MenuItem findItem2 = menu2.findItem(((upk) obj2).a());
                        if (findItem2 != null) {
                            arrayList2.add(findItem2);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return arrayList;
    }

    @Override // defpackage.czic
    public final void i(SuggestionData suggestionData) {
        l();
        this.ay.k(suggestionData);
    }

    final void j(final vyw vywVar) {
        if (!this.o.c(this.e.fe())) {
            this.bh.a();
            this.ay.l();
            return;
        }
        ehft ehftVar = new ehft(this.e.fe());
        ehftVar.y(this.e.fe().getResources().getQuantityString(R.plurals.delete_message_confirmation_dialog_title, vywVar.a(), Integer.valueOf(vywVar.a())));
        ehftVar.m(R.string.delete_message_confirmation_dialog_text);
        ehftVar.t(R.string.delete_message_confirmation_button, new elbb(this.P, "deleteMessages.Dialog.Onclick", new DialogInterface.OnClickListener() { // from class: uta
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ArrayList arrayList = (ArrayList) Collection.EL.stream(vywVar.b()).map(new Function() { // from class: urw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bcse) obj).u();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: urx
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                uuy uuyVar = uuy.this;
                csjy.j("Bugle", "UI initiated message %s deletion in conversation %s", arrayList, uuyVar.ap);
                if (uuyVar.ba.a()) {
                    ((ambs) uuyVar.j.b()).k(arrayList, cgrr.MESSAGE_LIST_MANUAL_DELETION);
                } else {
                    ((ambs) uuyVar.j.b()).j(arrayList);
                }
                uuyVar.l();
            }
        }));
        ehftVar.o(android.R.string.cancel, null);
        ehftVar.create().show();
    }

    public final void k() {
        this.v.d();
    }

    public final void l() {
        this.ay.l();
    }

    @Override // defpackage.czic
    public final void m(bcse bcseVar) {
        MessageIdType u = bcseVar.u();
        uqo uqoVar = this.I;
        if (uqoVar.h.c() || !uqoVar.h.equals(u)) {
            return;
        }
        fr frVar = this.I.g;
        if (frVar == null) {
            csjy.n("Bugle", "Failed to dismiss options UI: fragment manager is null.");
            return;
        }
        try {
            crka crkaVar = (crka) frVar.h("messageFailureOptionsBottomModalFragment");
            if (crkaVar != null) {
                crkh H = crkaVar.H();
                int f = bcseVar.f();
                if (ezxe.SENDING_OPTIONS.equals(H.d)) {
                    if (bdjs.m(f) || bdjs.q(f)) {
                        H.h.hw();
                        return;
                    }
                    return;
                }
                if (ezxe.SENT_OPTIONS.equals(H.d) && bdjs.o(f)) {
                    H.h.hw();
                }
            }
        } catch (IllegalStateException e) {
            enrr enrrVar = (enrr) csjy.a.e();
            enrrVar.Y(ente.a, "Bugle");
            enrrVar.Z(ense.a);
            ((enrr) ((enrr) enrrVar.g(e)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "d", 287, "LogUtil.java")).t("%s", "Failed to dismiss options UI:");
        }
    }

    public final void n(MessageIdType messageIdType, boolean z) {
        if (messageIdType.c()) {
            csjy.n("Bugle", "goToMessage with empty message id");
            return;
        }
        this.aO = true;
        elfl h = this.aB.h(messageIdType);
        erqj a2 = axou.a(new uug(this, messageIdType, z));
        Handler handler = cslq.a;
        h.k(a2, new cslo());
    }

    public final void o(czid czidVar) {
        csjy.j("Bugle", "handle message click for %s", czidVar);
        if (!this.v.f()) {
            w(czidVar.c());
            return;
        }
        bcse c2 = czidVar.c();
        boolean c3 = this.o.c(this.e.fe());
        final uxa uxaVar = this.h;
        axnw.h(uxaVar.a(c2, 3, new Consumer() { // from class: uwy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                uwz uwzVar = (uwz) obj;
                bcse a2 = uwzVar.a();
                int i = -1;
                if (uwzVar.b()) {
                    if (a2.bc()) {
                        i = 2;
                    } else if (uwzVar.c()) {
                        i = 3;
                    } else if (a2.aT() && a2.aM()) {
                        i = 0;
                    } else if (a2.aM() && bdjs.m(a2.f())) {
                        i = 1;
                    } else if (a2.aF()) {
                        i = 4;
                    }
                }
                if (i >= 0) {
                    uxa.this.b.e("Bugle.Message.Status.Tap.Counts", i);
                } else {
                    ((ensz) uxa.a.n().h("com/google/android/apps/messaging/conversation/messagelist/logging/MessageListMetricsLogger", "logMessageStatusTapInternal", 218, "MessageListMetricsLogger.java")).t("failed to logMessageStatusTap id:%s", a2.w());
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
        if (!this.bl.i() || !bdjs.w(c2.f())) {
            if (this.bl.q() && c2.av() && c2.ba()) {
                N(c3, c2);
                k();
            } else if (c2.ba() || c2.aK()) {
                N(c3, c2);
                k();
            }
            this.I.h = c2.u();
            return;
        }
        if (c2.aw()) {
            if (this.bl.n()) {
                Context z = this.e.z();
                z.getClass();
                Resources resources = z.getResources();
                String valueOf = String.valueOf(z.getPackageName());
                String c4 = this.bl.c();
                String string = resources.getString(R.string.dismiss_button);
                uxa uxaVar2 = this.h;
                String a2 = crmi.a(z);
                uxaVar2.b.c("Bugle.Etouffee.UI.FailToDecrypt.Dialog.Open.Counts");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z.getString(R.string.simple_fail_to_decrypt_message_dialog_body_with_learn_more, a2));
                LinkTextUtil.b(spannableStringBuilder, z, a2, c4, null);
                ehft ehftVar = new ehft(z);
                ehftVar.n(spannableStringBuilder);
                ehftVar.j(true);
                ehftVar.p(string, new DialogInterface.OnClickListener() { // from class: usq
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        cfup cfupVar = uuy.a;
                        dialogInterface.dismiss();
                    }
                });
                if (!TextUtils.isEmpty(c4)) {
                    final Uri a3 = ddyi.a("market://details?id=".concat(valueOf), this.e.fe());
                    String string2 = z.getString(R.string.update_messages_app);
                    string2.getClass();
                    ehftVar.u(new ffpa("\\s").a(string2, " "), new DialogInterface.OnClickListener() { // from class: usr
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            eldl.p(uuy.this.e.fe(), new Intent("android.intent.action.VIEW").setData(a3));
                        }
                    });
                }
                final iv create = ehftVar.create();
                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: uss
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        cfup cfupVar = uuy.a;
                        TextView textView = (TextView) iv.this.findViewById(android.R.id.message);
                        textView.getClass();
                        egyl.b(textView);
                    }
                });
                create.show();
                return;
            }
            return;
        }
        if (c2.aI()) {
            this.ay.m(c2.u());
            k();
            return;
        }
        if (c2.al() && c3) {
            w(czidVar.c());
            return;
        }
        deaj deajVar = this.bh;
        boolean e = deajVar.b.e();
        boolean q = deajVar.c.q();
        boolean i = ctid.i(deajVar.a);
        boolean d = deajVar.b.d();
        if (!e || !q || !i || !d) {
            this.bh.a();
            k();
            return;
        }
        if (!(czidVar instanceof ConversationMessageView)) {
            if (!c2.aY()) {
                throw new IllegalStateException("unhandled tap action for a conversation list item");
            }
            return;
        }
        ConversationMessageView conversationMessageView = (ConversationMessageView) czidVar;
        MessageIdType u = c2.u();
        boolean z2 = !conversationMessageView.G();
        Boolean valueOf2 = Boolean.valueOf(z2);
        csjy.j("Bugle", "Should show metadata view: %b", valueOf2);
        this.aQ.put(u, new uux(z2, conversationMessageView.e.f()));
        conversationMessageView.p = Optional.of(valueOf2);
        ((czia) conversationMessageView.ac.b()).b(conversationMessageView.G(), true);
    }

    public final void p() {
        if (this.az == null) {
            return;
        }
        this.aB.f.p();
    }

    public final void q(bcse bcseVar) {
        if (!this.o.c(this.e.fe())) {
            this.bh.a();
            return;
        }
        ((ambs) this.j.b()).l(bcseVar.u());
        if (((Boolean) ((cfup) b.get()).e()).booleanValue()) {
            uaj uajVar = this.bq;
            boolean z = false;
            if (bcseVar.aM() && bcseVar.ap()) {
                z = true;
            }
            if (uajVar.c(z)) {
                uaj uajVar2 = this.bq;
                uajVar2.b(R.string.data_required_download_snackbar_message);
                ((akzt) uajVar2.a.b()).c("Bugle.UI.Conversations.DataWarning.Downloading.Shown");
            }
        }
    }

    public final void r(List list) {
        sfx a2 = this.bn.a("Bugle.Async.ConversationFragment.ActionMode.Callback.onActionItemClicked.Duration");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            Uri t = messagePartCoreData.t();
            String V = messagePartCoreData.bB() ? "text/plain" : messagePartCoreData.V();
            if (t != null && V != null) {
                Uri v = messagePartCoreData.v();
                String str = null;
                if (!messagePartCoreData.bD() && !messagePartCoreData.bo()) {
                    str = messagePartCoreData.Y();
                }
                a2.b(t, V, v, str);
            }
        }
        if (a2.a.size() > 0) {
            a2.e(new Void[0]);
            this.ay.l();
        }
    }

    public final void s() {
        List list = this.bw;
        if (list == null || list.isEmpty()) {
            return;
        }
        urn urnVar = this.y;
        ea eaVar = this.e;
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) this.bw.remove(r2.size() - 1);
        urnVar.b.put(100, messagePartCoreData);
        String V = messagePartCoreData.bB() ? "text/plain" : messagePartCoreData.V();
        if (V != null) {
            csuv csuvVar = urnVar.c;
            String Y = messagePartCoreData.Y();
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.setType(V);
            intent.putExtra("android.intent.extra.TITLE", Y);
            eaVar.startActivityForResult(intent, 100);
        }
    }

    public final void t() {
        this.aO = true;
        elfl h = this.aB.h(bdhb.a);
        erqj a2 = axou.a(new uui(this));
        Handler handler = cslq.a;
        h.k(a2, new cslo());
    }

    @Override // defpackage.czic
    public final void u() {
        if (this.aP && G()) {
            uwh uwhVar = this.aB.c.f;
            uwhVar.getClass();
            if (uwhVar.x) {
                return;
            }
            this.aA.ab(0);
        }
    }

    public final void v(int i) {
        this.aP = i == 0;
        PinnedLinearLayoutManager pinnedLinearLayoutManager = this.aA;
        pinnedLinearLayoutManager.ac(i, pinnedLinearLayoutManager.I / 2);
    }

    public final void w(bcse bcseVar) {
        M(bcseVar, null);
    }

    public final void x(List list, String str) {
        ura uraVar = this.aB.c;
        boolean equals = TextUtils.equals(uraVar.g, str);
        uraVar.g = str;
        uraVar.j = list == null ? null : new HashSet(list);
        if (equals) {
            return;
        }
        uraVar.p();
    }

    public final void y(int i) {
        eg G = this.e.G();
        if (G != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.az.getLayoutParams();
            marginLayoutParams.bottomMargin = (int) (i * G.getResources().getDisplayMetrics().density);
            this.az.setLayoutParams(marginLayoutParams);
        }
    }

    public final void z(int i) {
        PinnedLinearLayoutManager pinnedLinearLayoutManager = this.aA;
        int max = Math.max(i, 0);
        if (max != pinnedLinearLayoutManager.a) {
            pinnedLinearLayoutManager.a = max;
            pinnedLinearLayoutManager.be();
        }
    }
}
