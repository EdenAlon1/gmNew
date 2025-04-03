package defpackage;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.usage.UsageStatsManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.provider.Telephony;
import android.telephony.ServiceState;
import android.telephony.SmsMessage;
import android.telephony.TelephonyManager;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.backup.g1.GoogleOneRestoreService;
import com.google.android.apps.messaging.diagnostics.LogTelephonyDatabaseAction;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.android.apps.messaging.ui.debug.database.DatabaseActivity;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.chatsession.ChatSessionReportEvent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.firebase.iid.FirebaseInstanceId;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.DesugarTimeZone;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StreamCorruptedException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dauv implements dafa {
    private static final emyl bm = cfvl.w("enable_stuck_messages_notification_in_debug_menu");
    public static final enru c = enru.c("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl");
    public static final bvmr[] d;
    public final ffbr A;
    public final ffbr B;
    public final ffbr C;
    public final ffbr D;
    public final ffbr E;
    public final ffbr F;
    public final ffbr G;
    public final errl H;
    public final fazb I;
    public final ffbr J;
    public final ffbr K;
    public final ffbr L;
    public final ffbr M;
    public final ffbr N;
    public final ffbr O;
    public final ffbr P;
    public final ffbr Q;
    public final ffbr R;
    public final ffbr S;
    public final ffbr T;
    public final ffbr U;
    public final ffbr V;
    public final ffbr W;
    public final ffbr X;
    public final ffbr Y;
    public final ffbr Z;
    public final ffbr aA;
    public final ffbr aB;
    public final ffbr aC;
    public final ffbr aD;
    public final ffbr aE;
    public final ffbr aF;
    public final ffbr aG;
    public final ffbr aH;
    public final ffbr aI;
    public final ffbr aJ;
    public final ffbr aK;
    public final ffbr aL;
    public final ffbr aM;
    public final ffbr aN;
    public final ffbr aO;
    public final ffbr aP;
    public final ffbr aQ;
    public final ffbr aR;
    public final ffbr aS;
    public int aT;
    public final errl aU;
    public final ffbr aV;
    public final ffbr aW;
    public final ffbr aX;
    public final ffbr aY;
    public final ffbr aZ;
    public final ffbr aa;
    public final ffbr ab;
    public final ffbr ac;
    public final ffbr ad;
    public final ffbr ae;
    public final errm af;
    public final ffbr ag;
    public final errm ah;
    public final ffbr ai;
    public final ffbr aj;
    public final cmne ak;
    public final ffbr al;
    public final ffbr am;
    public final ffbr an;
    public final ffbr ao;
    public final dadg ap;
    public final ffbr aq;
    public final ffbr ar;
    public final ffbr as;
    public final ffbr at;
    public final ffbr au;
    public final ffbr av;
    public final comc aw;
    public final ffbr ax;
    public final ffbr ay;
    public final ffbr az;
    private final ffbr bA;
    private final ffbr bB;
    private final ffbr bC;
    private final ffbr bD;
    public final ffbr ba;
    public final ffbr bb;
    public final ffbr bc;
    public final ffbr bd;
    public final ffbr be;
    public final ffbr bf;
    public final ffbr bg;
    public final ffbr bh;
    public final ffbr bi;
    public final Optional bj;
    public final ffbr bk;
    public final ffbr bl;
    private final ffbr bn;
    private final ffbr bo;
    private final ffbr bp;
    private final ffbr bq;
    private final ffbr br;
    private final ffbr bs;
    private final ffbr bt;
    private final ffbr bu;
    private final ffbr bv;
    private final List bw = new ArrayList();
    private final ffbr bx;
    private final ffbr by;
    private final ffbr bz;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final cqoh l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final fazb p;
    public final ffbr q;
    public final ffbr r;
    public final ffbr s;
    public final ffbr t;
    public final ffbr u;
    public final ffbr v;
    public final ffbr w;
    public final Context x;
    public final ffbr y;
    public final ffbr z;

    static {
        bvmq bvmqVar = bvoy.c;
        d = new bvmr[]{bvoy.c.a, bvmqVar.b, bvmqVar.c, bvmqVar.d, bvmqVar.i, bvmqVar.j, bvmqVar.k, bvmqVar.p, bvmqVar.R};
    }

    public dauv(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, cqoh cqohVar, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, fazb fazbVar, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, Context context, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, errl errlVar, fazb fazbVar2, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, ffbr ffbrVar30, ffbr ffbrVar31, ffbr ffbrVar32, ffbr ffbrVar33, ffbr ffbrVar34, ffbr ffbrVar35, ffbr ffbrVar36, ffbr ffbrVar37, ffbr ffbrVar38, ffbr ffbrVar39, ffbr ffbrVar40, ffbr ffbrVar41, ffbr ffbrVar42, ffbr ffbrVar43, ffbr ffbrVar44, ffbr ffbrVar45, ffbr ffbrVar46, ffbr ffbrVar47, ffbr ffbrVar48, ffbr ffbrVar49, errm errmVar, ffbr ffbrVar50, ffbr ffbrVar51, errm errmVar2, ffbr ffbrVar52, ffbr ffbrVar53, ffbr ffbrVar54, cmne cmneVar, ffbr ffbrVar55, ffbr ffbrVar56, ffbr ffbrVar57, ffbr ffbrVar58, dadg dadgVar, ffbr ffbrVar59, ffbr ffbrVar60, ffbr ffbrVar61, ffbr ffbrVar62, ffbr ffbrVar63, ffbr ffbrVar64, ffbr ffbrVar65, ffbr ffbrVar66, ffbr ffbrVar67, ffbr ffbrVar68, ffbr ffbrVar69, ffbr ffbrVar70, ffbr ffbrVar71, ffbr ffbrVar72, ffbr ffbrVar73, ffbr ffbrVar74, ffbr ffbrVar75, ffbr ffbrVar76, ffbr ffbrVar77, errl errlVar2, ffbr ffbrVar78, ffbr ffbrVar79, ffbr ffbrVar80, ffbr ffbrVar81, ffbr ffbrVar82, ffbr ffbrVar83, ffbr ffbrVar84, ffbr ffbrVar85, ffbr ffbrVar86, ffbr ffbrVar87, ffbr ffbrVar88, ffbr ffbrVar89, ffbr ffbrVar90, ffbr ffbrVar91, ffbr ffbrVar92, ffbr ffbrVar93, ffbr ffbrVar94, ffbr ffbrVar95, ffbr ffbrVar96, ffbr ffbrVar97, ffbr ffbrVar98, ffbr ffbrVar99, ffbr ffbrVar100, ffbr ffbrVar101, ffbr ffbrVar102, ffbr ffbrVar103, ffbr ffbrVar104, ffbr ffbrVar105, ffbr ffbrVar106, ffbr ffbrVar107, ffbr ffbrVar108, ffbr ffbrVar109, ffbr ffbrVar110, ffbr ffbrVar111, ffbr ffbrVar112, Optional optional, ffbr ffbrVar113, ffbr ffbrVar114, ffbr ffbrVar115, ffbr ffbrVar116) {
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = ffbrVar7;
        this.l = cqohVar;
        this.m = ffbrVar8;
        this.n = ffbrVar9;
        this.o = ffbrVar10;
        this.p = fazbVar;
        this.q = ffbrVar11;
        this.r = ffbrVar12;
        this.s = ffbrVar13;
        this.t = ffbrVar14;
        this.u = ffbrVar15;
        this.v = ffbrVar16;
        this.w = ffbrVar17;
        this.x = context;
        this.y = ffbrVar18;
        this.z = ffbrVar19;
        this.A = ffbrVar20;
        this.B = ffbrVar21;
        this.C = ffbrVar22;
        this.D = ffbrVar23;
        this.bn = ffbrVar24;
        this.E = ffbrVar25;
        this.F = ffbrVar26;
        this.I = fazbVar2;
        this.G = ffbrVar27;
        this.H = errlVar;
        this.J = ffbrVar28;
        this.K = ffbrVar29;
        this.L = ffbrVar30;
        this.M = ffbrVar31;
        this.N = ffbrVar32;
        this.O = ffbrVar33;
        this.P = ffbrVar34;
        this.Q = ffbrVar35;
        this.R = ffbrVar36;
        this.S = ffbrVar37;
        this.T = ffbrVar38;
        this.U = ffbrVar39;
        this.V = ffbrVar40;
        this.W = ffbrVar41;
        this.X = ffbrVar42;
        this.Y = ffbrVar43;
        this.Z = ffbrVar44;
        this.aa = ffbrVar45;
        this.ab = ffbrVar46;
        this.ac = ffbrVar47;
        this.ad = ffbrVar48;
        this.ae = ffbrVar49;
        this.af = errmVar;
        this.bo = ffbrVar50;
        this.ag = ffbrVar51;
        this.ah = errmVar2;
        this.ai = ffbrVar52;
        this.aj = ffbrVar53;
        this.bp = ffbrVar54;
        this.ak = cmneVar;
        this.al = ffbrVar55;
        this.am = ffbrVar56;
        this.an = ffbrVar57;
        this.ao = ffbrVar58;
        this.ap = dadgVar;
        this.aq = ffbrVar59;
        this.ar = ffbrVar60;
        this.bq = ffbrVar61;
        this.as = ffbrVar62;
        this.at = ffbrVar63;
        this.br = ffbrVar64;
        this.au = ffbrVar65;
        this.av = ffbrVar66;
        comy comyVar = (comy) ffbrVar67.b();
        comu c2 = comv.c();
        c2.d(comb.REACTIONS_PROMO_DATA);
        c2.f(ves.a);
        this.aw = comyVar.a(c2.a());
        this.ax = ffbrVar68;
        this.ay = ffbrVar69;
        this.bs = ffbrVar70;
        this.bt = ffbrVar71;
        this.az = ffbrVar72;
        this.aA = ffbrVar73;
        this.aB = ffbrVar74;
        this.aC = ffbrVar75;
        this.aD = ffbrVar76;
        this.aE = ffbrVar77;
        this.aU = errlVar2;
        this.aF = ffbrVar78;
        this.aG = ffbrVar79;
        this.aH = ffbrVar80;
        this.bu = ffbrVar81;
        this.aV = ffbrVar82;
        this.aK = ffbrVar83;
        this.bv = ffbrVar84;
        this.aI = ffbrVar85;
        this.aJ = ffbrVar86;
        this.aW = ffbrVar87;
        this.aX = ffbrVar88;
        this.aL = ffbrVar90;
        this.aM = ffbrVar91;
        this.aN = ffbrVar92;
        this.aO = ffbrVar93;
        this.aP = ffbrVar89;
        this.aY = ffbrVar94;
        this.aZ = ffbrVar95;
        this.aQ = ffbrVar96;
        this.ba = ffbrVar97;
        this.aS = ffbrVar98;
        this.bx = ffbrVar99;
        this.bb = ffbrVar100;
        this.bd = ffbrVar101;
        this.be = ffbrVar102;
        this.by = ffbrVar103;
        this.bf = ffbrVar104;
        this.bz = ffbrVar105;
        this.bg = ffbrVar106;
        this.bh = ffbrVar107;
        this.bA = ffbrVar108;
        this.bi = ffbrVar109;
        this.aR = ffbrVar110;
        this.bB = ffbrVar111;
        this.bj = optional;
        this.bk = ffbrVar113;
        this.bc = ffbrVar112;
        this.bC = ffbrVar114;
        this.bl = ffbrVar115;
        this.bD = ffbrVar116;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aoku, java.lang.Object] */
    static final String C(ctwi ctwiVar) {
        Optional i = ctwiVar.i(false);
        return i.isEmpty() ? "" : emxe.b(i.get().h());
    }

    public static ConversationIdType h() {
        bsob e = bsom.e();
        e.z("getLastRcsOneToOneConversationId");
        e.i(new Function() { // from class: damv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                enru enruVar = dauv.c;
                bsolVar.J();
                bsolVar.j(0);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.e(new bsny(bsom.c.r, false));
        e.x(1);
        e.g(new Function() { // from class: damw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = dauv.c;
                return ((bskp) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bskr bskrVar = (bskr) e.b().o();
        try {
            ConversationIdType h = bskrVar.moveToFirst() ? bskrVar.h() : bdgq.a;
            bskrVar.close();
            return h;
        } catch (Throwable th) {
            try {
                bskrVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void l(dbiq dbiqVar, String str, CharSequence charSequence, String str2, String str3) {
        aeun.a(dbiqVar.a, new aevv(str, charSequence, str2, str3, null, null));
    }

    public static void n(ajwc ajwcVar, StringBuilder sb) {
        sb.append(Base64.encodeToString(cqjf.c(ajwcVar.a), 2));
        sb.append("\n  [");
        sb.append(ajwcVar.c.name());
        sb.append("]\n\n");
    }

    public static void p() {
        w(cszt.p);
        w(cszt.o);
        w(cszt.n);
        w(cszt.m);
        cfva cfvaVar = cszt.d;
        Double valueOf = Double.valueOf(eobe.a);
        s(cfvaVar, valueOf);
        s(cszt.j, valueOf);
        s(cszt.l, valueOf);
        s(cszt.f, valueOf);
        s(cszt.h, valueOf);
    }

    public static void s(cfva cfvaVar, Object obj) {
        cfvaVar.k(obj);
    }

    public static void t(Activity activity) {
        if (activity instanceof iy) {
            activity.invalidateOptionsMenu();
        }
    }

    public static void w(cfva cfvaVar) {
        cfvaVar.m();
    }

    public final void A(ctwi ctwiVar, final String str, final dauu dauuVar) {
        final int a = ctwiVar.a();
        axnw.i(elfo.g(new Callable() { // from class: dapn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ((chco) dauv.this.S.b()).g(a);
            }
        }, this.ah).i(new eroh() { // from class: dapp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((chbx) dauv.this.I.b()).b((String) obj);
            }
        }, erpp.a).i(new eroh() { // from class: dapq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                enru enruVar = dauv.c;
                return ((chbu) obj).p(str);
            }
        }, this.ah), new Consumer() { // from class: dapr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final Boolean bool = (Boolean) obj;
                enru enruVar = dauv.c;
                final dauu dauuVar2 = dauu.this;
                efbd.e(new Runnable() { // from class: darw
                    @Override // java.lang.Runnable
                    public final void run() {
                        enru enruVar2 = dauv.c;
                        dauu dauuVar3 = dauuVar2;
                        if (bool.booleanValue()) {
                            dauuVar3.b();
                        } else {
                            dauuVar3.a();
                        }
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, erpp.a);
    }

    public final void B(int i, int i2, int i3, int i4) {
        csjd csjdVar = new csjd();
        for (int i5 = 1; i5 <= i4; i5++) {
            csjdVar.add(new ConversationIdType(i5));
        }
        new daua(this, i, i2, i3, csjdVar).e(new Void[0]);
    }

    @Override // defpackage.dafa
    public final void a(Menu menu, boolean z) {
        b(menu, z, Optional.empty());
    }

    @Override // defpackage.dafa
    public final void b(final Menu menu, boolean z, final Optional optional) {
        this.bw.clear();
        Iterator it = ((Set) ((fbbb) this.bB).a).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((dbit) it.next()).a().a().iterator();
            if (it2.hasNext()) {
                throw null;
            }
        }
        if (((atkr) this.bA.b()).a()) {
            m(menu, "Database", new daur() { // from class: darz
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    enru enruVar = dauv.c;
                    Activity activity = dbiqVar.a;
                    eldl.p(activity, akuv.c(activity, DatabaseActivity.class, "android.intent.action.VIEW").a());
                }
            }, optional);
        }
        boolean z2 = ((aczg) this.aW.b()).b;
        if ((csjc.d() || csjc.i()) && ((asqj) this.bx.b()).a()) {
            m(menu, "Trigger MMS group upgrade", new daur() { // from class: daje
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    elfl c2;
                    final dauv dauvVar = dauv.this;
                    ((ddzb) dauvVar.Y.b()).l("Starting MMS group upgrade batch");
                    cktd cktdVar = (cktd) dauvVar.bb.b();
                    c2 = axol.c(cktdVar.b, ffhe.a, ffsm.a, new cktc(cktdVar, null));
                    axnw.h(c2.h(new emwl() { // from class: darl
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            Integer num = (Integer) obj;
                            ddzb ddzbVar = (ddzb) dauv.this.Y.b();
                            Objects.toString(num);
                            ddzbVar.l(String.valueOf(num).concat(" groups have been upgraded"));
                            return null;
                        }
                    }, dauvVar.H));
                }
            }, optional);
        }
        if (csjc.d()) {
            m(menu, "Trigger repair forked MMS groups", new daur() { // from class: dajq
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    ((ddzb) dauvVar.Y.b()).l("Starting repair forked MMS groups");
                    axnw.h(elfo.h(new erog() { // from class: daoq
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            elfl c2;
                            ckwi ckwiVar = (ckwi) dauv.this.bc.b();
                            ekzz f = eleg.f("RepairForkedMmsGroupSynclet#syncOnForeground");
                            try {
                                c2 = axol.c(ckwiVar.b, ffhe.a, ffsm.a, new ckwh(ckwiVar, null));
                                ffig.a(f, null);
                                return c2;
                            } finally {
                            }
                        }
                    }, dauvVar.ah));
                }
            }, optional);
        }
        optional.ifPresent(new Consumer() { // from class: dakc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final Activity activity = (Activity) obj;
                Optional optional2 = (Optional) dauv.this.an.b();
                final Menu menu2 = menu;
                optional2.ifPresent(new Consumer() { // from class: datd
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        enru enruVar = dauv.c;
                        ((daxk) obj2).a(menu2, activity);
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
        m(menu, "Android Id", new daur() { // from class: dako
            @Override // defpackage.daur
            public final void a(final dbiq dbiqVar) {
                final dauv dauvVar = dauv.this;
                axnw.i(elfo.g(new Callable() { // from class: darn
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Long.valueOf(digu.b(dauv.this.x.getContentResolver(), "android_id", 0L));
                    }
                }, dauvVar.ah), new Consumer() { // from class: dalm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        Long l = (Long) obj;
                        ((ClipboardManager) dbiqVar.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("AndroidId", Long.toString(l.longValue())));
                        ((ddzb) dauv.this.Y.b()).l(a.i(l, "Android Id: ", "\n(Copied to Clipboard)"));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, dauvVar.H);
            }
        }, optional);
        optional.ifPresent(new Consumer() { // from class: dalk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final Activity activity = (Activity) obj;
                Optional optional2 = (Optional) dauv.this.aG.b();
                final Menu menu2 = menu;
                optional2.ifPresent(new Consumer() { // from class: daps
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        enru enruVar = dauv.c;
                        ((dbnh) obj2).a(menu2, activity);
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
        SubMenu addSubMenu = menu.addSubMenu("RCS");
        m(addSubMenu, "Configure MobileConfiguration", new daur() { // from class: dasl
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((akvg) dauv.this.u.b()).ad(dbiqVar.a);
            }
        }, optional);
        m(addSubMenu, "Report RCS Connection State", new daur() { // from class: dasw
            @Override // defpackage.daur
            public final void a(final dbiq dbiqVar) {
                String str;
                elfl e;
                int appStandbyBucket;
                String valueOf;
                boolean isBackgroundRestricted;
                String valueOf2;
                final dauv dauvVar = dauv.this;
                try {
                    RcsProfileService rcsProfileService = (RcsProfileService) dauvVar.E.b();
                    str = rcsProfileService.isConnected() ? rcsProfileService.getRcsConfigAcsUrl() : "[not connected]";
                } catch (ehxg e2) {
                    ensk j = dauv.c.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "getFullRcsStatus", (char) 5591, "DebugUtilsImpl.java")).q("Failed to retrieve getRcsConfigAcsUrl");
                    str = "[exception]";
                }
                final int f = dauvVar.f();
                StringBuilder sb = new StringBuilder(250);
                sb.append(((clws) dauvVar.al.b()).g());
                sb.append("\nTransport: ");
                Set g = ((crgh) dauvVar.au.b()).g();
                if (g.size() > 1) {
                    sb.append((String) Collection.EL.stream(g).map(new Function() { // from class: daph
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            enru enruVar = dauv.c;
                            return ((crgf) obj).g;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(", ")));
                } else {
                    sb.append(((crgf) Collection.EL.stream(g).findFirst().orElse(crgf.a)).g);
                }
                sb.append("\nACS url: ");
                sb.append(str);
                sb.append("\nPCSCF: ");
                sb.append(((altk) dauvVar.r.b()).k(Optional.of(Integer.valueOf(f))));
                sb.append("\nSub Id: ");
                sb.append(f);
                ctwi j2 = dauvVar.j(f);
                if (j2 == null) {
                    e = elfo.e(sb.toString());
                } else {
                    sb.append("\nSIM Slot: ");
                    sb.append(j2.d() + 1);
                    sb.append("\nSIM Carrier: ");
                    sb.append(String.valueOf(j2.l()));
                    sb.append("\nSIM Number: ");
                    sb.append(dauv.C(j2));
                    boolean k = dkuy.k(dauvVar.x);
                    sb.append("\nRcs Apk: ");
                    sb.append(true == k ? "cs.apk" : "Bugle");
                    if (!k) {
                        sb.append("\nRcs BOE: ");
                        sb.append(true != dkvw.c(dauvVar.x) ? "Optimized" : "Exempted");
                        sb.append("\nGmsBinding: ");
                        sb.append(true != dkuy.e(dauvVar.x) ? "Disabled" : "Enabled");
                        if (Build.VERSION.SDK_INT >= 28) {
                            UsageStatsManager usageStatsManager = (UsageStatsManager) dauvVar.x.getSystemService("usagestats");
                            if (usageStatsManager == null) {
                                valueOf = "statsManager is null";
                            } else {
                                appStandbyBucket = usageStatsManager.getAppStandbyBucket();
                                valueOf = String.valueOf(appStandbyBucket);
                            }
                            sb.append("\nApp StandBy Bucket: ");
                            sb.append(valueOf);
                            ActivityManager activityManager = (ActivityManager) dauvVar.x.getSystemService("activity");
                            if (activityManager == null) {
                                valueOf2 = "activityManager is null";
                            } else {
                                isBackgroundRestricted = activityManager.isBackgroundRestricted();
                                valueOf2 = String.valueOf(isBackgroundRestricted);
                            }
                            sb.append("\nBackground Restricted: ");
                            sb.append(valueOf2);
                        }
                    }
                    if (((bzqc) dauvVar.ae.b()).g()) {
                        final String sb2 = sb.toString();
                        elfl g2 = elfo.g(new Callable() { // from class: dapi
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return ((chco) dauv.this.S.b()).g(f);
                            }
                        }, dauvVar.ah);
                        final bzqc bzqcVar = (bzqc) dauvVar.ae.b();
                        bzqcVar.getClass();
                        e = g2.i(new eroh() { // from class: dapj
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                return bzqc.this.e((String) obj);
                            }
                        }, dauvVar.ah).i(new eroh() { // from class: dapk
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                enru enruVar = dauv.c;
                                return elfo.e(sb2 + "\nEtouffee provisioned: " + ((Boolean) obj));
                            }
                        }, dauvVar.ah);
                    } else {
                        e = elfo.e(sb.toString().concat("\nEtouffee: disabled"));
                    }
                }
                final Activity activity = dbiqVar.a;
                axnw.i(e, new Consumer() { // from class: danz
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        String str2 = (String) obj;
                        enru enruVar = dauv.c;
                        ((ClipboardManager) dbiq.this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("RCS Connection State", str2));
                        new AlertDialog.Builder(activity).setTitle("RCS Connection State").setMessage(str2).setCancelable(true).show();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, dauvVar.H);
            }
        }, optional);
        m(addSubMenu, "Report Multi SIM RCS Connection State", new daur() { // from class: dati
            @Override // defpackage.daur
            public final void a(final dbiq dbiqVar) {
                final StringBuilder sb = new StringBuilder(250);
                final dauv dauvVar = dauv.this;
                elfl i = ((cort) dauvVar.aH.b()).b().i(new eroh() { // from class: daqq
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        Iterator it3 = ((Set) obj).iterator();
                        while (true) {
                            StringBuilder sb2 = sb;
                            if (!it3.hasNext()) {
                                return elfo.e(sb2.toString());
                            }
                            dauv dauvVar2 = dauv.this;
                            cosz coszVar = (cosz) ((cort) dauvVar2.aH.b()).j((djrm) it3.next()).get();
                            djtp f = ((dkcp) dauvVar2.at.b()).f(coszVar.c);
                            sb2.append("\nSIM ID: ");
                            sb2.append(coszVar.c);
                            sb2.append("\n\tRCS Connection State: ");
                            sb2.append(true != f.Y() ? "NOT AVAILABLE" : "CONNECTED");
                            sb2.append("\n\tTransport: ");
                            sb2.append(true != f.N() ? "Not Tachygram" : "Tachygram");
                            sb2.append("\n\tRCS State: ");
                            sb2.append(f.b());
                            sb2.append("\n\tRCS Config Version: ");
                            sb2.append(f.e());
                            sb2.append("\n\tSubId: ");
                            sb2.append(coszVar.d);
                            sb2.append("\n\tSim Slot: ");
                            sb2.append(coszVar.e);
                            sb2.append("\n\tSIM Operator: ");
                            sb2.append(coszVar.r);
                            sb2.append("\n\tSIM Phone Number: ");
                            sb2.append(coszVar.q);
                            sb2.append("\n");
                        }
                    }
                }, dauvVar.aU);
                final Activity activity = dbiqVar.a;
                axnw.i(i, new Consumer() { // from class: damk
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        String str = (String) obj;
                        enru enruVar = dauv.c;
                        ((ClipboardManager) dbiq.this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Multi SIM RCS Connection State", str));
                        new AlertDialog.Builder(activity).setTitle("Multi SIM RCS Connection State").setMessage(str).setCancelable(true).show();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, dauvVar.H);
            }
        }, optional);
        m(addSubMenu, true != ((csrv) this.U.b()).p ? "Emulate RCS temp failure" : "Stop emulating RCS temp failure", new daur() { // from class: datu
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((csrv) dauv.this.U.b()).p = !((csrv) r0.U.b()).p;
                dauv.t(dbiqVar.a);
            }
        }, optional);
        m(addSubMenu, true != ((csrv) this.U.b()).q ? "Emulate RCS perm failure" : "Stop emulating RCS perm failure", new daur() { // from class: dafh
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((csrv) dauv.this.U.b()).q = !((csrv) r0.U.b()).q;
                dauv.t(dbiqVar.a);
            }
        }, optional);
        m(addSubMenu, "Show RCS success popup", new daur() { // from class: daft
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final dauv dauvVar = dauv.this;
                try {
                    ((cort) dauvVar.aH.b()).f().ifPresent(new Consumer() { // from class: dalz
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            final cosz coszVar = (cosz) obj;
                            final dauv dauvVar2 = dauv.this;
                            elfo.f(new Runnable() { // from class: dapv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((cmel) dauv.this.aM.b()).k(coszVar.c, cmes.RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY);
                                }
                            }, dauvVar2.aU).k(axnw.b(), erpp.a);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    ((ejvp) dauvVar.aK.b()).a(elfo.e(null), "POPUP_KEY");
                } catch (coqa e) {
                    ensk i = dauv.c.i();
                    i.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionRcsProvisioningSuccess", (char) 3428, "DebugUtilsImpl.java")).q("failed to get default sim info");
                }
                Activity activity = dbiqVar.a;
                ensk e2 = dauv.c.e();
                e2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionRcsProvisioningSuccess", 3430, "DebugUtilsImpl.java")).q("provision notification: debug queued rcs success popup");
                ((diza) djai.t().s()).a.g(true);
                activity.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_SUCCESS_REQUEST));
            }
        }, optional);
        m(addSubMenu, "Show Google Tos popup", new daur() { // from class: dagf
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                ((ctyx) dauvVar.q.b()).h("should_show_google_tos_prompt", true);
                ((ctyx) dauvVar.q.b()).h("did_show_google_tos_prompt", false);
                ((ctyx) dauvVar.q.b()).h("USER_ACCEPTED_UPSELL", false);
                dbiqVar.a.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST));
            }
        }, optional);
        m(addSubMenu, "Show Legal FYI", new daur() { // from class: dagr
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                ((ctyx) dauvVar.q.b()).h("should_show_rcs_default_on_prompt", true);
                ((djup) dauvVar.aX.b()).c(cmeq.a);
                dbiqVar.a.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_LEGAL_FYI_REQUEST));
            }
        }, optional);
        m(addSubMenu, "Show provisioning status log", new daur() { // from class: dahe
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                new AlertDialog.Builder(dbiqVar.a).setTitle("Provisioning status log").setMessage(((ckds) dauv.this.w.b()).r()).setCancelable(true).show();
            }
        }, optional);
        m(addSubMenu, true != ((csrv) this.U.b()).s ? "Emulate Ignoring RCS IMDN" : "Stop Ignoring RCS IMDN", new daur() { // from class: dahq
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((csrv) dauv.this.U.b()).s = !((csrv) r0.U.b()).s;
                dauv.t(dbiqVar.a);
            }
        }, optional);
        m(addSubMenu, "Fail to deliver last incoming RCS message", new daur() { // from class: dahv
            @Override // defpackage.daur
            public final void a(final dbiq dbiqVar) {
                final dauv dauvVar = dauv.this;
                elfo.f(new Runnable() { // from class: dano
                    @Override // java.lang.Runnable
                    public final void run() {
                        bdhg bdhgVar;
                        dbiq dbiqVar2 = dbiqVar;
                        final ConversationIdType h = dbiqVar2.b.isPresent() ? ((bcqs) dbiqVar2.b.get()).e : dauv.h();
                        dauv dauvVar2 = dauv.this;
                        if (h.b()) {
                            ((ddzb) dauvVar2.Y.b()).l("Failed to find 1:1 rcs conversation");
                            return;
                        }
                        buxo d2 = MessagesTable.d();
                        d2.z("getLastReceivedRcsMessageId");
                        d2.f(new Function() { // from class: daor
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                enru enruVar = dauv.c;
                                return ((buum) obj).C;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        d2.h(new Function() { // from class: daos
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar = (buxz) obj;
                                enru enruVar = dauv.c;
                                buxzVar.m(ConversationIdType.this);
                                buxzVar.K(3);
                                buxzVar.af(100);
                                int[] iArr = {2, 3};
                                int intValue = MessagesTable.g().intValue();
                                if (intValue < 13020) {
                                    dtub.w("message_report_status", intValue);
                                }
                                buxzVar.aq(new dtrw("messages.message_report_status", 3, buxz.au(iArr), true));
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        d2.d(new buxl(MessagesTable.c.g, false));
                        d2.x(1);
                        buuo buuoVar = (buuo) d2.b().o();
                        try {
                            if (buuoVar.moveToFirst()) {
                                bdhgVar = buuoVar.r();
                                buuoVar.close();
                            } else {
                                buuoVar.close();
                                bdhgVar = null;
                            }
                            if (bdhg.j(bdhgVar)) {
                                ((ddzb) dauvVar2.Y.b()).l("Failed to find received rcs in conversation ".concat(h.toString()));
                                return;
                            }
                            ChatSessionReportEvent chatSessionReportEvent = new ChatSessionReportEvent(50071, bdhg.e(bdhgVar), bdhg.e(bdhgVar), 3);
                            Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
                            intent.putExtra(RcsIntents.EXTRA_EVENT, chatSessionReportEvent);
                            dkqd.c(dbiqVar2.a, intent);
                            intent.setPackage("com.google.android.apps.messaging");
                            dbiqVar2.a.sendBroadcast(intent);
                            ((ddzb) dauvVar2.Y.b()).l("Failed delivery report for Rcs Message " + bdhg.c(bdhgVar) + " in conversation " + h.toString());
                        } catch (Throwable th) {
                            try {
                                buuoVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, dauvVar.ah);
            }
        }, optional);
        m(addSubMenu, "Show Phone Number Input activity", new daur() { // from class: dahw
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                clzh clzhVar = (clzh) dauvVar.ay.b();
                clzhVar.a(((dkpm) dauvVar.as.b()).f(), clzhVar.b(5, 3).build()).k(axnw.b(), clzhVar.b);
                ((akvg) dauvVar.u.b()).Z(dbiqVar.a, ((dkpm) dauvVar.as.b()).f(), 5);
            }
        }, optional);
        if (z) {
            m(addSubMenu, "Networkside Fallback last RCS message", new daur() { // from class: dahy
                @Override // defpackage.daur
                public final void a(final dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    if (dbiqVar.b.isEmpty() || !((bcqs) dbiqVar.b.get()).m || !((bcqs) dbiqVar.b.get()).d.z()) {
                        ((ddzb) dauvVar.Y.b()).l("Cannot simulate network-side fallback. Not in a 1:1 RCS conversation");
                    }
                    axos.a(new Runnable() { // from class: dant
                        @Override // java.lang.Runnable
                        public final void run() {
                            dbiq dbiqVar2 = dbiqVar;
                            bcqs bcqsVar = (bcqs) dbiqVar2.b.get();
                            ConversationIdType conversationIdType = bcqsVar.e;
                            dauv dauvVar2 = dauv.this;
                            if (conversationIdType.b()) {
                                ((ddzb) dauvVar2.Y.b()).l("Failed to find 1:1 RCS conversation");
                                return;
                            }
                            ParticipantsTable.BindData a = bcqsVar.g.a();
                            a.getClass();
                            String U = a.U();
                            long j = ((typ) bcqsVar.d).l;
                            MessageCoreData g = dauvVar2.g(conversationIdType);
                            if (g == null) {
                                ((ddzb) dauvVar2.Y.b()).l("Failed to find undelivered message in conversation ".concat(conversationIdType.toString()));
                                return;
                            }
                            bdhg E = g.E();
                            if (E.i()) {
                                ((ddzb) dauvVar2.Y.b()).l("Failed to find undelivered rcs in conversation ".concat(conversationIdType.toString()));
                                return;
                            }
                            ChatSessionMessageEvent chatSessionMessageEvent = new ChatSessionMessageEvent(j, E.b, 0L, true != g.cY() ? 50044 : 50045, U, false);
                            Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
                            intent.putExtra(RcsIntents.EXTRA_EVENT, chatSessionMessageEvent);
                            dkqd.c(dbiqVar2.a, intent);
                            intent.setPackage("com.google.android.apps.messaging");
                            dbiqVar2.a.sendBroadcast(intent);
                            ((ddzb) dauvVar2.Y.b()).l("Report network-side fallback for Rcs Message " + bdhg.c(E) + " in conversation " + conversationIdType.toString());
                        }
                    }, dauvVar.ah);
                }
            }, optional);
        }
        SubMenu addSubMenu2 = addSubMenu.addSubMenu("Self-service messages");
        m(addSubMenu2, "Request reconfiguration", new daur() { // from class: dahz
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.o(eytd.REQUEST_RECONFIGURATION);
            }
        }, optional);
        m(addSubMenu2, "Send keep-alive", new daur() { // from class: daia
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.o(eytd.SEND_KEEPALIVE);
            }
        }, optional);
        m(addSubMenu2, "Reset Provisioning Engine", new daur() { // from class: daib
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.o(eytd.RESET_PROVISIONING_ENGINE);
            }
        }, optional);
        m(addSubMenu, "Force client to unregister", new daur() { // from class: daic
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((ckds) dauv.this.w.b()).u();
            }
        }, optional);
        m(addSubMenu, "Schedule Provisioning Task", new daur() { // from class: daid
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                dauvVar.ak.k(((dkpm) dauvVar.as.b()).f(), eqws.DEBUG_UTILS);
            }
        }, optional);
        m(addSubMenu, "Schedule Provisioning Task for All Eligible SIMs", new daur() { // from class: daie
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cmnf) dauv.this.aV.b()).d(eyxa.TRIGGER_UNKNOWN, eqws.DEBUG_UTILS);
            }
        }, optional);
        m(addSubMenu, "Cancel scheduled provisioning tasks", new daur() { // from class: daif
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.ak.a(eqws.DEBUG_UTILS).k(axnw.b(), erpp.a);
            }
        }, optional);
        m(addSubMenu, "Restart Provisioning Task", new daur() { // from class: daig
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.ak.c(eqws.DEBUG_UTILS).k(axnw.b(), erpp.a);
            }
        }, optional);
        if (((auna) this.bC.b()).a()) {
            m(addSubMenu, "Schedule Config Refresh for All SIMs", new daur() { // from class: daii
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    ((cmnf) dauv.this.aV.b()).c();
                }
            }, optional);
        }
        m(addSubMenu, "Start RCS stack", new daur() { // from class: daij
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.z(true);
            }
        }, optional);
        m(addSubMenu, "Stop RCS stack", new daur() { // from class: daik
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.z(false);
            }
        }, optional);
        m(addSubMenu, "Invalidate default RCS configuration", new daur() { // from class: dail
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                ((dkcp) dauvVar.at.b()).t(((dkpm) dauvVar.as.b()).f(), new Configuration());
            }
        }, optional);
        m(addSubMenu, "Invalidate all RCS configurations", new daur() { // from class: daim
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final dauv dauvVar = dauv.this;
                ((cort) dauvVar.aH.b()).b().h(new emwl() { // from class: daqg
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Iterator it3 = ((Set) obj).iterator();
                        while (it3.hasNext()) {
                            ((dkcp) dauv.this.at.b()).t(djrn.a((djrm) it3.next()).a, new Configuration());
                        }
                        return null;
                    }
                }, dauvVar.aU).k(axnw.b(), erpp.a);
            }
        }, optional);
        m(addSubMenu, "Toggle forced network single-reg capability exchanges", new daur() { // from class: dain
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                boolean booleanValue = ((Boolean) ajno.a.e()).booleanValue();
                dauv.s(ajno.a, Boolean.valueOf(!booleanValue));
                ((ddzb) dauv.this.Y.b()).l("Capability exchanges in single registration will now " + (true != booleanValue ? "" : "not ") + "always force a network exchange.");
            }
        }, optional);
        if (csjc.e()) {
            m(addSubMenu, "Enter E2EE group multiplier", new daur() { // from class: daio
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    Activity activity = dbiqVar.a;
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                    ScrollView scrollView = new ScrollView(activity);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    scrollView.addView(linearLayout);
                    scrollView.setFillViewport(true);
                    linearLayout.setOrientation(1);
                    builder.setView(scrollView);
                    linearLayout.addView(dbiqVar.b("Enter multiplier:"));
                    final dadg dadgVar = dauv.this.ap;
                    fazb fazbVar = dadgVar.e;
                    final EditText a = dbiqVar.a(1);
                    a.setHint(String.valueOf(((bzqa) fazbVar.b()).v()));
                    linearLayout.addView(a);
                    builder.setPositiveButton("Set", (DialogInterface.OnClickListener) null);
                    builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: dacy
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    AlertDialog create = builder.create();
                    create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: dacz
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(final DialogInterface dialogInterface) {
                            Button button = ((AlertDialog) dialogInterface).getButton(-1);
                            final dadg dadgVar2 = dadg.this;
                            final EditText editText = a;
                            button.setOnClickListener(new View.OnClickListener() { // from class: dadd
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    dadg dadgVar3 = dadg.this;
                                    EditText editText2 = editText;
                                    DialogInterface dialogInterface2 = dialogInterface;
                                    try {
                                        int parseInt = Integer.parseInt(editText2.getText().toString().trim());
                                        ((bzqa) dadgVar3.e.b()).g(parseInt);
                                        ((ddzb) dadgVar3.b.b()).l(a.h(parseInt, "Set multiplier = "));
                                        dialogInterface2.dismiss();
                                    } catch (RuntimeException e) {
                                        csjy.p("Bugle", e, "Failed to set multiplier.");
                                        ((ddzb) dadgVar3.b.b()).l("Failed to set multiplier.");
                                        dialogInterface2.dismiss();
                                    }
                                }
                            });
                        }
                    });
                    create.show();
                }
            }, optional);
        }
        SubMenu addSubMenu3 = menu.addSubMenu("App commands");
        m(addSubMenu3, "Dump Database", new daur() { // from class: daip
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                if (aslx.a()) {
                    ((dbjc) dauvVar.bh.b()).a(dbiqVar.a, aceq.NOT_REDACTED);
                } else {
                    ((dbjc) dauvVar.bh.b()).b(dbiqVar.a, false);
                }
            }
        }, optional);
        m(addSubMenu3, "Dump Database (Redacted)", new daur() { // from class: daiq
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                if (aslx.a()) {
                    ((dbjc) dauvVar.bh.b()).a(dbiqVar.a, aceq.REDACTED);
                } else {
                    ((dbjc) dauvVar.bh.b()).b(dbiqVar.a, true);
                }
            }
        }, optional);
        m(addSubMenu3, "Analyze Database", new daur() { // from class: dais
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dtub.e(((dtqy) bwlk.a()).b).y("ANALYZE");
                Toast.makeText(dauv.this.x, "ANALYZE completed", 1).show();
            }
        }, optional);
        m(addSubMenu3, "Dump WorkManager Database", new daur() { // from class: dait
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final Activity activity = dbiqVar.a;
                final File file = new File(activity.getNoBackupFilesDir(), "androidx.work.workdb");
                final File e = cflz.e(activity, "wm_db_copy.db");
                Runnable runnable = new Runnable() { // from class: daoj
                    @Override // java.lang.Runnable
                    public final void run() {
                        enru enruVar = dauv.c;
                        File file2 = file;
                        File file3 = e;
                        try {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                            try {
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                                try {
                                    eiru.a(bufferedInputStream, bufferedOutputStream);
                                    bufferedOutputStream.close();
                                    bufferedInputStream.close();
                                } finally {
                                }
                            } finally {
                            }
                        } catch (IOException e2) {
                            ensk i = dauv.c.i();
                            i.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) ((enrr) i).g(e2)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionDumpWorkManagerDatabase", (char) 6369, "DebugUtilsImpl.java")).q("error getting wm database");
                        }
                    }
                };
                dauv dauvVar = dauv.this;
                axnw.i(elfo.f(runnable, dauvVar.ah), new Consumer() { // from class: daou
                    public final /* synthetic */ String b = "wm_db_copy.db";

                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = dauv.c;
                        Activity activity2 = activity;
                        knt kntVar = new knt(activity2);
                        kntVar.c("Share Messages workmanager db");
                        kntVar.d("application/sql");
                        kntVar.b(cflz.d(activity2, this.b));
                        Intent a = kntVar.a();
                        a.setFlags(1);
                        eldl.p(activity2, a);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, dauvVar.H);
            }
        }, optional);
        if (aslx.a()) {
            m(addSubMenu3, "Dump db for Contacts Sync", new daur() { // from class: daiu
                @Override // defpackage.daur
                public final void a(final dbiq dbiqVar) {
                    AlertDialog.Builder message = new AlertDialog.Builder(dbiqVar.a).setTitle("Dump Messages database for contacts sync debugging").setMessage("This command will dump a partially redacted database that includes the phone numbers and/or email addresses used in Messages conversations, but all other PII (including names and message content) will be redacted.");
                    final dauv dauvVar = dauv.this;
                    message.setPositiveButton("Continue", new DialogInterface.OnClickListener() { // from class: danv
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ((dbjc) dauv.this.bh.b()).a(dbiqVar.a, aceq.c);
                        }
                    }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: danw
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            enru enruVar = dauv.c;
                            dialogInterface.dismiss();
                        }
                    }).show();
                }
            }, optional);
        }
        m(addSubMenu3, "Toggle Database Sounds", new daur() { // from class: daiv
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final dauv dauvVar = dauv.this;
                dauvVar.ah.submit(new Runnable() { // from class: dasi
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((ctyx) ((caxm) dauv.this.ba.b()).a.b()).g("sound_for_debug_plugin_enabled_key", !((ctyx) r0.a.b()).q("sound_for_debug_plugin_enabled_key", false));
                    }
                });
            }
        }, optional);
        m(addSubMenu3, "Dump messages to csv file", new daur() { // from class: daiw
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final Activity activity = dbiqVar.a;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                ScrollView scrollView = new ScrollView(activity);
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setPadding(20, 0, 20, 0);
                scrollView.addView(linearLayout);
                scrollView.setFillViewport(true);
                linearLayout.setOrientation(1);
                builder.setView(scrollView);
                builder.setTitle("Create csv file with messages from");
                final ArrayAdapter arrayAdapter = new ArrayAdapter(activity, R.layout.simple_spinner_dropdown_item, dave.a);
                final rt rtVar = new rt(activity);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 48, 0, 48);
                rtVar.setLayoutParams(layoutParams);
                rtVar.setAdapter((SpinnerAdapter) arrayAdapter);
                linearLayout.addView(rtVar);
                final MaterialCheckBox materialCheckBox = new MaterialCheckBox(dbiqVar.a);
                materialCheckBox.setText("Strip all digits");
                materialCheckBox.f(1);
                linearLayout.addView(materialCheckBox);
                final dauv dauvVar = dauv.this;
                builder.setPositiveButton("Create", new DialogInterface.OnClickListener() { // from class: dama
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dauv dauvVar2 = dauv.this;
                        CheckBox checkBox = materialCheckBox;
                        ArrayAdapter arrayAdapter2 = arrayAdapter;
                        rt rtVar2 = rtVar;
                        final Activity activity2 = activity;
                        try {
                            ((ddzb) dauvVar2.Y.b()).l("Generating the file.");
                            final ArrayList arrayList = new ArrayList();
                            if (checkBox.isChecked()) {
                                arrayList.add(new davd());
                            }
                            final dave daveVar = (dave) dauvVar2.P.b();
                            final davb davbVar = (davb) arrayAdapter2.getItem(rtVar2.getSelectedItemPosition());
                            davbVar.getClass();
                            axnw.i(elfl.g(elfo.g(new Callable() { // from class: dauy
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    ParticipantsTable.BindData bindData;
                                    Locale locale = Locale.US;
                                    davb davbVar2 = davbVar;
                                    String format = String.format(locale, "messages-%s.csv", davbVar2 == davb.SHORT_CODE ? "short-code" : "all");
                                    dave daveVar2 = dave.this;
                                    bdmq bdmqVar = (bdmq) daveVar2.d.b();
                                    List list = arrayList;
                                    ekzz f = eleg.f("MessageDatabaseOperations#getAllMessages");
                                    try {
                                        efbd.b();
                                        ArrayList<MessageCoreData> arrayList2 = new ArrayList();
                                        buxo d2 = MessagesTable.d();
                                        d2.z("getAllMessages");
                                        d2.d(new buxl(MessagesTable.c.i, true));
                                        buuo buuoVar = (buuo) d2.b().o();
                                        while (buuoVar.moveToNext()) {
                                            try {
                                                MessageCoreData a = ((byzp) bdmqVar.e.b()).a();
                                                a.aN(buuoVar);
                                                ((bdpt) bdmqVar.f.b()).c(a, false);
                                                bdmqVar.N(a);
                                                arrayList2.add(a);
                                            } finally {
                                            }
                                        }
                                        buuoVar.close();
                                        f.close();
                                        Map map = (Map) Collection.EL.stream(((bdrr) daveVar2.c.b()).g()).collect(endq.a(new Function() { // from class: dauw
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                return ((ParticipantsTable.BindData) obj).S();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }, new Function() { // from class: daux
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) obj;
                                                engw engwVar = dave.a;
                                                return bindData2;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }));
                                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(cflz.e(daveVar2.b, format)));
                                        try {
                                            outputStreamWriter.write("Sender,Message\n");
                                            for (MessageCoreData messageCoreData : arrayList2) {
                                                ArrayList arrayList3 = new ArrayList();
                                                arrayList3.add(new davc());
                                                if (!list.isEmpty()) {
                                                    arrayList3.addAll(list);
                                                }
                                                arrayList3.add(new dauz());
                                                String ar = messageCoreData.ar();
                                                if (!TextUtils.isEmpty(ar) && (bindData = (ParticipantsTable.BindData) map.get(messageCoreData.aA())) != null) {
                                                    String U = bindData.U();
                                                    if (davbVar2 != davb.SHORT_CODE || (aoqw.j(U) && !daveVar2.e.g(U))) {
                                                        Iterator it3 = arrayList3.iterator();
                                                        while (it3.hasNext()) {
                                                            ar = ((dava) it3.next()).a(ar);
                                                        }
                                                        outputStreamWriter.write(String.format("%s,\"%s\"\n", bindData.P(), ar));
                                                    }
                                                }
                                            }
                                            Uri d3 = cflz.d(daveVar2.b, format);
                                            outputStreamWriter.close();
                                            return d3;
                                        } catch (Throwable th) {
                                            try {
                                                outputStreamWriter.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            f.close();
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                        }
                                        throw th3;
                                    }
                                }
                            }, daveVar.f)), new Consumer() { // from class: dafw
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    Uri uri = (Uri) obj;
                                    enru enruVar = dauv.c;
                                    if (uri == null) {
                                        return;
                                    }
                                    Activity activity3 = activity2;
                                    knt kntVar = new knt(activity3);
                                    kntVar.c("Share Messages csv");
                                    kntVar.d("text/csv");
                                    kntVar.b(uri);
                                    Intent a = kntVar.a();
                                    a.setFlags(1);
                                    eldl.p(activity3, a);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, dauvVar2.H);
                        } catch (Exception e) {
                            ((ddzb) dauvVar2.Y.b()).l("Error: ".concat(String.valueOf(e.getMessage())));
                        }
                        dialogInterface.dismiss();
                    }
                });
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: damc
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        enru enruVar = dauv.c;
                        dialogInterface.dismiss();
                    }
                });
                builder.create().show();
            }
        }, optional);
        m(addSubMenu3, "Show Row Counts", new daur() { // from class: daix
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                bsob e = bsom.e();
                e.z("actionShowDatabaseRowCounts-conversations");
                e.r();
                int i = e.b().i();
                bvvn e2 = ParticipantsTable.e();
                e2.z("actionShowDatabaseRowCounts-participants");
                e2.r();
                int i2 = e2.b().i();
                buxo d2 = MessagesTable.d();
                d2.z("actionShowDatabaseRowCounts-messages");
                d2.r();
                d2.v(MessagesTable.c.j);
                d2.c(MessagesTable.c.j);
                d2.n(new dtzr("COUNT(*)"), "count");
                enhk enhkVar = (enhk) d2.b().D().collect(endq.a(new Function() { // from class: dapx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((MessagesTable.BindData) obj).l());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: dapy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        enru enruVar = dauv.c;
                        return Integer.valueOf(Integer.parseInt(((MessagesTable.BindData) obj).ay("count")));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                Integer num = (Integer) Collection.EL.stream(enhkVar.values()).reduce(0, new BinaryOperator() { // from class: daqa
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return Integer.valueOf(((Integer) obj).intValue() + ((Integer) obj2).intValue());
                    }
                });
                num.intValue();
                bwdf c2 = PartsTable.c();
                c2.z("actionShowDatabaseRowCounts-parts");
                c2.r();
                new AlertDialog.Builder(dbiqVar.a).setTitle("Database Item Counts").setMessage(String.format(Locale.US, "Conversations: %d\nParticipants: %d\nMessages: %d\nSMS Messages: %d\nMMS Messages: %d\nRCS Messages: %d\nTombstone Messages: %d\nMessage Parts: %d", Integer.valueOf(i), Integer.valueOf(i2), num, enhkVar.getOrDefault(0, 0), enhkVar.getOrDefault(1, 0), enhkVar.getOrDefault(3, 0), enhkVar.getOrDefault(5, 0), Integer.valueOf(c2.b().i()))).setCancelable(true).show();
            }
        }, optional);
        m(addSubMenu3, "Log Telephony Data", new daur() { // from class: daiy
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                Context context = (Context) ((acev) dauvVar.h.b()).a.b();
                context.getClass();
                elfl g = elfl.g(new LogTelephonyDatabaseAction(context).t());
                final Activity activity = dbiqVar.a;
                axnw.i(g, new Consumer() { // from class: daml
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = dauv.c;
                        Activity activity2 = activity;
                        knt kntVar = new knt(activity2);
                        kntVar.c("Share Telephony db");
                        kntVar.d("application/text");
                        kntVar.b((Uri) obj);
                        Intent a = kntVar.a();
                        a.setFlags(1);
                        eldl.p(activity2, a);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, dauvVar.H);
            }
        }, optional);
        m(addSubMenu3, "Create BackupDb", new daur() { // from class: daiz
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final dauv dauvVar = dauv.this;
                elfl h = elfo.h(new erog() { // from class: darp
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        elfl c2;
                        bbhs bbhsVar = (bbhs) dauv.this.aS.b();
                        bbim bbimVar = new bbim(true);
                        UUID randomUUID = UUID.randomUUID();
                        randomUUID.getClass();
                        c2 = axol.c(bbhsVar.g, ffhe.a, ffsm.a, new bbhr(bbhsVar, bbimVar, randomUUID, null));
                        return c2;
                    }
                }, dauvVar.ah);
                final Activity activity = dbiqVar.a;
                h.h(new emwl() { // from class: darq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        dauv dauvVar2 = dauv.this;
                        Context context = dauvVar2.x;
                        Activity activity2 = activity;
                        File file = (File) obj;
                        File e = cflz.e(context, "bugle_backup_db");
                        try {
                            file.getClass();
                            eoej.a(new FileInputStream(file), new FileOutputStream(e));
                            Uri d2 = cflz.d(dauvVar2.x, "bugle_backup_db");
                            knt kntVar = new knt(activity2);
                            kntVar.c("Share Backup db");
                            kntVar.d("application/sql");
                            kntVar.b(d2);
                            Intent a = kntVar.a();
                            a.setFlags(1);
                            eldl.p(activity2, a);
                            return null;
                        } catch (IOException e2) {
                            ensk j = dauv.c.j();
                            j.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionWriteBackup", (char) 2375, "DebugUtilsImpl.java")).q("Failed to copy BackupDb");
                            ((ddzb) dauvVar2.Y.b()).l("Failed to copy BackupDb");
                            return null;
                        }
                    }
                }, dauvVar.H).e(Throwable.class, new emwl() { // from class: darr
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        ensk h2 = dauv.c.h();
                        h2.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) ((enrr) h2).g(th)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionWriteBackup", (char) 2384, "DebugUtilsImpl.java")).q("Failed to create BackupDb");
                        ((ddzb) dauv.this.Y.b()).l("Failed to create BackupDb: ".concat(String.valueOf(th.getClass().getSimpleName())));
                        return null;
                    }
                }, dauvVar.H);
            }
        }, optional);
        m(addSubMenu3, "Restore Workflow History", new daur() { // from class: daja
            @Override // defpackage.daur
            public final void a(final dbiq dbiqVar) {
                final dauv dauvVar = dauv.this;
                final elfl h = elfo.h(new erog() { // from class: daqs
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        elfl c2;
                        ajyr ajyrVar = (ajyr) dauv.this.bf.b();
                        c2 = axol.c(ajyrVar.e, ffhe.a, ffsm.a, new ajxk(ajyrVar, null));
                        return c2;
                    }
                }, dauvVar.ah);
                final elfl h2 = elfo.h(new erog() { // from class: daqt
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        elfl c2;
                        ajyr ajyrVar = (ajyr) dauv.this.bf.b();
                        c2 = axol.c(ajyrVar.e, ffhe.a, ffsm.a, new ajxn(ajyrVar, null));
                        return c2;
                    }
                }, dauvVar.ah);
                elfo.m(h, h2).a(new Callable() { // from class: daqu
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        enru enruVar = dauv.c;
                        List list = (List) erqt.q(elfl.this);
                        List list2 = (List) erqt.q(h2);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Active Executions:\n");
                        Iterable$EL.forEach(list, new Consumer() { // from class: dape
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                dauv.n((ajwc) obj, sb);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        sb.append("\nInactive Executions:\n");
                        Iterable$EL.forEach(list2, new Consumer() { // from class: dapf
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                dauv.n((ajwc) obj, sb);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return sb.toString();
                    }
                }, dauvVar.af).h(new emwl() { // from class: daqv
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        enru enruVar = dauv.c;
                        return new AlertDialog.Builder(dbiq.this.a).setTitle("Restore Workflow Execution Ids").setMessage((String) obj).setCancelable(true).show();
                    }
                }, dauvVar.H);
            }
        }, optional);
        m(addSubMenu3, "Log Recurring Profile Data", new daur() { // from class: dajb
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                Optional optional2 = (Optional) dauvVar.L.b();
                if (optional2.isEmpty()) {
                    ((ddzb) dauvVar.Y.b()).l("Profile Metrics is not available in this build");
                    return;
                }
                final Activity activity = dbiqVar.a;
                dbls dblsVar = (dbls) optional2.get();
                axnw.i(axol.b(new dblr(dblsVar), dblsVar.a), new Consumer() { // from class: daqr
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = dauv.c;
                        new AlertDialog.Builder(activity).setTitle("Profile Recurring Metrics").setMessage((String) obj).setCancelable(true).show();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, dauvVar.H);
            }
        }, optional);
        m(addSubMenu3, "Force sync SMS", new daur() { // from class: dajf
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                ((ctyx) dauvVar.q.b()).k("last_full_sync_time_millis", -1L);
                ((coxg) dauvVar.m.b()).k(eqqh.DEBUG_UTILS);
            }
        }, optional);
        m(addSubMenu3, "Sync SMS", new daur() { // from class: dajg
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((coxg) dauv.this.m.b()).l(eqqh.DEBUG_UTILS);
            }
        }, optional);
        m(addSubMenu3, "Load SMS/MMS from dump file", new daur() { // from class: dajh
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                new daut("Bugle.Async.DebugUtils.showDebugOptions.LoadSmsMmsFromDumpFile.Duration", dbiqVar.a, "load", (csrv) dauv.this.U.b()).e(new Void[0]);
            }
        }, optional);
        m(addSubMenu3, "Email SMS/MMS dump file", new daur() { // from class: daji
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                new daut("Bugle.Async.DebugUtils.showDebugOptions.EmailSmsMmsDumpFile.Duration", dbiqVar.a, "email", (csrv) dauv.this.U.b()).e(new Void[0]);
            }
        }, optional);
        m(addSubMenu3, "Schedule Telemetry Alarm for now", new daur() { // from class: dajj
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                calendar.add(13, 10);
                dauv dauvVar = dauv.this;
                ((almw) dauvVar.t.b()).i(calendar);
                ((ddzb) dauvVar.Y.b()).l("Alarm to run soon (max couple mins). Confirm via logs.");
            }
        }, optional);
        m(addSubMenu3, "Run Recurring Telemetry Directly", new daur() { // from class: dajk
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                ((batn) ((almw) dauvVar.t.b()).H.b()).a().r(null);
                ((ddzb) dauvVar.Y.b()).l("Running recurring logging. Confirm via logs.");
            }
        }, optional);
        m(addSubMenu3, "Schedule reverse sync immediately", new daur() { // from class: dajl
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final dauv dauvVar = dauv.this;
                axnw.h(elfo.f(new Runnable() { // from class: daqp
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((cpvq) dauv.this.av.b()).a();
                    }
                }, dauvVar.ah));
            }
        }, optional);
        m(addSubMenu3, "Schedule incremental reverse sync immediately", new daur() { // from class: dajm
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final dauv dauvVar = dauv.this;
                axnw.h(elfo.f(new Runnable() { // from class: dami
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((cptk) dauv.this.aY.b()).a(null);
                    }
                }, dauvVar.ah));
            }
        }, optional);
        m(addSubMenu3, "Schedule Telephony Parts Charset update immediately", new daur() { // from class: dajn
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final dauv dauvVar = dauv.this;
                axnw.h(elfo.f(new Runnable() { // from class: danl
                    @Override // java.lang.Runnable
                    public final void run() {
                        cqmi cqmiVar = (cqmi) dauv.this.aZ.b();
                        ezgm ezgmVar = (ezgm) ezgn.a.createBuilder();
                        ezgmVar.getClass();
                        ezgi ezgiVar = (ezgi) ezgj.a.createBuilder();
                        ezgiVar.getClass();
                        eyfy build = ezgiVar.build();
                        build.getClass();
                        ezgmVar.copyOnWrite();
                        ezgn ezgnVar = (ezgn) ezgmVar.instance;
                        ezgnVar.c = (ezgj) build;
                        ezgnVar.b = 1;
                        eyfy build2 = ezgmVar.build();
                        build2.getClass();
                        eyfq builder = ((ezgn) build2).toBuilder();
                        builder.getClass();
                        axol.k(cqmiVar.c, null, new cqmh(cqmiVar, (ezgm) builder, null), 3);
                    }
                }, dauvVar.ah));
            }
        }, optional);
        m(addSubMenu3, "Capture bug report (PH controlled)", new daur() { // from class: dajp
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((akwl) dauv.this.T.b()).a("manual from Debug menu");
            }
        }, optional);
        m(addSubMenu3, true != ((csrv) this.U.b()).g ? "Turn on Class Zero test" : "Turn off Class 0 sms test", new daur() { // from class: dajr
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                boolean booleanValue = ((Boolean) csrv.b.e()).booleanValue();
                final dauv dauvVar = dauv.this;
                final Activity activity = dbiqVar.a;
                if (booleanValue) {
                    dauvVar.q(activity, "enableClassZeroSms", Boolean.toString(!((csrv) dauvVar.U.b()).g), new Runnable() { // from class: daly
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((csrv) dauv.this.U.b()).n();
                            dauv.t(activity);
                        }
                    }, null, null);
                } else {
                    ((csrv) dauvVar.U.b()).n();
                    dauv.t(activity);
                }
            }
        }, optional);
        m(addSubMenu3, "Trigger SMS Tickle", new daur() { // from class: dajs
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                ctwi j = dauvVar.j(dauvVar.f());
                if (j == null) {
                    ((ddzb) dauvVar.Y.b()).l("SMS tickle failed to get subscriptionUtils");
                    return;
                }
                ciii i = dauvVar.i(j);
                fcjv fcjvVar = (fcjv) fcjy.a.createBuilder();
                String str = i.a;
                fcjvVar.copyOnWrite();
                fcjy fcjyVar = (fcjy) fcjvVar.instance;
                str.getClass();
                fcjyVar.f = str;
                fcjvVar.copyOnWrite();
                ((fcjy) fcjvVar.instance).d = 1;
                fcjvVar.copyOnWrite();
                ((fcjy) fcjvVar.instance).g = "RCS";
                fgtg fgtgVar = fgtg.PHONE_NUMBER;
                fcjvVar.copyOnWrite();
                ((fcjy) fcjvVar.instance).e = fgtgVar.a();
                ((cfyh) dauvVar.aN.b()).a((fcjy) fcjvVar.build());
                ((ddzb) dauvVar.Y.b()).l("SMS tickle sent");
            }
        }, optional);
        m(addSubMenu3, true != crqw.b ? "Use local contact blocking" : "Revert to system contact blocking", new daur() { // from class: dajt
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                crqw crqwVar = (crqw) dauvVar.V.b();
                crqw.b = !crqw.b;
                if (crqw.b) {
                    crqwVar.b(false);
                }
                Activity activity = dbiqVar.a;
                ((ayfg) dauvVar.v.b()).g(activity);
                dauv.t(activity);
            }
        }, optional);
        m(addSubMenu3, "Send \"restore complete\" intent to myself", new daur() { // from class: daju
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dbiqVar.a.sendBroadcast(((cnjt) dauv.this.k.b()).d());
            }
        }, optional);
        m(addSubMenu3, true != ((csrv) this.U.b()).t ? "Emulate unknown SIM number" : "Stop emulating unknown SIM number", new daur() { // from class: dajv
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                ((csrv) dauvVar.U.b()).t = !((csrv) dauvVar.U.b()).t;
                ((bavz) dauvVar.j.b()).b().K();
                dauv.t(dbiqVar.a);
            }
        }, optional);
        m(addSubMenu3, "Mark conversation as Not Yet Delivered", new daur() { // from class: dajw
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                new daul(dauv.this, dbiqVar.b).e(new Void[0]);
            }
        }, optional);
        m(addSubMenu3, "Check device service state", new daur() { // from class: dajx
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ServiceState serviceState;
                String str;
                TelephonyManager telephonyManager = (TelephonyManager) dauv.this.x.getSystemService("phone");
                String str2 = "Error";
                if (telephonyManager == null) {
                    str = "Can't retrieve telephony manager!";
                } else {
                    serviceState = telephonyManager.getServiceState();
                    if (serviceState == null) {
                        str = "Service state is null!";
                    } else {
                        int state = serviceState.getState();
                        if (state == 0) {
                            str = "STATE_IN_SERVICE";
                        } else if (state == 1) {
                            str = "STATE_OUT_OF_SERVICE";
                        } else if (state == 2) {
                            str = "STATE_EMERGENCY_ONLY";
                        } else if (state != 3) {
                            str = "Unknown Service State: " + serviceState.getState();
                        } else {
                            str = "STATE_POWER_OFF";
                        }
                        str2 = "Service State";
                    }
                }
                new AlertDialog.Builder(dbiqVar.a).setTitle(str2).setMessage(str).setCancelable(true).show();
            }
        }, optional);
        m(addSubMenu3, "Test sendMessage", new daur() { // from class: dajy
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                chww chwwVar = (chww) dauvVar.ab.b();
                fcej fcejVar = (fcej) fcek.a.createBuilder();
                fgtg fgtgVar = fgtg.DITTO;
                fcejVar.copyOnWrite();
                ((fcek) fcejVar.instance).b = fgtgVar.a();
                fcejVar.copyOnWrite();
                ((fcek) fcejVar.instance).d = "Bugle";
                fcejVar.copyOnWrite();
                ((fcek) fcejVar.instance).c = "123";
                chwu c2 = chwwVar.c((fcek) fcejVar.build(), Optional.empty(), esaa.GET_UPDATES);
                c2.c = "12345";
                c2.b(erxi.a);
                c2.l = true;
                axnw.h(elfl.g(((chep) dauvVar.y.b()).a(c2.a())));
            }
        }, optional);
        m(addSubMenu3, "Enable happiness tracking survey", new daur() { // from class: daka
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.s(cszt.d, Double.valueOf(1.0d));
                dauv.this.r();
            }
        }, optional);
        m(addSubMenu3, "Enable Expressive Content HaTS", new daur() { // from class: dakb
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.p();
                dauv.s(cszt.h, Double.valueOf(1.0d));
                dauv dauvVar = dauv.this;
                dauvVar.r();
                ((csyy) dauvVar.aE.b()).a(dauvVar.l.f().toEpochMilli());
            }
        }, optional);
        m(addSubMenu3, "Enable XMS Group Message HaTS", new daur() { // from class: dakd
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.p();
                dauv.s(cszt.j, Double.valueOf(1.0d));
                dauv dauvVar = dauv.this;
                dauvVar.r();
                ((csyy) dauvVar.aE.b()).d(dauvVar.l.f().toEpochMilli());
            }
        }, optional);
        m(addSubMenu3, "Enable RCS Group Message HaTS", new daur() { // from class: dake
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.p();
                dauv.s(cszt.l, Double.valueOf(1.0d));
                dauv dauvVar = dauv.this;
                dauvVar.r();
                ((csyy) dauvVar.aE.b()).b(dauvVar.l.f().toEpochMilli());
            }
        }, optional);
        m(addSubMenu3, "Disable play store rating or happiness tracking survey", new daur() { // from class: dakf
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                enru enruVar = dauv.c;
                dauv.p();
            }
        }, optional);
        m(addSubMenu3, "Reset HaTS flags to defaults", new daur() { // from class: dakg
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                enru enruVar = dauv.c;
                dauv.w(cszt.p);
                dauv.w(cszt.o);
                dauv.w(cszt.n);
                dauv.w(cszt.m);
                dauv.w(cszt.q);
                dauv.w(cszt.d);
                dauv.w(cszt.j);
                dauv.w(cszt.l);
                dauv.w(cszt.f);
                dauv.w(cszt.h);
            }
        }, optional);
        m(addSubMenu3, "Test sharing a changing linked file", new daur() { // from class: dakh
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                Context context = dauv.this.x;
                String str = context.getFilesDir().getPath() + context.getPackageName() + "/";
                String valueOf = String.valueOf(context.getFilesDir().getPath());
                String concat = str.concat("fake-sound.jpg");
                dauq.a("rm ".concat(concat));
                dauq.a("ln -s /system/media/audio/ringtones/Triton.ogg ".concat(concat));
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setPackage("com.google.android.apps.messaging");
                intent.putExtra("android.intent.extra.STREAM", Uri.parse("file://".concat(concat)));
                intent.setType("image/*");
                eldl.p(context, intent);
                new Handler().postDelayed(new daup(concat, valueOf.concat("com.google.android.apps.messaging/").concat("shared_prefs/bugle.xml"), context), 3000L);
            }
        }, optional);
        m(addSubMenu3, true != ((csrv) this.U.b()).r ? "Enable mock Cequint" : "Disable mock Cequint", new daur() { // from class: daki
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                ((csrv) dauvVar.U.b()).r = !((csrv) dauvVar.U.b()).r;
                ((ddzb) dauvVar.Y.b()).l(true != ((csrv) dauvVar.U.b()).r ? "Mock Cequint disabled" : "Mock Cequint enabled");
                dauv.t(dbiqVar.a);
            }
        }, optional);
        m(addSubMenu3, "Create fake Telephony conversations...", new daur() { // from class: dakj
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final Activity activity = dbiqVar.a;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                ScrollView scrollView = new ScrollView(activity);
                LinearLayout linearLayout = new LinearLayout(activity);
                scrollView.addView(linearLayout);
                scrollView.setFillViewport(true);
                linearLayout.setOrientation(1);
                builder.setView(scrollView);
                linearLayout.addView(dbiqVar.b("Total Conversations"));
                final EditText a = dbiqVar.a(2);
                linearLayout.addView(a);
                final Optional optional2 = dbiqVar.b;
                if (optional2.isEmpty() || ((bcqs) optional2.get()).g.a() == null) {
                    a.setText("100");
                } else {
                    a.setVisibility(8);
                    a.setText("1");
                }
                final dauv dauvVar = dauv.this;
                linearLayout.addView(dbiqVar.b("Messages per conversation"));
                final EditText a2 = dbiqVar.a(2);
                a2.setText("10");
                linearLayout.addView(a2);
                TextView b = dbiqVar.b("Message text (tap for help)");
                b.setOnClickListener(new View.OnClickListener() { // from class: dalt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        enru enruVar = dauv.c;
                        Toast.makeText(activity, String.format(Locale.US, "%s\n%s\n%s", "$M substitutes for message count", "$C substitutes for conversation count", "$U substitutes for random UUID"), 1).show();
                    }
                });
                linearLayout.addView(b);
                final EditText a3 = dbiqVar.a(1);
                a3.setHint("Message X, conversation Y");
                linearLayout.addView(a3);
                final Calendar calendar = Calendar.getInstance();
                final DatePicker datePicker = new DatePicker(dauvVar.x);
                datePicker.setVisibility(8);
                datePicker.setPadding(20, 0, 0, 0);
                datePicker.setMaxDate(dauvVar.l.f().toEpochMilli());
                TextView b2 = dbiqVar.b("Message received date (tap to show/hide date picker)");
                b2.setOnClickListener(new View.OnClickListener() { // from class: dalu
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        enru enruVar = dauv.c;
                        DatePicker datePicker2 = datePicker;
                        if (datePicker2.isShown()) {
                            datePicker2.setVisibility(8);
                        } else {
                            datePicker2.setVisibility(0);
                        }
                    }
                });
                linearLayout.addView(b2);
                linearLayout.addView(datePicker);
                final TextView b3 = dbiqVar.b("Progress");
                linearLayout.addView(b3);
                final ProgressBar progressBar = new ProgressBar(linearLayout.getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setPadding(32, 16, 23, 16);
                linearLayout.addView(progressBar);
                builder.setPositiveButton("Create", (DialogInterface.OnClickListener) null);
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: dalv
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        enru enruVar = dauv.c;
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog create = builder.create();
                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: dalw
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        Button button = ((AlertDialog) dialogInterface).getButton(-1);
                        final dauv dauvVar2 = dauv.this;
                        final Optional optional3 = optional2;
                        final EditText editText = a;
                        final EditText editText2 = a2;
                        final EditText editText3 = a3;
                        final Calendar calendar2 = calendar;
                        final DatePicker datePicker2 = datePicker;
                        final Activity activity2 = activity;
                        final TextView textView = b3;
                        final ProgressBar progressBar2 = progressBar;
                        button.setOnClickListener(new View.OnClickListener() { // from class: damo
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v0, types: [damo] */
                            /* JADX WARN: Type inference failed for: r1v1 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int parseInt;
                                int parseInt2;
                                String str;
                                ParticipantsTable.BindData a4;
                                dauv dauvVar3 = this;
                                TextView textView2 = textView;
                                dauv dauvVar4 = dauv.this;
                                Optional optional4 = optional3;
                                EditText editText4 = editText;
                                EditText editText5 = editText2;
                                EditText editText6 = editText3;
                                Calendar calendar3 = calendar2;
                                DatePicker datePicker3 = datePicker2;
                                Activity activity3 = activity2;
                                ProgressBar progressBar3 = progressBar2;
                                try {
                                } catch (Exception e) {
                                    e = e;
                                    dauvVar3 = dauvVar4;
                                }
                                try {
                                    if (!optional4.isEmpty() && ((bcqs) optional4.get()).g.a() != null) {
                                        parseInt = 1;
                                        parseInt2 = Integer.parseInt(editText5.getText().toString());
                                        if (parseInt > 0 && parseInt2 > 0) {
                                            String obj = editText6.getText().toString();
                                            calendar3.set(datePicker3.getYear(), datePicker3.getMonth(), datePicker3.getDayOfMonth());
                                            long timeInMillis = calendar3.getTimeInMillis();
                                            Long valueOf = Long.valueOf(timeInMillis);
                                            ((ddzb) dauvVar4.Y.b()).l(String.format(Locale.US, "Creating %d conversations with %d messages each", Integer.valueOf(parseInt), Integer.valueOf(parseInt2)));
                                            str = null;
                                            if (optional4.isPresent() && (a4 = ((bcqs) optional4.get()).g.a()) != null) {
                                                str = bdqu.j(a4);
                                            }
                                            davk davkVar = (davk) dauvVar4.ai.b();
                                            Context applicationContext = activity3.getApplicationContext();
                                            valueOf.getClass();
                                            davkVar.d(applicationContext, parseInt, str, parseInt2, textView2, progressBar3, obj, timeInMillis, 25, 0L, (covs) dauvVar4.B.b(), dauvVar4.x);
                                            return;
                                        }
                                        ((ddzb) dauvVar4.Y.b()).l("Please provide positive values.");
                                        return;
                                    }
                                    if (parseInt > 0) {
                                        String obj2 = editText6.getText().toString();
                                        calendar3.set(datePicker3.getYear(), datePicker3.getMonth(), datePicker3.getDayOfMonth());
                                        long timeInMillis2 = calendar3.getTimeInMillis();
                                        Long valueOf2 = Long.valueOf(timeInMillis2);
                                        ((ddzb) dauvVar4.Y.b()).l(String.format(Locale.US, "Creating %d conversations with %d messages each", Integer.valueOf(parseInt), Integer.valueOf(parseInt2)));
                                        str = null;
                                        if (optional4.isPresent()) {
                                            str = bdqu.j(a4);
                                        }
                                        davk davkVar2 = (davk) dauvVar4.ai.b();
                                        Context applicationContext2 = activity3.getApplicationContext();
                                        valueOf2.getClass();
                                        davkVar2.d(applicationContext2, parseInt, str, parseInt2, textView2, progressBar3, obj2, timeInMillis2, 25, 0L, (covs) dauvVar4.B.b(), dauvVar4.x);
                                        return;
                                    }
                                    ((ddzb) dauvVar4.Y.b()).l("Please provide positive values.");
                                    return;
                                } catch (Exception e2) {
                                    e = e2;
                                    ((ddzb) dauvVar3.Y.b()).l("Error: ".concat(String.valueOf(e.getMessage())));
                                    return;
                                }
                                parseInt = Integer.parseInt(editText4.getText().toString());
                                parseInt2 = Integer.parseInt(editText5.getText().toString());
                            }
                        });
                    }
                });
                create.show();
            }
        }, optional);
        m(addSubMenu3, "Reset Link Previews to first view", new daur() { // from class: dakl
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                new daue(dauv.this, dbiqVar.a).e(new Void[0]);
            }
        }, optional);
        m(addSubMenu3, "Fire Too Many Jobs (crashes on purpose)", new daur() { // from class: dakm
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                for (int i = 0; i < 200; i++) {
                    dauv dauvVar = dauv.this;
                    ((bbfa) dauvVar.g.b()).a().y(Alert.DURATION_SHOW_INDEFINITELY - i, Action.r);
                }
            }
        }, optional);
        m(addSubMenu3, "Send G1 Restore Intent", new daur() { // from class: dakn
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                enru enruVar = dauv.c;
                Activity activity = dbiqVar.a;
                Intent intent = new Intent(activity, (Class<?>) GoogleOneRestoreService.class);
                intent.setAction("com.android.Bugle.intent.action.RESTORE_ACTION");
                activity.bindService(intent, new daum(activity), 1);
            }
        }, optional);
        m(addSubMenu3, "Fake telephony msg from number", new daur() { // from class: dakp
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.x(dbiqVar, true, true);
            }
        }, optional);
        m(addSubMenu3, "Add fake sim", new daur() { // from class: dakq
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final dauv dauvVar = dauv.this;
                final int i = dauvVar.aT;
                final int i2 = i + 2;
                dauvVar.aT = i + 1;
                dauvVar.ah.submit(eldl.l(new Runnable() { // from class: damt
                    @Override // java.lang.Runnable
                    public final void run() {
                        dauv dauvVar2 = dauv.this;
                        ctwb ctwbVar = (ctwb) dauvVar2.C.b();
                        String str = "1234567654321" + i;
                        StringBuilder sb = new StringBuilder("Fake sim ");
                        int i3 = i2;
                        sb.append(i3);
                        ctwbVar.u(i3, str, i3, sb.toString(), a.h(i3, "Fake carrier "), ((aolr) dauvVar2.aB.b()).c("425-555-1212", new emyl() { // from class: dafl
                            @Override // defpackage.emyl
                            public final Object get() {
                                enru enruVar = dauv.c;
                                return Optional.of("US");
                            }
                        }), i3, Optional.empty());
                        ((cbeq) dauvVar2.W.b()).c();
                    }
                }));
            }
        }, optional);
        m(addSubMenu3, "Clear Glide cache", new daur() { // from class: dakr
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                qpt b = qpt.b(dauvVar.x);
                b.h();
                new dauo(dauvVar, b).e(new Void[0]);
            }
        }, optional);
        m(addSubMenu3, "Trigger debug receiver", new daur() { // from class: daks
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                daev daevVar = new daev();
                IntentFilter intentFilter = new IntentFilter("com.google.android.apps.messaging.ui.debug.DebugReceiver");
                final dauv dauvVar = dauv.this;
                koa.g(dauvVar.x, daevVar, intentFilter);
                axnw.i(elfl.g(dauvVar.af.schedule(new Runnable() { // from class: dahx
                    public final /* synthetic */ String b = "com.google.android.apps.messaging.ui.debug.DebugReceiver";

                    @Override // java.lang.Runnable
                    public final void run() {
                        dauv.this.x.sendBroadcast(new Intent(this.b));
                    }
                }, 2L, TimeUnit.SECONDS)), new Consumer() { // from class: daih
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((ddzb) dauv.this.Y.b()).l("DebugReceiver triggered.");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, erpp.a);
                dbiqVar.a.finish();
            }
        }, optional);
        m(addSubMenu3, "Show a specific message's annotations", new daur() { // from class: dakt
            @Override // defpackage.daur
            public final void a(final dbiq dbiqVar) {
                Activity activity = dbiqVar.a;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                ScrollView scrollView = new ScrollView(activity);
                LinearLayout linearLayout = new LinearLayout(activity);
                scrollView.addView(linearLayout);
                scrollView.setFillViewport(true);
                linearLayout.setOrientation(1);
                builder.setView(scrollView);
                linearLayout.addView(dbiqVar.b("Get Annotations for Message"));
                linearLayout.addView(dbiqVar.c());
                linearLayout.addView(dbiqVar.b("Message Id"));
                final EditText a = dbiqVar.a(1);
                a.setHint("Id of the message. Get it by: Long-click the message > Overflow menu > View details.");
                linearLayout.addView(a);
                final dauv dauvVar = dauv.this;
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: damm
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dauv dauvVar2 = dauv.this;
                        EditText editText = a;
                        dbiq dbiqVar2 = dbiqVar;
                        try {
                            final MessageIdType b = bdhb.b(editText.getText().toString());
                            final Activity activity2 = dbiqVar2.a;
                            axnw.h(elfo.g(new Callable() { // from class: danr
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    enru enruVar = dauv.c;
                                    btta b2 = bttf.b();
                                    b2.z("getSpecificMessageAnnotations");
                                    final MessageIdType messageIdType = MessageIdType.this;
                                    b2.f(new Function() { // from class: daqh
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            btte btteVar = (btte) obj;
                                            enru enruVar2 = dauv.c;
                                            btteVar.e(MessageIdType.this);
                                            return btteVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    btsn btsnVar = (btsn) b2.b().o();
                                    try {
                                        engw cW = btsnVar.cW();
                                        btsnVar.close();
                                        return cW;
                                    } catch (Throwable th) {
                                        try {
                                            btsnVar.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            }, dauvVar2.ah).h(new emwl() { // from class: dans
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    engw engwVar = (engw) obj;
                                    enru enruVar = dauv.c;
                                    Activity activity3 = activity2;
                                    if (engwVar == null || engwVar.isEmpty()) {
                                        new AlertDialog.Builder(activity3).setTitle("No annotations").setMessage(String.format("Message %s doesn't exist or has no annotations.", b)).setCancelable(true).show();
                                    } else {
                                        String join = TextUtils.join("\n--\n", Collection.EL.stream(engwVar).map(new Function() { // from class: daoe
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                btrw btrwVar = (btrw) obj2;
                                                enru enruVar2 = dauv.c;
                                                String join2 = TextUtils.join("\n", engw.t("Conversation Id: ".concat(String.valueOf(String.valueOf(btrwVar.l()))), "Message Id: ".concat(String.valueOf(String.valueOf(btrwVar.m()))), "Type: " + btrwVar.k()));
                                                fbuk n = btrwVar.n();
                                                if (n == null || n.c != 2) {
                                                    return join2;
                                                }
                                                String valueOf = String.valueOf(((fbva) n.d).b);
                                                return TextUtils.join("\n", engw.u(join2, "OTP code: ".concat(valueOf), "Start index: " + n.h, "End index: " + n.i));
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).toArray());
                                        ((ClipboardManager) activity3.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Annotation", join));
                                        new AlertDialog.Builder(activity3).setTitle("Annotations").setMessage(join).setCancelable(true).show();
                                    }
                                    return true;
                                }
                            }, dauvVar2.H));
                        } catch (Exception e) {
                            ((ddzb) dauvVar2.Y.b()).l("Failed to show specific message annotations: ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: damn
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        enru enruVar = dauv.c;
                        dialogInterface.dismiss();
                    }
                });
                builder.create().show();
            }
        }, optional);
        if (!csjc.g()) {
            m(addSubMenu3, "Dump example store iteration...", new daur() { // from class: daku
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    dauv dauvVar = dauv.this;
                    Optional optional2 = (Optional) ((fbbb) dauvVar.am).a;
                    if (optional2.isPresent()) {
                        ((decx) optional2.get()).a();
                    } else {
                        ((ddzb) dauvVar.Y.b()).l("Example store debug menu not available in this build");
                    }
                }
            }, optional);
        }
        m(addSubMenu3, "Force import contacts data", new daur() { // from class: dakw
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                axvj axvjVar = (axvj) dauvVar.aQ.b();
                axol.k(axvjVar.a, null, new axvi(axvjVar, null), 3);
                ((ddzb) dauvVar.Y.b()).l("Scheduling immediate contacts import");
            }
        }, optional);
        if (((atfe) this.bD.b()).a()) {
            m(addSubMenu3, "Force sync work contacts data", new daur() { // from class: dakx
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    String str;
                    final ffhx ffhxVar = ayee.c;
                    CharSequence[] charSequenceArr = new CharSequence[ffhxVar.a()];
                    for (int i = 0; i < ffhxVar.a(); i++) {
                        int ordinal = ((ayee) ffhxVar.get(i)).ordinal();
                        if (ordinal == 0) {
                            str = "Full";
                        } else {
                            if (ordinal != 1) {
                                throw null;
                            }
                            str = "Incremental";
                        }
                        charSequenceArr[i] = str;
                    }
                    final dauv dauvVar = dauv.this;
                    new AlertDialog.Builder(dbiqVar.a).setTitle("Sync Type:").setSingleChoiceItems(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: daqy
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            elfl c2;
                            ayee ayeeVar = (ayee) ffhxVar.get(i2);
                            final dauv dauvVar2 = dauv.this;
                            ayeg ayegVar = (ayeg) dauvVar2.bl.b();
                            ayeeVar.getClass();
                            c2 = axol.c(ayegVar.a, ffhe.a, ffsm.a, new ayef(ayegVar, ayeeVar, null));
                            axnw.i(c2.e(Throwable.class, new emwl() { // from class: dato
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    dauv dauvVar3 = dauv.this;
                                    ((cins) dauvVar3.e.b()).X(ephv.DEBUG_ISSUE, dauvVar3.x.getString(com.google.android.apps.messaging.R.string.report_contact_sync_issue));
                                    return false;
                                }
                            }, erpp.a), new Consumer() { // from class: datz
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    dauv dauvVar3 = dauv.this;
                                    if (booleanValue) {
                                        dauvVar3.u("Work contacts sync finished.");
                                    } else {
                                        dauvVar3.u("Sync failed to start. See go/am-work-contacts-sync.");
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, erpp.a);
                            dialogInterface.dismiss();
                        }
                    }).setCancelable(true).show();
                }
            }, optional);
        }
        if (!csjc.g()) {
            m(addSubMenu3, "Force birthday sync from contacts", new daur() { // from class: daky
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    dauv dauvVar = dauv.this;
                    Optional optional2 = (Optional) ((fbbb) dauvVar.aA).a;
                    if (optional2.isPresent()) {
                        ((aish) optional2.get()).a();
                    } else {
                        ((ddzb) dauvVar.Y.b()).l("Birthday Sync is not available in this build");
                    }
                }
            }, optional);
        }
        m(addSubMenu3, "Reset reactions promo", new daur() { // from class: dakz
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                emwl emwlVar = new emwl() { // from class: daqb
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ves vesVar = (ves) obj;
                        enru enruVar = dauv.c;
                        ver verVar = (ver) vesVar.toBuilder();
                        verVar.copyOnWrite();
                        ves vesVar2 = (ves) verVar.instance;
                        vesVar2.b |= 4;
                        vesVar2.e = false;
                        verVar.copyOnWrite();
                        ves vesVar3 = (ves) verVar.instance;
                        vesVar3.b |= 2;
                        vesVar3.d = 0;
                        boolean z3 = !vesVar.c;
                        verVar.copyOnWrite();
                        ves vesVar4 = (ves) verVar.instance;
                        vesVar4.b |= 1;
                        vesVar4.c = z3;
                        return (ves) verVar.build();
                    }
                };
                final dauv dauvVar = dauv.this;
                dauvVar.aw.j(emwlVar).k(axnw.c(new Consumer() { // from class: daqc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        dauv.this.v("Promo is reset.".concat(true != ((ves) obj).c ? "" : "  EXISTING REACTTIONS IGNORED"));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }), erpp.a);
            }
        }, optional);
        if (((Optional) this.ax.b()).isPresent()) {
            m(addSubMenu3, "Reset double tap to react promo", new daur() { // from class: dala
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    ((Optional) dauv.this.ax.b()).ifPresent(new Consumer() { // from class: daog
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            enru enruVar = dauv.c;
                            aaja aajaVar = (aaja) ((aajd) obj).a.b();
                            axol.k(aajaVar.a, null, new aaix(aajaVar, null), 3);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }, optional);
        }
        m(addSubMenu3, "Trigger dangling MMS parts cleanup", new daur() { // from class: dalb
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(dbiqVar.a);
                dauv dauvVar = dauv.this;
                final ListenableFuture f = ((ejtr) dauvVar.aC.b()).f(Telephony.MmsSms.CONTENT_URI, new Bundle());
                elfo.m(f).a(new Callable() { // from class: daqi
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        enru enruVar = dauv.c;
                        Bundle bundle = (Bundle) erqt.q(ListenableFuture.this);
                        StringBuilder sb = new StringBuilder();
                        if (bundle == null) {
                            sb.append("NULL bundle result. Requires sdk U+");
                        } else {
                            sb.append("Number of part files: ");
                            sb.append(bundle.getInt("part_file_count"));
                            sb.append("\nNumber of MMS parts: ");
                            sb.append(bundle.getInt("part_table_entry_count"));
                            sb.append("\nNumber of dangling files to delete: ");
                            sb.append(bundle.getInt("deleted_count"));
                            sb.append("\n");
                        }
                        AlertDialog.Builder builder2 = builder;
                        builder2.setTitle("Dangling MMS Parts Results");
                        builder2.setMessage(sb.toString());
                        builder2.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: damy
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                enru enruVar2 = dauv.c;
                                dialogInterface.dismiss();
                            }
                        });
                        ensk e = dauv.c.e();
                        e.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionDanglingMmsPartsCleanup", 2744, "DebugUtilsImpl.java")).t("Dangling MMS Parts Results: %s", sb);
                        return null;
                    }
                }, dauvVar.ah).h(new emwl() { // from class: daqj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        enru enruVar = dauv.c;
                        builder.create().show();
                        return null;
                    }
                }, dauvVar.H);
            }
        }, optional);
        m(addSubMenu3, true != ((csrv) this.U.b()).h ? "Immediately \"go foreground\" on AsyncBroadcastReceivers" : "Restore \"go foreground\" timer on AsyncBroadcastReceivers", new daur() { // from class: dalc
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                boolean booleanValue = ((Boolean) csrv.b.e()).booleanValue();
                final dauv dauvVar = dauv.this;
                final Activity activity = dbiqVar.a;
                if (booleanValue) {
                    dauvVar.q(activity, "enableGoForegroundImmediately", Boolean.toString(!((csrv) dauvVar.U.b()).h), new Runnable() { // from class: daoh
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((csrv) dauv.this.U.b()).o();
                            dauv.t(activity);
                        }
                    }, null, null);
                } else {
                    ((csrv) dauvVar.U.b()).o();
                    dauv.t(activity);
                }
            }
        }, optional);
        m(addSubMenu3, "Conversation Participants History", new daur() { // from class: dald
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r19v1 */
            /* JADX WARN: Type inference failed for: r19v10 */
            /* JADX WARN: Type inference failed for: r19v11 */
            /* JADX WARN: Type inference failed for: r19v12 */
            /* JADX WARN: Type inference failed for: r19v2 */
            /* JADX WARN: Type inference failed for: r19v4 */
            /* JADX WARN: Type inference failed for: r19v5 */
            /* JADX WARN: Type inference failed for: r19v6 */
            /* JADX WARN: Type inference failed for: r19v7 */
            /* JADX WARN: Type inference failed for: r19v8 */
            /* JADX WARN: Type inference failed for: r19v9 */
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                Object apply;
                java.util.Collection collection;
                engw g;
                final Activity activity;
                erna ernaVar;
                final ConversationIdType conversationIdType = (ConversationIdType) dbiqVar.b.map(new dajz()).orElse(dauv.h());
                bruu a = brux.a();
                a.z("actionGetConversationsPartAuditLogTable");
                a.c(new Function() { // from class: dakv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bruw bruwVar = (bruw) obj;
                        enru enruVar = dauv.c;
                        bruwVar.b(ConversationIdType.this);
                        return bruwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                engw y = a.b().y();
                final Set set = (Set) Collection.EL.stream(y).map(new Function() { // from class: dalf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        enru enruVar = dauv.c;
                        return Long.toString(((brti) obj).k());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.b);
                bvov a2 = bvoy.a();
                a2.z("actionGetConversationsPartAuditLogTable");
                bvmr[] bvmrVarArr = dauv.d;
                int intValue = bvoy.c().intValue();
                int length = bvmrVarArr.length;
                final dauv dauvVar = dauv.this;
                for (int i = 0; i < 9; i++) {
                    if (((Integer) bvoy.b.getOrDefault(bvmrVarArr[i].toString(), -1)).intValue() > intValue) {
                        dtub.w("columnReference.toString()", intValue);
                    }
                }
                a2.m(bvmrVarArr);
                apply = new Function() { // from class: dalq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvox bvoxVar = (bvox) obj;
                        enru enruVar = dauv.c;
                        bvoxVar.aq(new dtrw("participants_audit_log.participant_id", 3, bvox.at(set), false));
                        return bvoxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new bvox());
                a2.k(new bvow((bvox) apply));
                Stream map = Collection.EL.stream(a2.b().y()).map(new Function() { // from class: damb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvir bvirVar = (bvir) obj;
                        bvirVar.getClass();
                        String b = dabw.b(bvoy.c.a);
                        bvirVar.az(3, "participant_id");
                        String b2 = dabw.b(bvoy.c.i);
                        bvirVar.az(8, "normalized_destination");
                        String b3 = dabw.b(bvoy.c.j);
                        bvirVar.az(9, "send_destination");
                        String b4 = dabw.b(bvoy.c.k);
                        bvirVar.az(10, "display_destination");
                        String b5 = dabw.b(bvoy.c.p);
                        bvirVar.az(15, "full_name");
                        Map g2 = ffew.g(new ffcf(b, bvirVar.d), new ffcf(b2, bvirVar.i), new ffcf(b3, bvirVar.j), new ffcf(b4, bvirVar.k), new ffcf(b5, bvirVar.p));
                        bvirVar.az(0, "_id");
                        String str = bvirVar.a;
                        str.getClass();
                        long parseLong = Long.parseLong(str);
                        bvirVar.az(1, "operation_datetime");
                        Instant instant = bvirVar.b;
                        instant.getClass();
                        dabz dabzVar = dabz.a;
                        bvirVar.az(2, "operation_type");
                        dabz a3 = daby.a(bvirVar.c);
                        bvirVar.az(43, "last_modified_by_key");
                        bdpy bdpyVar = bvirVar.R;
                        bdpyVar.getClass();
                        return new dabx("participants_audit_log", parseLong, instant, a3, bdpyVar, g2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i2 = engw.d;
                engw engwVar = (engw) Stream.CC.concat(Collection.EL.stream((engw) map.collect(endq.a)), Collection.EL.stream((engw) Collection.EL.stream(y).map(new Function() { // from class: damg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brti brtiVar = (brti) obj;
                        brtiVar.getClass();
                        String a3 = dabw.a(brux.b.a);
                        brtiVar.az(3, "conversation_participants_id");
                        String a4 = dabw.a(brux.b.e);
                        brtiVar.az(4, "conversation_id");
                        Map g2 = ffew.g(new ffcf(a3, brtiVar.d), new ffcf(a4, brtiVar.e), new ffcf(dabw.a(brux.b.f), Long.valueOf(brtiVar.k())));
                        brtiVar.az(0, "_id");
                        String str = brtiVar.a;
                        str.getClass();
                        long parseLong = Long.parseLong(str);
                        brtiVar.az(1, "operation_datetime");
                        Instant instant = brtiVar.b;
                        instant.getClass();
                        dabz dabzVar = dabz.a;
                        brtiVar.az(2, "operation_type");
                        dabz a5 = daby.a(brtiVar.c);
                        brtiVar.az(8, "last_modified_by_key");
                        bdpy bdpyVar = brtiVar.i;
                        bdpyVar.getClass();
                        return new dabx("conversation_participants_audit_log", parseLong, instant, a5, bdpyVar, g2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.a))).sorted(Comparator.CC.comparing(new Function() { // from class: damr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((dabx) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })).collect(endq.a);
                String str = "Export the csv for conversation id: " + conversationIdType + "\nWarning: The participant destinations in this file are accurate as of the time when this file was created, and are not necessarily the same as when the changes represented in this file occurred.";
                engr engrVar = new engr();
                ?? r19 = "last modified by key";
                String[] strArr = {"table name", "row id", "operation datetime", "operation datetime in local device", "operation type", "last modified by key", "row data", "\n"};
                StringWriter stringWriter = new StringWriter();
                try {
                    int i3 = erna.d;
                    ernaVar = new erna(stringWriter, ernb.c);
                } catch (IOException e) {
                    e = e;
                    r19 = engwVar;
                }
                try {
                    try {
                        boolean z3 = true;
                        for (String str2 : Arrays.asList((String[]) Arrays.copyOf(strArr, 8))) {
                            if (!z3) {
                                ernaVar.a.write(44);
                            }
                            Writer writer = ernaVar.a;
                            ermz ermzVar = ernaVar.c;
                            if (str2 == null) {
                                str2 = "";
                                r19 = engwVar;
                            } else if (str2.indexOf(34) != -1) {
                                int length2 = str2.length();
                                StringBuilder sb = new StringBuilder(length2 + length2 + 2);
                                sb.append('\"');
                                r19 = engwVar;
                                int i4 = 0;
                                while (true) {
                                    try {
                                        int indexOf = str2.indexOf(34, i4);
                                        if (indexOf == -1) {
                                            break;
                                        }
                                        int i5 = indexOf + 1;
                                        sb.append(str2.substring(i4, i5));
                                        sb.append('\"');
                                        i4 = i5;
                                    } catch (Throwable th) {
                                        th = th;
                                        Throwable th2 = th;
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            ffig.a(ernaVar, th2);
                                            throw th3;
                                        }
                                    }
                                }
                                sb.append(str2.substring(i4));
                                sb.append('\"');
                                str2 = sb.toString();
                            } else {
                                r19 = engwVar;
                                if (ermzVar.a.i(str2) && str2.indexOf(44) == -1) {
                                    if (str2.indexOf(45) == 0 && str2.length() > 1) {
                                        int i6 = 1;
                                        while (i6 < str2.length() && !Character.isDigit(str2.charAt(i6)) && !ernb.b.c(str2.charAt(i6))) {
                                            i6++;
                                        }
                                        if (i6 == str2.length() || (i6 > 1 && !emvy.b.c(str2.charAt(i6 - 1)))) {
                                            str2 = " ".concat(str2);
                                        }
                                    }
                                }
                                str2 = a.a(str2, "\"", "\"");
                            }
                            writer.write(str2);
                            engwVar = r19;
                            z3 = false;
                        }
                        r19 = engwVar;
                        ernaVar.a.write(ernaVar.b);
                        ernaVar.flush();
                        ffig.a(ernaVar, null);
                        collection = r19;
                    } catch (IOException e2) {
                        e = e2;
                        csjb e3 = dacg.a.e();
                        e3.I("IOException converting audit log line to CSV");
                        e3.s(e);
                        collection = r19;
                        String stringWriter2 = stringWriter.toString();
                        stringWriter2.getClass();
                        engrVar.h(stringWriter2);
                        engrVar.j((Iterable) Collection.EL.stream(collection).map(new Function() { // from class: danb
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((dabx) obj).toString();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(endq.a));
                        g = engrVar.g();
                        activity = dbiqVar.a;
                        final FileWriter fileWriter = new FileWriter(cflz.e(activity, "conversation_participants_history.csv"));
                        try {
                            Iterable$EL.forEach(g, new Consumer() { // from class: dann
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    try {
                                        fileWriter.write(a.v((String) obj, "\n"));
                                    } catch (IOException e4) {
                                        ((ddzb) dauv.this.Y.b()).l("Error writing to dump file: ".concat(String.valueOf(e4.getMessage())));
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            fileWriter.close();
                            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                            builder.setTitle("Conversation Participants History").setMessage(str).setCancelable(true);
                            builder.setPositiveButton("Export", new DialogInterface.OnClickListener() { // from class: dany
                                public final /* synthetic */ String c = "conversation_participants_history.csv";

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i7) {
                                    knt kntVar = new knt(dauv.this.x);
                                    kntVar.d("text/csv");
                                    Activity activity2 = activity;
                                    kntVar.b(cflz.d(activity2, this.c));
                                    Intent a3 = kntVar.a();
                                    a3.setFlags(1);
                                    eldl.p(activity2, a3);
                                    dialogInterface.dismiss();
                                }
                            });
                            builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: dakk
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i7) {
                                    enru enruVar = dauv.c;
                                    dialogInterface.dismiss();
                                }
                            });
                            builder.create().show();
                        } finally {
                        }
                    }
                    String stringWriter22 = stringWriter.toString();
                    stringWriter22.getClass();
                    engrVar.h(stringWriter22);
                    engrVar.j((Iterable) Collection.EL.stream(collection).map(new Function() { // from class: danb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((dabx) obj).toString();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(endq.a));
                    g = engrVar.g();
                    activity = dbiqVar.a;
                    try {
                        final FileWriter fileWriter2 = new FileWriter(cflz.e(activity, "conversation_participants_history.csv"));
                        Iterable$EL.forEach(g, new Consumer() { // from class: dann
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                try {
                                    fileWriter2.write(a.v((String) obj, "\n"));
                                } catch (IOException e4) {
                                    ((ddzb) dauv.this.Y.b()).l("Error writing to dump file: ".concat(String.valueOf(e4.getMessage())));
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        fileWriter2.close();
                    } catch (IOException e4) {
                        ((ddzb) dauvVar.Y.b()).l("Error writing to dump file: ".concat(String.valueOf(e4.getMessage())));
                    }
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(activity);
                    builder2.setTitle("Conversation Participants History").setMessage(str).setCancelable(true);
                    builder2.setPositiveButton("Export", new DialogInterface.OnClickListener() { // from class: dany
                        public final /* synthetic */ String c = "conversation_participants_history.csv";

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i7) {
                            knt kntVar = new knt(dauv.this.x);
                            kntVar.d("text/csv");
                            Activity activity2 = activity;
                            kntVar.b(cflz.d(activity2, this.c));
                            Intent a3 = kntVar.a();
                            a3.setFlags(1);
                            eldl.p(activity2, a3);
                            dialogInterface.dismiss();
                        }
                    });
                    builder2.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: dakk
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i7) {
                            enru enruVar = dauv.c;
                            dialogInterface.dismiss();
                        }
                    });
                    builder2.create().show();
                } catch (Throwable th4) {
                    th = th4;
                    r19 = engwVar;
                }
            }
        }, optional);
        m(addSubMenu3, "Conversation Profile Details", new daur() { // from class: dahn
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final ConversationIdType conversationIdType = (ConversationIdType) dbiqVar.b.map(new dajz()).orElse(dauv.h());
                bruu a = brux.a();
                a.z("actionGetConversationsPartAuditLogTable");
                a.c(new Function() { // from class: danh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bruw bruwVar = (bruw) obj;
                        enru enruVar = dauv.c;
                        bruwVar.b(ConversationIdType.this);
                        return bruwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final enip enipVar = (enip) Collection.EL.stream(a.b().y()).map(new Function() { // from class: dani
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        enru enruVar = dauv.c;
                        return Long.valueOf(((brti) obj).k());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.b);
                bwon a2 = ProfilesTable.a();
                a2.z("actionGetConversationsProfilesTable");
                a2.e(new Function() { // from class: danj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bwor bworVar = (bwor) obj;
                        enru enruVar = dauv.c;
                        bworVar.aq(new dtrw("profiles_table.participant_id", 3, bwor.at(enip.this), true));
                        return bworVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                Stream stream = Collection.EL.stream(a2.b().y());
                final dauv dauvVar = dauv.this;
                Stream map = stream.map(new Function() { // from class: dank
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ProfilesTable.BindData bindData = (ProfilesTable.BindData) obj;
                        return "Profile name: " + bindData.v() + "\nProfile number: " + bindData.z() + "\nProfile url: " + String.valueOf(bindData.q()) + "\nTime since last photo update (in minutes): " + Duration.ofMillis(dauv.this.l.f().toEpochMilli() - bindData.o()).toMinutes();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                engw engwVar = (engw) map.collect(endq.a);
                AlertDialog.Builder title = new AlertDialog.Builder(dbiqVar.a).setTitle("Conversation Profile Details");
                StringBuilder sb = new StringBuilder();
                Iterator<E> it3 = engwVar.iterator();
                if (it3.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it3.next());
                        if (!it3.hasNext()) {
                            break;
                        } else {
                            sb.append((CharSequence) "\n\n");
                        }
                    }
                }
                title.setMessage(sb.toString()).setCancelable(true).show();
            }
        }, optional);
        SubMenu addSubMenu4 = addSubMenu3.addSubMenu("Notifications");
        m(addSubMenu4, "Notification Channels...", new daur() { // from class: dale
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                new daun(dauv.this, dbiqVar.a).e(new Void[0]);
            }
        }, optional);
        SubMenu addSubMenu5 = addSubMenu4.addSubMenu(cinj.MESSAGE_FAILURE.H);
        m(addSubMenu5, "Single Send Failure", new daur() { // from class: dalg
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.B(2, 1, 1, 1);
            }
        }, optional);
        m(addSubMenu5, "Single Download Failure", new daur() { // from class: dalh
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.B(2, 2, 1, 1);
            }
        }, optional);
        m(addSubMenu5, "Send Failures (Single Conv)", new daur() { // from class: dali
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.B(2, 1, 2, 1);
            }
        }, optional);
        m(addSubMenu5, "Download Failures (Single Conv)", new daur() { // from class: dalj
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.B(2, 2, 2, 1);
            }
        }, optional);
        m(addSubMenu5, "Send Failures (Multi Conv)", new daur() { // from class: dasa
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.B(2, 1, 2, 2);
            }
        }, optional);
        m(addSubMenu5, "Download Failures (Multi Conv)", new daur() { // from class: dasb
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.B(2, 2, 2, 2);
            }
        }, optional);
        if (((Boolean) ciow.a.e()).booleanValue()) {
            m(addSubMenu5, "Single RCS Delivery Failure", new daur() { // from class: dasc
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    dauv.this.B(2, 3, 1, 1);
                }
            }, optional);
            m(addSubMenu5, "RCS Delivery Failures (Single Conv)", new daur() { // from class: dasd
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    dauv.this.B(2, 3, 2, 1);
                }
            }, optional);
            m(addSubMenu5, "RCS Delivery Failures (Multi Conv)", new daur() { // from class: dase
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    dauv.this.B(2, 3, 2, 2);
                }
            }, optional);
        }
        m(addSubMenu5, "Outgoing Emergency Message Failure", new daur() { // from class: dasf
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).x(new ConversationIdType(1L), "911");
            }
        }, optional);
        m(addSubMenu5, "Cancel message failure", new daur() { // from class: dasg
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.B(1, 2, 0, 0);
            }
        }, optional);
        if (((Boolean) ((cfup) bm.get()).e()).booleanValue()) {
            m(addSubMenu4, "Message is Stuck in Sending", new daur() { // from class: dash
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    ((cins) dauv.this.e.b()).B();
                }
            }, optional);
        }
        m(addSubMenu4, cinj.LOW_STORAGE_SPACE.H, new daur() { // from class: dasj
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                enru enruVar = dauv.c;
                Toast.makeText(dbiqVar.a, "This is a pre-O notification only", 1).show();
            }
        }, optional);
        m(addSubMenu4, cinj.EXHAUSTED_STORAGE_SPACE.H, new daur() { // from class: dask
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cpei) dauv.this.f.b()).a();
            }
        }, optional);
        m(addSubMenu4, cinj.SIM_STORAGE_FULL.H, new daur() { // from class: dasm
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).A(-1, "simTitle");
            }
        }, optional);
        m(addSubMenu4, cinj.MEDIA_RESIZING.H, new daur() { // from class: dasn
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                ((cins) dauvVar.e.b()).v(((ames) dauvVar.bd.b()).a(new ConversationIdType(1L), null, false), 2, 3);
            }
        }, optional);
        m(addSubMenu4, cinj.INCOMING_MESSAGE_FOR_SECONDARY_USER.H, new daur() { // from class: daso
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cjcr) dauv.this.aP.b()).a();
            }
        }, optional);
        m(addSubMenu4, cinj.DIAGNOSTICS_TOOL.H, new daur() { // from class: dasp
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).s();
            }
        }, optional);
        m(addSubMenu4, cinj.INCOMING_MESSAGE.H, new daur() { // from class: dasq
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv.this.x(dbiqVar, false, false);
            }
        }, optional);
        m(addSubMenu4, cinj.FOREGROUND_SERVICE.H, new daur() { // from class: dasr
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).t();
            }
        }, optional);
        m(addSubMenu4, cinj.CMS_SYNC_FOREGROUND_SERVICE.H, new daur() { // from class: dass
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).p();
            }
        }, optional);
        m(addSubMenu4, cinj.REPORT_ISSUE.H, new daur() { // from class: dast
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                ((cins) dauvVar.e.b()).X(ephv.DEBUG_ISSUE, dauvVar.x.getString(com.google.android.apps.messaging.R.string.report_issue_notification_text));
            }
        }, optional);
        m(addSubMenu4, "SMS Rejected", new daur() { // from class: dasu
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                ((cins) dauvVar.e.b()).X(ephv.SMS_REJECTED, dauvVar.x.getString(com.google.android.apps.messaging.R.string.report_receive_issue_notification_message));
            }
        }, optional);
        if (z && ddjr.b()) {
            m(addSubMenu4, cinj.REMINDER.H, new daur() { // from class: dasv
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    if (dbiqVar.b.isEmpty()) {
                        return;
                    }
                    final dauv dauvVar = dauv.this;
                    final bcqs bcqsVar = (bcqs) dbiqVar.b.get();
                    ((Optional) dauvVar.O.b()).ifPresent(new Consumer() { // from class: damp
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            cnla cnlaVar = (cnla) obj;
                            final dauv dauvVar2 = dauv.this;
                            axnw.i(elfl.g(cnlaVar.v(null, bcqsVar.e, dauvVar2.l.f().toEpochMilli(), 7)), new Consumer() { // from class: damz
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj2) {
                                    ((ddzb) dauv.this.Y.b()).l("Setting a reminder on the last message in this conversation");
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, erpp.a);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }, optional);
        }
        m(addSubMenu4, cinj.AUTOMOVED_SPAM.H, new daur() { // from class: dasx
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).o();
            }
        }, optional);
        m(addSubMenu4, cinj.DASHER_DISABLED.H, new daur() { // from class: dasy
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).r("test_receiver@gmail.com");
            }
        }, optional);
        m(addSubMenu4, cinj.PRIMARY_DEVICE_CHANGED_MD.H, new daur() { // from class: dasz
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).L(csfz.MULTI_DEVICE, 2);
            }
        }, optional);
        m(addSubMenu4, cinj.PRIMARY_DEVICE_CHANGED_BNR.H, new daur() { // from class: data
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).L(csfz.BACKUP_AND_RESTORE, 2);
            }
        }, optional);
        m(addSubMenu4, cinj.BACKUP_DELETED_MD.H, new daur() { // from class: datb
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).L(csfz.MULTI_DEVICE, 3);
            }
        }, optional);
        m(addSubMenu4, cinj.BACKUP_DELETED_BNR.H, new daur() { // from class: datc
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).L(csfz.BACKUP_AND_RESTORE, 3);
            }
        }, optional);
        m(addSubMenu4, cinj.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_MD.H, new daur() { // from class: date
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).L(csfz.MULTI_DEVICE, 1);
            }
        }, optional);
        m(addSubMenu4, cinj.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_BNR.H, new daur() { // from class: datf
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).L(csfz.BACKUP_AND_RESTORE, 1);
            }
        }, optional);
        m(addSubMenu4, cinj.ACCOUNT_REMOVED.H, new daur() { // from class: datg
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).n();
            }
        }, optional);
        m(addSubMenu4, cinj.CMS_VITAL_ERROR.H, new daur() { // from class: dath
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                if (csjc.d()) {
                    ((cins) dauv.this.e.b()).q(new Intent());
                }
            }
        }, optional);
        m(addSubMenu4, cinj.RCS_NOT_DELIVERED.H, new daur() { // from class: datj
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).y();
            }
        }, optional);
        m(addSubMenu4, cinj.RCS_STILL_SENDING.H, new daur() { // from class: datk
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cins) dauv.this.e.b()).z();
            }
        }, optional);
        m(addSubMenu4, cinj.GAIA_PAIRING_VERIFICATION.H, new daur() { // from class: datl
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                if (csjc.d()) {
                    ((cins) dauv.this.e.b()).u();
                }
            }
        }, optional);
        if (((aspb) this.by.b()).a()) {
            m(addSubMenu4, "In App Update For Restore Initial Warning", new daur() { // from class: datm
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    dauv dauvVar = dauv.this;
                    String a = qmn.a(dauvVar.x.getString(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_initial_dialog_title_v2), "7", 7);
                    Context context = dauvVar.x;
                    dauv.l(dbiqVar, a, context.getText(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_initial_dialog_subtext_v2), context.getString(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_dialog_positive_button_caption_v2), context.getString(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_initial_dialog_negative_button_caption));
                }
            }, optional);
            m(addSubMenu4, "In App Update For Restore Reprompt Warning", new daur() { // from class: datn
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    Context context = dauv.this.x;
                    dauv.l(dbiqVar, context.getString(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_reprompt_dialog_title), context.getText(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_reprompt_dialog_subtext), context.getString(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_dialog_positive_button_caption_v2), context.getString(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_reprompt_dialog_negative_button_caption));
                }
            }, optional);
        }
        SubMenu addSubMenu6 = menu.addSubMenu("Performance");
        m(addSubMenu6, "Create message data for performance testing", new daur() { // from class: datp
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final Activity activity = dbiqVar.a;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage("Create message data for performance testing?");
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: daqz
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        enru enruVar = dauv.c;
                        dialogInterface.dismiss();
                    }
                });
                final dauv dauvVar = dauv.this;
                builder.setPositiveButton("Create", new elbb((elbx) dauvVar.ar.b(), "DebugUtilsImpl#showCreateMessageDataForPerformanceTestingDialog", new DialogInterface.OnClickListener() { // from class: darc
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        final dauv dauvVar2 = dauv.this;
                        final Activity activity2 = activity;
                        axnw.h(elfo.f(new Runnable() { // from class: daod
                            /* JADX WARN: Removed duplicated region for block: B:24:0x01d6  */
                            /* JADX WARN: Removed duplicated region for block: B:27:0x01dd  */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x01de A[SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:31:0x01d8  */
                            /* JADX WARN: Removed duplicated region for block: B:48:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() {
                                /*
                                    Method dump skipped, instructions count: 603
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.daod.run():void");
                            }
                        }, dauvVar2.aU));
                    }
                }));
                builder.create().show();
            }
        }, optional);
        m(addSubMenu6, "Create Fake Contacts", new daur() { // from class: datq
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final dacf dacfVar = (dacf) dauv.this.X.b();
                final Activity activity = dbiqVar.a;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage("Create contacts for performance testing?");
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: dacb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.setPositiveButton("Create", new elbb(dacfVar.c, "ContactManipulation#createFakePerformanceContactsDialog", new DialogInterface.OnClickListener() { // from class: dacc
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        final Context applicationContext = activity.getApplicationContext();
                        final dacf dacfVar2 = dacf.this;
                        elfo.g(new Callable() { // from class: dace
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Context context = applicationContext;
                                int i2 = 0;
                                while (i2 < 1500) {
                                    dacf dacfVar3 = dacf.this;
                                    Locale locale = Locale.US;
                                    Integer valueOf = Integer.valueOf(i2);
                                    String format = String.format(locale, "FakePerfContact %04d", valueOf);
                                    aoku n = dacfVar3.d.n(String.format(Locale.US, "555555%04d", valueOf));
                                    ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
                                    arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
                                    ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2");
                                    cfva cfvaVar = aoqm.a;
                                    arrayList.add(withValue.withValue("data1", n.d(((Boolean) new aopo().get()).booleanValue()).get()).withValue("data2", 2).build());
                                    arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data1", format).build());
                                    try {
                                        context.getContentResolver().applyBatch("com.android.contacts", arrayList);
                                    } catch (Exception e) {
                                        csjy.h("Bugle", e, "createContactWithPhoneNumber caught");
                                        dacfVar3.a.l("create contact " + String.valueOf(n.d(((Boolean) new aopo().get()).booleanValue())) + " caught " + e.toString());
                                    }
                                    i2++;
                                    csjy.m("Bugle", "Created contact %d of %d", Integer.valueOf(i2), 1500);
                                    if (i2 % 100 == 0) {
                                        dacfVar3.a.l(a.f(i2, "Created contact ", " of 1500"));
                                    }
                                }
                                return null;
                            }
                        }, dacfVar2.e).h(new emwl() { // from class: daca
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                dacf.this.b.b();
                                return null;
                            }
                        }, dacfVar2.e);
                    }
                }));
                builder.create().show();
            }
        }, optional);
        m(addSubMenu6, "Delete Fake Contacts", new daur() { // from class: datr
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final Activity activity = dbiqVar.a;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage("Delete contacts for performance testing?");
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: dapb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        enru enruVar = dauv.c;
                        dialogInterface.dismiss();
                    }
                });
                final dauv dauvVar = dauv.this;
                builder.setPositiveButton("Delete", new DialogInterface.OnClickListener() { // from class: dapc
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        final dauv dauvVar2 = dauv.this;
                        final dacf dacfVar = (dacf) dauvVar2.X.b();
                        final Context applicationContext = activity.getApplicationContext();
                        elfo.g(new Callable() { // from class: dacd
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Cursor query;
                                String[] strArr = {"display_name", "lookup"};
                                Uri uri = ContactsContract.Data.CONTENT_URI;
                                String[] strArr2 = {"FakePerfContact%"};
                                Context context = applicationContext;
                                try {
                                    query = context.getContentResolver().query(uri, strArr, "display_name LIKE ?", strArr2, null);
                                    try {
                                    } finally {
                                    }
                                } catch (RuntimeException e) {
                                    dacf dacfVar2 = dacf.this;
                                    csjy.h("Bugle", e, "deleteContacts caught");
                                    dacfVar2.a.l("delete contacts caught: ".concat(e.toString()));
                                }
                                if (query == null) {
                                    throw new IllegalArgumentException("Given Uri could not be found in Contacts.");
                                }
                                while (query.moveToNext()) {
                                    String string = query.getString(0);
                                    context.getContentResolver().delete(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, query.getString(1)), null, null);
                                    csjy.l("Bugle", "Deleted contact " + string);
                                }
                                query.close();
                                return null;
                            }
                        }, dacfVar.e).h(new emwl() { // from class: dara
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                ((cbeq) dauv.this.W.b()).b();
                                return null;
                            }
                        }, dauvVar2.aU);
                    }
                });
                builder.create().show();
            }
        }, optional);
        m(addSubMenu6, "Delete All Telephony Conversations", new daur() { // from class: dats
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                AlertDialog.Builder builder = new AlertDialog.Builder(dbiqVar.a);
                builder.setMessage("Delete all conversations?");
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: dajc
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        enru enruVar = dauv.c;
                        dialogInterface.dismiss();
                    }
                });
                final dauv dauvVar = dauv.this;
                builder.setPositiveButton("Delete!", new DialogInterface.OnClickListener() { // from class: dajo
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dauv dauvVar2 = dauv.this;
                        try {
                            int b = ((coxk) dauvVar2.p.b()).b(dauvVar2.l.f().toEpochMilli());
                            if (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) {
                                ((coxg) dauvVar2.m.b()).l(eqqh.DEBUG_UTILS_DELETE_ALL_CONVERSATIONS);
                            } else {
                                ((coxg) dauvVar2.m.b()).h();
                            }
                            ((ddzb) dauvVar2.Y.b()).l(a.B(b, " messages deleted!  Synchronizing in background."));
                        } catch (Exception e) {
                            ((ddzb) dauvVar2.Y.b()).l("Error: ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                });
                builder.create().show();
            }
        }, optional);
        m(addSubMenu6, "Simulate UI Jank", new daur() { // from class: datt
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                Optional optional2 = (Optional) ((fbbb) dauvVar.ao).a;
                if (optional2.isPresent()) {
                    ((dblt) optional2.get()).a();
                } else {
                    ((ddzb) dauvVar.Y.b()).l("UI Jank debug menu not available in this build");
                }
            }
        }, optional);
        SubMenu addSubMenu7 = menu.addSubMenu("Values");
        m(addSubMenu7, "Carrier Config...", new daur() { // from class: datv
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((akvg) dauv.this.u.b()).ac(dbiqVar.a);
            }
        }, optional);
        m(addSubMenu7, "Auto-ramp Overrides / GService keys...", new daur() { // from class: datw
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((akvg) dauv.this.u.b()).af(dbiqVar.a);
            }
        }, optional);
        m(addSubMenu7, "Phenotype flags", new daur() { // from class: datx
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                Window window = new AlertDialog.Builder(dbiqVar.a).setTitle("Phenotype flags").setMessage(((cfus) dauv.this.az.b()).b(true)).setCancelable(true).show().getWindow();
                window.getClass();
                window.setLayout(-1, -1);
            }
        }, optional);
        m(addSubMenu7, "Auto-retrieve status", new daur() { // from class: daty
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                AlertDialog.Builder builder = new AlertDialog.Builder(dbiqVar.a);
                dauv dauvVar = dauv.this;
                AlertDialog.Builder title = builder.setTitle("Auto-retrieve status: " + ((cpbw) dauvVar.A.b()).c(-1));
                cpbw cpbwVar = (cpbw) dauvVar.A.b();
                cpbn a = cpbwVar.d.a(-1);
                cxan b = cpbwVar.b(-1);
                boolean booleanValue = ((Boolean) b.c().orElse(Boolean.valueOf(a.p()))).booleanValue();
                boolean booleanValue2 = ((Boolean) b.d().orElse(Boolean.valueOf(a.q()))).booleanValue();
                title.setMessage("MMS auto download is enabled: " + booleanValue + "\nThe user is roaming: " + cpbwVar.e.h(-1).C() + "\nMMS auto download when roaming is enabled: " + booleanValue2 + "\n").setCancelable(true).show();
            }
        }, optional);
        m(addSubMenu7, "Settings (Preferences)", new daur() { // from class: dafb
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((akvg) dauv.this.u.b()).ae(dbiqVar.a);
            }
        }, optional);
        m(addSubMenu7, "Primes", new daur() { // from class: dafc
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                enru enruVar = dauv.c;
                ecdo.a(dbiqVar.a);
            }
        }, optional);
        m(addSubMenu7, "Message status DB size estimate", new daur() { // from class: dafd
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                dauv dauvVar = dauv.this;
                final aliv alivVar = (aliv) dauvVar.J.b();
                alivVar.getClass();
                final elfl g = elfo.g(new Callable() { // from class: daoi
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return aliv.this.b();
                    }
                }, dauvVar.ah);
                final alir alirVar = (alir) dauvVar.K.b();
                alirVar.getClass();
                final elfl g2 = elfo.g(new Callable() { // from class: daok
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return alir.this.b();
                    }
                }, dauvVar.ah);
                elfq d2 = elfr.d(g, g2);
                final Activity activity = dbiqVar.a;
                axnw.h(d2.a(new Callable() { // from class: daol
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        enru enruVar = dauv.c;
                        aliw aliwVar = (aliw) erqt.q(elfl.this);
                        aliw aliwVar2 = (aliw) erqt.q(g2);
                        new AlertDialog.Builder(activity).setTitle("Message Status DB Size").setMessage("message_status table:\n" + String.valueOf(aliwVar) + "\n\nevents table:\n" + String.valueOf(aliwVar2)).setCancelable(true).show();
                        return new Object();
                    }
                }, dauvVar.H));
            }
        }, optional);
        SubMenu addSubMenu8 = menu.addSubMenu("Failures");
        m(addSubMenu8, true != ((csrv) this.U.b()).i ? "Emulate SMS temp failure" : "Stop emulating SMS temp failure", new daur() { // from class: dafe
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                boolean booleanValue = ((Boolean) csrv.b.e()).booleanValue();
                final dauv dauvVar = dauv.this;
                final Activity activity = dbiqVar.a;
                if (booleanValue) {
                    dauvVar.q(activity, "enableSmsTempFailure", Boolean.toString(!((csrv) dauvVar.U.b()).i), new Runnable() { // from class: dapw
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((csrv) dauv.this.U.b()).j(!((csrv) r0.U.b()).i);
                            dauv.t(activity);
                        }
                    }, null, null);
                } else {
                    ((csrv) dauvVar.U.b()).j(!((csrv) dauvVar.U.b()).i);
                    dauv.t(activity);
                }
            }
        }, optional);
        m(addSubMenu8, true != ((csrv) this.U.b()).j ? "Emulate SMS perm failure" : "Stop emulation SMS perm failure", new daur() { // from class: daff
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                boolean booleanValue = ((Boolean) csrv.b.e()).booleanValue();
                final dauv dauvVar = dauv.this;
                final Activity activity = dbiqVar.a;
                if (booleanValue) {
                    dauvVar.q(activity, "enableSmsPermFailure", Boolean.toString(!((csrv) dauvVar.U.b()).j), new Runnable() { // from class: daop
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((csrv) dauv.this.U.b()).h(!((csrv) r0.U.b()).j);
                            dauv.t(activity);
                        }
                    }, null, null);
                } else {
                    ((csrv) dauvVar.U.b()).h(!((csrv) dauvVar.U.b()).j);
                    dauv.t(activity);
                }
            }
        }, optional);
        m(addSubMenu8, true != ((csrv) this.U.b()).n ? "Emulate SMS perm failure when receiving send result" : "Stop emulation SMS perm failure when receiving send result", new daur() { // from class: dafg
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                boolean booleanValue = ((Boolean) csrv.b.e()).booleanValue();
                final dauv dauvVar = dauv.this;
                final Activity activity = dbiqVar.a;
                if (booleanValue) {
                    dauvVar.q(activity, "enableSmsPermFailureAfterSending", Boolean.toString(!((csrv) dauvVar.U.b()).n), new Runnable() { // from class: damj
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((csrv) dauv.this.U.b()).i(!((csrv) r0.U.b()).n);
                            dauv.t(activity);
                        }
                    }, null, null);
                } else {
                    ((csrv) dauvVar.U.b()).i(!((csrv) dauvVar.U.b()).n);
                    dauv.t(activity);
                }
            }
        }, optional);
        m(addSubMenu8, true != ((csrv) this.U.b()).k ? "Emulate MMS send temp failure" : "Stop emulating MMS send temp failure", new daur() { // from class: dafi
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                boolean booleanValue = ((Boolean) csrv.b.e()).booleanValue();
                final dauv dauvVar = dauv.this;
                final Activity activity = dbiqVar.a;
                if (booleanValue) {
                    dauvVar.q(activity, "enableMmsSendTempFailure", Boolean.toString(!((csrv) dauvVar.U.b()).k), new Runnable() { // from class: daof
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((csrv) dauv.this.U.b()).g(!((csrv) r0.U.b()).k);
                            dauv.t(activity);
                        }
                    }, null, null);
                } else {
                    ((csrv) dauvVar.U.b()).g(!((csrv) dauvVar.U.b()).k);
                    dauv.t(activity);
                }
            }
        }, optional);
        m(addSubMenu8, true != ((csrv) this.U.b()).o ? "Emulate MMS perm failure when receiving send result" : "Stop emulation MMS perm failure when receiving send result", new daur() { // from class: dafj
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                boolean booleanValue = ((Boolean) csrv.b.e()).booleanValue();
                final dauv dauvVar = dauv.this;
                final Activity activity = dbiqVar.a;
                if (booleanValue) {
                    dauvVar.q(activity, "enableMmsPermFailureAfterSending", Boolean.toString(!((csrv) dauvVar.U.b()).o), new Runnable() { // from class: dare
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((csrv) dauv.this.U.b()).f(!((csrv) r0.U.b()).o);
                            dauv.t(activity);
                        }
                    }, null, null);
                } else {
                    ((csrv) dauvVar.U.b()).f(!((csrv) dauvVar.U.b()).o);
                    dauv.t(activity);
                }
            }
        }, optional);
        m(addSubMenu8, "Force MMS send result to status...", new daur() { // from class: dafk
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final CharSequence[] charSequenceArr = {"<Don't force any status>", "0 RESULT_OK", "1 unspecified error", "2 invalid APN error", "3 unable to connect error", "4 http failure", "5 io error", "6 retry error", "7 configuration error", "8 no data network"};
                final Activity activity = dbiqVar.a;
                AlertDialog.Builder title = new AlertDialog.Builder(activity).setTitle("Tap on desired status to force sent MMS to");
                boolean booleanValue = ((Boolean) csrv.b.e()).booleanValue();
                final dauv dauvVar = dauv.this;
                title.setSingleChoiceItems(charSequenceArr, booleanValue ? ((csrv) dauvVar.U.b()).m + 1 : -1, new DialogInterface.OnClickListener() { // from class: daqf
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(final DialogInterface dialogInterface, int i) {
                        final dauv dauvVar2 = dauv.this;
                        if (i == 0) {
                            if (!((Boolean) csrv.b.e()).booleanValue()) {
                                ((csrv) dauvVar2.U.b()).d();
                                ((ddzb) dauvVar2.Y.b()).l("Won't force MMS send result status anymore");
                                return;
                            }
                            i = 0;
                        }
                        CharSequence charSequence = charSequenceArr[i];
                        final int parseInt = Integer.parseInt((String) enjk.h(emye.b(' ').g(charSequence.toString()), 0));
                        String concat = i != 0 ? "Will force MMS send result status to ".concat(String.valueOf(String.valueOf(charSequence))) : "Won't force MMS send result status anymore";
                        if (((Boolean) csrv.b.e()).booleanValue()) {
                            final Activity activity2 = activity;
                            dauvVar2.q(activity2, "forceMmsSendResultStatusFailure", charSequence, i == 0 ? new Runnable() { // from class: daom
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((csrv) dauv.this.U.b()).d();
                                    dauv.t(activity2);
                                }
                            } : new Runnable() { // from class: daon
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((csrv) dauv.this.U.b()).l(parseInt);
                                    dauv.t(activity2);
                                }
                            }, new Runnable() { // from class: daoo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dauv.t(activity2);
                                    dialogInterface.cancel();
                                }
                            }, concat);
                        } else {
                            ((csrv) dauvVar2.U.b()).l(parseInt);
                            ((ddzb) dauvVar2.Y.b()).l(concat);
                        }
                    }
                }).setCancelable(true).show();
            }
        }, optional);
        m(addSubMenu8, "Force downloaded MMS to status...", new daur() { // from class: dafm
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final CharSequence[] charSequenceArr = new CharSequence[19];
                charSequenceArr[0] = "<Don't force any status>";
                int i = 100;
                int i2 = 1;
                while (i2 < 19) {
                    charSequenceArr[i2] = i + " " + axuh.a(i).replace("MESSAGE_STATUS_INCOMING_", "").replace("_", " ").toLowerCase(Locale.ENGLISH);
                    i2++;
                    i++;
                }
                final dauv dauvVar = dauv.this;
                final Activity activity = dbiqVar.a;
                new AlertDialog.Builder(activity).setTitle("Tap on desired status to force downloaded MMS to").setSingleChoiceItems(charSequenceArr, ((Boolean) csrv.b.e()).booleanValue() ? ((csrv) dauvVar.U.b()).l - 99 : -1, new DialogInterface.OnClickListener() { // from class: damd
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(final DialogInterface dialogInterface, int i3) {
                        final dauv dauvVar2 = dauv.this;
                        if (i3 == 0) {
                            if (!((Boolean) csrv.b.e()).booleanValue()) {
                                ((csrv) dauvVar2.U.b()).c();
                                ((ddzb) dauvVar2.Y.b()).l("Won't force any MMS status anymore");
                                return;
                            }
                            i3 = 0;
                        }
                        CharSequence charSequence = charSequenceArr[i3];
                        final int parseInt = Integer.parseInt((String) enjk.h(emye.b(' ').g(charSequence.toString()), 0));
                        String concat = i3 != 0 ? "Will force new MMS messages to ".concat(String.valueOf(String.valueOf(charSequence))) : "Won't force any MMS status anymore";
                        if (((Boolean) csrv.b.e()).booleanValue()) {
                            final Activity activity2 = activity;
                            dauvVar2.q(activity2, "forceMmsDownloadStatusFailure", charSequence, i3 == 0 ? new Runnable() { // from class: dalo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((csrv) dauv.this.U.b()).c();
                                    dauv.t(activity2);
                                }
                            } : new Runnable() { // from class: dalp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((csrv) dauv.this.U.b()).k(parseInt);
                                    dauv.t(activity2);
                                }
                            }, new Runnable() { // from class: dalr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dauv.t(activity2);
                                    dialogInterface.cancel();
                                }
                            }, concat);
                        } else {
                            ((csrv) dauvVar2.U.b()).k(parseInt);
                            ((ddzb) dauvVar2.Y.b()).l(concat);
                        }
                    }
                }).setCancelable(true).show();
            }
        }, optional);
        m(addSubMenu8, "Expedite all retries", new daur() { // from class: dafn
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                enru enruVar = banu.a;
                for (int i = 0; i < 8; i++) {
                    banu.b(i, true);
                }
                ((bbfo) dauv.this.ac.b()).a().A();
            }
        }, optional);
        long longValue = ((Long) MessageData.d.e()).longValue();
        long j = MessageData.b;
        m(addSubMenu8, longValue == j ? "Shorten retry window timeout value" : "Reset retry window timeout value", new daur() { // from class: dafo
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                Long valueOf;
                Long valueOf2;
                long longValue2 = ((Long) MessageData.d.e()).longValue();
                long j2 = MessageData.b;
                if (longValue2 == j2) {
                    valueOf = Long.valueOf(TimeUnit.SECONDS.toMillis(10L));
                    valueOf2 = Long.valueOf(TimeUnit.SECONDS.toMillis(10L));
                } else {
                    valueOf = Long.valueOf(j2);
                    valueOf2 = Long.valueOf(MessageData.c);
                }
                dauv dauvVar = dauv.this;
                Activity activity = dbiqVar.a;
                dauv.s(MessageData.d, valueOf);
                dauv.s(MessageData.e, valueOf2);
                ((ddzb) dauvVar.Y.b()).l(a.k(valueOf2, valueOf, "Zero connectivity timeout set to ", " ms; RCS resend and mark fail timeout set to ", " ms"));
                dauv.t(activity);
            }
        }, optional);
        SubMenu addSubMenu9 = menu.addSubMenu("RBM");
        final daxf daxfVar = (daxf) this.bo.b();
        daxfVar.getClass();
        m(addSubMenu9, "Trigger Retrieval Worker", new daur() { // from class: dafp
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                daxf daxfVar2 = daxf.this;
                String str = (String) daxfVar2.c.e();
                daxf.a.p("Why are you pressing this?");
                cero ceroVar = (cero) cerr.a.createBuilder();
                ceroVar.copyOnWrite();
                cerr cerrVar = (cerr) ceroVar.instance;
                str.getClass();
                cerrVar.b = str;
                ceroVar.copyOnWrite();
                ((cerr) ceroVar.instance).c = cerp.a(4);
                ceroVar.copyOnWrite();
                ((cerr) ceroVar.instance).d = cerq.a(4);
                cerr cerrVar2 = (cerr) ceroVar.build();
                cetp cetpVar = new cetp();
                cetpVar.a = str;
                cetpVar.b = str;
                daxfVar2.b.b(cerrVar2, cetpVar.a());
            }
        }, optional);
        if (((Boolean) cful.i.e()).booleanValue()) {
            SubMenu addSubMenu10 = menu.addSubMenu("Tachyon / Ditto");
            m(addSubMenu10, "Register with internal FCM Authority", new daur() { // from class: dafq
                @Override // defpackage.daur
                public final void a(final dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    axnw.i(elfo.g(new Callable() { // from class: darg
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Optional ofNullable = Optional.ofNullable(FirebaseInstanceId.b().h());
                            if (ofNullable.isPresent()) {
                                return (String) ofNullable.get();
                            }
                            return null;
                        }
                    }, dauvVar.ah), new Consumer() { // from class: darh
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            String str = (String) obj;
                            ((ClipboardManager) dbiqVar.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("FCM Registration Token", str));
                            ((ddzb) dauv.this.Y.b()).l("FCM Registration Token: ".concat(String.valueOf(str)));
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, dauvVar.H);
                }
            }, optional);
            m(addSubMenu10, "Use debug Tachyon URL", new daur() { // from class: dafr
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    dauv.s(chhs.b, "tachyon-playground-autopush-grpc.sandbox.googleapis.com:443");
                    dauv dauvVar = dauv.this;
                    ((ddzb) dauvVar.Y.b()).l("Tachyon URL: tachyon-playground-autopush-grpc.sandbox.googleapis.com:443");
                    axnw.h(((chmx) dauvVar.R.b()).a());
                }
            }, optional);
            m(addSubMenu10, "Reset Tachyon URL", new daur() { // from class: dafs
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    dauv.w(chhs.b);
                    dauv dauvVar = dauv.this;
                    ((ddzb) dauvVar.Y.b()).l("Tachyon URL: ".concat(String.valueOf((String) chhs.b.e())));
                    axnw.h(((chmx) dauvVar.R.b()).a());
                }
            }, optional);
            m(addSubMenu10, "Reset Tachyon token", new daur() { // from class: dafu
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    axnw.h(((chmx) dauv.this.R.b()).a());
                }
            }, optional);
            m(addSubMenu10, "Set Tachyon token as expired", new daur() { // from class: dafv
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    axnw.h(((chmx) dauv.this.R.b()).d(0L));
                }
            }, optional);
            m(addSubMenu10, "Register Anon with Tachyon", new daur() { // from class: dafx
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    final chxl chxlVar = (chxl) dauvVar.F.b();
                    axnw.i(((chmx) dauvVar.R.b()).c().i(new eroh() { // from class: dari
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            fcfn a = ((chga) dauv.this.Z.b()).a("Bugle");
                            eyee x = eyee.x((byte[]) obj);
                            a.copyOnWrite();
                            fcfo fcfoVar = (fcfo) a.instance;
                            fcfo fcfoVar2 = fcfo.a;
                            fcfoVar.f = x;
                            return chxlVar.c((fcfo) a.build());
                        }
                    }, dauvVar.af).i(new eroh() { // from class: darj
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return chxl.n((chrv) dauv.this.n.b(), (fcbn) obj);
                        }
                    }, dauvVar.ah), new Consumer() { // from class: dark
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ensk e = dauv.c.e();
                            e.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionRegisterAnonymousWithTachyon", 3794, "DebugUtilsImpl.java")).q("Registered successfully with tachyon");
                            ((ddzb) dauv.this.Y.b()).l("Successfully refreshed tachyon registration");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, erpp.a);
                }
            }, optional);
            m(addSubMenu10, "Refresh Anon Tachyon registration", new daur() { // from class: dafy
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    axnw.i(((cgwk) dauvVar.o.b()).l(cgwm.FORCE_REFRESH), new Consumer() { // from class: dall
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ensk e = dauv.c.e();
                            e.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionRefreshAnonTachyonRegistration", 3804, "DebugUtilsImpl.java")).q("Successfully refreshed tachyon registration");
                            ((ddzb) dauv.this.Y.b()).l("Successfully refreshed tachyon registration");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, erpp.a);
                }
            }, optional);
            m(addSubMenu10, "Clear Gaia Registration Token Expiration", new daur() { // from class: dafz
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    axnw.i(((chlh) dauvVar.be.b()).e(0L), new Consumer() { // from class: dair
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ensk e = dauv.c.e();
                            e.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionClearGaiaRegistrationTokenExpiration", 3830, "DebugUtilsImpl.java")).q("Successfully cleared Gaia Registration Token Expiration");
                            ((ddzb) dauv.this.Y.b()).l("Successfully cleared Gaia Registration Token Expiration");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, erpp.a);
                }
            }, optional);
            m(addSubMenu10, "Link RCS to Gaia Account", new daur() { // from class: daga
                /* JADX WARN: Type inference failed for: r0v2, types: [bzgw, java.lang.Object] */
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    dauvVar.bj.isPresent();
                    axnw.i(dauvVar.bj.get().c().i(new eroh() { // from class: daoz
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            elfl c2;
                            String str = (String) obj;
                            cgwa cgwaVar = (cgwa) dauv.this.bk.b();
                            str.getClass();
                            c2 = axol.c(cgwaVar.a, ffhe.a, ffsm.a, new cgvv(cgwaVar, str, null));
                            return c2;
                        }
                    }, erpp.a), new Consumer() { // from class: dapa
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ensk e = dauv.c.e();
                            e.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionLinkGaiaAccount", 3821, "DebugUtilsImpl.java")).q("Successfully linked rcs phone number to current gaia account");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, erpp.a);
                }
            }, optional);
            m(addSubMenu10, "Start anonymous bind handler", new daur() { // from class: dagb
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    dauv dauvVar = dauv.this;
                    if (((Optional) dauvVar.z.b()).isPresent()) {
                        ((cilk) ((Optional) dauvVar.z.b()).get()).d();
                    }
                }
            }, optional);
            m(addSubMenu10, "Stop anonymous bind handler", new daur() { // from class: dagc
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    dauv dauvVar = dauv.this;
                    if (((Optional) dauvVar.z.b()).isPresent()) {
                        ((cilk) ((Optional) dauvVar.z.b()).get()).g();
                    }
                }
            }, optional);
            m(addSubMenu10, "challenge browser", new daur() { // from class: dagd
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    dauv dauvVar = dauv.this;
                    byte[] r = ((ctyx) dauvVar.q.b()).r("ditto_active_desktop_id");
                    if (r == null) {
                        return;
                    }
                    try {
                        chwu c2 = ((chww) dauvVar.ab.b()).c((fcek) eyfy.parseFrom(fcek.a, r, eyfc.a()), Optional.empty(), esaa.GET_UPDATES);
                        erxg erxgVar = (erxg) erxi.a.createBuilder();
                        ertu ertuVar = ertu.a;
                        erxgVar.copyOnWrite();
                        erxi erxiVar = (erxi) erxgVar.instance;
                        ertuVar.getClass();
                        erxiVar.c = ertuVar;
                        erxiVar.b = 7;
                        c2.b(erxgVar.build());
                        ((chep) dauvVar.y.b()).a(c2.a());
                    } catch (eygu e) {
                        ensk i = dauv.c.i();
                        i.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionChallengeBrowserHandler", (char) 3871, "DebugUtilsImpl.java")).q("Unable to parse browser id");
                    }
                }
            }, optional);
            m(addSubMenu10, "Clear promo banner data", new daur() { // from class: dage
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    dauv dauvVar = dauv.this;
                    ((ctyx) dauvVar.q.b()).h("ditto_has_seen_pairing_screen", false);
                    ((ctyx) dauvVar.q.b()).j("ditto_prompt_dismissed_count", 0);
                    ((ctyx) dauvVar.q.b()).k("ditto_last_dismissed_timestamp_ms", 0L);
                }
            }, optional);
            m(addSubMenu10, "Clear desktop settings data", new daur() { // from class: dagg
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    ((ctyx) dauv.this.q.b()).i("ditto_desktop_settings", ervg.a.toByteArray());
                }
            }, optional);
            m(addSubMenu10, "Send browser inactive message", new daur() { // from class: dagi
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    dauv dauvVar = dauv.this;
                    try {
                        byte[] r = ((ctyx) dauvVar.q.b()).r("ditto_active_desktop_id");
                        r.getClass();
                        axnw.h(((bbfs) dauvVar.ad.b()).e((fcek) eyfy.parseFrom(fcek.a, r, eyfc.a()), (String) Optional.ofNullable(((ctyx) dauvVar.q.b()).f("ditto_active_desktop_request_id", null)).orElse("")));
                    } catch (eygu e) {
                        ensk i = dauv.c.i();
                        i.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionSendBrowserInactive", (char) 3906, "DebugUtilsImpl.java")).q("Error unmarshalling the desktop Id");
                    }
                }
            }, optional);
            m(addSubMenu10, "Register PhoneNum with Tachyon", new daur() { // from class: dagj
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final iy iyVar = (iy) dbiqVar.a;
                    dauv.this.y(iyVar, new Consumer() { // from class: dapu
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            enru enruVar = dauv.c;
                            Bundle bundle = new Bundle();
                            bundle.putInt("effectiveSubId", ((ctwi) obj).a());
                            dblu dbluVar = new dblu();
                            dbluVar.at(bundle);
                            dbluVar.t(iy.this.a(), "DebugTachyonPhoneRegistrationFragmentPeer");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }, optional);
            m(addSubMenu10, "Refresh PhoneNum with Tachyon", new daur() { // from class: dagk
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    dauvVar.y(dbiqVar.a, new Consumer() { // from class: dalx
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            final ctwi ctwiVar = (ctwi) obj;
                            final dauv dauvVar2 = dauv.this;
                            axnw.i(elfo.g(new Callable() { // from class: dagh
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return ((chco) dauv.this.S.b()).g(ctwiVar.a());
                                }
                            }, dauvVar2.ah).i(new eroh() { // from class: dags
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    return ((chbx) dauv.this.I.b()).b((String) obj2);
                                }
                            }, erpp.a).i(new eroh() { // from class: dahd
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    enru enruVar = dauv.c;
                                    return ((chbu) obj2).l(cgwm.FORCE_REFRESH);
                                }
                            }, erpp.a), new Consumer() { // from class: daho
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj2) {
                                    ensk e = dauv.c.e();
                                    e.Y(ente.a, "Bugle");
                                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionRefreshPhoneTachyonRegistration", 3950, "DebugUtilsImpl.java")).q("Successfully refreshed tachyon registration");
                                    ((ddzb) dauv.this.Y.b()).l("Successfully refreshed tachyon registration");
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, erpp.a);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }, optional);
            m(addSubMenu10, "Enter registration code", new daur() { // from class: dagl
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final Activity activity = dbiqVar.a;
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                    ScrollView scrollView = new ScrollView(activity);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    scrollView.addView(linearLayout);
                    scrollView.setFillViewport(true);
                    linearLayout.setOrientation(1);
                    builder.setView(scrollView);
                    linearLayout.addView(dbiqVar.b("Enter registration code"));
                    final EditText a = dbiqVar.a(2);
                    a.setId(com.google.android.apps.messaging.R.id.tachyon_pin_edit_text);
                    a.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                    linearLayout.addView(a);
                    TextView b = dbiqVar.b("Result: None");
                    b.setId(com.google.android.apps.messaging.R.id.tachyon_pin_result_text);
                    linearLayout.addView(b);
                    final dauh dauhVar = new dauh(b);
                    builder.setPositiveButton("Verify", (DialogInterface.OnClickListener) null);
                    builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: danc
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            enru enruVar = dauv.c;
                            dialogInterface.dismiss();
                        }
                    });
                    AlertDialog create = builder.create();
                    final dauv dauvVar = dauv.this;
                    create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: darb
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            Button button = ((AlertDialog) dialogInterface).getButton(-1);
                            final dauv dauvVar2 = dauv.this;
                            final EditText editText = a;
                            final Activity activity2 = activity;
                            final dauu dauuVar = dauhVar;
                            button.setOnClickListener(new View.OnClickListener() { // from class: daqo
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final String obj = editText.getText().toString();
                                    int length = obj.length();
                                    final dauv dauvVar3 = dauv.this;
                                    if (length != 6) {
                                        ((ddzb) dauvVar3.Y.b()).l("Invalid PIN, enter 6 digits from verification SMS");
                                    } else {
                                        final dauu dauuVar2 = dauuVar;
                                        dauvVar3.y(activity2, new Consumer() { // from class: dapt
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void o(Object obj2) {
                                                dauv.this.A((ctwi) obj2, obj, dauuVar2);
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                    }
                                }
                            });
                        }
                    });
                    create.show();
                }
            }, optional);
            m(addSubMenu10, "Verify registration code", new daur() { // from class: dagm
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    dauvVar.y(dbiqVar.a, new Consumer() { // from class: dard
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ctwi ctwiVar = (ctwi) obj;
                            String str = (String) cgyj.c.e();
                            boolean isEmpty = TextUtils.isEmpty(str);
                            dauv dauvVar2 = dauv.this;
                            if (isEmpty) {
                                ((ddzb) dauvVar2.Y.b()).l("No configured PIN to verify");
                            } else {
                                dauvVar2.A(ctwiVar, str, new daui(dauvVar2, str));
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }, optional);
            m(addSubMenu10, "Reset Tachyon phone token", new daur() { // from class: dagn
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    ensk e = dauv.c.e();
                    e.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionResetTachyonPhoneToken", 4076, "DebugUtilsImpl.java")).q("Resetting Tachyon phone token");
                    final dauv dauvVar = dauv.this;
                    axnw.i(dauvVar.k(), new Consumer() { // from class: dals
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ((ddzb) dauv.this.Y.b()).l("Removed the data");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, dauvVar.H);
                }
            }, optional);
            m(addSubMenu10, "Unregister from Tachyon", new daur() { // from class: dago
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    dauvVar.y(dbiqVar.a, new Consumer() { // from class: darx
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            final dauv dauvVar2 = dauv.this;
                            final ctwi ctwiVar = (ctwi) obj;
                            axnw.i(dauvVar2.k().i(new eroh() { // from class: dame
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    dauv dauvVar3 = dauv.this;
                                    return ((chep) dauvVar3.y.b()).a(new chzi(dauvVar3.i(ctwiVar)));
                                }
                            }, dauvVar2.ah), new Consumer() { // from class: damf
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj2) {
                                    ((ddzb) dauv.this.Y.b()).l("Unregistered successfully from Tachyon");
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, dauvVar2.H);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }, optional);
            m(addSubMenu10, "Unregister Google RCS", new daur() { // from class: dagp
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    Stream map = Collection.EL.stream(((djrv) dauvVar.aL.b()).p()).map(new dana()).map(new Function() { // from class: dand
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((chep) dauv.this.y.b()).a(new chzh((String) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = engw.d;
                    axnw.h(elfo.j((Iterable) map.collect(endq.a)).c(new Runnable() { // from class: dane
                        @Override // java.lang.Runnable
                        public final void run() {
                            enru enruVar = dauv.c;
                        }
                    }, dauvVar.ah).h(new emwl() { // from class: danf
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ((ddzb) dauv.this.Y.b()).l("Unregistered Google RCS successfully");
                            return new Object();
                        }
                    }, dauvVar.H).e(fedn.class, new emwl() { // from class: dang
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ((ddzb) dauv.this.Y.b()).l("Failed to unregistered Google RCS");
                            ensk i2 = dauv.c.i();
                            i2.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) ((enrr) i2).g((fedn) obj)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionUnregisterGoogleRcs", 4137, "DebugUtilsImpl.java")).q("Failed to unregistered Google RCS");
                            return new Object();
                        }
                    }, dauvVar.H));
                }
            }, optional);
            m(addSubMenu10, "Start phone bind handler", new daur() { // from class: dagq
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    dauvVar.y(dbiqVar.a, new Consumer() { // from class: danm
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ctwi ctwiVar = (ctwi) obj;
                            dauv dauvVar2 = dauv.this;
                            if (((Optional) dauvVar2.z.b()).isPresent()) {
                                ((cilk) ((Optional) dauvVar2.z.b()).get()).e(dauv.C(ctwiVar));
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }, optional);
            m(addSubMenu10, "Clear participant Tachyon data", new daur() { // from class: dagt
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    if (dbiqVar.b.isEmpty()) {
                        ((ddzb) dauvVar.Y.b()).l("Failed to clear participant Tachyon data, is the conversation open?");
                        return;
                    }
                    final String m = ((bcqs) dbiqVar.b.get()).m();
                    if (m == null) {
                        ((ddzb) dauvVar.Y.b()).l("No 1:1 participant found");
                    } else {
                        axnw.i(((cbwj) dauvVar.aa.b()).a("DebugUtilsImpl#clearParticipantTachyonData", new emyl() { // from class: dars
                            @Override // defpackage.emyl
                            public final Object get() {
                                Object apply;
                                Object apply2;
                                String[] strArr = bxhr.a;
                                bxhi bxhiVar = new bxhi();
                                final String str = m;
                                apply = new Function() { // from class: damq
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bxhq bxhqVar = (bxhq) obj;
                                        enru enruVar = dauv.c;
                                        bxhqVar.b(str);
                                        return bxhqVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }.apply(new bxhq());
                                bxhiVar.b = new bxhp((bxhq) apply);
                                bxhiVar.d();
                                String[] strArr2 = bxiv.a;
                                bxio bxioVar = new bxio();
                                apply2 = new Function() { // from class: dams
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bxiu bxiuVar = (bxiu) obj;
                                        enru enruVar = dauv.c;
                                        bxiuVar.b(str);
                                        return bxiuVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }.apply(new bxiu());
                                bxioVar.b = new bxit((bxiu) apply2);
                                bxioVar.d();
                                Iterator it3 = ((Set) dauv.this.ag.b()).iterator();
                                while (it3.hasNext()) {
                                    ((bzqh) it3.next()).a(str, false);
                                }
                                return true;
                            }
                        }), new Consumer() { // from class: dart
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                ((ddzb) dauv.this.Y.b()).l("Successfully cleared participant Tachyon data");
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, erpp.a);
                    }
                }
            }, optional);
            final dadg dadgVar = this.ap;
            m(addSubMenu10, "Delete Scytale session", new daur() { // from class: dagu
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dadg dadgVar2 = dadg.this;
                    if (!((Boolean) dadgVar2.a.b()).booleanValue()) {
                        ((ddzb) dadgVar2.b.b()).l("Disabled");
                        return;
                    }
                    if (dbiqVar.b.isEmpty()) {
                        ((ddzb) dadgVar2.b.b()).l("Failed to clear participant encryption session data, is the conversation open?");
                        return;
                    }
                    final String m = ((bcqs) dbiqVar.b.get()).m();
                    if (m == null) {
                        ((ddzb) dadgVar2.b.b()).l("No 1:1 participant found");
                    } else {
                        axnw.i(((chco) dadgVar2.c.b()).a().i(new eroh() { // from class: dadf
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                final dadg dadgVar3 = dadg.this;
                                elfl b = ((bzvx) dadgVar3.g.b()).b((String) obj);
                                final String str = m;
                                return b.h(new emwl() { // from class: dadc
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        Scope create = Scope.create(((cafi) dadg.this.h.b()).b());
                                        String[] strArr = bxiv.a;
                                        bxis bxisVar = new bxis(bxiv.a);
                                        final String str2 = str;
                                        bxisVar.d(new Function() { // from class: dade
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                bxiu bxiuVar = (bxiu) obj3;
                                                bxiuVar.b(str2);
                                                return bxiuVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        bxhy bxhyVar = (bxhy) bxisVar.b().y().get(0);
                                        bxhyVar.az(1, "tachyon_registration_id");
                                        ((NativeMessageEncryptorV2) obj2).deleteSession(create, bxhyVar.b);
                                        return null;
                                    }
                                }, dadgVar3.f);
                            }
                        }, dadgVar2.f), new Consumer() { // from class: dacw
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                ((ddzb) dadg.this.b.b()).l("Scytale session deleted");
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, dadgVar2.f);
                    }
                }
            }, optional);
            final dadg dadgVar2 = this.ap;
            m(addSubMenu10, "Clear local prekeys", new daur() { // from class: dagv
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dadg dadgVar3 = dadg.this;
                    elfl a = ((chco) dadgVar3.c.b()).a();
                    final bzqc bzqcVar = (bzqc) dadgVar3.d.b();
                    bzqcVar.getClass();
                    axnw.i(a.i(new eroh() { // from class: dada
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return bzqc.this.a((String) obj);
                        }
                    }, dadgVar3.f), new Consumer() { // from class: dadb
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ((ddzb) dadg.this.b.b()).l("Local prekeys cleared");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, dadgVar3.f);
                }
            }, optional);
            final dadg dadgVar3 = this.ap;
            m(addSubMenu10, "Upload prekeys", new daur() { // from class: dagw
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dadg dadgVar4 = dadg.this;
                    axnw.i(((chco) dadgVar4.c.b()).a().h(new emwl() { // from class: dacv
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ((bzqc) dadg.this.d.b()).f((String) obj);
                            return null;
                        }
                    }, dadgVar4.f), new Consumer() { // from class: dacx
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ((ddzb) dadg.this.b.b()).l("Prekey upload scheduled");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, dadgVar4.f);
                }
            }, optional);
            m(addSubMenu10, "Fork conversation", new daur() { // from class: dagx
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    elfl b = ((dacm) dauv.this.aD.b()).a.b("ConversationDebugOperations#forkLatestConversation", new Runnable() { // from class: dack
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            bsob e = bsom.e();
                            e.z("forkLatestConversation-conversations");
                            e.i(new Function() { // from class: dach
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bsol bsolVar = (bsol) obj;
                                    bsolVar.G();
                                    return bsolVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            e.e(new bsny(bsom.c.r, false));
                            e.x(1);
                            final bseh bsehVar = (bseh) ((bskr) e.b().o()).cT();
                            bsel F = bsehVar.F();
                            String a = bsehVar.C().a();
                            a.getClass();
                            F.B(bdgq.b(String.valueOf(Long.parseLong(a) + 1)));
                            F.f(null);
                            bseh b2 = F.b(new Supplier() { // from class: bsek
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new bsei();
                                }
                            });
                            b2.D();
                            bsehVar.getClass();
                            b2.getClass();
                            String[] strArr = bsdr.a;
                            bsdm bsdmVar = new bsdm(bsdr.a);
                            bsdmVar.z("forkLatestConversation-conversation_participants");
                            bsdmVar.f(new Function() { // from class: dacl
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bsdq bsdqVar = (bsdq) obj;
                                    bsdqVar.b(bseh.this.C());
                                    return bsdqVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            enqv it3 = bsdmVar.b().y().iterator();
                            it3.getClass();
                            while (it3.hasNext()) {
                                bscn o = ((bscj) it3.next()).o();
                                o.d(b2.C());
                                o.c();
                            }
                            buxo d2 = MessagesTable.d();
                            d2.z("forkLatestConversation-messages");
                            d2.h(new Function() { // from class: daci
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    buxz buxzVar = (buxz) obj;
                                    buxzVar.m(bseh.this.C());
                                    int intValue = MessagesTable.g().intValue();
                                    if (intValue < 56000) {
                                        dtub.w("draft_id", intValue);
                                    }
                                    buxzVar.aq(new dtrx("messages.draft_id", 5));
                                    return buxzVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            d2.d(new buxl(MessagesTable.c.i, false));
                            d2.x(1);
                            final MessagesTable.BindData bindData = (MessagesTable.BindData) ((buuo) d2.b().o()).cT();
                            buoy I = bindData.I();
                            I.j(null);
                            I.i(null);
                            I.x(Optional.of(UUID.randomUUID()));
                            I.m(b2.C());
                            MessagesTable.BindData c2 = I.c();
                            bwdf c3 = PartsTable.c();
                            c3.z("forkLatestConversation-parts");
                            c3.h(new Function() { // from class: dacj
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bwdm bwdmVar = (bwdm) obj;
                                    bwdmVar.n(MessagesTable.BindData.this.D());
                                    return bwdmVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            enqv it4 = c3.b().y().iterator();
                            it4.getClass();
                            while (it4.hasNext()) {
                                bvwp w = ((PartsTable.BindData) it4.next()).w();
                                w.J(c2.D());
                                w.d();
                            }
                        }
                    });
                    b.getClass();
                    axnw.h(b);
                }
            }, optional);
            if (csjc.d() && adhu.a() && ((Boolean) ((cfup) bzaq.n.get()).e()).booleanValue()) {
                m(addSubMenu10, "Keychain Pairing", new daur() { // from class: dagy
                    @Override // defpackage.daur
                    public final void a(dbiq dbiqVar) {
                        dauv dauvVar = dauv.this;
                        if (((Optional) dauvVar.aF.b()).isPresent()) {
                        }
                    }
                }, optional);
            }
            final dacp dacpVar = (dacp) this.bt.b();
            dacpVar.getClass();
            m(addSubMenu10, "Start Cronet NetLog", new daur() { // from class: dagz
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dacp dacpVar2 = dacp.this;
                    axnw.h(elfo.f(new Runnable() { // from class: daco
                        @Override // java.lang.Runnable
                        public final void run() {
                            dacp dacpVar3 = dacp.this;
                            try {
                                dacpVar3.e = File.createTempFile("netlog-", ".json", dacpVar3.b.getCacheDir());
                                ((enrr) ((enrr) dacp.a.h()).h("com/google/android/apps/messaging/ui/debug/CronetDebugUtils", "startCronetNetLog", 55, "CronetDebugUtils.java")).t("Starting Cronet NetLog. Output file: %s", dacpVar3.e);
                                ((CronetEngine) ((aipn) dacpVar3.c.b()).a().get()).startNetLogToFile(dacpVar3.e.toString(), true);
                            } catch (IOException e) {
                                ((enrr) ((enrr) ((enrr) dacp.a.j()).g(e)).h("com/google/android/apps/messaging/ui/debug/CronetDebugUtils", "startCronetNetLog", '4', "CronetDebugUtils.java")).q("Cannot start Cronet NetLog");
                            }
                        }
                    }, dacpVar2.d));
                }
            }, optional);
            final dacp dacpVar2 = (dacp) this.bt.b();
            dacpVar2.getClass();
            m(addSubMenu10, "Stop Cronet NetLog", new daur() { // from class: daha
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dacp dacpVar3 = dacp.this;
                    axnw.h(elfo.f(new Runnable() { // from class: dacn
                        @Override // java.lang.Runnable
                        public final void run() {
                            enrr enrrVar = (enrr) ((enrr) dacp.a.h()).h("com/google/android/apps/messaging/ui/debug/CronetDebugUtils", "stopCronetNetLog", 69, "CronetDebugUtils.java");
                            dacp dacpVar4 = dacp.this;
                            enrrVar.t("Stopping Cronet NetLog. Output file: %s", dacpVar4.e);
                            ((CronetEngine) ((aipn) dacpVar4.c.b()).a().get()).stopNetLog();
                        }
                    }, dacpVar3.d));
                }
            }, optional);
        }
        m(menu, "Diagnostics", new daur() { // from class: dahb
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((akvg) dauv.this.u.b()).A(dbiqVar.a);
            }
        }, optional);
        SubMenu addSubMenu11 = menu.addSubMenu("MDD");
        m(addSubMenu11, "Download now", new daur() { // from class: dahc
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final dauv dauvVar = dauv.this;
                axnw.h(elfl.g(((cgmf) dauvVar.N.b()).d()).h(new emwl() { // from class: daru
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        dauv dauvVar2 = dauv.this;
                        ((cgns) dauvVar2.s.b()).b(3, 2);
                        ((ddzb) dauvVar2.Y.b()).l("Download task handled.");
                        return new Object();
                    }
                }, erpp.a).e(Throwable.class, new emwl() { // from class: darv
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ((cgns) dauv.this.s.b()).b(3, 3);
                        return new Object();
                    }
                }, erpp.a));
            }
        }, optional);
        m(addSubMenu11, "Dump MDD Debug", new daur() { // from class: dahf
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ensk h = dauv.c.h();
                h.Y(ente.a, "Bugle");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionDumpMDDLibDebugInfo", 4971, "DebugUtilsImpl.java")).D("%s %s", "BugleMDD", ((cgmf) dauv.this.N.b()).f());
            }
        }, optional);
        m(addSubMenu11, "Advanced", new daur() { // from class: dahg
            @Override // defpackage.daur
            public final void a(final dbiq dbiqVar) {
                ((cgmf) dauv.this.N.b()).e(dbiqVar.a).ifPresent(new Consumer() { // from class: daqk
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = dauv.c;
                        eldl.p(dbiq.this.a, (Intent) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }, optional);
        if (aewg.h()) {
            m(menu.addSubMenu("Stickers"), true != ((Boolean) ctjd.r.e()).booleanValue() ? "Enable sticker emotion debug" : "Disable sticker emotion debug", new daur() { // from class: dahh
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    enru enruVar = dauv.c;
                    if (csjc.d()) {
                        dauv.s(ctjd.r, Boolean.valueOf(!((Boolean) ctjd.r.e()).booleanValue()));
                    }
                }
            }, optional);
            final SubMenu addSubMenu12 = menu.addSubMenu("Super Sort");
            final SubMenu addSubMenu13 = addSubMenu12.addSubMenu("Label Conversation");
            DesugarArrays.stream(SuperSortLabel.values()).forEach(new Consumer() { // from class: dahi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    final SuperSortLabel superSortLabel = (SuperSortLabel) obj;
                    String name = superSortLabel.name();
                    final dauv dauvVar = dauv.this;
                    dauvVar.m(addSubMenu13, name, new daur() { // from class: dary
                        @Override // defpackage.daur
                        public final void a(dbiq dbiqVar) {
                            if (dbiqVar.b.isEmpty()) {
                                return;
                            }
                            final dauv dauvVar2 = dauv.this;
                            if (((Optional) dauvVar2.aq.b()).isEmpty()) {
                                return;
                            }
                            final SuperSortLabel superSortLabel2 = superSortLabel;
                            final bcqs bcqsVar = (bcqs) dbiqVar.b.get();
                            axnw.h(elfo.g(new Callable() { // from class: daot
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    enru enruVar = dauv.c;
                                    buxo d2 = MessagesTable.d();
                                    d2.z("getLastMessageIdInConversation");
                                    d2.f(new Function() { // from class: daoa
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            enru enruVar2 = dauv.c;
                                            return ((buum) obj2).a;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    final ConversationIdType conversationIdType = bcqs.this.e;
                                    d2.h(new Function() { // from class: daob
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            buxz buxzVar = (buxz) obj2;
                                            enru enruVar2 = dauv.c;
                                            buxzVar.m(ConversationIdType.this);
                                            buxzVar.af(100);
                                            return buxzVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    d2.d(new buxl(MessagesTable.c.g, false));
                                    d2.x(1);
                                    buuo buuoVar = (buuo) d2.b().o();
                                    try {
                                        MessageIdType q = buuoVar.moveToFirst() ? buuoVar.q() : bdhb.a;
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
                            }, dauvVar2.ah).i(new eroh() { // from class: daov
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    return ((aeyq) ((Optional) dauv.this.aq.b()).get()).a(new aeyc((MessageIdType) obj2, superSortLabel2, "", buay.USER, buax.HIGH, "", false));
                                }
                            }, dauvVar2.ah).h(new emwl() { // from class: daow
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    dauv dauvVar3 = dauv.this;
                                    Boolean bool = (Boolean) obj2;
                                    if (bool == null || !bool.booleanValue()) {
                                        ((ddzb) dauvVar3.Y.b()).l("Unable to label last message in conversation");
                                        return bool;
                                    }
                                    SuperSortLabel superSortLabel3 = superSortLabel2;
                                    bcqs bcqsVar2 = bcqsVar;
                                    ((ddzb) dauvVar3.Y.b()).l("Conversation with " + bcqsVar2.l() + " labeled as " + superSortLabel3.name());
                                    return bool;
                                }
                            }, erpp.a));
                        }
                    }, optional);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((Optional) this.br.b()).ifPresent(new Consumer() { // from class: dahj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    final aitx aitxVar = (aitx) obj;
                    dauv.this.m(addSubMenu12, "Reset OTP auto-delete states", new daur() { // from class: daln
                        @Override // defpackage.daur
                        public final void a(dbiq dbiqVar) {
                            enru enruVar = dauv.c;
                            emwl emwlVar = new emwl() { // from class: aitw
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    aiuk aiukVar = (aiuk) ((aiul) obj2).toBuilder();
                                    aiukVar.copyOnWrite();
                                    ((aiul) aiukVar.instance).c = false;
                                    aiukVar.copyOnWrite();
                                    ((aiul) aiukVar.instance).d = false;
                                    aiukVar.copyOnWrite();
                                    ((aiul) aiukVar.instance).b = 0;
                                    return (aiul) aiukVar.build();
                                }
                            };
                            aitx aitxVar2 = aitx.this;
                            axnw.h(elfl.g(aitxVar2.b.b(emwlVar, aitxVar2.a)));
                        }
                    }, optional);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        ((Optional) ((fbbb) this.bs).a).ifPresent(new Consumer() { // from class: dahk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final sxi sxiVar = (sxi) obj;
                SubMenu addSubMenu14 = menu.addSubMenu("Spam");
                final dauv dauvVar = dauv.this;
                daur daurVar = new daur() { // from class: dapd
                    @Override // defpackage.daur
                    public final void a(dbiq dbiqVar) {
                        Activity activity = dbiqVar.a;
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                        ScrollView scrollView = new ScrollView(activity);
                        LinearLayout linearLayout = new LinearLayout(activity);
                        scrollView.addView(linearLayout);
                        scrollView.setFillViewport(true);
                        linearLayout.setOrientation(1);
                        builder.setView(scrollView);
                        linearLayout.addView(dbiqVar.b("Comma separated spammy phone numbers"));
                        final EditText a = dbiqVar.a(1);
                        a.setHint("+14445556666,+12223334444");
                        final dauv dauvVar2 = dauv.this;
                        engw n = engw.n(((csrx) dauvVar2.G.b()).a);
                        if (!n.isEmpty()) {
                            a.setText(TextUtils.join(",", n));
                        }
                        linearLayout.addView(a);
                        builder.setPositiveButton("Create", (DialogInterface.OnClickListener) null);
                        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: dapl
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                enru enruVar = dauv.c;
                                dialogInterface.dismiss();
                            }
                        });
                        AlertDialog create = builder.create();
                        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: dapm
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(final DialogInterface dialogInterface) {
                                Button button = ((AlertDialog) dialogInterface).getButton(-1);
                                final dauv dauvVar3 = dauv.this;
                                final EditText editText = a;
                                button.setOnClickListener(new View.OnClickListener() { // from class: danx
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        dauv dauvVar4 = dauv.this;
                                        csrx csrxVar = (csrx) dauvVar4.G.b();
                                        int i = engw.d;
                                        csrxVar.a(enou.a);
                                        String obj2 = editText.getText().toString();
                                        if (!TextUtils.isEmpty(obj2)) {
                                            List e = cuxt.e(obj2);
                                            if (!e.isEmpty()) {
                                                csrx csrxVar2 = (csrx) dauvVar4.G.b();
                                                Stream stream = Collection.EL.stream(e);
                                                final aolr aolrVar = (aolr) dauvVar4.aB.b();
                                                aolrVar.getClass();
                                                csrxVar2.a((java.util.Collection) stream.map(new Function() { // from class: darf
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj3) {
                                                        return aolr.this.n((String) obj3);
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }).collect(endq.a));
                                            }
                                        }
                                        DialogInterface dialogInterface2 = dialogInterface;
                                        ((ddzb) dauvVar4.Y.b()).l("List updated to: ".concat(String.valueOf((String) Collection.EL.stream(engw.n(((csrx) dauvVar4.G.b()).b)).map(new Function() { // from class: damx
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                enru enruVar = dauv.c;
                                                return emxe.b(((aoku) obj3).G().a);
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).collect(Collectors.joining(",")))));
                                        dialogInterface2.dismiss();
                                    }
                                });
                            }
                        });
                        create.show();
                    }
                };
                Optional optional2 = optional;
                dauvVar.m(addSubMenu14, "Manage phone numbers with rcs spam warning...", daurVar, optional2);
                dauvVar.m(addSubMenu14, "Mark as detected spam", new daur() { // from class: dapo
                    @Override // defpackage.daur
                    public final void a(dbiq dbiqVar) {
                        enru enruVar = dauv.c;
                        sxi.this.a();
                    }
                }, optional2);
                dauvVar.m(addSubMenu14, "Reset spam status", new daur() { // from class: dapz
                    @Override // defpackage.daur
                    public final void a(dbiq dbiqVar) {
                        enru enruVar = dauv.c;
                        sxi.this.b();
                    }
                }, optional2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        SubMenu addSubMenu14 = menu.addSubMenu("Theme");
        if (((Boolean) cful.ao.e()).booleanValue()) {
            m(addSubMenu14, "Disable system font", new daur() { // from class: dahl
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    enru enruVar = dauv.c;
                    dauv.s(cful.ao, false);
                    dbiqVar.a.recreate();
                }
            }, optional);
        } else {
            m(addSubMenu14, "Enable system font", new daur() { // from class: dahm
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    enru enruVar = dauv.c;
                    dauv.s(cful.ao, true);
                    dbiqVar.a.recreate();
                }
            }, optional);
        }
        final SubMenu addSubMenu15 = menu.addSubMenu("Profiles");
        m(addSubMenu15, "Conversation Profile Details", new daur() { // from class: dahn
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                final ConversationIdType conversationIdType = (ConversationIdType) dbiqVar.b.map(new dajz()).orElse(dauv.h());
                bruu a = brux.a();
                a.z("actionGetConversationsPartAuditLogTable");
                a.c(new Function() { // from class: danh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bruw bruwVar = (bruw) obj;
                        enru enruVar = dauv.c;
                        bruwVar.b(ConversationIdType.this);
                        return bruwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final enip enipVar = (enip) Collection.EL.stream(a.b().y()).map(new Function() { // from class: dani
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        enru enruVar = dauv.c;
                        return Long.valueOf(((brti) obj).k());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.b);
                bwon a2 = ProfilesTable.a();
                a2.z("actionGetConversationsProfilesTable");
                a2.e(new Function() { // from class: danj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bwor bworVar = (bwor) obj;
                        enru enruVar = dauv.c;
                        bworVar.aq(new dtrw("profiles_table.participant_id", 3, bwor.at(enip.this), true));
                        return bworVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                Stream stream = Collection.EL.stream(a2.b().y());
                final dauv dauvVar = dauv.this;
                Stream map = stream.map(new Function() { // from class: dank
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ProfilesTable.BindData bindData = (ProfilesTable.BindData) obj;
                        return "Profile name: " + bindData.v() + "\nProfile number: " + bindData.z() + "\nProfile url: " + String.valueOf(bindData.q()) + "\nTime since last photo update (in minutes): " + Duration.ofMillis(dauv.this.l.f().toEpochMilli() - bindData.o()).toMinutes();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                engw engwVar = (engw) map.collect(endq.a);
                AlertDialog.Builder title = new AlertDialog.Builder(dbiqVar.a).setTitle("Conversation Profile Details");
                StringBuilder sb = new StringBuilder();
                Iterator<E> it3 = engwVar.iterator();
                if (it3.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it3.next());
                        if (!it3.hasNext()) {
                            break;
                        } else {
                            sb.append((CharSequence) "\n\n");
                        }
                    }
                }
                title.setMessage(sb.toString()).setCancelable(true).show();
            }
        }, optional);
        m(addSubMenu15, "Reset Shared Profile Tokens", new daur() { // from class: dahp
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                axnw.h(((aqkp) dauv.this.bi.b()).F(2));
            }
        }, optional);
        ((Optional) this.bz.b()).ifPresent(new Consumer() { // from class: dahr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final cvjo cvjoVar = (cvjo) obj;
                dauv.this.m(addSubMenu15, "Reset Welcome Flow V1 state", new daur() { // from class: danu
                    @Override // defpackage.daur
                    public final void a(dbiq dbiqVar) {
                        enru enruVar = dauv.c;
                        cvjo.this.k();
                    }
                }, optional);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && ((Optional) this.aI.b()).isPresent()) {
            m(menu.addSubMenu("Penpal conversation"), "Clean up Penpal bot", new daur() { // from class: dahs
                @Override // defpackage.daur
                public final void a(dbiq dbiqVar) {
                    final dauv dauvVar = dauv.this;
                    axnw.h(elfo.f(new Runnable() { // from class: daql
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object apply;
                            final dauv dauvVar2 = dauv.this;
                            ((cjeo) ((Optional) dauvVar2.aJ.b()).get()).k();
                            brwp a = brww.a();
                            a.e(new Function() { // from class: darm
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    brwv brwvVar = (brwv) obj;
                                    bvvn e = ParticipantsTable.e();
                                    final dauv dauvVar3 = dauv.this;
                                    e.h(new Function() { // from class: daqw
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            bvvw bvvwVar = (bvvw) obj2;
                                            bvvwVar.r(((cjdk) ((Optional) dauv.this.aI.b()).get()).r());
                                            return bvvwVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    Stream map = Collection.EL.stream(e.b().f()).map(new Function() { // from class: daqx
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            return Long.valueOf(Long.parseLong((String) obj2));
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    int i = engw.d;
                                    brwvVar.d((Iterable) map.collect(endq.a));
                                    return brwvVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            brwa brwaVar = (brwa) a.b().p(brww.c.a);
                            try {
                                engw c2 = brwaVar.c();
                                brwaVar.close();
                                if (((enou) c2).c > 0) {
                                    dauvVar2.v("Failed: please delete all Penpal conversations and try again.");
                                    return;
                                }
                                String[] strArr = ParticipantsTable.a;
                                bvvf bvvfVar = new bvvf();
                                apply = new Function() { // from class: daro
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bvvw bvvwVar = (bvvw) obj;
                                        bvvwVar.r(((cjdk) ((Optional) dauv.this.aI.b()).get()).r());
                                        return bvvwVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }.apply(new bvvw());
                                bvvfVar.b = new bvvs((bvvw) apply);
                                dauvVar2.v(bvvfVar.d() > 0 ? "Penpal bot is removed." : "No recipient is removed.");
                            } catch (Throwable th) {
                                try {
                                    brwaVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }, dauvVar.aU));
                }
            }, optional);
        }
        optional.ifPresent(new Consumer() { // from class: daht
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final Activity activity = (Activity) obj;
                final dbne dbneVar = (dbne) dauv.this.aO.b();
                Menu menu2 = menu;
                menu2.getClass();
                activity.getClass();
                SubMenu addSubMenu16 = menu2.addSubMenu("Wear");
                MenuItem add = addSubMenu16.add("Report wear sync status");
                add.getClass();
                dbneVar.a(add, activity, new ffji() { // from class: dbmr
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        ((dbiq) obj2).getClass();
                        dbne.this.b(activity);
                        return ffcu.a;
                    }
                });
                MenuItem add2 = addSubMenu16.add("Force disable wear sync");
                add2.getClass();
                dbneVar.a(add2, activity, new ffji() { // from class: dbms
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        ((dbiq) obj2).getClass();
                        ensk f = dbne.a.f();
                        f.Y(ente.a, "BugleWearable");
                        enrr enrrVar = (enrr) f;
                        enrrVar.Y(csux.O, "WearableDebugMenuProvider");
                        ((enrr) enrrVar.h("com/google/android/apps/messaging/ui/debug/wearable/WearableDebugMenuProvider", "forceDisableWearSync", 116, "WearableDebugMenuProvider.kt")).q("Clearing watch connected data store from debug menu.");
                        dbne dbneVar2 = dbne.this;
                        axol.k(dbneVar2.l, null, new dbmy(dbneVar2, activity, null), 3);
                        return ffcu.a;
                    }
                });
                MenuItem add3 = addSubMenu16.add("Force enable wear sync");
                add3.getClass();
                dbneVar.a(add3, activity, new ffji() { // from class: dbmt
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        ((dbiq) obj2).getClass();
                        final dbne dbneVar2 = dbne.this;
                        final Activity activity2 = activity;
                        final Runnable runnable = new Runnable() { // from class: dbmo
                            @Override // java.lang.Runnable
                            public final void run() {
                                dbne dbneVar3 = dbne.this;
                                axol.k(dbneVar3.l, null, new dbmz(dbneVar3, activity2, null), 3);
                            }
                        };
                        if (dbneVar2.h.b()) {
                            ensk f = dbne.a.f();
                            f.Y(ente.a, "BugleWearable");
                            enrr enrrVar = (enrr) f;
                            enrrVar.Y(csux.O, "WearableDebugMenuProvider");
                            ((enrr) enrrVar.h("com/google/android/apps/messaging/ui/debug/wearable/WearableDebugMenuProvider", "forceEnableWearSync", 169, "WearableDebugMenuProvider.kt")).q("Marking watch as online from debug menu.");
                            runnable.run();
                        } else {
                            new AlertDialog.Builder(activity2).setTitle("Potential misconfiguration").setMessage("Force enabling wear sync but no WearOS Companion app(s) is installed. Missing Wearable GmsCore modules may result in unexpected sync behavior.\n\nConsider installing \"Google Pixel Watch\" from the Play Store.").setCancelable(true).setPositiveButton("Ack", new elbb(dbneVar2.j, "WearDebugDialogClick", new DialogInterface.OnClickListener() { // from class: dbmp
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    ensk f2 = dbne.a.f();
                                    f2.Y(ente.a, "BugleWearable");
                                    enrr enrrVar2 = (enrr) f2;
                                    enrrVar2.Y(csux.O, "WearableDebugMenuProvider");
                                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/ui/debug/wearable/WearableDebugMenuProvider", "forceEnableWearSync$lambda$8", 156, "WearableDebugMenuProvider.kt")).q("Marking watch as online from debug menu with missing WearOS modules.");
                                    runnable.run();
                                }
                            })).show();
                        }
                        return ffcu.a;
                    }
                });
                MenuItem add4 = addSubMenu16.add("Queue wear sync");
                add4.getClass();
                dbneVar.a(add4, activity, new ffji() { // from class: dbmu
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        ((dbiq) obj2).getClass();
                        dbne dbneVar2 = dbne.this;
                        axol.k(dbneVar2.l, null, new dbnd(dbneVar2, null), 3);
                        return ffcu.a;
                    }
                });
                MenuItem add5 = addSubMenu16.add("Clear DataClient broadcasts");
                add5.getClass();
                dbneVar.a(add5, activity, new ffji() { // from class: dbmv
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        ((dbiq) obj2).getClass();
                        dbne dbneVar2 = dbne.this;
                        axol.k(dbneVar2.l, null, new dbmx(dbneVar2, null), 3);
                        return ffcu.a;
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        m(menu.addSubMenu("Satellite"), "Connect to Satellite", new daur() { // from class: dahu
            @Override // defpackage.daur
            public final void a(dbiq dbiqVar) {
                ((cnoc) dauv.this.aR.b()).b(new daub());
            }
        }, optional);
    }

    @Override // defpackage.dafa
    public final SmsMessage[] c(String str) {
        DataInputStream dataInputStream;
        SmsMessage[] smsMessageArr = new SmsMessage[0];
        DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new DataInputStream(new FileInputStream(((csrv) this.U.b()).a(str, false, this.x)));
        } catch (FileNotFoundException unused) {
        } catch (StreamCorruptedException unused2) {
        } catch (IOException unused3) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (dataInputStream.readInt() > 0) {
                dataInputStream.readUTF();
            }
            int readInt = dataInputStream.readInt();
            SmsMessage[] smsMessageArr2 = new SmsMessage[readInt];
            for (int i = 0; i < readInt; i++) {
                int readInt2 = dataInputStream.readInt();
                byte[] bArr = new byte[readInt2];
                dataInputStream.read(bArr, 0, readInt2);
                smsMessageArr2[i] = SmsMessage.createFromPdu(bArr);
            }
            try {
                dataInputStream.close();
            } catch (IOException unused4) {
            }
            return smsMessageArr2;
        } catch (FileNotFoundException unused5) {
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 == null) {
                return smsMessageArr;
            }
            try {
                dataInputStream2.close();
                return smsMessageArr;
            } catch (IOException unused6) {
                return smsMessageArr;
            }
        } catch (StreamCorruptedException unused7) {
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 == null) {
                return smsMessageArr;
            }
            dataInputStream2.close();
            return smsMessageArr;
        } catch (IOException unused8) {
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 == null) {
                return smsMessageArr;
            }
            dataInputStream2.close();
            return smsMessageArr;
        } catch (Throwable th2) {
            dataInputStream2 = dataInputStream;
            th = th2;
            if (dataInputStream2 != null) {
                try {
                    dataInputStream2.close();
                } catch (IOException unused9) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.dafa
    public final void d(int i, Activity activity, Optional optional) {
        e(i, activity, optional, b);
    }

    @Override // defpackage.dafa
    public final void e(int i, Activity activity, Optional optional, Optional optional2) {
        int i2;
        if (((csrv) this.U.b()).q() && i - 3001 >= 0 && i2 < this.bw.size()) {
            daur daurVar = (daur) this.bw.get(i2);
            daurVar.a(dbir.a(activity, optional, optional2));
        }
    }

    final int f() {
        return ((ctwb) this.C.b()).f();
    }

    public final MessageCoreData g(final ConversationIdType conversationIdType) {
        buxo d2 = MessagesTable.d();
        d2.z("getLastUndeliveredRcsMessage");
        d2.h(new Function() { // from class: daox
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                enru enruVar = dauv.c;
                buxzVar.m(ConversationIdType.this);
                buxzVar.K(3);
                buxzVar.af(1);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d2.f(new Function() { // from class: daoy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = dauv.c;
                return ((buum) obj).C;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d2.x(1);
        buuo buuoVar = (buuo) d2.b().o();
        try {
            MessageCoreData w = buuoVar.moveToFirst() ? ((bdmq) this.bn.b()).w(buuoVar.r()) : null;
            buuoVar.close();
            return w;
        } catch (Throwable th) {
            try {
                buuoVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ciii i(ctwi ctwiVar) {
        return new ciii(((chco) this.S.b()).g(ctwiVar.a()));
    }

    public final ctwi j(int i) {
        if (i < 0) {
            return null;
        }
        return ((ctwb) this.C.b()).h(i);
    }

    public final elfl k() {
        chbx chbxVar = (chbx) this.I.b();
        synchronized (chbxVar.c) {
            chbxVar.d.clear();
        }
        Stream map = Collection.EL.stream(((djrv) this.aL.b()).p()).map(new dana()).map(new Function() { // from class: daqm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final chpy a = ((chpz) dauv.this.Q.b()).a((String) obj);
                chpy.a.p("Clearing Tachyon phone data");
                final AtomicReference atomicReference = new AtomicReference();
                return a.b.h().i(new eroh() { // from class: chog
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        atomicReference.set((chod) obj2);
                        return chpy.this.b.f();
                    }
                }, erpp.a).i(new eroh() { // from class: choh
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        AtomicReference atomicReference2 = atomicReference;
                        choc b = choc.b(((chod) atomicReference2.get()).i);
                        if (b == null) {
                            b = choc.UNRECOGNIZED;
                        }
                        chpy chpyVar = chpy.this;
                        chpyVar.p(b, choc.UNSET_TACHYON_STATE, 6);
                        choc b2 = choc.b(((chod) atomicReference2.get()).i);
                        if (b2 == null) {
                            b2 = choc.UNRECOGNIZED;
                        }
                        return chpyVar.o(b2, choc.UNSET_TACHYON_STATE, 6);
                    }
                }, a.c);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        elfl a = elfo.j((Iterable) map.collect(endq.a)).a(new Callable() { // from class: daqn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                enru enruVar = dauv.c;
                return null;
            }
        }, this.af);
        csvs.c(a, "Bugle", "Failed to clear tachyon phone registration data");
        return a;
    }

    public final void m(Menu menu, String str, daur daurVar, final Optional optional) {
        this.bw.add(daurVar);
        MenuItem add = menu.add(0, this.bw.size() + 3000, 0, str);
        if (adhu.a() && optional.isPresent()) {
            add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: damu
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    Optional optional2 = optional;
                    int itemId = menuItem.getItemId();
                    Object obj = optional2.get();
                    Optional empty = Optional.empty();
                    Optional empty2 = Optional.empty();
                    dauv.this.e(itemId, (Activity) obj, empty, empty2);
                    return false;
                }
            });
        }
    }

    public final void o(eytd eytdVar) {
        eytb eytbVar = (eytb) eyte.a.createBuilder();
        eytbVar.copyOnWrite();
        ((eyte) eytbVar.instance).b = eytdVar.a();
        String valueOf = String.valueOf(String.valueOf(UUID.randomUUID()));
        eytbVar.copyOnWrite();
        ((eyte) eytbVar.instance).c = "debug_".concat(valueOf);
        ((ckds) this.w.b()).w((eyte) eytbVar.build());
    }

    public final void q(Activity activity, String str, CharSequence charSequence, final Runnable runnable, final Runnable runnable2, final String str2) {
        new AlertDialog.Builder(activity).setTitle(a.F(charSequence, "Persist setting as ", "?")).setMessage(str + " will be persisted as " + String.valueOf(charSequence) + " until you manually change it again in the debug menu.").setPositiveButton("Continue", new DialogInterface.OnClickListener() { // from class: danp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnable.run();
                String str3 = str2;
                if (str3 != null) {
                    ((ddzb) dauv.this.Y.b()).l(str3);
                }
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: danq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                enru enruVar = dauv.c;
                Runnable runnable3 = runnable2;
                if (runnable3 != null) {
                    runnable3.run();
                }
            }
        }).show();
    }

    public final void r() {
        s(cszt.p, 1);
        s(cszt.o, 0L);
        s(cszt.n, 0);
        s(cszt.m, 0L);
        s(cszt.q, true);
        ((ctyx) this.q.b()).h("has_sent_a_message", true);
        ((ctyx) this.q.b()).h("has_dismissed_hats", false);
    }

    public final void u(final String str) {
        efbd.e(new Runnable() { // from class: daoc
            @Override // java.lang.Runnable
            public final void run() {
                ((ddwn) dauv.this.bg.b()).b(str, false);
            }
        });
    }

    @Deprecated
    public final void v(final String str) {
        efbd.e(new Runnable() { // from class: dapg
            @Override // java.lang.Runnable
            public final void run() {
                ((ddzb) dauv.this.Y.b()).l(str);
            }
        });
    }

    public final void x(dbiq dbiqVar, final boolean z, final boolean z2) {
        Activity activity = dbiqVar.a;
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        ScrollView scrollView = new ScrollView(activity);
        LinearLayout linearLayout = new LinearLayout(activity);
        scrollView.addView(linearLayout);
        scrollView.setFillViewport(true);
        linearLayout.setOrientation(1);
        builder.setView(scrollView);
        linearLayout.addView(dbiqVar.b("Create Fake Telephony Message"));
        linearLayout.addView(dbiqVar.c());
        linearLayout.addView(dbiqVar.b("Phone number"));
        final EditText a = dbiqVar.a(1);
        a.setHint("E.g. 5555550000");
        linearLayout.addView(a);
        linearLayout.addView(dbiqVar.b("Message text"));
        final EditText a2 = dbiqVar.a(1);
        a2.setHint("Message text");
        linearLayout.addView(a2);
        builder.setPositiveButton("Create", (DialogInterface.OnClickListener) null);
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: daqd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                enru enruVar = dauv.c;
                dialogInterface.dismiss();
            }
        });
        AlertDialog create = builder.create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: daqe
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Button button = ((AlertDialog) dialogInterface).getButton(-1);
                final dauv dauvVar = dauv.this;
                final EditText editText = a;
                final EditText editText2 = a2;
                final boolean z3 = z;
                final boolean z4 = z2;
                button.setOnClickListener(new View.OnClickListener() { // from class: dajd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z5 = z3;
                        dauv dauvVar2 = dauv.this;
                        EditText editText3 = editText;
                        EditText editText4 = editText2;
                        boolean z6 = z4;
                        try {
                            String obj = editText3.getText().toString();
                            String obj2 = editText4.getText().toString();
                            ((ddzb) dauvVar2.Y.b()).l("Creating conversation");
                            new davj((davk) dauvVar2.ai.b(), obj, obj2, z5, z6).e(new Void[0]);
                        } catch (Exception e) {
                            ((ddzb) dauvVar2.Y.b()).l("Error: ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                });
            }
        });
        create.show();
    }

    public final void y(Context context, Consumer consumer) {
        List m = ((ctwb) this.C.b()).m();
        if (m.isEmpty()) {
            ((ddzb) this.Y.b()).l("No sims inserted");
            return;
        }
        if (m.size() == 1) {
            consumer.o((ctwi) m.get(0));
            return;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, m);
        rt rtVar = new rt(context);
        rtVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        rtVar.setAdapter((SpinnerAdapter) arrayAdapter);
        rtVar.setOnItemSelectedListener(new dauc(consumer, arrayAdapter));
        new AlertDialog.Builder(context).setTitle("Select a sim").setView(rtVar).setCancelable(true).create().show();
    }

    public final void z(boolean z) {
        cklj ckljVar = (cklj) this.bq.b();
        if (z) {
            String f = ((dkpm) this.as.b()).f();
            cklj.a.m("Starting the RCS Engine");
            ckljVar.a(true, f).k(axnw.b(), this.ah);
            return;
        }
        String f2 = ((dkpm) this.as.b()).f();
        cklj.a.m("Stopping the RCS Engine");
        ckljVar.a(false, f2).k(axnw.b(), this.ah);
    }
}
