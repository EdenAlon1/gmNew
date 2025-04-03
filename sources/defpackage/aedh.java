package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.common.ListEmptyView;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aedh implements bcrg, ddwh, czyy {
    public static final enru a = enru.c("com/google/android/apps/messaging/home/HomeFragmentPeer");
    public final ejxn A;
    public final ejlq B;
    public final aefs C;
    public final aegj D;
    public final ffbr E;
    public final elbx F;
    public final ffbr G;
    public final ffbr H;
    public final ffbr I;
    public final ffbr J;
    public final ffbr K;
    public final ffbr L;
    public final ffbr M;
    public final ffbr N;
    public final ffbr O;
    public final ffbr P;
    public final Optional Q;
    public final ffbr R;
    public final ffbr S;
    public final ddwz T;
    public final fazb U;
    public final fazb V;
    public final fazb W;
    public final ecmt X;
    public final ecrj Y;
    public final ffbr Z;
    public final ejlr aA;
    public final ejlr aB;
    public final ffbr aC;
    public final ffbr aD;
    public final fazb aE;
    public final ffbr aF;
    public ViewTreeObserver.OnPreDrawListener aG;
    public ViewTreeObserver.OnPreDrawListener aH;
    public adg aI;
    public cgix aK;
    boolean aL;
    public aeac aM;
    ord aN;
    public LinearLayoutManager aO;
    public crly aP;
    public egzo aQ;
    public boolean aR;
    ajie aW;
    public boolean aX;
    public ViewTreeObserver.OnGlobalLayoutListener aY;
    public final ffbr aa;
    public final Optional ab;
    public final aeek ac;
    public final ffbr ad;
    public final ffbr ae;
    public final ffbr af;
    public final ffbr ag;
    public final ffbr ah;
    public final ffbr ai;
    public final ffbr aj;
    public final ffbr ak;
    public final eisx al;
    public final ffbr am;
    public final ffbr an;
    public final ffbr ao;
    public final ffbr ap;
    public final ffbr aq;
    public final axkm ar;
    public final ffbr as;
    public final ffbr at;
    public final ffbr au;
    public final ajid av;
    public final ajif aw;
    public final ejlr ax;
    public final ejlr ay;
    public final ejlr az;
    public final adzz b;
    public final ffbr bA;
    public final ffbr bB;
    public final ffbr bC;
    public final aepb bD;
    private final Activity bE;
    private final ffbr bF;
    private final ffbr bG;
    private final ffbr bH;
    private final ffbr bI;
    private final ffbr bJ;
    private final ffbr bK;
    private final fazb bL;
    private final ffbr bM;
    private final ffbr bN;
    private final ffbr bO;
    private final ffbr bP;
    private final ffbr bQ;
    private final ffbr bR;
    private final fazb bS;
    private final ffbr bT;
    private final ffbr bU;
    private final ffbr bV;
    private final ffbr bW;
    private final Optional bX;
    private final ffbr bY;
    private final ffbr bZ;
    public aenx ba;
    public final ffbr bb;
    public final crlv bc;
    public final alse bd;
    public final ffbr be;
    public final fazb bf;
    public final asgp bg;
    public final asgq bh;
    public final asgs bi;
    public final asgr bj;
    public final ffbr bk;
    public final ffbr bl;
    public final ffbr bm;
    public final ffbr bn;
    public final ffbr bo;
    public final ffbr bp;
    public final AtomicBoolean bq;
    public final ffbr br;
    public final ffbr bs;
    public final ffbr bt;
    public final ffbr bu;
    public final ffbr bv;
    public final ffbr bw;
    public final ffbr bx;
    public final ffbr by;
    public final ffbr bz;
    final ffbr c;
    private final ffbr ca;
    private final ffbr cb;
    private final ffbr cc;
    private final ffbr cd;
    private final ffbr ce;
    private final ffbr cf;
    private final ffbr cg;
    private final ffbr ch;
    private final ffbr ci;
    private final ffbr cj;
    private final ffbr ck;
    private MenuItem cl;
    private final tam cm;
    private final ffbr cn;
    private final ffbr co;
    private final fazb cp;
    private final fazb cq;
    private final fazb cr;
    private final ffbr cs;
    private final ffbr ct;
    private final ffbr cu;
    private final ffbr cv;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ctvb j;
    public final ffbr k;
    public final cqoh l;
    public final fazb m;
    public final ffbr n;
    public final ffbr o;
    public final fazb p;
    public final aeiu q;
    public final aeiw r;
    public final aemc s;
    public final ffbr t;
    public final ffbr u;
    public final ffbr v;
    public sl w;
    public final fazb x;
    public final fazb y;
    public final ejwl z;
    public boolean aJ = false;
    public boolean aS = true;
    public boolean aT = false;
    final bcpt aU = new bcpt();
    final HashSet aV = new HashSet();
    public boolean aZ = false;

    public aedh(eisx eisxVar, adzz adzzVar, Activity activity, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, Optional optional, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ctvb ctvbVar, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, cqoh cqohVar, fazb fazbVar, fazb fazbVar2, aeiu aeiuVar, aeiw aeiwVar, fazb fazbVar3, fazb fazbVar4, ejwl ejwlVar, ejxn ejxnVar, ejlq ejlqVar, aefs aefsVar, ffbr ffbrVar22, ffbr ffbrVar23, aegj aegjVar, ffbr ffbrVar24, elbx elbxVar, ffbr ffbrVar25, fazb fazbVar5, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, ffbr ffbrVar30, ffbr ffbrVar31, ffbr ffbrVar32, ffbr ffbrVar33, ffbr ffbrVar34, ffbr ffbrVar35, ajid ajidVar, ffbr ffbrVar36, ffbr ffbrVar37, ffbr ffbrVar38, ffbr ffbrVar39, fazb fazbVar6, ajif ajifVar, ffbr ffbrVar40, ffbr ffbrVar41, ffbr ffbrVar42, axkm axkmVar, ffbr ffbrVar43, ffbr ffbrVar44, ffbr ffbrVar45, ffbr ffbrVar46, Optional optional2, ffbr ffbrVar47, ffbr ffbrVar48, ddwz ddwzVar, ffbr ffbrVar49, final fazb fazbVar7, fazb fazbVar8, fazb fazbVar9, ecmt ecmtVar, ecrj ecrjVar, ffbr ffbrVar50, ffbr ffbrVar51, Optional optional3, aeek aeekVar, aepb aepbVar, ffbr ffbrVar52, ffbr ffbrVar53, ffbr ffbrVar54, ffbr ffbrVar55, ffbr ffbrVar56, ffbr ffbrVar57, ffbr ffbrVar58, ffbr ffbrVar59, aemc aemcVar, ffbr ffbrVar60, ffbr ffbrVar61, ffbr ffbrVar62, ffbr ffbrVar63, ffbr ffbrVar64, tam tamVar, alse alseVar, ffbr ffbrVar65, ffbr ffbrVar66, ffbr ffbrVar67, ffbr ffbrVar68, fazb fazbVar10, asgp asgpVar, asgq asgqVar, asgs asgsVar, asgr asgrVar, ffbr ffbrVar69, ffbr ffbrVar70, ffbr ffbrVar71, ffbr ffbrVar72, ffbr ffbrVar73, AtomicBoolean atomicBoolean, ffbr ffbrVar74, ffbr ffbrVar75, ffbr ffbrVar76, ffbr ffbrVar77, ffbr ffbrVar78, ffbr ffbrVar79, ffbr ffbrVar80, ffbr ffbrVar81, ffbr ffbrVar82, ffbr ffbrVar83, ffbr ffbrVar84, ffbr ffbrVar85, ffbr ffbrVar86, fazb fazbVar11, fazb fazbVar12, ffbr ffbrVar87, fazb fazbVar13, fazb fazbVar14, ffbr ffbrVar88, ffbr ffbrVar89, ffbr ffbrVar90, ffbr ffbrVar91, ffbr ffbrVar92, ffbr ffbrVar93, ffbr ffbrVar94, ffbr ffbrVar95, ffbr ffbrVar96, ffbr ffbrVar97, ffbr ffbrVar98, ffbr ffbrVar99, ffbr ffbrVar100, ffbr ffbrVar101, ffbr ffbrVar102) {
        ekzz f = eleg.f("HomeFragment#init");
        try {
            this.al = eisxVar;
            this.b = adzzVar;
            this.bE = activity;
            this.c = ffbrVar2;
            this.bW = ffbrVar3;
            this.bX = optional;
            this.n = ffbrVar;
            this.bY = ffbrVar4;
            this.bZ = ffbrVar5;
            this.bI = ffbrVar6;
            this.ao = ffbrVar7;
            this.ap = ffbrVar8;
            this.d = ffbrVar9;
            this.e = ffbrVar10;
            this.f = ffbrVar11;
            this.g = ffbrVar12;
            this.h = ffbrVar13;
            this.i = ffbrVar14;
            this.j = ctvbVar;
            this.k = ffbrVar15;
            this.ca = ffbrVar16;
            this.cb = ffbrVar17;
            this.cc = ffbrVar18;
            this.cd = ffbrVar19;
            this.ce = ffbrVar20;
            this.bF = ffbrVar21;
            this.l = cqohVar;
            this.m = fazbVar;
            this.p = fazbVar2;
            this.x = fazbVar3;
            this.y = fazbVar4;
            this.z = ejwlVar;
            this.A = ejxnVar;
            this.B = ejlqVar;
            this.C = aefsVar;
            this.am = ffbrVar22;
            this.an = ffbrVar23;
            this.D = aegjVar;
            this.E = ffbrVar24;
            this.F = elbxVar;
            this.bK = ffbrVar25;
            this.bL = fazbVar5;
            this.G = ffbrVar26;
            this.H = ffbrVar27;
            this.bM = ffbrVar28;
            this.bN = ffbrVar29;
            this.bO = ffbrVar30;
            this.bP = ffbrVar31;
            this.I = ffbrVar32;
            this.J = ffbrVar33;
            this.K = ffbrVar34;
            this.bQ = ffbrVar35;
            this.av = ajidVar;
            this.L = ffbrVar36;
            this.bR = ffbrVar37;
            this.M = ffbrVar38;
            this.cf = ffbrVar39;
            this.bS = fazbVar6;
            this.aw = ajifVar;
            this.N = ffbrVar40;
            this.bT = ffbrVar41;
            this.O = ffbrVar42;
            this.ar = axkmVar;
            this.br = ffbrVar43;
            this.bs = ffbrVar44;
            this.bt = ffbrVar45;
            this.P = ffbrVar46;
            this.Q = optional2;
            this.R = ffbrVar47;
            this.S = ffbrVar48;
            this.T = ddwzVar;
            this.bU = ffbrVar49;
            this.U = fazbVar7;
            this.V = fazbVar8;
            this.W = fazbVar9;
            this.X = ecmtVar;
            this.Y = ecrjVar;
            this.Z = ffbrVar50;
            this.aa = ffbrVar51;
            this.ab = optional3;
            this.ac = aeekVar;
            this.bD = aepbVar;
            this.bV = ffbrVar52;
            this.ad = ffbrVar53;
            this.ae = ffbrVar54;
            this.af = ffbrVar55;
            this.ag = ffbrVar56;
            this.ah = ffbrVar57;
            this.q = aeiuVar;
            this.r = aeiwVar;
            this.cg = ffbrVar58;
            this.ch = ffbrVar59;
            this.s = aemcVar;
            this.as = ffbrVar60;
            this.at = ffbrVar61;
            this.au = ffbrVar62;
            this.ai = ffbrVar63;
            this.aj = ffbrVar64;
            this.bd = alseVar;
            this.ci = ffbrVar65;
            this.cj = ffbrVar66;
            this.cm = tamVar;
            this.bb = ffbrVar67;
            this.be = ffbrVar68;
            this.bf = fazbVar10;
            this.bg = asgpVar;
            this.bh = asgqVar;
            this.bi = asgsVar;
            this.bj = asgrVar;
            this.bG = ffbrVar69;
            this.ak = ffbrVar70;
            this.ck = ffbrVar71;
            this.aC = ffbrVar72;
            this.bm = ffbrVar73;
            this.aD = ffbrVar75;
            this.bq = atomicBoolean;
            this.aq = ffbrVar74;
            this.bn = ffbrVar76;
            this.bo = ffbrVar77;
            this.cn = ffbrVar78;
            this.bl = ffbrVar79;
            this.t = ffbrVar80;
            this.bH = ffbrVar81;
            this.o = ffbrVar82;
            this.bp = ffbrVar83;
            this.co = ffbrVar84;
            this.aF = ffbrVar86;
            this.u = ffbrVar85;
            this.aE = fazbVar11;
            this.cr = fazbVar12;
            this.cs = ffbrVar87;
            this.cp = fazbVar13;
            this.cq = fazbVar14;
            this.bJ = ffbrVar88;
            this.ct = ffbrVar89;
            this.bu = ffbrVar90;
            this.bk = ffbrVar91;
            this.bv = ffbrVar92;
            this.cu = ffbrVar93;
            this.bw = ffbrVar94;
            this.bx = ffbrVar95;
            this.cv = ffbrVar97;
            this.by = ffbrVar96;
            this.bz = ffbrVar98;
            this.bA = ffbrVar99;
            this.bB = ffbrVar100;
            this.v = ffbrVar101;
            this.bC = ffbrVar102;
            this.ax = new aecj(this);
            this.ay = new aecm(this);
            this.az = new aecp(this);
            this.aA = new aecq(this);
            this.aB = new aect(this);
            this.aL = false;
            this.bc = new crlv("enable_ditto_extensions_state", new ffix() { // from class: aeal
                @Override // defpackage.ffix
                public final Object invoke() {
                    fazb fazbVar15 = fazb.this;
                    boolean z = false;
                    if (((Optional) fazbVar15.b()).isPresent() && ((acio) ((Optional) fazbVar15.b()).get()).m()) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            });
            f.close();
        } finally {
        }
    }

    private final void I(Context context) {
        adtn adtnVar = (adtn) this.bT.b();
        adtt adttVar = new adtt();
        adttVar.b(eoio.BUGLE_ADVANCED_FEEDBACK_SOURCE_OPTIONS_MENU);
        adtnVar.b(context, adttVar.a());
    }

    private final void J() {
        ((akvg) this.G.b()).w(this.b.fe(), this.al);
    }

    private final void K() {
        axnw.h(((adtc) this.bO.b()).c(this.b.A(), "Messenger_main", this.al));
    }

    private final void L(int i) {
        ((akzt) this.bM.b()).e("Bugle.UI.AvatarMenu.ItemClickEvent", i);
    }

    private final void M() {
        if (this.aK.b()) {
            this.ba.a = !D();
        }
    }

    public static RecyclerView b(adzz adzzVar) {
        return (RecyclerView) f(adzzVar).findViewById(R.id.list);
    }

    public static View c(adzz adzzVar) {
        return adzzVar.N().findViewById(com.google.android.apps.messaging.R.id.conversation_list_not_default_sms_app_view);
    }

    public static View d(adzz adzzVar) {
        return adzzVar.N().findViewById(com.google.android.apps.messaging.R.id.go_to_top_inflated_view);
    }

    public static ViewGroup e(adzz adzzVar) {
        return (ViewGroup) f(adzzVar).findViewById(com.google.android.apps.messaging.R.id.bottom_layout);
    }

    public static ViewGroup f(adzz adzzVar) {
        return (ViewGroup) adzzVar.N().findViewById(com.google.android.apps.messaging.R.id.home_fragment);
    }

    public static LottieAnimationView g(adzz adzzVar) {
        return (LottieAnimationView) c(adzzVar).findViewById(com.google.android.apps.messaging.R.id.default_chat_app_animation);
    }

    public static czyz k(eg egVar) {
        czyz czyzVar = (czyz) ((cwpv) egVar).V();
        czyzVar.getClass();
        return czyzVar;
    }

    public static void w(ListEmptyView listEmptyView, int i) {
        listEmptyView.a.setContentDescription(listEmptyView.getResources().getString(i));
        listEmptyView.b(i);
    }

    public final void A(ListEmptyView listEmptyView) {
        if (C() && this.aK.b()) {
            listEmptyView.a(8);
            kkw kkwVar = new kkw(-1, -1);
            kkwVar.c = 16;
            kkwVar.b(new AppBarLayout.ScrollingViewBehavior());
            listEmptyView.setLayoutParams(kkwVar);
            return;
        }
        if (ddzb.o(this.b.A())) {
            listEmptyView.a(8);
        } else {
            listEmptyView.a(0);
            listEmptyView.c(com.google.android.apps.messaging.R.drawable.ic_messages_noconversations);
        }
    }

    public final void B(boolean z) {
        if (this.bE.isDestroyed()) {
            return;
        }
        this.aR = !z;
        if (z && this.j.G()) {
            this.aP.g(0);
        } else {
            this.aP.e();
        }
    }

    public final boolean C() {
        return !E() && ((akmj) this.cu.b()).a() && ((Optional) this.bS.b()).isPresent();
    }

    public final boolean D() {
        return ((cwpv) this.b.fe()).V() instanceof czyz;
    }

    public final boolean E() {
        return ahpj.a(this.bE, this.cm.a);
    }

    public final boolean F() {
        return this.aO.K() == 0;
    }

    public final boolean G(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        Context A = this.b.A();
        if (itemId == com.google.android.apps.messaging.R.id.action_settings) {
            ((akvg) this.G.b()).M(A, this.al);
            L(2);
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_help_and_feedback) {
            K();
            L(4);
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_help) {
            K();
            L(4);
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_advanced_feedback) {
            I(A);
            L(6);
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_show_archived) {
            J();
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_show_spam_folder) {
            ((akvg) this.G.b()).ab(A);
            ((adsd) this.h.b()).a(12);
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_mark_all_as_read) {
            ((aedr) this.c.b()).a(this.al);
            ((akzt) this.bM.b()).c("Bugle.UI.MarkAllAsRead");
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_show_blocked_contacts) {
            ((akvg) this.G.b()).x(A);
            ((akzt) this.bM.b()).c("Bugle.UI.Blocked");
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_zero_state_search) {
            ((ddou) this.bN.b()).b(this.al, this.b.A());
            return true;
        }
        ((dafa) this.bL.b()).d(itemId, this.b.fe(), dafa.a);
        if (this.bc.b() && ((acio) ((Optional) this.U.b()).get()).n(menuItem)) {
            return true;
        }
        if (itemId != com.google.android.apps.messaging.R.id.action_camera) {
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x047f A[Catch: all -> 0x0504, TryCatch #2 {all -> 0x0504, blocks: (B:38:0x0409, B:40:0x0414, B:41:0x041e, B:43:0x042c, B:96:0x0462, B:95:0x045f, B:107:0x0463, B:109:0x047f, B:110:0x049e, B:112:0x04ac, B:113:0x04bf, B:115:0x04c7, B:117:0x04cf, B:119:0x04d5, B:120:0x04e7, B:91:0x045a), top: B:20:0x00a5, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04ac A[Catch: all -> 0x0504, TryCatch #2 {all -> 0x0504, blocks: (B:38:0x0409, B:40:0x0414, B:41:0x041e, B:43:0x042c, B:96:0x0462, B:95:0x045f, B:107:0x0463, B:109:0x047f, B:110:0x049e, B:112:0x04ac, B:113:0x04bf, B:115:0x04c7, B:117:0x04cf, B:119:0x04d5, B:120:0x04e7, B:91:0x045a), top: B:20:0x00a5, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04d5 A[Catch: all -> 0x0504, TryCatch #2 {all -> 0x0504, blocks: (B:38:0x0409, B:40:0x0414, B:41:0x041e, B:43:0x042c, B:96:0x0462, B:95:0x045f, B:107:0x0463, B:109:0x047f, B:110:0x049e, B:112:0x04ac, B:113:0x04bf, B:115:0x04c7, B:117:0x04cf, B:119:0x04d5, B:120:0x04e7, B:91:0x045a), top: B:20:0x00a5, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04e7 A[Catch: all -> 0x0504, TRY_LEAVE, TryCatch #2 {all -> 0x0504, blocks: (B:38:0x0409, B:40:0x0414, B:41:0x041e, B:43:0x042c, B:96:0x0462, B:95:0x045f, B:107:0x0463, B:109:0x047f, B:110:0x049e, B:112:0x04ac, B:113:0x04bf, B:115:0x04c7, B:117:0x04cf, B:119:0x04d5, B:120:0x04e7, B:91:0x045a), top: B:20:0x00a5, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0075 A[Catch: all -> 0x050c, TryCatch #4 {all -> 0x050c, blocks: (B:3:0x0008, B:5:0x0010, B:8:0x0018, B:11:0x0037, B:13:0x003f, B:16:0x004f, B:18:0x0055, B:19:0x009a, B:22:0x00a7, B:24:0x00b4, B:26:0x00ba, B:28:0x00c8, B:29:0x00d5, B:106:0x00d1, B:132:0x0075, B:134:0x008f, B:136:0x0097, B:138:0x0026), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[Catch: all -> 0x050c, TryCatch #4 {all -> 0x050c, blocks: (B:3:0x0008, B:5:0x0010, B:8:0x0018, B:11:0x0037, B:13:0x003f, B:16:0x004f, B:18:0x0055, B:19:0x009a, B:22:0x00a7, B:24:0x00b4, B:26:0x00ba, B:28:0x00c8, B:29:0x00d5, B:106:0x00d1, B:132:0x0075, B:134:0x008f, B:136:0x0097, B:138:0x0026), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[Catch: all -> 0x050c, TryCatch #4 {all -> 0x050c, blocks: (B:3:0x0008, B:5:0x0010, B:8:0x0018, B:11:0x0037, B:13:0x003f, B:16:0x004f, B:18:0x0055, B:19:0x009a, B:22:0x00a7, B:24:0x00b4, B:26:0x00ba, B:28:0x00c8, B:29:0x00d5, B:106:0x00d1, B:132:0x0075, B:134:0x008f, B:136:0x0097, B:138:0x0026), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0414 A[Catch: all -> 0x0504, TryCatch #2 {all -> 0x0504, blocks: (B:38:0x0409, B:40:0x0414, B:41:0x041e, B:43:0x042c, B:96:0x0462, B:95:0x045f, B:107:0x0463, B:109:0x047f, B:110:0x049e, B:112:0x04ac, B:113:0x04bf, B:115:0x04c7, B:117:0x04cf, B:119:0x04d5, B:120:0x04e7, B:91:0x045a), top: B:20:0x00a5, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x042c A[Catch: all -> 0x0504, TRY_LEAVE, TryCatch #2 {all -> 0x0504, blocks: (B:38:0x0409, B:40:0x0414, B:41:0x041e, B:43:0x042c, B:96:0x0462, B:95:0x045f, B:107:0x0463, B:109:0x047f, B:110:0x049e, B:112:0x04ac, B:113:0x04bf, B:115:0x04c7, B:117:0x04cf, B:119:0x04d5, B:120:0x04e7, B:91:0x045a), top: B:20:0x00a5, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(android.view.MenuInflater r22) {
        /*
            Method dump skipped, instructions count: 1305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aedh.H(android.view.MenuInflater):void");
    }

    public final int a() {
        return ((aehw) this.p.b()).a();
    }

    public RecyclerView getRecyclerView() {
        return b(this.b);
    }

    public final aedh h() {
        return this.b.H();
    }

    public final aehy i() {
        return (aehy) this.p.b();
    }

    public final aeix j() {
        return (aeix) this.m.b();
    }

    @Override // defpackage.ddwh
    public final List l() {
        ArrayList arrayList = new ArrayList(1);
        ddwi ddwiVar = new ddwi(e(this.b));
        if (this.ac.g() != null) {
            View g = this.ac.g();
            g.getClass();
            arrayList.add(new ddwi(g));
        }
        arrayList.add(ddwiVar);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [fazb, java.lang.Object] */
    public final void m() {
        final ArrayList arrayList = new ArrayList();
        if (adhu.b()) {
            ((Optional) this.bZ.b()).ifPresent(new Consumer() { // from class: aeao
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    arrayList.add((dbwa) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (((aspb) this.cv.b()).a() && ((Optional) this.ci.b()).isPresent()) {
            arrayList.add((ajhy) ((Optional) this.ci.b()).get());
        }
        if (((acpf) this.bH.b()).a()) {
            ((Optional) this.bI.b()).ifPresent(new Consumer() { // from class: aeaz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    arrayList.add((acxp) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        arrayList.add((ajhy) this.cj.b());
        ((Optional) this.bY.b()).ifPresent(new Consumer() { // from class: aebk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                arrayList.add((adms) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        arrayList.add((ajhy) this.cg.b());
        arrayList.add((ajhy) this.ca.b());
        arrayList.add((ajhy) this.cb.b());
        dcyu dcyuVar = (dcyu) this.ce.b();
        errl errlVar = (errl) dcyuVar.a.b();
        errlVar.getClass();
        errl errlVar2 = (errl) dcyuVar.b.b();
        errlVar2.getClass();
        arrayList.add(new dcyt(errlVar, errlVar2, dcyuVar.c));
        ddbt ddbtVar = (ddbt) this.cd.b();
        ffbr ffbrVar = ddbtVar.a;
        ffbr ffbrVar2 = ddbtVar.b;
        ffbr ffbrVar3 = ddbtVar.c;
        ffbr ffbrVar4 = ddbtVar.d;
        ffbr ffbrVar5 = ddbtVar.e;
        ffbr ffbrVar6 = ddbtVar.f;
        errl errlVar3 = (errl) ddbtVar.g.b();
        errlVar3.getClass();
        errl errlVar4 = (errl) ddbtVar.h.b();
        errlVar4.getClass();
        arrayList.add(new ddbs(ffbrVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, ffbrVar6, errlVar3, errlVar4, ddbtVar.i, ddbtVar.j, ddbtVar.k, ddbtVar.l, ddbtVar.m, ddbtVar.n));
        if (csgj.a() && ((Boolean) ((cfup) csgj.t.get()).e()).booleanValue()) {
            ((Optional) ((fbbb) this.ch).a).ifPresent(new Consumer() { // from class: aebt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    arrayList.add((tdg) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (((Optional) this.ci.b()).isPresent() && !((aspb) this.cv.b()).a()) {
            arrayList.add((ajhy) ((Optional) this.ci.b()).get());
        }
        if (((asql) this.cs.b()).a()) {
            arrayList.add((ajhy) ((Optional) this.cr.b()).get());
        }
        Stream sorted = Collection.EL.stream((Set) this.cf.b()).sorted(Comparator.CC.comparingInt(new ToIntFunction() { // from class: aebu
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((ajhy) obj).n();
            }
        }));
        int i = engw.d;
        arrayList.addAll((java.util.Collection) sorted.collect(endq.a));
        dabh dabhVar = (dabh) this.cc.b();
        adzz adzzVar = this.b;
        ffbr ffbrVar7 = dabhVar.a;
        ffbr ffbrVar8 = dabhVar.b;
        ffbr ffbrVar9 = dabhVar.c;
        RecyclerView b = b(adzzVar);
        cqoh cqohVar = (cqoh) ffbrVar9.b();
        cqohVar.getClass();
        ?? b2 = dabhVar.d.b();
        b2.getClass();
        b.getClass();
        arrayList.add(new dabg(ffbrVar7, ffbrVar8, cqohVar, b2, b));
        ajid ajidVar = this.av;
        ViewGroup e = e(this.b);
        ajidVar.h = (ajhy[]) arrayList.toArray(new ajhy[arrayList.size()]);
        for (ajhy ajhyVar : ajidVar.h) {
            ajhyVar.c(ajidVar, e);
        }
    }

    public final void n() {
        if (((aube) this.bv.b()).a()) {
            ensk e = a.e();
            e.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "enterMultiSelectState", 2844, "HomeFragmentPeer.java")).q("enterMultiSelectState");
        } else {
            aeaa.a.m("enterMultiSelectState");
        }
        czza czzaVar = (czza) this.bP.b();
        aedh h = h();
        Context context = (Context) czzaVar.a.b();
        cuye cuyeVar = (cuye) czzaVar.b.b();
        cuyeVar.getClass();
        cpbs cpbsVar = (cpbs) czzaVar.c.b();
        cpbsVar.getClass();
        crqw crqwVar = (crqw) czzaVar.d.b();
        crqwVar.getClass();
        Optional optional = (Optional) czzaVar.e.b();
        optional.getClass();
        czyz czyzVar = new czyz(context, cuyeVar, cpbsVar, crqwVar, optional, h, czzaVar.f, czzaVar.g, czzaVar.h);
        this.aM.h(czyzVar, this.b.N(), null);
        if (E()) {
            i().Q(aeir.a);
            ((Optional) this.bJ.b()).ifPresent(new Consumer() { // from class: aebp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((ajjl) obj).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        i().O(czyzVar);
        M();
        ((adsd) this.h.b()).a(24);
    }

    public final void o() {
        if (this.b.aF()) {
            if (((aube) this.bv.b()).a()) {
                ensk e = a.e();
                e.Y(ente.a, "HomeFragmentFlogger");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "exitMultiSelectState", 2866, "HomeFragmentPeer.java")).q("exitMultiSelectState");
            } else {
                aeaa.a.m("exitMultiSelectState");
            }
            if (!this.aM.a().isEmpty()) {
                ord ordVar = this.aN;
                if (ordVar != null) {
                    ordVar.h();
                }
                this.aM.b();
            }
            if (this.aN == null) {
                ((aehw) this.p.b()).u(0, ((aehw) this.p.b()).a());
            }
            M();
        }
    }

    public final void p(adhl adhlVar, final Optional optional) {
        switch (adhlVar.ordinal()) {
            case 1:
                if (adhu.a()) {
                    akvg akvgVar = (akvg) this.G.b();
                    adzz adzzVar = this.b;
                    akvgVar.M(adzzVar.A(), this.al);
                } else {
                    ((akvg) this.G.b()).L(this.b.A());
                }
                L(1);
                break;
            case 2:
                K();
                L(3);
                break;
            case 3:
                I(this.b.A());
                L(5);
                break;
            case 4:
                ((Optional) this.bW.b()).ifPresent(new Consumer() { // from class: aebj
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        adns adnsVar = (adns) obj;
                        ejlp ejlpVar = new ejlp(elfl.g(((eixo) adnsVar.a.b()).c((eisx) adnsVar.b.b())).h(new emwl() { // from class: adnq
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return ((eixn) obj2).b().g;
                            }
                        }, erpp.a).h(new emwl() { // from class: adnr
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", ewom.PRIVACY_ADVISOR_MESSAGES.qw).putExtra("extra.accountName", (String) obj2);
                            }
                        }, erpp.a));
                        ejlm ejlmVar = new ejlm(null);
                        aedh aedhVar = aedh.this;
                        aedhVar.B.i(ejlpVar, ejlmVar, aedhVar.aA);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                L(7);
                break;
            case 5:
                J();
                break;
            case 7:
                ((aedr) this.c.b()).a(this.al);
                break;
            case 8:
                if (!adhu.b() || !((Optional) this.H.b()).isPresent()) {
                    ((akvg) this.G.b()).I(this.b.A());
                    break;
                } else {
                    ((dbtj) ((Optional) this.H.b()).get()).a();
                    break;
                }
                break;
            case 9:
                ((acio) ((Optional) this.U.b()).get()).g(acmd.STANDALONE);
                break;
            case 10:
                ((Optional) this.cn.b()).ifPresent(new Consumer() { // from class: aebl
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        aedh aedhVar = aedh.this;
                        ((adok) obj).a(aedhVar.b, aedhVar.al, optional);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                break;
            case 11:
                ((Optional) this.bl.b()).ifPresent(new Consumer() { // from class: aebm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((ajlu) obj).a(aedh.this.b);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                break;
        }
    }

    final void q(int i, SelectedConversation selectedConversation, MessageIdType messageIdType, bcyl bcylVar) {
        int i2;
        aemg aemgVar = (aemg) this.x.b();
        aler alerVar = aemgVar.m;
        if (alerVar != null) {
            alerVar.c();
            aemgVar.m = null;
        }
        ConversationId conversationId = selectedConversation.b;
        ConversationIdType conversationIdType = selectedConversation.a;
        this.bd.a(alrv.r, 0);
        int i3 = 1;
        if (!selectedConversation.h || ((askf) this.co.b()).a()) {
            if (((Boolean) wpl.a.e()).booleanValue()) {
                abar abarVar = (abar) this.bV.b();
                efbd.c();
                if (abarVar.c == null) {
                    ((enrr) ((enrr) abar.a.h()).h("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl", "cancelCurrentLoad", 87, "ConversationCachedLoaderImpl.java")).q("No conversations have started loading");
                } else {
                    enrr enrrVar = (enrr) ((enrr) abar.a.h()).h("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl", "cancelCurrentLoad", 91, "ConversationCachedLoaderImpl.java");
                    abaq abaqVar = abarVar.c;
                    abaqVar.getClass();
                    enrrVar.t("Cancel loading for conversation %s", abaqVar.a.d().b());
                    abarVar.a().close();
                }
                ((enrr) ((enrr) abar.a.h()).h("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl", "startLoadingConversation", 58, "ConversationCachedLoaderImpl.java")).t("Start loading messages for conversation %s", conversationId.b());
                abarVar.c = new abaq(abarVar.b.a(conversationId, alxk.FOR_DISPLAY));
            }
            messageIdType = bdhb.a;
        } else {
            bdmz bdmzVar = (bdmz) this.bU.b();
            int intValue = ((Integer) uvp.a.e()).intValue();
            efbd.c();
            csjy.c("Bugle", "cancel preload.");
            bdmzVar.c = bdgq.a;
            elfl elflVar = bdmzVar.d;
            if (elflVar != null) {
                bdmzVar.d = null;
                elflVar.cancel(false);
            }
            emxf.l(bdmzVar.c.b());
            emxf.l(bdmzVar.d == null);
            bdmzVar.c = conversationIdType;
            bdmzVar.d = !messageIdType.c() ? bdmzVar.a(conversationIdType, messageIdType, intValue) : bdmzVar.b(conversationIdType, intValue);
        }
        MessageIdType messageIdType2 = messageIdType;
        if (selectedConversation.t == amny.c && (selectedConversation.h || selectedConversation.u)) {
            final cgiw cgiwVar = (cgiw) this.ct.b();
            final eg fe = this.b.fe();
            ehft ehftVar = new ehft(fe);
            ehftVar.x(com.google.android.apps.messaging.R.string.rbm_email_trusted_contacts_user_education_title);
            ehftVar.m(com.google.android.apps.messaging.R.string.rbm_email_trusted_contacts_user_education_body);
            ehftVar.t(com.google.android.apps.messaging.R.string.ok_action, new elbb(cgiwVar.a, "TrustedContactsDialog#ShowRbmEmailDisabledEducationDialog#positive", new DialogInterface.OnClickListener() { // from class: cgiu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                }
            }));
            ehftVar.o(com.google.android.apps.messaging.R.string.learn_more_action, new elbb(cgiwVar.a, "TrustedContactsDialog#ShowRbmEmailDisabledEducationDialog#negative", new DialogInterface.OnClickListener() { // from class: cgiv
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    eldl.p(fe, new Intent("android.intent.action.VIEW", Uri.parse((String) cgiw.this.b.b())));
                }
            }));
            ehftVar.a();
            return;
        }
        if (!this.aK.b()) {
            boolean z = selectedConversation.h;
            int i4 = this.aK.d;
            if (i4 != 0) {
                if (i4 != 1) {
                    i3 = 3;
                } else {
                    i2 = 2;
                    ((ayfg) this.bK.b()).x(this.b.fe(), conversationId, messageIdType2, bcylVar, Optional.of(this.al), z, i2);
                }
            }
            i2 = i3;
            ((ayfg) this.bK.b()).x(this.b.fe(), conversationId, messageIdType2, bcylVar, Optional.of(this.al), z, i2);
        } else if (((Optional) this.ck.b()).isPresent()) {
            this.aM.e(conversationId, bcylVar, selectedConversation.h);
        } else {
            this.aM.f(conversationId, messageIdType2, bcylVar, selectedConversation.h);
        }
        ((altk) this.bF.b()).s(conversationIdType, eoko.CONVERSATION_FROM_LIST, i);
        Optional optional = (Optional) this.cp.b();
        if (optional.isPresent() && ((aolr) ((ajcb) this.cq.b()).a.b()).u(selectedConversation.k, selectedConversation.p).A()) {
            ajgd ajgdVar = (ajgd) optional.get();
            eqbx eqbxVar = (eqbx) eqbz.a.createBuilder();
            eqbxVar.getClass();
            eqvn.b(2, eqbxVar);
            ajgdVar.a(eqvn.a(eqbxVar));
        }
    }

    @Override // defpackage.czyy
    public final void r(Iterable iterable, boolean z) {
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            engrVar.h(((SelectedConversation) it.next()).a);
        }
        u(engrVar.g(), z, eoko.CONVERSATION_FROM_LIST);
    }

    public final void t() {
        View findViewById;
        if (!this.aK.b()) {
            adzz adzzVar = this.b;
            if (adzzVar.G() != null) {
                adzzVar.fe().invalidateOptionsMenu();
                return;
            }
            return;
        }
        H(null);
        Toolbar toolbar = this.bD.d;
        if (!adhu.a() || toolbar == null || (findViewById = f(this.b).findViewById(com.google.android.apps.messaging.R.id.gk_tooltip_hack)) == null) {
            return;
        }
        toolbar.getLocationOnScreen(new int[2]);
        float[] fArr = {r3[0] + (toolbar.getWidth() * 0.94f), r3[1] + ((toolbar.getHeight() * 3) / 5)};
        findViewById.setX(fArr[0]);
        findViewById.setY(fArr[1]);
    }

    public final void u(engw engwVar, boolean z, eoko eokoVar) {
        if (this.b.I().ai()) {
            return;
        }
        if (((aube) this.bv.b()).a()) {
            ensk h = a.h();
            h.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "setConversationsArchiveStatus", 2725, "HomeFragmentPeer.java")).J("Set conversation archive status started by user, conversationIds: %s, isToArchive: %s, origin: %s", engwVar, Boolean.valueOf(z), eokoVar);
        } else {
            csjb c = aeaa.a.c();
            c.I("Set conversation archive status started by user");
            c.A("ConversationIds", engwVar);
            c.B("IsToArchive", z);
            c.A("Origin", eokoVar);
            c.r();
        }
        ejlp ejlpVar = new ejlp(this.C.a(engwVar, z ? byyt.ARCHIVED : byyt.UNARCHIVED, eokoVar, this.al));
        ejlq ejlqVar = this.B;
        aent createBuilder = aenu.a.createBuilder();
        createBuilder.copyOnWrite();
        aenu aenuVar = (aenu) createBuilder.instance;
        aenuVar.b |= 1;
        aenuVar.c = z;
        createBuilder.copyOnWrite();
        aenu aenuVar2 = (aenu) createBuilder.instance;
        aenuVar2.d = eokoVar.u;
        aenuVar2.b |= 2;
        ejlqVar.i(ejlpVar, ejlm.a(createBuilder.build()), this.az);
    }

    public final void v() {
        Button button;
        boolean G = this.j.G();
        if (((aube) this.bv.b()).a()) {
            ensk h = a.h();
            h.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "setDefaultSmsValueAndUpdateUI", 3488, "HomeFragmentPeer.java")).t("isDefaultSmsApp: %s", Boolean.valueOf(G));
        } else {
            csjb c = aeaa.a.c();
            c.B("isDefaultSmsApp", G);
            c.r();
        }
        if (G) {
            if (c(this.b) != null) {
                c(this.b).setVisibility(8);
            }
            b(this.b).setVisibility(0);
            return;
        }
        if (c(this.b) == null) {
            ((ViewStub) f(this.b).findViewById(com.google.android.apps.messaging.R.id.conversation_list_not_default_sms_app_stub)).inflate();
            button = (Button) c(this.b).findViewById(com.google.android.apps.messaging.R.id.set_as_default_button);
            g(this.b).g(c(this.b).getContext().getString(com.google.android.apps.messaging.R.string.default_chat_app_gm3_json));
            g(this.b).d();
            if (ddzb.o(this.b.A())) {
                g(this.b).setVisibility(8);
            }
        } else if (c(this.b).getVisibility() == 0) {
            return;
        } else {
            button = (Button) c(this.b).findViewById(com.google.android.apps.messaging.R.id.set_as_default_button);
        }
        b(this.b).setVisibility(8);
        c(this.b).setVisibility(0);
        button.setOnClickListener(((cxqk) this.bG.b()).a(new View.OnClickListener() { // from class: aeap
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aedh aedhVar = aedh.this;
                if (((aube) aedhVar.bv.b()).a()) {
                    ensk h2 = aedh.a.h();
                    h2.Y(ente.a, "HomeFragmentFlogger");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "setDefaultSmsValueAndUpdateUI", 3520, "HomeFragmentPeer.java")).q("Set default sms button clicked");
                } else {
                    aeaa.a.p("Set default sms button clicked");
                }
                aedhVar.b.startActivityForResult(((akvg) aedhVar.G.b()).l(aedhVar.b.fe()), 1);
            }
        }));
        AppBarLayout appBarLayout = this.bD.c;
        if (!C() || appBarLayout == null) {
            return;
        }
        appBarLayout.m(false);
    }

    final void x() {
        if (this.aK.b() && F() && this.b.aI()) {
            ((bcrh) this.aU.a()).d(true);
        }
    }

    public final void y(LayoutInflater layoutInflater, boolean z) {
        this.aQ = new egzo() { // from class: aeam
            @Override // defpackage.egzj
            public final void hj(AppBarLayout appBarLayout, int i) {
                aedh.this.j().p(Boolean.valueOf(i == 0));
            }
        };
        j().w();
        ViewGroup f = f(this.b);
        egzo egzoVar = this.aQ;
        boolean booleanValue = j().f().booleanValue();
        layoutInflater.getClass();
        f.getClass();
        aepb aepbVar = this.bD;
        adzz adzzVar = this.b;
        aepbVar.c = (AppBarLayout) crly.c(AppBarLayout.class, layoutInflater, f, com.google.android.apps.messaging.R.id.searchbar_stub, z ? ((akml) ((Optional) aepbVar.a.b()).get()).a : com.google.android.apps.messaging.R.layout.top_app_bar, -1);
        AppBarLayout appBarLayout = aepbVar.c;
        if (appBarLayout != null) {
            appBarLayout.j(egzoVar);
            if (z) {
                appBarLayout.j(new akmk(appBarLayout.findViewById(com.google.android.apps.messaging.R.id.lockup), appBarLayout.findViewById(com.google.android.apps.messaging.R.id.big_lockup)));
            }
        }
        AppBarLayout appBarLayout2 = aepbVar.c;
        Toolbar toolbar = appBarLayout2 != null ? (Toolbar) appBarLayout2.findViewById(com.google.android.apps.messaging.R.id.toolbar) : null;
        toolbar.getClass();
        aepbVar.d = toolbar;
        AppBarLayout appBarLayout3 = aepbVar.c;
        if (appBarLayout3 != null) {
            appBarLayout3.n(booleanValue, false);
        }
        Toolbar toolbar2 = aepbVar.d;
        if (toolbar2 != null) {
            toolbar2.requestApplyInsets();
        }
        if (!z) {
            AppBarLayout appBarLayout4 = aepbVar.c;
            if (appBarLayout4 != null) {
                Context context = f.getContext();
                context.getClass();
                appBarLayout4.setBackground(new ColorDrawable(cwoj.b(context)));
            }
            AppBarLayout appBarLayout5 = aepbVar.c;
            if (appBarLayout5 != null) {
                appBarLayout5.e = false;
            }
            Toolbar toolbar3 = aepbVar.d;
            TextView textView = toolbar3 != null ? (TextView) toolbar3.findViewById(com.google.android.apps.messaging.R.id.messages_title) : null;
            ekzz f2 = eleg.f("HomeToolbarPresenterimpl#loadProductSansFont");
            if (textView != null) {
                try {
                    textView.setTypeface(aepbVar.a(adzzVar));
                } finally {
                }
            }
            ffig.a(f2, null);
        }
        RecyclerView recyclerView = (RecyclerView) f.findViewById(R.id.list);
        recyclerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: aeoz
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                view.getClass();
                windowInsets.getClass();
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            }
        });
        recyclerView.requestApplyInsets();
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.getClass();
        ((kkw) layoutParams).b(new AppBarLayout.ScrollingViewBehavior());
    }

    public final void z() {
        MenuItem menuItem = this.cl;
        if (menuItem != null) {
            menuItem.setTitle(com.google.android.apps.messaging.R.string.blocked_destination_list_title);
            this.cl.setVisible(((crqw) this.bQ.b()).c());
        }
    }

    @Override // defpackage.bcrg
    public final /* synthetic */ void s(bcrh bcrhVar, Cursor cursor) {
    }
}
