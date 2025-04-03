package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.messagelist.MessageListRecyclerView;
import com.google.android.apps.messaging.conversation.scrolltobottombutton.ConversationScrollToBottomButton;
import com.google.android.apps.messaging.main.MainActivity;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.shared.util.LegacyGroupProtocolSwitchAction;
import com.google.android.apps.messaging.ui.common.BugleSearchView;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.Compose2oRootView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.vvn;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvn extends vxj implements wpj, cxra, cxrb, cylx, uuw, czfn, czgy, bcvm, ckgc, ugl, uaw {
    public WindowInsets A;
    public decz B;
    public dbxp C;
    public cnjr E;
    public cnjr F;
    public final ffbr G;
    public final Optional H;
    public String I;
    public final ConversationIdType M;
    public final ea N;
    public final wpk O;
    public final crnx P;
    public final twr Q;
    public final wdd R;
    public final tyk S;
    public final cwjx T;
    public final akzt U;
    public final albq V;
    public final ffbr W;
    public final csuk X;
    public final fazb Y;
    public final ffbr Z;
    public final ddxs aA;
    public final cuyd aB;
    public final cztl aC;
    public final dede aD;
    public final boolean aE;
    public final ddzb aG;
    public final ffbr aH;
    public final ddyc aI;
    public final Optional aJ;
    public final dbzl aK;
    public final ejlq aL;
    public final coly aM;
    public final ctud aN;
    public final Optional aO;
    public final adtn aP;
    public final ellq aQ;
    public final ffbr aR;
    public final aljt aS;
    public final elbx aT;
    public final elhn aU;
    public final bcwz aV;
    public final Optional aW;
    public final Optional aX;
    public final Set aY;
    public final uea aZ;
    public final bcvs aa;
    public final cskx ab;
    public final czgk ac;
    public final ffbr ad;
    public final ffbr ae;
    public final azze af;
    public final ddzq ag;
    public final adsd ah;
    public final ctml ai;
    public final cqoh aj;
    public final bduy ak;
    public final fazb al;
    public final csjk am;
    public final ffbr an;
    public final axul ao;
    public final ffbr ap;
    public final ctvb aq;
    public final cuxh ar;
    public final cuxz as;
    public final csll at;
    public final cpbs au;
    public final csmj av;
    public final ejwl aw;
    public final ffbr ax;
    public final dfpi ay;
    public final cstx az;
    public final wpg bA;
    public final ffbr bB;
    public final ffbr bC;
    public final ffbr bD;
    public final ffbr bE;
    public final ffbr bF;
    public final ffbr bG;
    public final ffbr bH;
    public final ffbr bI;
    public final ffbr bJ;
    public final ffbr bK;
    public final ffbr bL;
    public final ffbr bM;
    public final Optional bN;
    public final Optional bO;
    public final Optional bP;
    public final Optional bQ;
    public final Optional bR;
    public final Optional bS;
    public final Optional bT;
    public final ffbr bU;
    public final ffbr bV;
    public final ffbr bW;
    public final ffbr bX;
    public final Optional bY;
    public final ffbr bZ;
    public final bdud ba;
    public final tam bb;
    public final cxzh bc;
    public final ffbr bd;
    public final fazb be;
    public final fazb bf;
    public final ffbr bg;
    public final cvmd bh;
    public final ffbr bi;
    public final Optional bj;
    public final Optional bk;
    public final Optional bl;
    public final Optional bm;
    public final Optional bn;
    public final Optional bo;
    public final Optional bp;
    public final aolr bq;
    public final ffbr br;
    public final wgd bs;
    public final wgc bt;
    public final uoy bu;
    public final uox bv;
    public final ffbr bw;
    public final aepz bx;
    public final adgn by;
    public final ffbr bz;
    public boolean c;
    public final bcpt cA;
    public int cB;
    public vjt cC;
    public ViewGroup cD;
    public ContactIconView cE;
    public TextView cF;
    public TextView cG;
    public boolean cH;
    public boolean cI;
    public boolean cJ;
    public boolean cK;
    public boolean cL;

    @Deprecated
    public bcpw cM;
    public long cN;
    public long cO;
    public boolean cP;
    public TextView cQ;
    public View cR;
    public Compose2oRootView cS;
    public ConversationScrollToBottomButton cT;
    public int cU;
    public int cV;
    public int cW;
    public ViewTreeObserver.OnGlobalLayoutListener cX;
    public boolean cY;
    public boolean cZ;
    public final ffbr ca;
    public final ffbr cb;
    public final ffbr cc;
    public final eisx cd;
    public tzd ce;
    public MessageIdType cf;
    public udz cg;
    public Snackbar cj;
    public wdc ck;
    public final crlv cl;
    public final ffbr cm;
    public Toast cn;
    public long co;
    public String cp;
    public boolean cq;
    public View cr;
    public View cs;
    public czgj ct;
    public vvk cu;

    @Deprecated
    public ComposeMessageView cv;
    public cymk cw;
    public uuy cx;
    public MessageCoreData cy;
    public engw cz;
    public iv d;
    private Snackbar dB;
    private crly dC;
    private int dD;
    private BroadcastReceiver dE;
    private boolean dF;
    private boolean dG;
    private final crmk dH;
    private final vzx dI;
    public View.OnLayoutChangeListener da;
    public final axop db;
    public final bbab dc;
    public vlk dd;
    private final ffbr dg;
    private final Activity dj;
    private final cvff dk;
    private final Optional dl;
    private final alcz dm;
    private final fazb dn;

    /* renamed from: do, reason: not valid java name */
    private final ddou f18do;
    private final cpbw dp;
    private final cuye dq;
    private final fazb dr;
    private final bcvw ds;
    private final Map dt;
    private final bbfd du;
    private final ffbr dv;
    private final uaj dw;
    private final ffbr dx;
    private final ffbr dy;
    private final ffbr dz;
    public adg e;
    public ejlr f;
    public ejlr g;
    public Optional h;
    public ejlr i;
    public ejlr j;
    public ejlr k;
    public ejlr l;
    public ejlr m;
    public ajsb n;
    public tzj o;
    public MenuItem p;
    public MenuItem q;
    public MenuItem r;
    public MenuItem s;
    public MenuItem t;
    public final uot y;
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer");
    private static final entd df = entd.c("BugleBanners");
    public static final cfva b = cfvl.i(cfvl.b, "use_conv_recipients_model", false);
    public boolean u = false;
    private boolean dh = false;
    private boolean di = false;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public int z = -1;
    public int D = 0;
    public final AtomicReference J = new AtomicReference(bdgq.a);
    public final AtomicReference K = new AtomicReference();
    public final AtomicReference L = new AtomicReference();
    public boolean aF = false;
    public boolean ch = true;
    private boolean dA = true;
    public boolean ci = false;

    /* compiled from: PG */
    abstract class e implements ellf {
    }

    public vvn(ea eaVar, Activity activity, wpk wpkVar, crnx crnxVar, cuyd cuydVar, ctvb ctvbVar, fazb fazbVar, cqoh cqohVar, twr twrVar, wdd wddVar, tyk tykVar, cwjx cwjxVar, czgk czgkVar, Optional optional, akzt akztVar, fazb fazbVar2, ddxs ddxsVar, bcvs bcvsVar, cstx cstxVar, csuk csukVar, dfpi dfpiVar, adsd adsdVar, ffbr ffbrVar, csmj csmjVar, alcz alczVar, cpbs cpbsVar, cpbw cpbwVar, ctml ctmlVar, ffbr ffbrVar2, azze azzeVar, ffbr ffbrVar3, cskx cskxVar, csjk csjkVar, cuxh cuxhVar, bduy bduyVar, csll csllVar, ejwl ejwlVar, albq albqVar, ffbr ffbrVar4, ffbr ffbrVar5, axul axulVar, cuxz cuxzVar, ffbr ffbrVar6, bbab bbabVar, ffbr ffbrVar7, ddzq ddzqVar, cuye cuyeVar, fazb fazbVar3, cvff cvffVar, cztl cztlVar, ddou ddouVar, uot uotVar, fazb fazbVar4, dede dedeVar, cssv cssvVar, crmk crmkVar, bcvw bcvwVar, ddzb ddzbVar, ddyc ddycVar, Optional optional2, dbzl dbzlVar, ejlq ejlqVar, coly colyVar, ctud ctudVar, Map map, Optional optional3, adtn adtnVar, ellq ellqVar, vzx vzxVar, ffbr ffbrVar8, bbfd bbfdVar, aljt aljtVar, elbx elbxVar, elhn elhnVar, bcwz bcwzVar, Optional optional4, Optional optional5, Set set, uea ueaVar, tam tamVar, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12, cxzh cxzhVar, ffbr ffbrVar9, aolr aolrVar, ffbr ffbrVar10, ffbr ffbrVar11, fazb fazbVar5, fazb fazbVar6, ffbr ffbrVar12, cvmd cvmdVar, wgd wgdVar, wgc wgcVar, ffbr ffbrVar13, uoy uoyVar, uox uoxVar, ffbr ffbrVar14, uaj uajVar, aepz aepzVar, adgn adgnVar, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, vjr vjrVar, eisx eisxVar, ffbr ffbrVar18, wpg wpgVar, Optional optional13, axop axopVar, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, ffbr ffbrVar30, ffbr ffbrVar31, Optional optional14, Optional optional15, Optional optional16, Optional optional17, Optional optional18, Optional optional19, Optional optional20, ffbr ffbrVar32, ffbr ffbrVar33, ffbr ffbrVar34, Optional optional21, ffbr ffbrVar35, ffbr ffbrVar36, ffbr ffbrVar37, ffbr ffbrVar38, ffbr ffbrVar39, ffbr ffbrVar40, ffbr ffbrVar41, ffbr ffbrVar42) {
        final cfva cfvaVar = b;
        cfvaVar.getClass();
        this.cl = new crlv("use_conv_recipients_model", new ffix() { // from class: vmk
            @Override // defpackage.ffix
            public final Object invoke() {
                return (Boolean) cfva.this.e();
            }
        });
        this.co = 0L;
        this.dD = 0;
        this.cA = new bcpt();
        this.cN = 0L;
        this.cO = 0L;
        this.cT = null;
        this.ad = ffbrVar6;
        this.dg = ffbrVar13;
        this.bH = ffbrVar30;
        this.bN = optional14;
        this.bO = optional15;
        this.bP = optional16;
        this.bQ = optional17;
        this.bR = optional18;
        this.bS = optional19;
        this.bT = optional20;
        this.bU = ffbrVar32;
        this.dz = ffbrVar36;
        this.bV = ffbrVar33;
        this.bW = ffbrVar34;
        this.M = bdgq.b(vjrVar.b);
        this.N = eaVar;
        this.dj = activity;
        this.O = wpkVar;
        this.P = crnxVar;
        this.Q = twrVar;
        this.R = wddVar;
        this.S = tykVar;
        this.T = cwjxVar;
        this.aB = cuydVar;
        this.aq = ctvbVar;
        this.dn = fazbVar;
        this.aj = cqohVar;
        this.ac = czgkVar;
        this.dl = optional;
        this.U = akztVar;
        this.al = fazbVar2;
        this.aA = ddxsVar;
        this.aa = bcvsVar;
        this.az = cstxVar;
        this.X = csukVar;
        this.ay = dfpiVar;
        this.ah = adsdVar;
        this.ap = ffbrVar;
        this.av = csmjVar;
        this.dm = alczVar;
        this.au = cpbsVar;
        this.dp = cpbwVar;
        this.ai = ctmlVar;
        this.bi = ffbrVar2;
        this.af = azzeVar;
        this.ax = ffbrVar3;
        this.ab = cskxVar;
        this.am = csjkVar;
        this.ar = cuxhVar;
        this.ak = bduyVar;
        this.at = csllVar;
        this.aw = ejwlVar;
        this.V = albqVar;
        this.W = ffbrVar4;
        this.an = ffbrVar5;
        this.ao = axulVar;
        this.as = cuxzVar;
        this.dc = bbabVar;
        this.ae = ffbrVar7;
        this.ag = ddzqVar;
        this.dq = cuyeVar;
        this.Y = fazbVar3;
        this.Z = ffbrVar17;
        this.dk = cvffVar;
        this.aC = cztlVar;
        this.f18do = ddouVar;
        this.y = uotVar;
        this.dr = fazbVar4;
        this.aD = dedeVar;
        this.aE = cssvVar.a();
        this.dH = crmkVar;
        this.ds = bcvwVar;
        this.aG = ddzbVar;
        this.aI = ddycVar;
        this.aJ = optional2;
        this.aK = dbzlVar;
        this.aL = ejlqVar;
        this.aM = colyVar;
        this.aV = bcwzVar;
        this.aN = ctudVar;
        this.bY = optional21;
        this.dt = map;
        this.aO = optional3;
        this.aP = adtnVar;
        this.aQ = ellqVar;
        this.dI = vzxVar;
        this.aR = ffbrVar8;
        this.du = bbfdVar;
        this.aS = aljtVar;
        this.aT = elbxVar;
        this.aU = elhnVar;
        this.aW = optional4;
        this.aX = optional5;
        this.aY = set;
        this.aZ = ueaVar;
        this.bb = tamVar;
        this.bc = cxzhVar;
        this.dv = ffbrVar9;
        this.bd = ffbrVar10;
        this.be = fazbVar5;
        this.bf = fazbVar6;
        this.bg = ffbrVar12;
        this.bh = cvmdVar;
        this.ba = new bdud();
        this.bj = optional6;
        this.bk = optional7;
        this.bl = optional8;
        this.bm = optional9;
        this.bn = optional10;
        this.bo = optional11;
        this.bp = optional12;
        this.bq = aolrVar;
        this.br = ffbrVar11;
        this.bs = wgdVar;
        this.bt = wgcVar;
        this.bu = uoyVar;
        this.bv = uoxVar;
        this.bw = ffbrVar14;
        this.dw = uajVar;
        this.bx = aepzVar;
        this.by = adgnVar;
        this.cd = eisxVar;
        this.bz = ffbrVar15;
        this.dx = ffbrVar16;
        this.G = ffbrVar18;
        this.bA = wpgVar;
        this.H = optional13;
        this.db = axopVar;
        this.bB = ffbrVar19;
        this.bF = ffbrVar20;
        this.bC = ffbrVar21;
        this.bD = ffbrVar22;
        this.bE = ffbrVar23;
        this.bG = ffbrVar24;
        this.bI = ffbrVar25;
        this.bJ = ffbrVar26;
        this.bK = ffbrVar27;
        this.dy = ffbrVar28;
        this.bL = ffbrVar29;
        this.bM = ffbrVar31;
        this.bX = ffbrVar35;
        this.bZ = ffbrVar37;
        this.ca = ffbrVar38;
        this.cb = ffbrVar39;
        this.cc = ffbrVar40;
        this.cm = ffbrVar41;
        this.aH = ffbrVar42;
        if (!(eaVar instanceof vjs)) {
            throw new AssertionError("The fragment should be ConversationFragment but is\n".concat(String.valueOf(eaVar.getClass().getName())));
        }
    }

    public static void bt(ffbr ffbrVar, Uri uri, boolean z, ConversationIdType conversationIdType, Activity activity) {
        if (z) {
            ((akvg) ffbrVar.b()).X(activity, uri, bcqc.f(activity, conversationIdType));
        } else {
            ((akvg) ffbrVar.b()).V(activity, uri, bcqc.a(activity, conversationIdType));
        }
    }

    public static void bu(ffbr ffbrVar, Uri uri, boolean z, ConversationIdType conversationIdType, ea eaVar) {
        if (z) {
            ((akvg) ffbrVar.b()).Y(eaVar, uri, bcqc.f(eaVar.A(), conversationIdType));
        } else {
            ((akvg) ffbrVar.b()).W(eaVar, uri, bcqc.a(eaVar.A(), conversationIdType));
        }
    }

    private final void bv() {
        T(new Consumer() { // from class: vqp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ugg uggVar = (ugg) obj;
                enru enruVar = vvn.a;
                if (uggVar.c() == ugo.IME) {
                    uggVar.h(true);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vra
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final vvn vvnVar = vvn.this;
                vvnVar.U(new Consumer() { // from class: vkj
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        uav uavVar = (uav) obj2;
                        if (uavVar != null) {
                            dede.b(vvn.this.p(), uavVar.e());
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: vkk
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        ComposeMessageView composeMessageView = (ComposeMessageView) obj2;
                        if (composeMessageView != null) {
                            dede.b(vvn.this.p(), composeMessageView);
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
    }

    private final void bw() {
        S(new Consumer() { // from class: vmu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
                ((uav) obj).e().setVisibility(0);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vmv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
                ((ComposeMessageView) obj).setVisibility(0);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.cQ.setVisibility(8);
        this.cx.y(0);
        Snackbar snackbar = this.dB;
        if (snackbar != null) {
            snackbar.e();
        }
    }

    private final boolean bx() {
        bcqs bcqsVar = (bcqs) this.cA.a();
        if (!bcqsVar.f) {
            return false;
        }
        ArrayList f2 = bcqsVar.g.f();
        int size = f2.size();
        int i = 0;
        while (i < size) {
            boolean q = bdqu.q((ParticipantsTable.BindData) f2.get(i));
            i++;
            if (q) {
                this.aG.h(R.string.unknown_sender);
                return false;
            }
        }
        return true;
    }

    private final boolean by() {
        return ((Boolean) cful.ap.e()).booleanValue() && this.dl.isPresent();
    }

    private final void bz(String str, MessagePartCoreData messagePartCoreData) {
        if (TextUtils.isEmpty(str) && messagePartCoreData == null) {
            return;
        }
        bcvr F = F();
        F.S(str);
        F.P("text/plain");
        if (messagePartCoreData == null) {
            au(F);
            return;
        }
        F.D(new vuj(this));
        bcpt bcptVar = new bcpt();
        bcptVar.c(F);
        F.U(new enpx(messagePartCoreData), bcptVar.b());
    }

    public static uav x(ea eaVar) {
        if (eaVar instanceof uau) {
            return ((uau) eaVar).H();
        }
        throw new AssertionError("The fragment should be DraftEditorFragment but is ".concat(String.valueOf(eaVar.getClass().getName())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vvn z(ea eaVar) {
        if (eaVar instanceof ekhu) {
            Object H = ((ekhu) eaVar).H();
            if (H instanceof vvn) {
                return (vvn) H;
            }
        }
        throw new AssertionError("Conversation fragment is not a ConversationFragmentPeer");
    }

    public final vvn A() {
        ea eaVar = this.N;
        if (eaVar instanceof vjs) {
            return ((vjs) eaVar).H();
        }
        throw new AssertionError("The fragment should be ConversationFragment but is\n".concat(String.valueOf(eaVar.getClass().getName())));
    }

    @Override // defpackage.cylx
    public final wdm B() {
        return C(true);
    }

    public final wdm C(boolean z) {
        fr I = this.N.I();
        wdu wduVar = (wdu) I.g(R.id.sim_picker_fragment);
        if (wduVar == null && this.cK && z) {
            String a2 = this.M.a();
            wduVar = new wdu();
            fbae.e(wduVar);
            ekku.b(wduVar, a2);
            cg cgVar = new cg(I);
            cgVar.E(R.id.sim_picker_fragment, wduVar);
            cgVar.c();
        }
        if (wduVar != null) {
            return wduVar.H();
        }
        return null;
    }

    public final wgl D(SuggestionData suggestionData) {
        if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
            return (wgl) this.dt.get(((SmartSuggestionItemSuggestionData) suggestionData).l());
        }
        return null;
    }

    @Override // defpackage.czgy
    public final bcpw E() {
        return this.cM;
    }

    public final bcvr F() {
        bcqs bcqsVar = (bcqs) this.cA.a();
        bcvr a2 = this.aa.a(bcqsVar.e, bcqsVar.q());
        a2.g = A();
        a2.i = bcqsVar.d.y();
        a2.T(i(), a());
        return a2;
    }

    public final MessageCoreData G() {
        bcpw bcpwVar = this.cM;
        if (bcpwVar == null) {
            return null;
        }
        return ((bcvr) bcpwVar.a()).u(false);
    }

    @Override // defpackage.czgy
    public final cpbn H() {
        return this.au.a(a());
    }

    public final Object I(Function function, Function function2) {
        Object apply;
        Object apply2;
        if (!ba()) {
            apply = function2.apply(this.cv);
            return apply;
        }
        uav w = w();
        w.getClass();
        apply2 = function.apply(w);
        return apply2;
    }

    @Override // defpackage.cylx
    public final Object J(Function function, Function function2) {
        Object apply;
        Object apply2;
        ugg y = y();
        if (y != null) {
            apply2 = function.apply(y);
            return apply2;
        }
        apply = function2.apply(this.ct);
        return apply;
    }

    public final String K() {
        return ((bcqs) this.cA.a()).l();
    }

    public final String L() {
        if (((bcqs) this.cA.a()).m) {
            return ((bcqs) this.cA.a()).l();
        }
        return null;
    }

    public final void M(ejuh ejuhVar, ejwd ejwdVar) {
        this.aw.b(ejuhVar, ejwdVar);
    }

    public final void N() {
        S(new Consumer() { // from class: vsw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                View view = ((uav) obj).b().Q;
                view.getClass();
                vvn.this.aP(view.getHeight());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vsx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                vvn.this.aP(((ComposeMessageView) obj).getHeight());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void O() {
        Toast toast = this.cn;
        if (toast != null) {
            toast.cancel();
        }
    }

    public final void P() {
        BugleSearchView bugleSearchView;
        MenuItem menuItem = this.p;
        if (menuItem == null || (bugleSearchView = (BugleSearchView) menuItem.getActionView()) == null) {
            return;
        }
        bugleSearchView.setOnQueryTextListener(null);
    }

    public final void Q() {
        this.at.i();
        this.cC.d();
    }

    @Override // defpackage.cylx
    public final void R() {
        bv();
        int a2 = a();
        czfo czfoVar = new czfo();
        Bundle bundle = new Bundle();
        bundle.putInt("subId", a2);
        czfoVar.at(bundle);
        czfoVar.aP(this.N);
        czfoVar.t(this.N.J(), null);
    }

    public final void S(Consumer consumer, Consumer consumer2) {
        if (!ba()) {
            consumer2.o(this.cv);
        } else if (consumer != null) {
            uav w = w();
            w.getClass();
            consumer.o(w);
        }
    }

    @Override // defpackage.cylx
    public final void T(Consumer consumer, Consumer consumer2) {
        ugg y = y();
        if (y != null) {
            if (consumer != null) {
                consumer.o(y);
            }
        } else if (consumer2 != null) {
            consumer2.o(this.ct);
        }
    }

    public final void U(Consumer consumer, Consumer consumer2) {
        if (ba()) {
            consumer.o(w());
        } else {
            consumer2.o(this.cv);
        }
    }

    public final void V(final akqx akqxVar) {
        this.bj.ifPresent(new Consumer() { // from class: vqc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                akqx akqxVar2 = akqxVar;
                ejlp ejlpVar = new ejlp(((coja) obj).e(akqxVar2.b));
                vvn vvnVar = vvn.this;
                vvnVar.aL.i(ejlpVar, ejlm.a(akqxVar2), vvnVar.l);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void W(int i) {
        fr I = this.N.I();
        czoj czojVar = (czoj) I.h("RbmUnavailableBottomSheetFragment");
        if (czojVar == null || !czojVar.aK()) {
            String valueOf = String.valueOf(i);
            valueOf.getClass();
            czoj czojVar2 = new czoj();
            fbae.e(czojVar2);
            ekku.b(czojVar2, valueOf);
            czojVar2.p(false);
            czojVar2.s(I, "RbmUnavailableBottomSheetFragment");
        }
    }

    public final void X(final boolean z) {
        T(new Consumer() { // from class: vkd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
                ((ugg) obj).h(z);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vke
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final boolean z2 = z;
                vvn.this.S(null, new Consumer() { // from class: vnz
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        enru enruVar = vvn.a;
                        ((ComposeMessageView) obj2).H().z(z2);
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
    }

    public final void Y() {
        T(new Consumer() { // from class: vlu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((ugg) obj).h(false);
                vvn.this.S(new Consumer() { // from class: vql
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        enru enruVar = vvn.a;
                        ((uav) obj2).e().setVisibility(8);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: vqm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        enru enruVar = vvn.a;
                        ((ComposeMessageView) obj2).setVisibility(8);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vlv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                vvn.this.S(null, new Consumer() { // from class: vls
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        ComposeMessageView composeMessageView = (ComposeMessageView) obj2;
                        enru enruVar = vvn.a;
                        composeMessageView.H().z(false);
                        composeMessageView.setVisibility(8);
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
    }

    @Override // defpackage.czgy
    public final void Z() {
        this.cC.c();
    }

    @Override // defpackage.bcvn
    public final int a() {
        return ((bcqs) this.cA.a()).b(i());
    }

    public final void aA() {
        ahqt ahqtVar = (ahqt) this.cC;
        ahqtVar.v.isPresent();
        if (ahqtVar.E || !ahqtVar.b.hasWindowFocus()) {
            return;
        }
        ensk h2 = a.h();
        h2.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) h2;
        enrrVar.Y(csux.p, this.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "setConversationFocus", 3763, "ConversationFragmentPeer.java")).q("ConversationFragment: marking conversation as seen because setConversationFocus.");
        ((carb) this.aR.b()).e(this.M);
        this.du.e(this.M);
    }

    @Override // defpackage.cylx
    public final void aB(boolean z) {
        boolean z2 = false;
        if (this.dh && !z) {
            z2 = true;
        }
        this.dh = z;
        if (z2) {
            if (this.cA.g()) {
                S(new Consumer() { // from class: vtd
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        View view = ((uav) obj).b().Q;
                        view.getClass();
                        vvn.this.aP(view.getHeight());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: vkf
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        vvn.this.aP(((ComposeMessageView) obj).getHeight());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            ensk h2 = a.h();
            h2.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) h2;
            enrrVar.Y(csux.p, this.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "setIsAnimating", 7009, "ConversationFragmentPeer.java")).q("ConversationFragment: Fragment has been destroyed when animation ended");
        }
    }

    public final void aC(final Instant instant) {
        S(new Consumer() { // from class: vmt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
                ((uav) obj).e().H().N(Instant.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vne
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                enru enruVar = vvn.a;
                composeMessageView.getClass();
                composeMessageView.H().N(Instant.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void aD(int i) {
        if (i != 0) {
            i = 1;
        }
        this.dD = i;
    }

    public final void aE(final boolean z) {
        T(new Consumer() { // from class: vkm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
                ((ugg) obj).r(ugo.CAMERA_GALLERY, true, z);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vkn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                czgj czgjVar = (czgj) obj;
                enru enruVar = vvn.a;
                if (czgjVar != null) {
                    czgjVar.h.r(true);
                    czgjVar.a();
                    czgjVar.c.b();
                    bcpw bcpwVar = czgjVar.e;
                    epts eptsVar = epts.CAMERA_GALLERY;
                    eptu eptuVar = eptu.COLLAPSED;
                    ((bcvr) bcpwVar.a()).v.size();
                    czgjVar.i.d(eptsVar, eptuVar, epto.UNKNOWN_OPENING_STATE, eptm.CAMERA_GALLERY_BUTTON);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void aF(ParticipantsTable.BindData bindData) {
        if (((Boolean) avjy.b.e()).booleanValue() && ((bcqs) this.cA.a()).o == avji.SHOW && ((bcqs) this.cA.a()).f) {
            bcqs bcqsVar = (bcqs) this.cA.a();
            if (bcqsVar.k == null) {
                ensk h2 = bcqs.a.h();
                h2.Y(ente.a, "BugleDataModel");
                enrr enrrVar = (enrr) h2;
                enrrVar.Y(csux.p, bcqsVar.e);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/data/ConversationData", "shouldShowRbmToolstone", 562, "ConversationData.java")).q("ConversationData: Should not show RBM block and report spam toolstone due to null BusinessInfoData");
                return;
            }
            List a2 = avjy.a();
            BusinessInfoData businessInfoData = bcqsVar.k;
            businessInfoData.getClass();
            if (a2.contains(businessInfoData.getAgentUseCase().name())) {
                ensk h3 = bcqs.a.h();
                h3.Y(ente.a, "BugleDataModel");
                enrr enrrVar2 = (enrr) h3;
                enrrVar2.Y(csux.p, bcqsVar.e);
                enrr enrrVar3 = (enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/data/ConversationData", "shouldShowRbmToolstone", 572, "ConversationData.java");
                BusinessInfoData businessInfoData2 = bcqsVar.k;
                businessInfoData2.getClass();
                enrrVar3.t("ConversationData: Should not show RBM block and report spam toolstone due to AgentUseCase of %s", businessInfoData2.getAgentUseCase().name());
                return;
            }
            if (avjy.b().contains(bindData.W())) {
                ensk h4 = a.h();
                h4.Y(ente.a, "Bugle");
                enrr enrrVar4 = (enrr) h4;
                enrrVar4.Y(csux.p, this.M);
                ((enrr) enrrVar4.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "showRbmBlockAndReportToolstone", 5314, "ConversationFragmentPeer.java")).q("ConversationFragment: Not showing RBM block and report spam toolstone as the sender is allowlisted.");
                return;
            }
            this.dC = new crly(this.cr, R.id.draft_toolstone_stub, R.id.draft_toolstone);
            czxf czxfVar = (czxf) this.bD.b();
            crly crlyVar = this.dC;
            ConversationIdType conversationIdType = this.M;
            ffix ffixVar = new ffix() { // from class: vso
                @Override // defpackage.ffix
                public final Object invoke() {
                    vvn.this.N();
                    return ffcu.a;
                }
            };
            crlyVar.getClass();
            if (((Boolean) avjy.b.e()).booleanValue()) {
                avjf avjfVar = (avjf) czxfVar.d.b();
                eqex eqexVar = (eqex) eqey.a.createBuilder();
                eqexVar.copyOnWrite();
                eqey eqeyVar = (eqey) eqexVar.instance;
                eqeyVar.c = 3;
                eqeyVar.b |= 1;
                avjfVar.i((eqey) eqexVar.build());
                crlyVar.f(R.layout.draft_toolstone);
                ((ComposeView) crlyVar.b().findViewById(R.id.draft_toolstone_compose_view)).a(new hpw(-59981352, true, new czxe(czxfVar, ffixVar, conversationIdType, bindData)));
            }
            if (this.dC.h()) {
                this.dC.b().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: vsp
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        vvn.this.N();
                    }
                });
            }
        }
    }

    final void aG() {
        if (this.aN.q()) {
            this.bk.ifPresent(new vtb());
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                emxf.l(false);
                return;
            }
            final adg adgVar = this.e;
            adgVar.getClass();
            new AlertDialog.Builder(p()).setMessage(R.string.request_exact_alarm_permission).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: vqj
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    adgVar.c(akuv.d("android.settings.REQUEST_SCHEDULE_EXACT_ALARM").a().setData(Uri.parse("package:".concat(String.valueOf(vvn.this.p().getPackageName())))));
                }
            }).create().show();
        }
    }

    public final void aH(String str, String str2, final Runnable runnable, boolean z) {
        eg G = this.N.G();
        G.getClass();
        if (crnx.j(G)) {
            if (z) {
                runnable.run();
            }
        } else {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: vkq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    enru enruVar = vvn.a;
                    runnable.run();
                }
            };
            Snackbar r = Snackbar.r(this.cr, str, 0);
            r.o();
            r.t(str2, onClickListener);
            r.i();
        }
    }

    public final void aI() {
        boolean z = false;
        if (this.aG.n() && this.aD.b) {
            z = true;
        }
        this.bc.a(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r1 != 2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void aJ(com.google.android.ims.rcsservice.businessinfo.BusinessInfoData r5) {
        /*
            r4 = this;
            bcpt r0 = r4.cA
            bcpr r0 = r0.a()
            bcqs r0 = (defpackage.bcqs) r0
            r0.k = r5
            bcpt r0 = r4.cA
            bcpr r0 = r0.a()
            bcqs r0 = (defpackage.bcqs) r0
            bctw r0 = r0.g
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r0 = r0.a()
            if (r0 == 0) goto L2b
            bcpt r1 = r4.cA
            bcpr r1 = r1.a()
            bcqs r1 = (defpackage.bcqs) r1
            boolean r1 = r1.p()
            if (r1 == 0) goto L2b
            r4.aF(r0)
        L2b:
            uuy r1 = r4.cx
            upx r1 = r1.aB
            upq r1 = r1.d
            r1.F(r5, r0)
            r0 = 0
            if (r5 == 0) goto L68
            uuy r1 = r4.cx
            r2 = 1
            r1.z(r2)
            int r1 = r5.getVerificationStatus()
            r3 = 2
            if (r1 == r3) goto L45
            goto L62
        L45:
            int r1 = r5.getVerifiedBotPlatform()
            if (r1 == r2) goto L50
            if (r1 == r3) goto L4e
            goto L62
        L4e:
            r0 = r2
            goto L62
        L50:
            cfup r0 = defpackage.cful.l
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4e
            boolean r0 = r5.containsLocalVerifierInfo()
        L62:
            r4.di = r0
            r4.aQ()
            goto L6d
        L68:
            uuy r5 = r4.cx
            r5.z(r0)
        L6d:
            uuy r5 = r4.cx
            r5.p()
            vjt r5 = r4.cC
            r5.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvn.aJ(com.google.android.ims.rcsservice.businessinfo.BusinessInfoData):void");
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [aoku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [aoku, java.lang.Object] */
    public final void aK() {
        String K = K();
        if (TextUtils.isEmpty(K)) {
            return;
        }
        if (!((bcqs) this.cA.a()).d.A() && !((bcqs) this.cA.a()).d.z()) {
            cuxh cuxhVar = this.ar;
            TextPaint paint = this.cF.getPaint();
            int width = this.cF.getWidth();
            this.N.Y(R.string.and_n_more);
            K = cuxhVar.e(K, paint, width, R.plurals.and_n_more_plural);
        }
        TextView textView = this.cF;
        if (textView != null) {
            textView.setText(this.ar.c(K));
        }
        if (this.cG != null) {
            String str = ((typ) ((bcqs) this.cA.a()).d).i;
            if (str != null) {
                this.cG.setText(this.ar.c(str));
                this.cG.setVisibility(0);
                return;
            }
            ParticipantsTable.BindData a2 = ((bcqs) this.cA.a()).g.a();
            byzi D = a2 == null ? byzi.VERIFICATION_NA : a2.D();
            if (D == byzi.VERIFICATION_IN_PROGRESS) {
                return;
            }
            if (D != byzi.VERIFICATION_VERIFIED || !this.dq.c() || !((bcqs) this.cA.a()).g.d().isPresent() || ((bcqs) this.cA.a()).g.d().get().x()) {
                this.cG.setVisibility(8);
            } else {
                this.cG.setVisibility(0);
                this.cG.setText(this.ar.c(((bcqs) this.cA.a()).g.d().get().G().a));
            }
        }
    }

    public final void aL(final MessageCoreData messageCoreData, final boolean z) {
        ensk e2 = a.e();
        e2.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e2;
        enrrVar.Y(csux.p, this.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "updateDraft", 4633, "ConversationFragmentPeer.java")).q("ConversationFragment: DraftDataService : replace with new incoming data");
        S(new Consumer() { // from class: vko
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
                ((uav) obj).n(MessageCoreData.this, z);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vkp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((bcvr) ((ComposeMessageView) obj).H().s().a()).G();
                udz udzVar = vvn.this.cg;
                udzVar.getClass();
                udzVar.c(messageCoreData, z, false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void aM(final String str) {
        S(new Consumer() { // from class: vlx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                vvn vvnVar = vvn.this;
                uav uavVar = (uav) obj;
                bcvr F = vvnVar.F();
                cnmd cnmdVar = uavVar.d().y;
                if (cnmdVar != null) {
                    F.y = cnmdVar;
                }
                F.S(str);
                F.P("text/plain");
                uavVar.p(F.v(vvnVar.aj.f().toEpochMilli()));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vmi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void aN() {
        if (ctjd.c() && this.cA.g() && this.K.get() != null) {
            final boolean k = ((ctyz) this.dz.b()).k();
            S(new Consumer() { // from class: vsy
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ImageView imageView;
                    ValueAnimator valueAnimator;
                    uav uavVar = (uav) obj;
                    vvn vvnVar = vvn.this;
                    float f2 = vvnVar.N.B().getDisplayMetrics().widthPixels;
                    Context A = vvnVar.N.A();
                    int i = ddzd.a;
                    float round = Math.round(f2 / A.getResources().getDisplayMetrics().density);
                    float f3 = vvnVar.N.B().getConfiguration().fontScale;
                    if (((Optional) vvnVar.bf.b()).isPresent()) {
                        f3 *= ((cync) ((Optional) vvnVar.bf.b()).get()).g();
                    }
                    final boolean z = k;
                    if ((vvnVar.bg() && round / f3 <= ((Float) ctjd.aV.e()).floatValue()) || !z || !((aixr) vvnVar.K.get()).a) {
                        uavVar.e().H().c.v();
                        ensk e2 = vvn.a.e();
                        e2.Y(ente.a, "Bugle");
                        enrr enrrVar = (enrr) e2;
                        enrrVar.Y(csux.p, vvnVar.M);
                        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "updateMagicComposeVisibility", 2498, "ConversationFragmentPeer.java")).q("ConversationFragment: MagicComposeVisibility: false");
                        ((Optional) vvnVar.bV.b()).ifPresent(new Consumer() { // from class: vrd
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                enru enruVar = vvn.a;
                                ((wmu) obj2).j(false);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        if (vvnVar.cZ) {
                            return;
                        }
                        vvnVar.cZ = true;
                        final List list = ((aixr) vvnVar.K.get()).b;
                        ((Optional) vvnVar.bW.b()).ifPresent(new Consumer() { // from class: vre
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                wmf wmfVar = (wmf) obj2;
                                enru enruVar = vvn.a;
                                List list2 = list;
                                wmfVar.f(false, list2.contains(aixs.a), list2.contains(aixs.b), list2.contains(aixs.c), list2.contains(aixs.d), !z, list2.contains(aixs.g));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return;
                    }
                    cxsr cxsrVar = uavVar.e().H().c.g;
                    if (!((Boolean) ctjd.aX.e()).booleanValue()) {
                        cxsrVar.d(true);
                    }
                    if (cxsrVar.e != null) {
                        cxsrVar.k.l(R.id.magic_button, 0);
                        if (cxsrVar.e.getVisibility() == 8) {
                            cxsrVar.e.setVisibility(0);
                        }
                    }
                    ensk e3 = vvn.a.e();
                    e3.Y(ente.a, "Bugle");
                    enrr enrrVar2 = (enrr) e3;
                    enrrVar2.Y(csux.p, vvnVar.M);
                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "updateMagicComposeVisibility", 2480, "ConversationFragmentPeer.java")).q("ConversationFragment: MagicComposeVisibility: true");
                    ((Optional) vvnVar.bV.b()).ifPresent(new Consumer() { // from class: vrb
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            enru enruVar = vvn.a;
                            ((wmu) obj2).j(true);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    if (vvnVar.cY) {
                        return;
                    }
                    vvnVar.cY = true;
                    if (((Boolean) ((cfup) ctjd.aY.get()).e()).booleanValue() && ctjd.c() && ((Boolean) ((cfup) ctjd.aY.get()).e()).booleanValue() && vvnVar.L.get() != null && !((czuk) vvnVar.L.get()).e && ((czuk) vvnVar.L.get()).f < ((Integer) ctjd.ba.e()).intValue()) {
                        cxsr cxsrVar2 = uavVar.e().H().c.g;
                        if (((Boolean) ((cfup) ctjd.aY.get()).e()).booleanValue() && (imageView = cxsrVar2.e) != null && imageView.getVisibility() != 8 && cxsrVar2.e.getVisibility() != 4 && (valueAnimator = cxsrVar2.q) != null) {
                            valueAnimator.start();
                        }
                        woi woiVar = (woi) vvnVar.bU.b();
                        axol.k(woiVar.a, null, new wnz(woiVar, null), 3);
                    }
                    ((Optional) vvnVar.bW.b()).ifPresent(new Consumer() { // from class: vrc
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            enru enruVar = vvn.a;
                            ((wmf) obj2).e();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: vsz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    enru enruVar = vvn.a;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public final void aO(boolean z) {
        if (this.cx == null) {
            return;
        }
        WindowInsets windowInsets = this.A;
        int systemWindowInsetTop = windowInsets == null ? 0 : windowInsets.getSystemWindowInsetTop();
        int dimensionPixelSize = this.cr.getResources().getDimensionPixelSize(R.dimen.message_padding_default);
        final uuy uuyVar = this.cx;
        int i = systemWindowInsetTop + this.cV + this.cW + dimensionPixelSize;
        MessageListRecyclerView messageListRecyclerView = uuyVar.az;
        if (messageListRecyclerView == null || i == messageListRecyclerView.getPaddingTop()) {
            return;
        }
        ValueAnimator valueAnimator = uuyVar.aN;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            uuyVar.aN = ValueAnimator.ofInt(uuyVar.az.getPaddingTop(), i);
            uuyVar.aN.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: usa
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    uuy uuyVar2 = uuy.this;
                    MessageListRecyclerView messageListRecyclerView2 = uuyVar2.az;
                    if (messageListRecyclerView2 == null) {
                        return;
                    }
                    int paddingTop = messageListRecyclerView2.getPaddingTop();
                    uuyVar2.az.setPadding(0, ((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0, uuyVar2.e.B().getDimensionPixelOffset(R.dimen.message_list_padding_bottom));
                    MessageListRecyclerView messageListRecyclerView3 = uuyVar2.az;
                    messageListRecyclerView3.scrollBy(0, paddingTop - messageListRecyclerView3.getPaddingTop());
                }
            });
            uuyVar.aN.setDuration(300L);
            uuyVar.aN.start();
            return;
        }
        int paddingTop = uuyVar.az.getPaddingTop();
        uuyVar.az.setPadding(0, i, 0, uuyVar.e.B().getDimensionPixelOffset(R.dimen.message_list_padding_bottom));
        MessageListRecyclerView messageListRecyclerView2 = uuyVar.az;
        messageListRecyclerView2.scrollBy(0, paddingTop - messageListRecyclerView2.getPaddingTop());
    }

    public final void aP(int i) {
        View a2;
        if (this.cx == null || this.dh) {
            return;
        }
        if (((Boolean) ((cfup) cyml.a.get()).e()).booleanValue()) {
            cymk cymkVar = this.cw;
            cyml cymlVar = null;
            if (cymkVar != null && cymkVar.aF()) {
                cymlVar = cymkVar.H();
            }
            if (cymlVar != null && (a2 = cyml.a((cymk) cymlVar.b.b())) != null && a2.getVisibility() == 0) {
                View a3 = cyml.a((cymk) cymlVar.b.b());
                i += (a3 == null || a3.getHeight() <= 0) ? ((cymk) cymlVar.b.b()).B().getDimensionPixelSize(R.dimen.conv_bottom_bar_height) : a3.getHeight();
            }
        }
        crly crlyVar = this.dC;
        if (crlyVar != null) {
            int i2 = 0;
            if (crlyVar.h() && crlyVar.h()) {
                i2 = crlyVar.b().getHeight();
            }
            i += i2;
        }
        uuy uuyVar = this.cx;
        uuyVar.aB.k(i);
        vr vrVar = uuyVar.az.E;
        if (vrVar instanceof url) {
            ((url) vrVar).d = i;
        }
    }

    public final void aQ() {
        ParticipantsTable.BindData a2;
        if (this.t == null) {
            return;
        }
        boolean z = true;
        boolean z2 = this.dq.c() && (a2 = ((bcqs) this.cA.a()).g.a()) != null && a2.D() == byzi.VERIFICATION_VERIFIED;
        MenuItem menuItem = this.t;
        if (!z2 && !this.di) {
            z = false;
        }
        menuItem.setVisible(z);
    }

    public final void aR(Menu menu, boolean z) {
        ArrayList arrayList;
        if (!bb()) {
            bcqs bcqsVar = (bcqs) this.cA.a();
            ParticipantsTable.BindData a2 = bcqsVar.g.a();
            if (!((Boolean) cvfg.a.e()).booleanValue() || !this.dk.a() || bcqsVar.g.d().isEmpty() || bcqsVar.p() || bcqsVar.g.h() || !z || a2 == null) {
                return;
            }
            if (aX() && this.aG.n()) {
                return;
            }
            MenuItem findItem = menu.findItem(R.id.action_video_call);
            this.s = findItem;
            if (findItem != null) {
                boolean f2 = ((cvfe) this.Y.b()).f(a2);
                this.s.setVisible(f2);
                if (f2) {
                    this.U.e("Bugle.UI.VideoCallButton.Shown", a2.t());
                    if (((cvfe) this.Y.b()).j(a2)) {
                        this.ah.a(13);
                        if (((cvfe) this.Y.b()).h(a2) && ((Boolean) cvfg.b.e()).booleanValue()) {
                            Optional c2 = ((cvfe) this.Y.b()).c();
                            final MenuItem menuItem = this.s;
                            menuItem.getClass();
                            c2.ifPresent(new Consumer() { // from class: vrt
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    menuItem.setIcon(((Integer) obj).intValue());
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        bcqs bcqsVar2 = (bcqs) this.cA.a();
        ArrayList f3 = bcqsVar2.g.f();
        if (((Boolean) cvfg.a.e()).booleanValue() && this.dk.a()) {
            final bctw bctwVar = bcqsVar2.g;
            ArrayList f4 = bctwVar.f();
            if (f4.isEmpty() || Collection.EL.stream(f4).anyMatch(new Predicate() { // from class: bcth
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
                    return !((cpdg) bctw.this.b.b()).k(((ParticipantsTable.BindData) obj).W());
                }
            })) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                int size = f4.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((aolr) bctwVar.c.b()).t((ParticipantsTable.BindData) f4.get(i)));
                }
            }
            if (arrayList.isEmpty() || bcqsVar2.p() || bcqsVar2.g.h() || !z || f3.isEmpty()) {
                return;
            }
            if (aX() && this.aG.n()) {
                return;
            }
            MenuItem findItem2 = menu.findItem(R.id.action_video_call);
            this.s = findItem2;
            if (findItem2 == null) {
                return;
            }
            boolean g2 = ((cvfe) this.Y.b()).g(f3);
            this.s.setVisible(g2);
            if (g2 && ((cvfe) this.Y.b()).k(f3)) {
                this.ah.a(13);
                Optional c3 = ((cvfe) this.Y.b()).c();
                final MenuItem menuItem2 = this.s;
                menuItem2.getClass();
                c3.ifPresent(new Consumer() { // from class: vrt
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        menuItem2.setIcon(((Integer) obj).intValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    public final void aS(bcvr bcvrVar) {
        if (!this.dG && this.dF && this.cI && this.cJ) {
            this.dG = true;
            bcqs bcqsVar = (bcqs) this.cA.a();
            crmk crmkVar = this.dH;
            ConversationIdType conversationIdType = bcqsVar.e;
            SelfIdentityId t = bcvrVar.t();
            int q = bcvrVar.q();
            int i = bcqsVar.g.e;
            boolean z = bcqsVar.m;
            cbvt cbvtVar = (cbvt) crmkVar.b.b();
            cbvtVar.getClass();
            bdtd bdtdVar = (bdtd) crmkVar.c.b();
            bdtdVar.getClass();
            cqoh cqohVar = (cqoh) crmkVar.d.b();
            cqohVar.getClass();
            new LegacyGroupProtocolSwitchAction(crmkVar.a, cbvtVar, bdtdVar, cqohVar, conversationIdType, t, q, i, z).t();
        }
    }

    @Override // defpackage.cylx
    public final void aT(final bcvr bcvrVar, boolean z, boolean z2) {
        Object obj;
        ehft ehftVar;
        final alcz alczVar;
        int i;
        ehft ehftVar2;
        final Runnable runnable = (Runnable) I(new Function() { // from class: vpc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                final uav uavVar = (uav) obj2;
                enru enruVar = vvn.a;
                return new Runnable() { // from class: vou
                    @Override // java.lang.Runnable
                    public final void run() {
                        enru enruVar2 = vvn.a;
                        uav.this.j(false, true, false);
                    }
                };
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: vpd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                enru enruVar = vvn.a;
                final cxtc H = ((ComposeMessageView) obj2).H();
                return new Runnable() { // from class: vqn
                    @Override // java.lang.Runnable
                    public final void run() {
                        cxtc.this.c.ai(false, true, 1);
                    }
                };
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boolean fu = fu();
        Activity p = p();
        Supplier supplier = new Supplier() { // from class: vpe
            @Override // java.util.function.Supplier
            public final Object get() {
                return dclk.a(vvn.this.az, bcvrVar.v);
            }
        };
        int a2 = a();
        obj = supplier.get();
        final Iterable iterable = (Iterable) obj;
        final int i2 = fu ? 4 : 3;
        final boolean z3 = (!z || fu || z2) ? false : true;
        final alcz alczVar2 = this.dm;
        ddxs ddxsVar = this.aA;
        final int d2 = ddxsVar.e.a(a2).d();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ehft ehftVar3 = new ehft(p);
        ehftVar3.x(R.string.mms_attachment_limit_reached);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ddxr
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                alcz.this.b(iterable, i2, d2, z3);
                atomicBoolean.set(true);
            }
        };
        if (fu) {
            ehftVar3.m(R.string.attachment_limit_reached_dialog_message_when_composing_rcs);
            ehftVar3.t(android.R.string.ok, onClickListener);
            ehftVar = ehftVar3;
        } else if (z) {
            if (z2) {
                ehftVar3.m(R.string.video_attachment_limit_exceeded_when_sending);
                ehftVar2 = ehftVar3;
                alczVar = alczVar2;
                i = 17039370;
            } else {
                ehftVar3.m(R.string.attachment_limit_reached_dialog_message_when_sending);
                alczVar = alczVar2;
                final boolean z4 = z3;
                i = 17039370;
                ehftVar3.o(R.string.attachment_limit_reached_send_anyway, new elbb(ddxsVar.i, "DialogUtils#warnOfExceedingMessageLimit", new DialogInterface.OnClickListener() { // from class: ddxd
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        alcz.this.c(4, iterable, i2, d2, z4);
                        atomicBoolean.set(true);
                        runnable.run();
                    }
                }));
                ehftVar2 = ehftVar3;
            }
            ehftVar = ehftVar2;
            int i3 = i;
            alczVar2 = alczVar;
            ehftVar.t(i3, new DialogInterface.OnClickListener() { // from class: ddxe
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    alcz.this.b(iterable, i2, d2, z3);
                    atomicBoolean.set(true);
                }
            });
        } else {
            ehftVar = ehftVar3;
            if (z2) {
                ehftVar.m(R.string.video_attachment_limit_exceeded_when_sending);
            } else {
                ehftVar.m(R.string.attachment_limit_reached_dialog_message_when_composing);
            }
            ehftVar.t(android.R.string.ok, onClickListener);
        }
        final alcz alczVar3 = alczVar2;
        final boolean z5 = z3;
        ehftVar.s(new DialogInterface.OnDismissListener() { // from class: ddxf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                if (atomicBoolean.get()) {
                    return;
                }
                boolean z6 = z5;
                int i4 = d2;
                int i5 = i2;
                alczVar3.c(3, iterable, i5, i4, z6);
            }
        });
        ehftVar.a();
        alczVar3.c(2, iterable, i2, d2, z5);
    }

    @Override // defpackage.cylx
    public final void aU() {
        Runnable runnable = (Runnable) I(new Function() { // from class: vsm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final uav uavVar = (uav) obj;
                enru enruVar = vvn.a;
                return new Runnable() { // from class: vov
                    @Override // java.lang.Runnable
                    public final void run() {
                        enru enruVar2 = vvn.a;
                        uav.this.j(false, false, false);
                    }
                };
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: vsn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = vvn.a;
                final cxtc H = ((ComposeMessageView) obj).H();
                return new Runnable() { // from class: vos
                    @Override // java.lang.Runnable
                    public final void run() {
                        cxtc.this.c.ai(false, false, 1);
                    }
                };
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        Activity p = p();
        final Runnable l = eldl.l(runnable);
        ehft ehftVar = new ehft(p);
        ehftVar.m(R.string.warn_of_exceeding_sms_message_limit_to_emergency_number_dialog_message);
        ehftVar.t(R.string.confirm_send_to_emergency_number, new elbb(this.aA.i, "DialogUtils#warnOfExceedingSmsMessageLengthToEmergencyNumber", new DialogInterface.OnClickListener() { // from class: ddxh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                l.run();
            }
        }));
        ehftVar.o(R.string.cancel_send_to_emergency_number, new DialogInterface.OnClickListener() { // from class: ddxi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        ehftVar.create().show();
    }

    public final void aV() {
        ((deaj) this.dn.b()).a();
    }

    public final void aW() {
        S(new Consumer() { // from class: vjv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ComposeMessageView e2 = ((uav) obj).e();
                if (e2 == null || e2.getVisibility() != 0) {
                    return;
                }
                vvn vvnVar = vvn.this;
                if (vvnVar.cH) {
                    return;
                }
                if (vvnVar.cI || e2.H().k()) {
                    udz udzVar = vvnVar.cg;
                    udzVar.getClass();
                    udzVar.d(e2.H().t());
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vjw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                if (composeMessageView == null || composeMessageView.getVisibility() != 0) {
                    return;
                }
                vvn vvnVar = vvn.this;
                if (vvnVar.cH) {
                    return;
                }
                if (vvnVar.cI || composeMessageView.H().k()) {
                    udz udzVar = vvnVar.cg;
                    udzVar.getClass();
                    udzVar.d(vvnVar.cv.H().t());
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final boolean aX() {
        return ((Boolean) J(new Function() { // from class: vmn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ugg uggVar = (ugg) obj;
                enru enruVar = vvn.a;
                boolean z = false;
                if (uggVar.t() && uggVar.c() != ugo.IME) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: vmo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                czgj czgjVar = (czgj) obj;
                enru enruVar = vvn.a;
                boolean z = false;
                if (czgjVar != null && (czgjVar.y() || czgjVar.z())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).booleanValue();
    }

    @Override // defpackage.cylx, defpackage.czgy
    public final boolean aY() {
        return this.cA.g();
    }

    public final boolean aZ() {
        return this.aW.isPresent();
    }

    public final void aa() {
        if (bd()) {
            P();
        }
        eg G = this.N.G();
        if (G instanceof cwpv) {
            ((cwpv) G).o();
        }
    }

    public final void ab(int i) {
        if (i != 1) {
            emxf.l(((bcqs) this.cA.a()).f);
        }
        if (!((bcqs) this.cA.a()).p()) {
            if (((bcqs) this.cA.a()).d.z()) {
                this.dI.d(p(), this.M, ((bcqs) this.cA.a()).m, ((typ) ((bcqs) this.cA.a()).d).g, ((typ) ((bcqs) this.cA.a()).d).d, ((typ) ((bcqs) this.cA.a()).d).r, i, ((typ) ((bcqs) this.cA.a()).d).m);
                return;
            } else {
                this.dI.c(p(), this.M, ((bcqs) this.cA.a()).m, ((typ) ((bcqs) this.cA.a()).d).g, ((typ) ((bcqs) this.cA.a()).d).d, L(), i, ((typ) ((bcqs) this.cA.a()).d).q);
                return;
            }
        }
        ParticipantsTable.BindData a2 = ((bcqs) this.cA.a()).g.a();
        if (a2 == null) {
            ensk i2 = a.i();
            i2.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) i2;
            enrrVar.Y(csux.p, this.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "launchConversationSettings", 4453, "ConversationFragmentPeer.java")).q("ConversationFragment: Conversation has RBM bot recipient, but null other participant");
            return;
        }
        String U = a2.U();
        if (U != null) {
            vzx.e(p(), this.M, U);
            return;
        }
        ensk i3 = a.i();
        i3.Y(ente.a, "Bugle");
        enrr enrrVar2 = (enrr) i3;
        enrrVar2.Y(csux.p, this.M);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "launchConversationSettings", 4445, "ConversationFragmentPeer.java")).q("ConversationFragment: Conversation has RBM bot recipient and other participant, but the participant has a null normalized destination");
    }

    public final void ac() {
        axnw.h(((adtc) this.ap.b()).c(p(), "Messenger_conversation", this.cd));
    }

    public final void ad() {
        if (((Boolean) ctjd.e.e()).booleanValue()) {
            Optional c2 = this.T.c(this.M);
            if (c2.isPresent() && ((bcqs) this.cA.a()).f && ((typ) ((bcqs) this.cA.a()).d).n) {
                this.T.d(this.M);
                k((SuggestionData) c2.get());
            }
        }
    }

    public final void ae() {
        eg G;
        int a2 = a();
        if (!this.cP && this.cA.g() && ((bcqs) this.cA.a()).g.e > 1 && ((bcqs) this.cA.a()).f && this.dp.d(a2) && this.cI && (G = this.N.G()) != null && this.ds.c(G, a2)) {
            if (!fu()) {
                this.cP = true;
            }
            View view = this.cr;
            view.getClass();
            view.post(new Runnable() { // from class: vrq
                @Override // java.lang.Runnable
                public final void run() {
                    final vvn vvnVar = vvn.this;
                    if (!vvnVar.cA.g() || vvnVar.fu()) {
                        return;
                    }
                    vvnVar.aH(vvnVar.N.Y(R.string.sim_number_empty_warning_snackbar), vvnVar.N.Y(R.string.sim_number_empty_warning_action_label), new Runnable() { // from class: vpr
                        @Override // java.lang.Runnable
                        public final void run() {
                            vvn.this.ap(false);
                        }
                    }, true);
                }
            });
        }
    }

    public final void af() {
        String a2;
        View.OnClickListener onClickListener;
        int i;
        String a3;
        List list;
        int i2;
        if (this.cA.g() && this.cJ && this.dF && this.cj == null) {
            boolean i3 = ((bcqs) this.cA.a()).g.i();
            boolean p = ((bcqs) this.cA.a()).p();
            int a4 = a();
            enru enruVar = a;
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onAllowReplyStateMaybeChanged", 5514, "ConversationFragmentPeer.java")).r("Calling onAllowReplyStateMaybeChanged with subId: %d", a4);
            boolean z = p && (((djrv) this.bZ.b()).x(a4) || ((ckge) this.am.a()).s());
            if (((bcqs) this.cA.a()).n() && ((!p || z) && ((ctvs) this.dx.b()).d())) {
                bw();
                return;
            }
            if (bg() && p) {
                bw();
                if (a4 == -1 || !bm(a4)) {
                    return;
                }
                W(a4);
                return;
            }
            Y();
            this.cx.y((int) this.N.B().getDimension(R.dimen.conversation_bottom_margin_without_compose));
            Snackbar snackbar = this.dB;
            if (snackbar == null || !snackbar.l()) {
                bcqs bcqsVar = (bcqs) this.cA.a();
                if (bcqsVar.p() || !((!bcqsVar.d.A() || (i2 = ((typ) bcqsVar.d).g) == 2 || i2 == 8) && ((ctvs) this.dx.b()).d() && !bcqsVar.g.i())) {
                    final String format = String.format((String) cful.t.e(), kqt.a(this.N.B().getConfiguration()).f(0));
                    final Activity p2 = p();
                    if (i3) {
                        Context z2 = this.N.z();
                        z2.getClass();
                        a2 = crmi.a(z2);
                        onClickListener = new View.OnClickListener() { // from class: vrh
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Context z3 = vvn.this.N.z();
                                z3.getClass();
                                ehft ehftVar = new ehft(z3);
                                ehftVar.y(null);
                                ehftVar.n(z3.getString(R.string.messaging_not_supported_with_short_code_dialog_body));
                                ehftVar.j(true);
                                ehftVar.o(R.string.messaging_not_supported_with_short_code_dialog_dismiss_button, new vup());
                                ehftVar.create().show();
                            }
                        };
                        i = R.string.messaging_not_supported_with_short_code_snackbar_body;
                    } else if (!((ctvs) this.dx.b()).d()) {
                        a2 = this.N.B().getString(R.string.requires_default_sms_change_button);
                        onClickListener = new View.OnClickListener() { // from class: vri
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ensk e2 = vvn.a.e();
                                e2.Y(ente.a, "Bugle");
                                enrr enrrVar = (enrr) e2;
                                vvn vvnVar = vvn.this;
                                enrrVar.Y(csux.p, vvnVar.M);
                                ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "displayComposeDisabledMessage", 5635, "ConversationFragmentPeer.java")).q("ConversationFragment: Set default sms button clicked");
                                vvnVar.N.startActivityForResult(((akvg) vvnVar.an.b()).l(vvnVar.p()), 1);
                            }
                        };
                        i = R.string.requires_default_sms_app_to_send;
                    } else if (((djrv) this.bZ.b()).d(a()).a == eqwf.DISABLED_FROM_PREFERENCES) {
                        a2 = this.N.B().getString(R.string.rcs_reply_not_available_turn_on_label);
                        onClickListener = new View.OnClickListener() { // from class: vrj
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                akvg akvgVar = (akvg) vvn.this.an.b();
                                Activity activity = p2;
                                eldl.p(activity, akvgVar.o(activity));
                            }
                        };
                        i = R.string.rcs_turned_off_from_preferences_v2;
                    } else if (((ckge) this.am.a()).t()) {
                        Context z3 = this.N.z();
                        z3.getClass();
                        bcpt bcptVar = this.cA;
                        a2 = crmi.a(z3);
                        onClickListener = ((bcqs) bcptVar.a()).p() ? new View.OnClickListener() { // from class: vrk
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ((akvg) vvn.this.an.b()).y(p2, format);
                            }
                        } : new View.OnClickListener() { // from class: vrm
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ((adtc) vvn.this.ap.b()).h(p2);
                            }
                        };
                        i = R.string.rcs_not_supported_by_carrier;
                    } else {
                        Context z4 = this.N.z();
                        z4.getClass();
                        bcpt bcptVar2 = this.cA;
                        a2 = crmi.a(z4);
                        onClickListener = ((bcqs) bcptVar2.a()).p() ? new View.OnClickListener() { // from class: vrn
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ((akvg) vvn.this.an.b()).y(p2, format);
                            }
                        } : null;
                        i = R.string.rcs_reply_not_available_message;
                    }
                    View u = u();
                    bcqs bcqsVar2 = (bcqs) this.cA.a();
                    ParticipantsTable.BindData a5 = bcqsVar2.g.a();
                    if (a5 == null) {
                        if (bcqsVar2.d.z()) {
                            ensk j = enruVar.j();
                            j.Y(ente.a, "Bugle");
                            enrr enrrVar = (enrr) j;
                            enrrVar.Y(csux.p, this.M);
                            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "buildAvailabilityMessage", 5716, "ConversationFragmentPeer.java")).q("ConversationFragment: Participant data is expected in conversation");
                        }
                        a3 = bcqsVar2.l();
                    } else {
                        a3 = ((bdrt) this.dg.b()).a(a5, true);
                    }
                    Snackbar r = Snackbar.r(u, this.N.B().getString(i, a3), -2);
                    this.dB = r;
                    r.n(this.cr.findViewById(R.id.input_manager_fragment));
                    if (onClickListener != null) {
                        this.dB.t(a2, new elay(this.aT, "ConversationFragmentPeer#shouldShowComposeDisabledMessage", onClickListener));
                    }
                    Snackbar snackbar2 = this.dB;
                    vuo vuoVar = new vuo();
                    ehqw ehqwVar = snackbar2.v;
                    if (ehqwVar != null && (list = snackbar2.s) != null) {
                        list.remove(ehqwVar);
                    }
                    if (snackbar2.s == null) {
                        snackbar2.s = new ArrayList();
                    }
                    snackbar2.s.add(vuoVar);
                    snackbar2.v = vuoVar;
                    this.dB.i();
                }
            }
        }
    }

    @Override // defpackage.czgy
    public final void ag() {
        S(null, new Consumer() { // from class: vlw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((ComposeMessageView) obj).addOnLayoutChangeListener(vvn.this.t());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.cs.addOnLayoutChangeListener(t());
    }

    @Override // defpackage.cylx
    public final void ah() {
        this.cC.ad();
        this.cx.k();
        l();
        if (ba()) {
            return;
        }
        T(new Consumer() { // from class: vnk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ugg uggVar = (ugg) obj;
                if (vvn.this.ch) {
                    uggVar.r(ugo.IME, false, false);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, null);
    }

    public final void ai() {
        eg G = this.N.G();
        if (G == null || G.isDestroyed()) {
            return;
        }
        this.dF = true;
        aS((bcvr) this.cM.a());
        af();
        ad();
        uuy uuyVar = this.cx;
        if (uuyVar.v.a() == 1 && uuyVar.aJ != null) {
            List Y = ((bcse) uuyVar.v.b().iterator().next()).Y();
            if (Y.size() == 1) {
                uuyVar.aJ = (MessagePartCoreData) Y.get(0);
            } else if (!Y.contains(uuyVar.aJ)) {
                uuyVar.k();
            }
        }
        upx upxVar = uuyVar.aB;
        if (upxVar != null) {
            upxVar.c.q(0);
        }
        aa();
        ahqt ahqtVar = (ahqt) this.cC;
        ahqtVar.v.isPresent();
        ahqtVar.c();
        vvn p = ahqtVar.p();
        if (p != null && !p.cq) {
            csll csllVar = p.at;
            csllVar.g(p.p(), csllVar.f(p.M));
            p.cq = true;
        }
        ensk g2 = a.g();
        g2.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) g2;
        enrrVar.Y(csux.p, this.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onConversationMetadataUpdated", 4565, "ConversationFragmentPeer.java")).I("ConversationFragment: isRcsConversation: %s isRcsSendingEnabled: %s", ((bcqs) this.cA.a()).m, ((bcqs) this.cA.a()).q());
    }

    @Override // defpackage.cylx
    public final void aj() {
        if (((bcqs) this.cA.a()).d.A()) {
            bcqs bcqsVar = (bcqs) this.cA.a();
            final ConversationIdType conversationIdType = bcqsVar.e;
            final boolean z = ((typ) bcqsVar.d).e;
            if (bcqsVar.o(false)) {
                S(new Consumer() { // from class: vqo
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        vvn.this.Q.b(conversationIdType, z, ((uav) obj).d().m());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: vqq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        vvn.this.Q.b(conversationIdType, z, ((bcvr) ((ComposeMessageView) obj).H().s().a()).m());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        } else {
            bcqs bcqsVar2 = (bcqs) this.cA.a();
            final ConversationIdType conversationIdType2 = bcqsVar2.e;
            final aoku aokuVar = (aoku) ((typ) bcqsVar2.d).k.orElse(null);
            if (aokuVar != null) {
                final boolean y = bcqsVar2.d.y();
                final boolean z2 = ((typ) bcqsVar2.d).e;
                S(new Consumer() { // from class: vjx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        vvn.this.Q.a(conversationIdType2, aokuVar, y, z2, ((uav) obj).d().m());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: vjy
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        vvn.this.Q.a(conversationIdType2, aokuVar, y, z2, ((bcvr) ((ComposeMessageView) obj).H().s().a()).m());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                af();
            }
        }
        af();
    }

    public final void ak(final ephg ephgVar) {
        S(null, new Consumer() { // from class: vqk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cxtc H = ((ComposeMessageView) obj).H();
                vvn vvnVar = vvn.this;
                tys tysVar = ((bcqs) vvnVar.cA.a()).d;
                cxvv cxvvVar = H.c;
                ((bcvr) cxvvVar.x.a()).L(tysVar, ephgVar);
                cxvvVar.ah((bcvr) cxvvVar.x.a());
                cxvvVar.Q("onDraftRcsConditionsUpdated");
                if (vvnVar.w && vvnVar.x) {
                    vvnVar.aj();
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ckgc
    public final void al(ckgd ckgdVar) {
        cslq.c(new Runnable() { // from class: vsu
            @Override // java.lang.Runnable
            public final void run() {
                vvn.this.af();
            }
        }, 250L);
    }

    public final void am() {
        this.U.c("Bugle.UI.Conversations.ScrollToBottomButton.Click");
        uuy uuyVar = this.cx;
        uuyVar.aO = true;
        uuyVar.L.g(new ejlp(uuyVar.aB.h(bdhb.a)), uuyVar.aj);
        X(false);
    }

    public final void an() {
        this.cx.p();
        S(null, new Consumer() { // from class: vpz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
                ((ComposeMessageView) obj).H().c.D();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.cylx
    public final void ao() {
        if (this.dD == 1) {
            aD(0);
            az(0, this.aj.f());
            this.cN = 0L;
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [aoku, java.lang.Object] */
    @Override // defpackage.cylx
    public final void ap(boolean z) {
        czgo a2;
        bv();
        emxf.l(this.cA.g());
        if (this.cA.g()) {
            aztg d2 = ((bcqs) this.cA.a()).d(i());
            if (d2 == null) {
                a2 = czgr.a(-1, null, z);
            } else {
                String h2 = d2.h();
                if (h2 == null) {
                    csjy.n("Bugle", "subscriptionName is empty");
                    h2 = d2.b().isPresent() ? d2.b().get().G().a : String.valueOf(d2.d());
                }
                a2 = czgr.a(d2.e(), h2, z);
            }
            a2.aP(this.N);
            a2.t(this.N.J(), null);
        }
    }

    public final void aq() {
        final ArrayList arrayList = new ArrayList();
        bdud bdudVar = this.ba;
        arrayList.addAll(bdudVar.a);
        arrayList.addAll(bdudVar.b.c());
        S(new Consumer() { // from class: voo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                vvn vvnVar = vvn.this;
                if (vvnVar.cM != null) {
                    vvnVar.cx.B(arrayList);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vop
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                vvn.this.cx.B(arrayList);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void ar() {
        if (this.da != null) {
            S(null, new Consumer() { // from class: vky
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((ComposeMessageView) obj).removeOnLayoutChangeListener(vvn.this.da);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.cs.removeOnLayoutChangeListener(this.da);
        }
    }

    @Override // defpackage.cylx
    public final void as(MessageCoreData messageCoreData, Instant instant) {
        boolean z = false;
        if (((Boolean) cnvu.a.e()).booleanValue() && this.bj.isPresent()) {
            this.bl.isPresent();
            z = true;
        }
        emxf.m(z, "Cannot schedule message. Is the build misconfigured?");
        this.cx.k();
        l();
        if (!bj()) {
            aV();
            return;
        }
        if (bx()) {
            this.aL.i(new ejlp(((coja) this.bj.get()).b(messageCoreData, instant)), new ejlm(messageCoreData), this.k);
            return;
        }
        ensk j = a.j();
        j.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) j;
        enrrVar.Y(csux.p, this.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "scheduleMessage", 4853, "ConversationFragmentPeer.java")).q("ConversationFragment: Message can't be scheduled: conversation participants not loaded");
    }

    @Override // defpackage.czgy
    public final void at() {
        this.cx.t();
    }

    public final void au(bcvr bcvrVar) {
        cqoh cqohVar = this.aj;
        long a2 = cqohVar.a();
        long epochMilli = cqohVar.f().toEpochMilli();
        MessageCoreData v = bcvrVar.v(epochMilli);
        altk altkVar = (altk) this.ae.b();
        bcvrVar.y();
        altkVar.aM();
        av(v, epochMilli, a2);
    }

    public final void av(MessageCoreData messageCoreData, long j, long j2) {
        aw(messageCoreData, j, j2, false, Optional.empty(), Optional.empty());
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x04c1 A[Catch: all -> 0x04dd, TRY_LEAVE, TryCatch #5 {all -> 0x04dd, blocks: (B:109:0x0480, B:111:0x0494, B:113:0x049f, B:115:0x04a7, B:116:0x04bb, B:118:0x04c1), top: B:108:0x0480, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x031c A[Catch: all -> 0x04fe, TryCatch #7 {all -> 0x04fe, blocks: (B:17:0x009d, B:20:0x00b7, B:21:0x00c0, B:23:0x00c6, B:26:0x00d2, B:31:0x00d8, B:33:0x00eb, B:35:0x00fb, B:37:0x0101, B:39:0x010b, B:41:0x010e, B:46:0x0113, B:48:0x011c, B:51:0x0206, B:54:0x0217, B:56:0x0233, B:57:0x0247, B:59:0x024d, B:60:0x0284, B:61:0x029c, B:63:0x02a2, B:65:0x02b0, B:67:0x02b6, B:72:0x02c5, B:73:0x02d8, B:76:0x02e7, B:78:0x0318, B:80:0x031c, B:81:0x0323, B:83:0x034f, B:84:0x0359, B:86:0x035f, B:88:0x0377, B:91:0x03b4, B:107:0x0477, B:120:0x04c6, B:139:0x04e7, B:138:0x04e4, B:149:0x04f2, B:148:0x04ef, B:159:0x04fd, B:158:0x04fa, B:161:0x0321, B:162:0x02fc, B:164:0x0302, B:173:0x0278, B:174:0x0243, B:176:0x0151, B:178:0x0161, B:179:0x016f, B:181:0x017b, B:183:0x0189, B:187:0x0193, B:189:0x0199, B:191:0x01a3, B:193:0x01a9, B:194:0x01ac, B:196:0x01b6, B:200:0x01b9, B:203:0x01c1, B:204:0x01db, B:206:0x01e5, B:207:0x01eb, B:134:0x04df, B:90:0x03a9, B:93:0x03bd, B:95:0x03cb, B:97:0x03d1, B:98:0x03e4, B:100:0x03ea, B:102:0x03f8, B:104:0x0406, B:106:0x041a, B:140:0x0455, B:154:0x04f5, B:109:0x0480, B:111:0x0494, B:113:0x049f, B:115:0x04a7, B:116:0x04bb, B:118:0x04c1, B:144:0x04ea), top: B:16:0x009d, inners: #0, #1, #3, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x034f A[Catch: all -> 0x04fe, TryCatch #7 {all -> 0x04fe, blocks: (B:17:0x009d, B:20:0x00b7, B:21:0x00c0, B:23:0x00c6, B:26:0x00d2, B:31:0x00d8, B:33:0x00eb, B:35:0x00fb, B:37:0x0101, B:39:0x010b, B:41:0x010e, B:46:0x0113, B:48:0x011c, B:51:0x0206, B:54:0x0217, B:56:0x0233, B:57:0x0247, B:59:0x024d, B:60:0x0284, B:61:0x029c, B:63:0x02a2, B:65:0x02b0, B:67:0x02b6, B:72:0x02c5, B:73:0x02d8, B:76:0x02e7, B:78:0x0318, B:80:0x031c, B:81:0x0323, B:83:0x034f, B:84:0x0359, B:86:0x035f, B:88:0x0377, B:91:0x03b4, B:107:0x0477, B:120:0x04c6, B:139:0x04e7, B:138:0x04e4, B:149:0x04f2, B:148:0x04ef, B:159:0x04fd, B:158:0x04fa, B:161:0x0321, B:162:0x02fc, B:164:0x0302, B:173:0x0278, B:174:0x0243, B:176:0x0151, B:178:0x0161, B:179:0x016f, B:181:0x017b, B:183:0x0189, B:187:0x0193, B:189:0x0199, B:191:0x01a3, B:193:0x01a9, B:194:0x01ac, B:196:0x01b6, B:200:0x01b9, B:203:0x01c1, B:204:0x01db, B:206:0x01e5, B:207:0x01eb, B:134:0x04df, B:90:0x03a9, B:93:0x03bd, B:95:0x03cb, B:97:0x03d1, B:98:0x03e4, B:100:0x03ea, B:102:0x03f8, B:104:0x0406, B:106:0x041a, B:140:0x0455, B:154:0x04f5, B:109:0x0480, B:111:0x0494, B:113:0x049f, B:115:0x04a7, B:116:0x04bb, B:118:0x04c1, B:144:0x04ea), top: B:16:0x009d, inners: #0, #1, #3, #4, #5, #6 }] */
    /* JADX WARN: Type inference failed for: r0v127, types: [java.lang.Object, ugy] */
    @Override // defpackage.cylx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aw(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r23, long r24, long r26, boolean r28, final j$.util.Optional r29, final j$.util.Optional r30) {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvn.aw(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, long, long, boolean, j$.util.Optional, j$.util.Optional):void");
    }

    @Override // defpackage.czfn
    public final void ax(final long j, final long j2) {
        U(new Consumer() { // from class: vrz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                uav uavVar = (uav) obj;
                enru enruVar = vvn.a;
                if (uavVar != null) {
                    uavVar.i(j, j2);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vsa
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                enru enruVar = vvn.a;
                if (composeMessageView != null) {
                    long j3 = j2;
                    composeMessageView.H().c.aj(j, j3, 1, null);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Deprecated
    public final void ay(String str, String str2) {
        long a2 = this.aj.a();
        bcvr F = F();
        F.S(str);
        F.P(str2);
        long epochMilli = this.aj.f().toEpochMilli();
        MessageCoreData v = F.v(epochMilli);
        altk altkVar = (altk) this.ae.b();
        F.y();
        altkVar.aM();
        av(v, epochMilli, a2);
    }

    public final void az(int i, final Instant instant) {
        final bcqs bcqsVar = (bcqs) this.cA.a();
        final int a2 = a();
        if (bcqsVar.m) {
            final tys tysVar = bcqsVar.d;
            final cowy cowyVar = i == 1 ? cowy.ACTIVE : cowy.IDLE;
            final txl txlVar = (txl) this.Q;
            ((clvl) txlVar.s.get()).b(bcqsVar, cowyVar);
            elfo.g(new Callable() { // from class: tww
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(((cowz) txl.this.i.b()).b(a2));
                }
            }, txlVar.d).i(new eroh() { // from class: twx
                /* JADX WARN: Type inference failed for: r11v12, types: [aoku, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v1, types: [aoku, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v3, types: [aoku, java.lang.Object] */
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Optional empty;
                    Object obj2;
                    Optional of;
                    if (!((Boolean) obj).booleanValue()) {
                        csjb c2 = txl.a.c();
                        c2.I("Not sending a typing indicator because we should not share our typing status");
                        c2.r();
                        return elfo.e(null);
                    }
                    tys tysVar2 = tysVar;
                    final txl txlVar2 = txl.this;
                    if (tysVar2.y()) {
                        bcqs bcqsVar2 = bcqsVar;
                        typ typVar = (typ) bcqsVar2.d;
                        String str = typVar.o;
                        if (TextUtils.isEmpty(str)) {
                            csjb e2 = txl.a.e();
                            e2.I("Not sending typing indicator because RCS conversation id is missing");
                            e2.c(typVar.b);
                            e2.r();
                            of = Optional.empty();
                        } else {
                            String str2 = typVar.p;
                            if (TextUtils.isEmpty(str2)) {
                                final ConversationIdType conversationIdType = bcqsVar2.e;
                                bsob e3 = bsom.e();
                                e3.z("getRcsConferenceUriFromDatabase");
                                e3.c(bsom.c.ab);
                                e3.i(new Function() { // from class: txa
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        bsol bsolVar = (bsol) obj3;
                                        bsolVar.q(ConversationIdType.this);
                                        return bsolVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                str2 = ((bseh) ((bskr) e3.b().o()).cT()).ac();
                            }
                            if (TextUtils.isEmpty(str2)) {
                                csjb e4 = txl.a.e();
                                e4.I("Not sending typing indicator because RCS conference URI is missing");
                                e4.c(typVar.b);
                                e4.g(str);
                                e4.r();
                                of = Optional.empty();
                            } else {
                                int i2 = engw.d;
                                engr engrVar = new engr();
                                ArrayList f2 = bcqsVar2.g.f();
                                int size = f2.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) f2.get(i3);
                                    if (bindData.U() == null) {
                                        csjb e5 = txl.a.e();
                                        e5.I("Ignoring participant with null normalized destination while sending typing indicator");
                                        e5.c(typVar.b);
                                        e5.g(str);
                                        e5.r();
                                    } else {
                                        engrVar.h(((aolr) txlVar2.m.b()).q(bindData));
                                    }
                                }
                                engw g2 = engrVar.g();
                                if (g2.isEmpty()) {
                                    csjb e6 = txl.a.e();
                                    e6.I("Not sending typing indicator because no valid participant found in the conference");
                                    e6.c(typVar.b);
                                    e6.g(str);
                                    e6.r();
                                    of = Optional.empty();
                                } else {
                                    of = Optional.of(((avkm) txlVar2.j.b()).c(str, str2, g2));
                                }
                            }
                        }
                        if (of.isEmpty()) {
                            return elfo.e(null);
                        }
                        obj2 = of.get();
                    } else {
                        Optional optional = ((typ) tysVar2).k;
                        cfva cfvaVar = aoqm.a;
                        final boolean booleanValue = ((Boolean) new emyl() { // from class: aoop
                            @Override // defpackage.emyl
                            public final Object get() {
                                return Boolean.valueOf(ersy.a("bugle.enable_messaging_identity_in_conversation_metadata", "bugle"));
                            }
                        }.get()).booleanValue();
                        if (optional.isEmpty() || optional.get().p(booleanValue) == null) {
                            txl.a.r("1-1 conversation has empty otherParticipantNormalizedDestination().");
                            empty = Optional.empty();
                        } else {
                            if (booleanValue) {
                                try {
                                    if (optional.get().e().isPresent()) {
                                        Optional e7 = optional.get().e();
                                        ((avkm) txlVar2.j.b()).getClass();
                                        empty = e7.map(new Function() { // from class: txe
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                return new avkl((awui) obj3);
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                    }
                                } catch (avkg e8) {
                                    csjb e9 = txl.a.e();
                                    e9.I("1-1 conversation has otherParticipantNormalizedDestination() that cannot be parsed.");
                                    e9.s(e8);
                                    empty = Optional.empty();
                                }
                            }
                            empty = optional.map(new Function() { // from class: txf
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return ((avkm) txl.this.j.b()).a(emxe.b(((aoku) obj3).p(booleanValue)));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        }
                        if (empty.isEmpty()) {
                            return elfo.e(null);
                        }
                        obj2 = (avkl) empty.get();
                    }
                    int i4 = a2;
                    return ((cowz) txlVar2.i.b()).a(cowyVar, (avkl) obj2, instant, i4);
                }
            }, txlVar.d).k(axnw.b(), txlVar.g);
        }
    }

    @Override // defpackage.bcvm
    public final void b(bcvr bcvrVar, int i) {
        this.cM.e(bcvrVar);
        bcvr bcvrVar2 = (bcvr) this.cM.a();
        if (!this.cI) {
            this.cI = true;
        }
        ensk e2 = a.e();
        e2.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e2;
        enrrVar.Y(csux.p, this.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "internalOnDraftChanged", 6943, "ConversationFragmentPeer.java")).q("ConversationFragment: onDraftChanged");
        ae();
        aS(bcvrVar2);
        aq();
    }

    public final boolean ba() {
        return ((Boolean) cful.p.e()).booleanValue() && by();
    }

    @Override // defpackage.czgy
    public final boolean bb() {
        return ((bcqs) this.cA.a()).d.y();
    }

    @Override // defpackage.czgy
    public final boolean bc() {
        eg G = this.N.G();
        if (G != null) {
            return ctid.e(G, this.bb.a);
        }
        return false;
    }

    public final boolean bd() {
        MenuItem menuItem = this.p;
        return menuItem != null && menuItem.isActionViewExpanded();
    }

    public final boolean be() {
        return ahpj.a(this.dj, this.bb.a);
    }

    public final boolean bf() {
        ahqt ahqtVar = (ahqt) this.cC;
        ahqtVar.v.isPresent();
        return ahqtVar.N == 3;
    }

    final boolean bg() {
        return ((bcqs) this.cA.a()).h.a() > 1;
    }

    @Override // defpackage.cylx
    public final boolean bh() {
        return ((bcqs) this.cA.a()).d.z();
    }

    @Override // defpackage.czgy
    public final boolean bi() {
        if (((bcqs) this.cA.a()).g.a() == null) {
            return false;
        }
        ParticipantsTable.BindData a2 = ((bcqs) this.cA.a()).g.a();
        a2.getClass();
        return bdqv.d(a2);
    }

    @Override // defpackage.cylx
    public final boolean bj() {
        return this.as.c(p());
    }

    public final boolean bk() {
        return ((typ) ((bcqs) this.cA.a()).d).m == 2;
    }

    public final boolean bl() {
        if (!bf() || !this.dA) {
            return false;
        }
        this.dA = false;
        return true;
    }

    public final boolean bm(int i) {
        return bi() && !((djrv) this.bZ.b()).x(i);
    }

    public final boolean bn() {
        return ((typ) ((bcqs) this.cA.a()).d).d;
    }

    public final void bo() {
        im k;
        eg G = this.N.G();
        if ((G instanceof iy) && (k = ((iy) G).k()) != null) {
            k.isShowing();
        }
    }

    public final void bp() {
        ensk h2 = a.h();
        h2.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) h2;
        enrrVar.Y(csux.p, this.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "logZeroStateSearchItemActionShowAsActionState", 2999, "ConversationFragmentPeer.java")).q("ConversationFragment: Setting search action showAsAction to SHOW_AS_ACTION_NEVER");
    }

    public final void bq() {
        ((ensz) ((ensz) df.h()).h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "setRecipientContainerHeight", 1689, "ConversationFragmentPeer.java")).u("setContainerHeight: recipientHeight=%d, actionBarHeight=%d", 0, this.cV);
        int i = this.cV;
        cxzg cxzgVar = this.bc.a;
        if (cxzgVar != null) {
            cxzgVar.e(i);
        }
    }

    public final void br(int i, boolean z) {
        eisx eisxVar = this.cd;
        eisxVar.getClass();
        Activity p = p();
        ura uraVar = this.cx.aB.c;
        uraVar.d.getClass();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            mz mzVar = uraVar.d;
            if (i2 >= mzVar.g) {
                break;
            }
            if (!((bcse) mzVar.e(i2)).g.isEmpty()) {
                z2 = true;
                break;
            }
            i2++;
        }
        this.f18do.a(eisxVar, p, i, this.M, z2, z, this.bb.a);
    }

    public final void bs(MenuItem menuItem) {
        if (menuItem == null) {
            return;
        }
        menuItem.setOnMenuItemClickListener(new elbk(this.aT, "ConversationFragmentPeer searchMenuItem onMenuItemClick", new MenuItem.OnMenuItemClickListener() { // from class: vmw
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem2) {
                vvn vvnVar = vvn.this;
                ((ddpm) vvnVar.bC.b()).a("Bugle.Search.Button.Clicked", 1);
                vvnVar.ah.a(4);
                return false;
            }
        }));
    }

    @Override // defpackage.ugl
    public final int c(final MessagePartCoreData messagePartCoreData) {
        return ((Integer) I(new Function() { // from class: vsr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                vvn vvnVar = vvn.this;
                uav uavVar = (uav) obj;
                if (!vvnVar.ba()) {
                    vvnVar.ch = false;
                }
                int a2 = uavVar.a(messagePartCoreData);
                if (!vvnVar.ba()) {
                    vvnVar.ch = true;
                }
                return Integer.valueOf(a2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: vst
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                bcpw s = composeMessageView.H().s();
                bcvr bcvrVar = (bcvr) s.a();
                MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                if (bcvrVar.U(Collections.singletonList(messagePartCoreData2), s.b())) {
                    vvn vvnVar = vvn.this;
                    if (messagePartCoreData2 instanceof PendingAttachmentData) {
                        vvnVar.ch = false;
                        composeMessageView.H().F();
                        vvnVar.ch = true;
                    } else {
                        ((upg) vvnVar.bL.b()).a();
                    }
                    if (((Boolean) cjja.a.e()).booleanValue() && messagePartCoreData2.bm() && messagePartCoreData2.t() != null) {
                        Uri t = messagePartCoreData2.t();
                        t.getClass();
                        engw r = engw.r(t.toString());
                        if (!r.isEmpty() && !vvnVar.by.a().isEmpty()) {
                            vvnVar.aL.g(new ejlp(((cjhi) vvnVar.by.a().get()).a(vvnVar.cd, r)), vvnVar.bx);
                        }
                    }
                }
                return Integer.valueOf(((bcvr) s.a()).k() - 1);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).intValue();
    }

    @Override // defpackage.ugl
    public final EditText d() {
        return (EditText) (ba() ? new Function() { // from class: vlb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                uav uavVar = (uav) obj;
                enru enruVar = vvn.a;
                if (uavVar != null) {
                    return uavVar.c();
                }
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(w()) : new Function() { // from class: vlm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                enru enruVar = vvn.a;
                if (composeMessageView != null) {
                    return composeMessageView.H().c.o;
                }
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(this.cv));
    }

    @Override // defpackage.ugl
    public final ugx e() {
        return new ugx(new ffji() { // from class: vog
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                bcvr bcvrVar = (bcvr) vvn.this.cM.a();
                return ((Boolean) obj).booleanValue() ? Integer.valueOf(bcvrVar.n()) : Integer.valueOf(bcvrVar.m());
            }
        }, new ffix() { // from class: voh
            @Override // defpackage.ffix
            public final Object invoke() {
                vvn vvnVar = vvn.this;
                return Long.valueOf(vvnVar.X.a(vvnVar.a(), vvnVar.fu()));
            }
        }, new ffix() { // from class: voi
            @Override // defpackage.ffix
            public final Object invoke() {
                return Long.valueOf(((bcvr) vvn.this.cM.a()).s());
            }
        }, new ffix() { // from class: voj
            @Override // defpackage.ffix
            public final Object invoke() {
                return Boolean.valueOf(((bcvr) vvn.this.cM.a()).i);
            }
        });
    }

    @Override // defpackage.ugl
    public final void f(MessagePartCoreData messagePartCoreData) {
        bz(null, messagePartCoreData);
    }

    @Override // defpackage.bcvn
    public final boolean fu() {
        return ((bcqs) this.cA.a()).q();
    }

    @Override // defpackage.ugl
    public final void g(String str) {
        bz(str, null);
    }

    @Override // defpackage.ugl
    public final boolean h(final MessagePartCoreData messagePartCoreData) {
        return ((Boolean) I(new Function() { // from class: vpw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = vvn.a;
                return Boolean.valueOf(((uav) obj).r(MessagePartCoreData.this));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: vpx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = vvn.a;
                return Boolean.valueOf(((bcvr) ((ComposeMessageView) obj).H().s().a()).x(MessagePartCoreData.this) != null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).booleanValue();
    }

    @Override // defpackage.uuw
    public final SelfIdentityId i() {
        return (SelfIdentityId) I(new Function() { // from class: vol
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = vvn.a;
                return ((uav) obj).e().H().r();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: von
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = vvn.a;
                return ((ComposeMessageView) obj).H().r();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.uuw
    public final Optional j() {
        return this.cC.a();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [fazb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [fazb, java.lang.Object] */
    @Override // defpackage.uuw
    public final void k(SuggestionData suggestionData) {
        vva vvaVar = new vva(this);
        wgl D = D(suggestionData);
        if (D != null) {
            this.aL.i(ejlp.a(D.a(suggestionData, vvaVar)), new ejlm(suggestionData), this.g);
        }
        cztl cztlVar = this.aC;
        suggestionData.getClass();
        if (!(suggestionData instanceof SmartSuggestionData)) {
            if (!(suggestionData instanceof RbmSuggestionData)) {
                String format = String.format("Cannot determine how to handle suggestion %s", Arrays.copyOf(new Object[]{suggestionData}, 1));
                format.getClass();
                throw new IllegalStateException(format);
            }
            czrl czrlVar = (czrl) cztlVar.b.b();
            czui czuiVar = (czui) czrlVar.a.b();
            czuiVar.getClass();
            ffbr ffbrVar = czrlVar.b;
            ffbr ffbrVar2 = czrlVar.c;
            ffbr ffbrVar3 = czrlVar.d;
            ddzb ddzbVar = (ddzb) czrlVar.e.b();
            ddzbVar.getClass();
            akzt akztVar = (akzt) czrlVar.f.b();
            akztVar.getClass();
            Optional optional = (Optional) czrlVar.g.b();
            optional.getClass();
            crjp crjpVar = (crjp) czrlVar.h.b();
            crjpVar.getClass();
            new czrk(czuiVar, ffbrVar, ffbrVar2, ffbrVar3, ddzbVar, akztVar, optional, crjpVar, vvaVar).a(suggestionData);
            return;
        }
        czrp czrpVar = (czrp) cztlVar.a.b();
        ffbr ffbrVar4 = czrpVar.a;
        ffbr ffbrVar5 = czrpVar.b;
        ffbr ffbrVar6 = czrpVar.c;
        ffbr ffbrVar7 = czrpVar.d;
        ffbr ffbrVar8 = czrpVar.e;
        ffbr ffbrVar9 = czrpVar.f;
        ffbr ffbrVar10 = czrpVar.g;
        ffbr ffbrVar11 = czrpVar.h;
        ffbr ffbrVar12 = czrpVar.i;
        ffbr ffbrVar13 = czrpVar.j;
        ffbr ffbrVar14 = czrpVar.k;
        ffbr ffbrVar15 = czrpVar.l;
        ffbr ffbrVar16 = czrpVar.m;
        ?? b2 = czrpVar.n.b();
        b2.getClass();
        ?? b3 = czrpVar.o.b();
        b3.getClass();
        final czro czroVar = new czro(ffbrVar4, ffbrVar5, ffbrVar6, ffbrVar7, ffbrVar8, ffbrVar9, ffbrVar10, ffbrVar11, ffbrVar12, ffbrVar13, ffbrVar14, ffbrVar15, ffbrVar16, b2, b3, vvaVar);
        if (!(suggestionData instanceof SmartSuggestionItemSuggestionData)) {
            czro.a.n("Non P2P suggestion passed to SmartSuggestionAcceptor");
            throw new IllegalStateException("Non P2P suggestion passed to SmartSuggestionAcceptor");
        }
        SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = (SmartSuggestionItemSuggestionData) suggestionData;
        fbwy fbwyVar = smartSuggestionItemSuggestionData.c.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        fbri b4 = fbri.b(fbwyVar.l);
        if (b4 == null) {
            b4 = fbri.UNRECOGNIZED;
        }
        int ordinal = b4.ordinal();
        if (ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                czroVar.c();
                return;
            }
            if (ordinal == 5) {
                if (((ctml) czroVar.g.b()).g()) {
                    String p = smartSuggestionItemSuggestionData.p();
                    if (czroVar.n.b().q()) {
                        ((akvg) czroVar.i.b()).G(czroVar.n.a(), p, 0, 0, ((csuk) czroVar.d.b()).b(-1), eptm.SUGGESTION);
                        return;
                    }
                    cpbs cpbsVar = (cpbs) czroVar.e.b();
                    wgi wgiVar = czroVar.n;
                    final vva vvaVar2 = (vva) wgiVar;
                    cpbn a2 = cpbsVar.a(wgiVar.b().b((SelfIdentityId) vvaVar2.a.I(new Function() { // from class: vuw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((uav) obj).e().H().r();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: vux
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return vva.this.a.cv.H().r();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    })));
                    ((akvg) czroVar.i.b()).G(czroVar.n.a(), p, a2.c(), a2.b(), a2.d(), eptm.SUGGESTION);
                    return;
                }
                return;
            }
            if (ordinal == 6) {
                fbxa fbxaVar = smartSuggestionItemSuggestionData.c;
                String str = (fbxaVar.c == 6 ? (fbsm) fbxaVar.d : fbsm.a).g;
                str.getClass();
                if (TextUtils.isEmpty(str)) {
                    ((axul) czroVar.c.b()).a(czroVar.n.a());
                    return;
                } else {
                    new ddzo((ddzq) czroVar.j.b(), str, new ddzp() { // from class: czrn
                        @Override // defpackage.ddzp
                        public final void a(Uri uri) {
                            czro czroVar2 = czro.this;
                            ((vva) czroVar2.n).a.c(((dbzl) czroVar2.k.b()).a(uri, eohh.CONTACT_SUGGESTION).a());
                        }
                    }).e(new Void[0]);
                    return;
                }
            }
            if (ordinal == 9) {
                ((vva) czroVar.n).a.aE(false);
                return;
            }
            if (ordinal == 12) {
                String o = smartSuggestionItemSuggestionData.o();
                ewnk a3 = ((ctot) czroVar.f.b()).a(o, smartSuggestionItemSuggestionData.u());
                if (a3 != null) {
                    ExpressiveStickerContentItem expressiveStickerContentItem = new ExpressiveStickerContentItem(a3, eohh.STICKER_SUGGESTION);
                    ((cswx) czroVar.h.b()).c(new csxi(a3.c, o));
                    vva vvaVar3 = (vva) czroVar.n;
                    vvaVar3.a.f(vvaVar3.a.y.a(expressiveStickerContentItem, dcle.a));
                    return;
                }
                return;
            }
            if (ordinal == 13) {
                ParticipantsTable.BindData a4 = czroVar.n.b().g.a();
                a4.getClass();
                axnw.h(((cvfe) czroVar.l.b()).a(a4));
                return;
            }
            if (ordinal != 15 && ordinal != 16) {
                if (ordinal == 22) {
                    ((crnc) czroVar.m.b()).e(smartSuggestionItemSuggestionData, fbqp.CONVERSATION_VIEW);
                    return;
                }
                if (ordinal != 23) {
                    return;
                }
                fbxa fbxaVar2 = smartSuggestionItemSuggestionData.c;
                if (fbxaVar2.c == 19) {
                    fbsh fbshVar = (fbsh) fbxaVar2.d;
                    fbshVar.getClass();
                    fcfy fcfyVar = fbshVar.d;
                    if (fcfyVar == null) {
                        fcfyVar = fcfy.a;
                    }
                    Intent c2 = czts.c(fcfyVar, "android.intent.action.INSERT");
                    fbshVar.c.getClass();
                    String str2 = fbshVar.e;
                    str2.getClass();
                    if (!TextUtils.isEmpty(str2)) {
                        c2.putExtra("eventLocation", str2);
                    }
                    c2.putExtra("description", ((Context) czroVar.b.b()).getString(R.string.calendar_suggestion_event_description));
                    dlps dlpsVar = (dlps) dlpv.a.createBuilder();
                    dlpsVar.copyOnWrite();
                    dlpv.a((dlpv) dlpsVar.instance);
                    dlpt dlptVar = (dlpt) dlpu.a.createBuilder();
                    String string = ((Context) czroVar.b.b()).getString(R.string.calendar_suggestion_event_chat_title);
                    dlptVar.copyOnWrite();
                    dlpu dlpuVar = (dlpu) dlptVar.instance;
                    string.getClass();
                    dlpuVar.b = 16 | dlpuVar.b;
                    dlpuVar.c = string;
                    dlpsVar.copyOnWrite();
                    dlpv dlpvVar = (dlpv) dlpsVar.instance;
                    dlpu dlpuVar2 = (dlpu) dlptVar.build();
                    dlpuVar2.getClass();
                    dlpvVar.h = dlpuVar2;
                    dlpvVar.b |= 8192;
                    if (c2.hasExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE)) {
                        String stringExtra = c2.getStringExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
                        stringExtra.getClass();
                        dlpsVar.copyOnWrite();
                        dlpv dlpvVar2 = (dlpv) dlpsVar.instance;
                        dlpvVar2.b = 2 | dlpvVar2.b;
                        dlpvVar2.c = stringExtra;
                    }
                    if (c2.hasExtra("eventLocation")) {
                        String stringExtra2 = c2.getStringExtra("eventLocation");
                        stringExtra2.getClass();
                        dlpsVar.copyOnWrite();
                        dlpv dlpvVar3 = (dlpv) dlpsVar.instance;
                        dlpvVar3.b |= 64;
                        dlpvVar3.f = stringExtra2;
                    }
                    if (c2.hasExtra("description")) {
                        String stringExtra3 = c2.getStringExtra("description");
                        stringExtra3.getClass();
                        dlpsVar.copyOnWrite();
                        dlpv dlpvVar4 = (dlpv) dlpsVar.instance;
                        dlpvVar4.b |= 128;
                        dlpvVar4.g = stringExtra3;
                    }
                    if (c2.hasExtra("beginTime")) {
                        long longExtra = c2.getLongExtra("beginTime", 0L);
                        dlpsVar.copyOnWrite();
                        dlpv dlpvVar5 = (dlpv) dlpsVar.instance;
                        dlpvVar5.b |= 8;
                        dlpvVar5.d = longExtra;
                    }
                    eyfy build = dlpsVar.build();
                    build.getClass();
                    c2.putExtra("proto", ((dlpv) build).toByteArray());
                    wgi wgiVar2 = czroVar.n;
                    String str3 = smartSuggestionItemSuggestionData.a;
                    vvn vvnVar = ((vva) wgiVar2).a;
                    vvnVar.I = str3;
                    vvnVar.N.startActivityForResult(c2, 5001);
                    return;
                }
                return;
            }
        }
        czroVar.b(smartSuggestionItemSuggestionData);
    }

    @Override // defpackage.uuw
    public final void l() {
        this.cC.b();
    }

    @Override // defpackage.uuw
    public final void m(MessageIdType messageIdType) {
        if (!bj()) {
            aV();
            return;
        }
        ensk h2 = a.h();
        h2.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) h2;
        enrrVar.Y(csux.p, this.M);
        enrrVar.Y(csux.b, messageIdType);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "retrySend", 5199, "ConversationFragmentPeer.java")).q("ConversationFragment: UI initiated message resending");
        if (bx()) {
            ((ambs) this.dv.b()).m(messageIdType, ((bcqs) this.cA.a()).k(eooi.MESSAGE_SEND_RETRY, this.aj.f().toEpochMilli()));
        }
    }

    @Override // defpackage.uuw
    public final void n() {
        ConversationScrollToBottomButton conversationScrollToBottomButton = this.cT;
        if (conversationScrollToBottomButton != null) {
            vyp H = conversationScrollToBottomButton.H();
            int i = this.cU;
            H.i.d(vyp.a[0], i == 0 ? vyl.a : new vyk(i));
            vyp H2 = this.cT.H();
            if (!H2.b.isShown()) {
                H2.a().start();
            }
            czxf czxfVar = (czxf) this.bD.b();
            if (czxfVar.f) {
                return;
            }
            czxfVar.e.b(false);
        }
    }

    @Override // defpackage.czgy
    public final long o() {
        return this.X.b(-1);
    }

    @Override // defpackage.cylx
    public final Activity p() {
        return this.N.fe();
    }

    @Override // defpackage.cxra
    public final boolean q() {
        throw null;
    }

    public final BroadcastReceiver r() {
        if (this.dE == null) {
            this.dE = new vtu(this);
        }
        return this.dE;
    }

    public final Intent s() {
        eg G = this.N.G();
        if (G == null) {
            return null;
        }
        return G.getIntent();
    }

    public final View.OnLayoutChangeListener t() {
        if (this.da == null) {
            this.da = new View.OnLayoutChangeListener() { // from class: vsq
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    vvn vvnVar = vvn.this;
                    WindowInsets windowInsets = vvnVar.A;
                    int systemWindowInsetBottom = windowInsets != null ? windowInsets.getSystemWindowInsetBottom() : ddzb.b(vvnVar.p());
                    if (i4 <= vvnVar.cr.getRootView().getHeight() - systemWindowInsetBottom) {
                        return;
                    }
                    view.setBottom(i4 - systemWindowInsetBottom);
                    view.setTop(i2 - systemWindowInsetBottom);
                }
            };
        }
        return this.da;
    }

    public final View u() {
        return (View) I(new Function() { // from class: vkb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = vvn.a;
                View view = ((uav) obj).b().Q;
                view.getClass();
                return view;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: vkc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                enru enruVar = vvn.a;
                return composeMessageView;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cxrb
    public final void v() {
        throw null;
    }

    public final uav w() {
        fr I = this.N.I();
        ea g2 = I.g(R.id.draft_editor_fragment);
        if (g2 == null && this.cK) {
            eisx eisxVar = this.cd;
            ConversationIdType conversationIdType = this.M;
            entd entdVar = ucd.a;
            String a2 = conversationIdType.a();
            uau uauVar = new uau();
            fbae.e(uauVar);
            ekky.b(uauVar, eisxVar);
            ekku.b(uauVar, a2);
            uauVar.a.c(new vvc(this, uauVar));
            cg cgVar = new cg(I);
            cgVar.E(R.id.draft_editor_fragment, uauVar);
            cgVar.c();
            vjt vjtVar = this.cC;
            uav x = x(uauVar);
            ahqt ahqtVar = (ahqt) vjtVar;
            ahqtVar.v.isPresent();
            sfs sfsVar = (sfs) ahqtVar.k.b();
            MainActivity mainActivity = ahqtVar.b;
            sfq sfqVar = (sfq) sfsVar.a.b();
            sfqVar.getClass();
            ahqtVar.K = new sfr(sfqVar, mainActivity, x);
            g2 = uauVar;
        }
        if (g2 != null) {
            return x(g2);
        }
        return null;
    }

    public final ugg y() {
        if (!by()) {
            return null;
        }
        ea g2 = this.N.I().g(R.id.input_manager_fragment);
        if (g2 == null && this.cK) {
            eisx eisxVar = this.cd;
            ConversationIdType conversationIdType = this.M;
            entd entdVar = ufz.a;
            String a2 = conversationIdType.a();
            uft uftVar = new uft();
            fbae.e(uftVar);
            ekky.b(uftVar, eisxVar);
            ekku.b(uftVar, a2);
            cg cgVar = new cg(this.N.I());
            cgVar.E(R.id.input_manager_fragment, uftVar);
            cgVar.c();
            g2 = uftVar;
        }
        if (g2 == null) {
            return null;
        }
        ugg a3 = ugh.a(g2);
        a3.p(A());
        return a3;
    }

    @Override // defpackage.bcvm
    public final void fs() {
    }

    /* compiled from: PG */
    final class a implements ejlr<eyjv<akqx>, MessageCoreData> {
        public a() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            vvn.this.aC(Instant.ofEpochMilli(((akqx) ((eyjv) obj).a(akqx.a, eyfc.a())).c));
            vvn.this.aL((MessageCoreData) obj2, false);
            vvn.this.bo.ifPresent(new Consumer() { // from class: vvl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    vvn.a aVar = vvn.a.this;
                    akqy.a(vvn.this.N, "OVERWRITE_DRAFT_DIALOG_FRAGMENT_TAG");
                    akqy.c(vvn.this.N);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            vvn.this.bl.ifPresent(new Consumer() { // from class: vvm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    vvn.this.aG.k(R.string.scheduled_send_announcement_editing_failed);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((cfyt) vvn.this.br.b()).b(th).k(axnw.b(), erpp.a);
            ensk j = vvn.a.j();
            j.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) ((enrr) j).g(th);
            enrrVar.Y(csux.p, vvn.this.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$EditScheduledMessageCallback", "onFailure", 781, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to edit message.");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    final class b implements ejlr<String, ScheduledSendTable.BindData> {
        public b() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            final ScheduledSendTable.BindData bindData = (ScheduledSendTable.BindData) obj2;
            vvn.this.bn.ifPresent(new Consumer() { // from class: vvo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    final ScheduledSendTable.BindData bindData2 = ScheduledSendTable.BindData.this;
                    ((akpg) obj3).o(new Supplier() { // from class: akpe
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            eqfx eqfxVar = (eqfx) eqfy.a.createBuilder();
                            eqga d = akpq.d(ScheduledSendTable.BindData.this);
                            eqfxVar.copyOnWrite();
                            eqfy eqfyVar = (eqfy) eqfxVar.instance;
                            d.getClass();
                            eqfyVar.c = d;
                            eqfyVar.b |= 1;
                            return (eqfy) eqfxVar.build();
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            vvn.this.aG.k(R.string.send_message_failure);
            ((cfyt) vvn.this.br.b()).b(th).k(axnw.b(), erpp.a);
            csjy.p("Bugle", th, "Failed to queue scheduled message for immediate send.");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    final class c implements ejlr<Void, Boolean> {
        public c() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj2;
            if (bool != null && bool.booleanValue()) {
                vvn.this.aE(true);
                return;
            }
            ctud ctudVar = vvn.this.aN;
            boolean d = ctudVar.d();
            if (ctudVar.s() && d) {
                vvn.this.aE(true);
                return;
            }
            ((alrv) vvn.this.W.b()).b(alrv.A);
            ((ctuk) vvn.this.ax.b()).b(new vvp(this));
            csvs.c(elfl.g(vvn.this.aM.a.b(new emwl() { // from class: colx
                @Override // defpackage.emwl
                public final Object apply(Object obj3) {
                    akut akutVar = (akut) ((akuu) obj3).toBuilder();
                    akutVar.copyOnWrite();
                    akuu akuuVar = (akuu) akutVar.instance;
                    akuuVar.b |= 2;
                    akuuVar.c = true;
                    return (akuu) akutVar.build();
                }
            }, erpp.a)), "Bugle", "Fail to update cameraGalleryAlreadyPromotedPermissions");
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ensk i = vvn.a.i();
            i.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) ((enrr) i).g(th);
            enrrVar.Y(csux.p, vvn.this.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$PermissionFutureCallback", "onFailure", 646, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to get permission promotion info from settings.");
            ((alrv) vvn.this.W.b()).b(alrv.A);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    final class d implements ejlr<MessageCoreData, ScheduledSendTable.BindData> {
        public d() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            final ScheduledSendTable.BindData bindData = (ScheduledSendTable.BindData) obj2;
            vvn.this.bk.ifPresent(new Consumer() { // from class: vvs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    final aksy aksyVar = (aksy) obj3;
                    final ScheduledSendTable.BindData bindData2 = bindData;
                    vvn.this.bm.ifPresent(new Consumer() { // from class: vvq
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj4) {
                            final int a = aksyVar.a();
                            final ScheduledSendTable.BindData bindData3 = ScheduledSendTable.BindData.this;
                            ((akpa) obj4).o(new Supplier() { // from class: akoz
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    int a2 = eqgi.a(a);
                                    if (a2 == 0) {
                                        a2 = 1;
                                    }
                                    ScheduledSendTable.BindData bindData4 = bindData3;
                                    eqft eqftVar = (eqft) eqfu.a.createBuilder();
                                    eqga d = akpq.d(bindData4);
                                    eqftVar.copyOnWrite();
                                    eqfu eqfuVar = (eqfu) eqftVar.instance;
                                    d.getClass();
                                    eqfuVar.c = d;
                                    eqfuVar.b = 1 | eqfuVar.b;
                                    eqftVar.copyOnWrite();
                                    eqfu eqfuVar2 = (eqfu) eqftVar.instance;
                                    eqfuVar2.d = a2 - 1;
                                    eqfuVar2.b |= 2;
                                    return (eqfu) eqftVar.build();
                                }
                            });
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
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            vvn.this.bl.ifPresent(new Consumer() { // from class: vvr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    vvn.this.aG.k(R.string.scheduled_send_announcement_scheduling_failed);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((cfyt) vvn.this.br.b()).b(th).k(axnw.b(), erpp.a);
            ensk j = vvn.a.j();
            j.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) ((enrr) j).g(th);
            enrrVar.Y(csux.p, vvn.this.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$ScheduleMessageCallback", "onFailure", 742, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to schedule message.");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    final class f implements ejlr<String, List<String>> {
        public f() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            final String str = (String) obj;
            final List list = (List) obj2;
            vvn.this.aW.ifPresent(new Consumer() { // from class: vvt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    czqb czqbVar = (czqb) obj3;
                    String str2 = str;
                    engw c = bdhb.c(list);
                    str2.getClass();
                    c.getClass();
                    czqbVar.a = true;
                    czqbVar.c = c;
                    if (!Objects.equals(czqbVar.b, str2)) {
                        czqbVar.d = 0;
                    }
                    czqbVar.b = str2;
                    czqbVar.c();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ensk j = vvn.a.j();
            j.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) ((enrr) j).g(th);
            enrrVar.Y(csux.p, vvn.this.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$SearchQueryChangeCallback", "onFailure", 714, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to get search results");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    final class g implements ejlr<SuggestionData, eyjv<wgp>> {
        public g() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            SuggestionData suggestionData = (SuggestionData) obj;
            eyjv eyjvVar = (eyjv) obj2;
            wgl D = vvn.this.D(suggestionData);
            if (D != null) {
                D.b(vvn.this.M, suggestionData, eyjvVar);
            }
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ensk i = vvn.a.i();
            i.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) ((enrr) i).g(th);
            enrrVar.Y(csux.p, vvn.this.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$SuggestionBehaviorCallback", "onFailure", 668, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to run conversation suggestion.");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    final class h implements ejlr<Void, Boolean> {
        public h() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj2;
            if (bool == null || !bool.booleanValue()) {
                vvn.this.aG.k(R.string.activity_not_found_message);
                return;
            }
            ensk i = vvn.a.i();
            i.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) i;
            enrrVar.Y(csux.p, vvn.this.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$VideoCallCallback", "onSuccess", 682, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to start video call.");
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            vvn.this.aG.k(R.string.activity_not_found_message);
            ensk i = vvn.a.i();
            i.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) ((enrr) i).g(th);
            enrrVar.Y(csux.p, vvn.this.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$VideoCallCallback", "onFailure", 693, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to start video call.");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }

    @Override // defpackage.bcvm
    public final void ft(bcvr bcvrVar) {
    }

    @Override // defpackage.bcvm
    public final void fv(bcvr bcvrVar) {
    }
}
