package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.widget.AppCompatTextView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.debug.cloudstore.analysisui.CmsSyncAnalysisActivity;
import com.google.android.apps.messaging.ui.debug.cloudstore.d2d.D2dToolsActivity;
import com.google.android.apps.messaging.ui.debug.cloudstore.keyretrievalclient.KeyRetrievalClientActivity;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dayt implements daxk {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/debug/cloudstore/CloudStoreDebugMenuProviderImpl");
    public final dazm b;
    public final ffbr c;
    public final axmm d;
    public final ffsk e;
    public final ffhd f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final cgwa j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    private final asik r;
    private final ffbr s;
    private final ffbz t;
    private final ffbz u;

    public dayt(dazm dazmVar, dbir dbirVar, ffbr ffbrVar, axmm axmmVar, ffsk ffskVar, ffhd ffhdVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cgwa cgwaVar, ffbr ffbrVar5, ffbr ffbrVar6, asik asikVar, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12) {
        dbirVar.getClass();
        ffbrVar.getClass();
        axmmVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        cgwaVar.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        ffbrVar11.getClass();
        ffbrVar12.getClass();
        this.b = dazmVar;
        this.c = ffbrVar;
        this.d = axmmVar;
        this.e = ffskVar;
        this.f = ffhdVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.j = cgwaVar;
        this.k = ffbrVar5;
        this.l = ffbrVar6;
        this.r = asikVar;
        this.s = ffbrVar7;
        this.m = ffbrVar8;
        this.n = ffbrVar9;
        this.o = ffbrVar10;
        this.p = ffbrVar11;
        this.q = ffbrVar12;
        this.t = ffca.a(new ffix() { // from class: daxy
            @Override // defpackage.ffix
            public final Object invoke() {
                comu c = comv.c();
                c.d(comb.CMS_SETTINGS);
                c.f(axez.a);
                return ((comy) dayt.this.c.b()).a(c.a());
            }
        });
        this.u = ffca.a(new ffix() { // from class: daxz
            @Override // defpackage.ffix
            public final Object invoke() {
                return (daxi) fflm.b((Optional) ((fbbb) dayt.this.m).a);
            }
        });
    }

    private final void d(MenuItem menuItem, final Activity activity, final ffji ffjiVar) {
        menuItem.setOnMenuItemClickListener(new elbk((elbx) this.s.b(), "CloudStoreDebugMenuClick", new MenuItem.OnMenuItemClickListener() { // from class: daxl
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem2) {
                menuItem2.getClass();
                ffjiVar.invoke(dbir.a(activity, Optional.empty(), Optional.empty()));
                return false;
            }
        }));
    }

    @Override // defpackage.daxk
    public final void a(Menu menu, final Activity activity) {
        menu.getClass();
        activity.getClass();
        SubMenu addSubMenu = menu.addSubMenu("CMS Sync & Backup");
        addSubMenu.getClass();
        boolean j = this.d.j((axez) b().l());
        if (j) {
            final Intent a2 = akuv.c(activity, CmsSyncAnalysisActivity.class, "android.intent.action.VIEW").a();
            a2.getClass();
            MenuItem add = addSubMenu.add("Backup & Restore Analysis");
            add.getClass();
            d(add, activity, new ffji() { // from class: daxw
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    eldl.p(activity, a2);
                    return ffcu.a;
                }
            });
        }
        if (!csjc.g()) {
            MenuItem add2 = addSubMenu.add("Log local CMS keys");
            add2.getClass();
            d(add2, activity, new ffji() { // from class: daxo
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    cskc g = cskc.g("BugleCms", "DebugUtils");
                    dayt daytVar = dayt.this;
                    axol.k(daytVar.e, null, new days(daytVar, g, null), 3);
                    return ffcu.a;
                }
            });
        }
        MenuItem add3 = addSubMenu.add("Show CMS Settings Data");
        add3.getClass();
        d(add3, activity, new ffji() { // from class: daxp
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dbiq dbiqVar = (dbiq) obj;
                dbiqVar.getClass();
                dayt daytVar = dayt.this;
                axez axezVar = (axez) daytVar.b().l();
                String b = daytVar.d.b(axezVar);
                dazn daznVar = new dazn(dbiqVar, activity);
                axeu b2 = axeu.b(axezVar.l);
                if (b2 == null) {
                    b2 = axeu.UNSPECIFIED_STATUS;
                }
                daznVar.a("MD Feature Enable Status", b2.name());
                axeu b3 = axeu.b(axezVar.r);
                if (b3 == null) {
                    b3 = axeu.UNSPECIFIED_STATUS;
                }
                daznVar.a("B&R Feature Enable Status", b3.name());
                daznVar.a("Is MultiDevice enabled", String.valueOf(axezVar.e));
                daznVar.a("Is B&R enabled", String.valueOf(axezVar.q));
                daznVar.a("Is B&R preparing to start", String.valueOf(((axcm) daytVar.p.b()).a()));
                daznVar.a("Initial sync status", b);
                axes b4 = axes.b(axezVar.y);
                if (b4 == null) {
                    b4 = axes.ENCRYPTION_STATUS_UNSPECIFIED;
                }
                String substring = b4.name().substring(18);
                substring.getClass();
                daznVar.a("Encryption status", substring);
                daznVar.a("HasFolsomConsent", String.valueOf(axezVar.D));
                String str = axezVar.h;
                str.getClass();
                daznVar.a("Restore page token", str);
                StringBuilder sb = new StringBuilder("R:(P:");
                axky axkyVar = axezVar.C;
                if (axkyVar == null) {
                    axkyVar = axky.a;
                }
                axkyVar.getClass();
                sb.append(axkyVar.l);
                sb.append("/");
                sb.append(axkyVar.k);
                sb.append(",C:");
                sb.append(axkyVar.h);
                sb.append("/");
                sb.append(axkyVar.g);
                sb.append(",M:");
                sb.append(axkyVar.d);
                sb.append("/");
                sb.append(axkyVar.c);
                sb.append(")\nB:(P:");
                sb.append(axkyVar.n);
                sb.append("/");
                sb.append(axkyVar.m);
                sb.append(",C:");
                sb.append(axkyVar.j);
                sb.append("/");
                sb.append(axkyVar.i);
                sb.append(",M:");
                sb.append(axkyVar.f);
                sb.append("/");
                sb.append(axkyVar.e);
                sb.append(")");
                daznVar.a("Initial sync progress data", sb.toString());
                daznVar.a("Record Initial Sync Progress", String.valueOf(axezVar.B));
                String str2 = axezVar.j;
                str2.getClass();
                ensk h = dayt.a.h();
                h.Y(ente.a, "BugleCms");
                ((enrr) h.h("com/google/android/apps/messaging/ui/debug/cloudstore/CloudStoreDebugMenuProviderImpl", "showCmsSettingsData", 344, "CloudStoreDebugMenuProviderImpl.kt")).t("Cms session id = %s", str2);
                daznVar.a("Session id", str2);
                eygr eygrVar = axezVar.L;
                eygrVar.getClass();
                dbiq dbiqVar2 = daznVar.a;
                int i = daznVar.c + 1;
                daznVar.c = i;
                daznVar.b(dbiqVar2.b(i + ". Previous session ids:"));
                Activity activity2 = daznVar.a.a;
                rt rtVar = new rt(activity2);
                rtVar.setAdapter((SpinnerAdapter) new ArrayAdapter(activity2, R.layout.simple_spinner_dropdown_item, eygrVar));
                rtVar.setSelection(0, false);
                daznVar.b(rtVar);
                String str3 = axezVar.g;
                str3.getClass();
                daznVar.a("Device id", str3);
                axey axeyVar = axezVar.z;
                if (axeyVar == null) {
                    axeyVar = axey.a;
                }
                daznVar.a("Failed-to-back-up count due to storage", String.valueOf(axeyVar.c));
                eyja eyjaVar = axezVar.I;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                daznVar.a("cmsD2DTimestamp", eykm.i(eyjaVar));
                eyja eyjaVar2 = axezVar.H;
                if (eyjaVar2 == null) {
                    eyjaVar2 = eyja.a;
                }
                daznVar.a("dailyRetrievedCmsTimestamp", eykm.i(eyjaVar2));
                String str4 = axezVar.K;
                str4.getClass();
                daznVar.a("priorToCmsGaiaId", str4);
                String str5 = axezVar.J;
                str5.getClass();
                daznVar.a("priorToDeviceId", str5);
                eyja eyjaVar3 = axezVar.M;
                if (eyjaVar3 == null) {
                    eyjaVar3 = eyja.a;
                }
                daznVar.a("cmsOptOutTimestamp", eykm.i(eyjaVar3));
                daznVar.a("deviceUserId", axezVar.Q.toString());
                daznVar.b.create().show();
                return ffcu.a;
            }
        });
        if (csjc.e() || csjc.f()) {
            MenuItem add4 = addSubMenu.add("Set CMS settings data");
            add4.getClass();
            d(add4, activity, new ffji() { // from class: daxq
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    dbiq dbiqVar = (dbiq) obj;
                    dbiqVar.getClass();
                    AlertDialog.Builder builder = new AlertDialog.Builder(dbiqVar.a);
                    ScrollView scrollView = new ScrollView(dbiqVar.a);
                    LinearLayout linearLayout = new LinearLayout(dbiqVar.a);
                    linearLayout.setOrientation(1);
                    scrollView.addView(linearLayout);
                    builder.setView(scrollView);
                    csfz csfzVar = csfz.MULTI_DEVICE;
                    dazm dazmVar = dayt.this.b;
                    dazmVar.d(dbiqVar, "Pick MD status", linearLayout, csfzVar);
                    dazmVar.d(dbiqVar, "Pick B&R status", linearLayout, csfz.BACKUP_AND_RESTORE);
                    dazmVar.c(dbiqVar, "Pick MD on/off", linearLayout, csfz.MULTI_DEVICE);
                    dazmVar.c(dbiqVar, "Pick B&R on/off", linearLayout, csfz.BACKUP_AND_RESTORE);
                    TextView b = dbiqVar.b("Pick Initial Sync Status");
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                    layoutParams.weight = 1.0f;
                    layoutParams.gravity = 17;
                    b.setTypeface(((AppCompatTextView) b).d, 1);
                    b.setLayoutParams(layoutParams);
                    b.setPadding(0, 5, 0, 5);
                    linearLayout.addView(b);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("Not selected");
                    Stream stream = DesugarArrays.stream(axmi.values());
                    final ffji ffjiVar = new ffji() { // from class: axmj
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            axmi axmiVar = (axmi) obj2;
                            axmiVar.getClass();
                            return axmiVar.name();
                        }
                    };
                    Object collect = stream.map(new Function() { // from class: axmk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ffji.this.invoke(obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new Supplier() { // from class: axml
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new ArrayList();
                        }
                    }));
                    collect.getClass();
                    arrayList.addAll((List) collect);
                    Spinner a3 = dazm.a(dbiqVar.a, arrayList);
                    linearLayout.addView(a3);
                    a3.setSelection(0, false);
                    a3.setOnItemSelectedListener(new elbw(dazmVar.h, new dazh(dazmVar, a3)));
                    TextView b2 = dbiqVar.b("Pick Encryption status");
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
                    layoutParams2.weight = 1.0f;
                    layoutParams2.gravity = 17;
                    b2.setTypeface(((AppCompatTextView) b2).d, 1);
                    b2.setLayoutParams(layoutParams2);
                    b2.setPadding(0, 5, 0, 5);
                    linearLayout.addView(b2);
                    ArrayList arrayList2 = new ArrayList();
                    Activity activity2 = dbiqVar.a;
                    arrayList2.add("Not selected");
                    arrayList2.addAll((Collection) DesugarArrays.stream(axes.values()).map(new Function() { // from class: dayu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((axes) obj2).name();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new Function() { // from class: dayv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            enru enruVar = dazm.a;
                            return ((String) obj2).substring(18);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new dayw())));
                    Spinner a4 = dazm.a(activity2, arrayList2);
                    linearLayout.addView(a4);
                    a4.setSelection(0, false);
                    a4.setOnItemSelectedListener(new elbw(dazmVar.h, new dazj(dazmVar)));
                    dazmVar.b(dbiqVar, "Set deviceId", linearLayout);
                    dazmVar.b(dbiqVar, "Set cmsD2DTimestamp", linearLayout);
                    dazmVar.b(dbiqVar, "Set dailyRetrievedCmsTimestamp", linearLayout);
                    dazmVar.b(dbiqVar, "Set PriorToCmsGaiaId", linearLayout);
                    dazmVar.b(dbiqVar, "Set priorToDeviceId", linearLayout);
                    dazmVar.b(dbiqVar, "Set cmsOptOutTimestamp", linearLayout);
                    builder.create().show();
                    return ffcu.a;
                }
            });
        }
        if (csjc.d()) {
            MenuItem add5 = addSubMenu.add("Unmatch Telephony and Bugle");
            add5.getClass();
            d(add5, activity, new ffji() { // from class: daxr
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    String[] strArr = MessagesTable.a;
                    buxr buxrVar = new buxr();
                    buxrVar.ap("unmatchTelephonyAndBugle");
                    buxrVar.T();
                    buxz buxzVar = new buxz();
                    buxzVar.w(100L);
                    buxrVar.X(buxzVar);
                    buxrVar.b().e();
                    return ffcu.a;
                }
            });
            MenuItem add6 = addSubMenu.add("Link Account");
            add6.getClass();
            d(add6, activity, new ffji() { // from class: daxs
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    dayt daytVar = dayt.this;
                    axol.k(daytVar.e, null, new dayq(daytVar, null), 3);
                    return ffcu.a;
                }
            });
            MenuItem add7 = addSubMenu.add("Get MDE Account");
            add7.getClass();
            d(add7, activity, new ffji() { // from class: daxt
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    dayt daytVar = dayt.this;
                    axol.k(daytVar.e, null, new dayp(daytVar, null), 3);
                    return ffcu.a;
                }
            });
            daxi daxiVar = (daxi) this.u.a();
            final Intent a3 = daxiVar != null ? daxiVar.a() : null;
            if (a3 != null) {
                MenuItem add8 = addSubMenu.add("Alphaverse");
                add8.getClass();
                d(add8, activity, new ffji() { // from class: daxu
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((dbiq) obj).getClass();
                        eldl.p(activity, a3);
                        return ffcu.a;
                    }
                });
            }
        }
        if (csjc.c()) {
            MenuItem add9 = addSubMenu.add("Simulate batch backup errors");
            add9.getClass();
            d(add9, activity, new ffji() { // from class: daxv
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    final dazm dazmVar = dayt.this.b;
                    axnw.h(dazmVar.g.a().h(new emwl() { // from class: dayz
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            eisx eisxVar = (eisx) obj2;
                            enru enruVar = dazm.a;
                            return eisxVar;
                        }
                    }, dazmVar.e).h(new emwl() { // from class: daza
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            cccd cccdVar = (cccd) ccce.a.createBuilder();
                            int a4 = ((eisx) obj2).a();
                            cccdVar.copyOnWrite();
                            ccce ccceVar = (ccce) cccdVar.instance;
                            ccceVar.b |= 1;
                            ccceVar.c = a4;
                            cccdVar.copyOnWrite();
                            ccce ccceVar2 = (ccce) cccdVar.instance;
                            ccceVar2.b |= 2;
                            ccceVar2.d = -999;
                            cccdVar.copyOnWrite();
                            ccce ccceVar3 = (ccce) cccdVar.instance;
                            ccceVar3.b |= 4;
                            ccceVar3.e = "test item id";
                            cccdVar.copyOnWrite();
                            ccce ccceVar4 = (ccce) cccdVar.instance;
                            ccceVar4.b |= 16;
                            ccceVar4.g = true;
                            cccdVar.copyOnWrite();
                            ccce ccceVar5 = (ccce) cccdVar.instance;
                            ccceVar5.b |= 128;
                            ccceVar5.j = "test trigger name";
                            ((cevh) dazm.this.f.b()).a(ceyr.g("cms_batch_backup", (ccce) cccdVar.build()));
                            return null;
                        }
                    }, dazmVar.e).e(Exception.class, new emwl() { // from class: dazb
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            enru enruVar = dazm.a;
                            return null;
                        }
                    }, dazmVar.e));
                    return ffcu.a;
                }
            });
        }
        if (csgj.a() && ((Boolean) ((cfup) csgj.t.get()).e()).booleanValue() && csjc.d() && ((Optional) ((fbbb) this.g).a).isPresent()) {
            MenuItem add10 = addSubMenu.add("Show Backup Promo Popup");
            add10.getClass();
            d(add10, activity, new ffji() { // from class: daxx
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    Optional optional = (Optional) ((fbbb) dayt.this.g).a;
                    final ffji ffjiVar = new ffji() { // from class: daya
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            tdg tdgVar = (tdg) obj2;
                            tdgVar.getClass();
                            tdgVar.a();
                            return ffcu.a;
                        }
                    };
                    optional.ifPresent(new Consumer() { // from class: dayb
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            ffji.this.invoke(obj2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return ffcu.a;
                }
            });
        }
        if (csgj.a() && ((Boolean) ((cfup) csgj.k.get()).e()).booleanValue() && csjc.e()) {
            final Intent a4 = akuv.c(activity, KeyRetrievalClientActivity.class, "android.intent.action.VIEW").a();
            a4.getClass();
            MenuItem add11 = addSubMenu.add("Folsom Tools");
            add11.getClass();
            d(add11, activity, new ffji() { // from class: dayc
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    eldl.p(activity, a4);
                    return ffcu.a;
                }
            });
        }
        if (csjc.d() && this.r.a() && j) {
            final Intent a5 = akuv.c(activity, D2dToolsActivity.class, "android.intent.action.VIEW").a();
            a5.getClass();
            MenuItem add12 = addSubMenu.add("D2D Tools");
            add12.getClass();
            d(add12, activity, new ffji() { // from class: dayd
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    eldl.p(activity, a5);
                    return ffcu.a;
                }
            });
        }
        if (csgj.a() && csjc.d() && j) {
            MenuItem add13 = addSubMenu.add("Set invalid restore progress");
            add13.getClass();
            d(add13, activity, new ffji() { // from class: daye
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    final axkm axkmVar = dayt.this.b.c;
                    axkmVar.A(new Function() { // from class: axhp
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            axep axepVar = (axep) obj2;
                            axky axkyVar = ((axez) axepVar.instance).C;
                            if (axkyVar == null) {
                                axkyVar = axky.a;
                            }
                            axkm.this.an(axkyVar.d, 0L, -1L, "The total messages to restore will be smaller than the restored message count");
                            axkx axkxVar = (axkx) axkyVar.toBuilder();
                            axkxVar.copyOnWrite();
                            axky axkyVar2 = (axky) axkxVar.instance;
                            axkyVar2.b |= 1;
                            axkyVar2.c = -1L;
                            axepVar.copyOnWrite();
                            axez axezVar = (axez) axepVar.instance;
                            axky axkyVar3 = (axky) axkxVar.build();
                            axkyVar3.getClass();
                            axezVar.C = axkyVar3;
                            axezVar.b |= 1073741824;
                            return axepVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return ffcu.a;
                }
            });
            MenuItem add14 = addSubMenu.add("Set invalid backup progress");
            add14.getClass();
            d(add14, activity, new ffji() { // from class: dayf
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    final dazm dazmVar = dayt.this.b;
                    elfo.f(new Runnable() { // from class: dayy
                        @Override // java.lang.Runnable
                        public final void run() {
                            dazm.this.c.ac(-1L);
                        }
                    }, dazmVar.d);
                    return ffcu.a;
                }
            });
        }
        if (csjc.e() && ((Optional) ((fbbb) this.h).a).isPresent() && !((dbel) ((Optional) ((fbbb) this.h).a).get()).a()) {
            MenuItem add15 = addSubMenu.add("Dump debug db");
            add15.getClass();
            d(add15, activity, new ffji() { // from class: dayg
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    ((dbel) ((Optional) ((fbbb) dayt.this.h).a).get()).b();
                    return ffcu.a;
                }
            });
            MenuItem add16 = addSubMenu.add("Dump metadata");
            add16.getClass();
            d(add16, activity, new ffji() { // from class: dayh
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    ((dbel) ((Optional) ((fbbb) dayt.this.h).a).get()).b();
                    return ffcu.a;
                }
            });
        }
        if (csjc.c()) {
            MenuItem add17 = addSubMenu.add("Queue backup-now");
            add17.getClass();
            d(add17, activity, new ffji() { // from class: dayi
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    dayt daytVar = dayt.this;
                    axol.k(daytVar.e, null, new dayk(daytVar, null), 3);
                    return ffcu.a;
                }
            });
            MenuItem add18 = addSubMenu.add("Queue periodic sync now");
            add18.getClass();
            d(add18, activity, new ffji() { // from class: dayj
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    dayt daytVar = dayt.this;
                    axol.k(daytVar.e, null, new dayl(daytVar, null), 3);
                    return ffcu.a;
                }
            });
            MenuItem add19 = addSubMenu.add("Cancel backup-now");
            add19.getClass();
            d(add19, activity, new ffji() { // from class: daxm
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    dayt daytVar = dayt.this;
                    axol.k(daytVar.e, null, new daym(daytVar, null), 3);
                    return ffcu.a;
                }
            });
            MenuItem add20 = addSubMenu.add("Cancel periodic sync");
            add20.getClass();
            d(add20, activity, new ffji() { // from class: daxn
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dbiq) obj).getClass();
                    dayt daytVar = dayt.this;
                    axol.k(daytVar.e, null, new dayn(daytVar, null), 3);
                    return ffcu.a;
                }
            });
        }
    }

    public final comc b() {
        return (comc) this.t.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dayo
            if (r0 == 0) goto L13
            r0 = r5
            dayo r0 = (defpackage.dayo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dayo r0 = new dayo
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)     // Catch: defpackage.babn -> L4a
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            ffbr r5 = r4.i     // Catch: defpackage.babn -> L4a
            java.lang.Object r5 = r5.b()     // Catch: defpackage.babn -> L4a
            babf r5 = (defpackage.babf) r5     // Catch: defpackage.babn -> L4a
            elfl r5 = r5.a()     // Catch: defpackage.babn -> L4a
            r0.c = r3     // Catch: defpackage.babn -> L4a
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)     // Catch: defpackage.babn -> L4a
            if (r5 != r1) goto L47
            return r1
        L47:
            eisx r5 = (defpackage.eisx) r5     // Catch: defpackage.babn -> L4a
            return r5
        L4a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dayt.c(ffgu):java.lang.Object");
    }
}
