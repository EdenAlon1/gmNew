package defpackage;

import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckmk implements cfzm {
    public static final evkn a = new evkn();
    public final Context b;
    public final fazb c;
    public final ffbr d;
    private final errl e;
    private final errl f;
    private final errl g;

    public ckmk(Context context, errl errlVar, errl errlVar2, errl errlVar3, fazb fazbVar, ffbr ffbrVar) {
        this.b = context;
        this.e = errlVar;
        this.f = errlVar2;
        this.g = errlVar3;
        this.c = fazbVar;
        this.d = ffbrVar;
    }

    @Override // defpackage.cfzm
    public final elfl b() {
        return d().h(new emwl() { // from class: ckmc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                evkn evknVar = ckmk.a;
                final StringBuilder sb = new StringBuilder("Section: rcs_psd\n");
                Collection.EL.stream((List) obj).sorted(Comparator.CC.comparing(new Function() { // from class: ckmd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((cfzl) obj2).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, String.CASE_INSENSITIVE_ORDER)).forEach(new Consumer() { // from class: ckme
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        cfzl cfzlVar = (cfzl) obj2;
                        evkn evknVar2 = ckmk.a;
                        String a2 = cfzlVar.a();
                        StringBuilder sb2 = sb;
                        sb2.append(a2);
                        sb2.append(": ");
                        sb2.append(cfzlVar.b());
                        sb2.append("\n");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return sb.toString();
            }
        }, this.g);
    }

    @Override // defpackage.cfzm
    public final elfl c() {
        return elfo.g(new Callable() { // from class: ckmg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                evkn evknVar = ckmk.a;
                ArrayList arrayList = new ArrayList();
                List<dimm> G = dimn.E().G();
                StringBuilder sb = new StringBuilder();
                for (dimm dimmVar : G) {
                    sb.append(System.lineSeparator());
                    sb.append(dimmVar.b());
                    sb.append("=");
                    sb.append(dimmVar.a());
                }
                arrayList.add(new FileTeleporter(sb.toString().getBytes(), "RcsFlags"));
                return arrayList;
            }
        }, this.f).h(new emwl() { // from class: ckmh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                List list = (List) obj;
                evkn evknVar = ckmk.a;
                list.add(new FileTeleporter(dizg.o().j().getBytes(), "CsLibSettings"));
                list.add(new FileTeleporter(dizs.a().j().getBytes(), "MultiSimSettings"));
                list.add(new FileTeleporter(djam.a().j().getBytes(), "SimStateTrackerSettings"));
                list.add(new FileTeleporter(diyv.a().j().getBytes(), "CsLibAllowSwitchFlags"));
                return list;
            }
        }, this.e);
    }

    @Override // defpackage.cfzm
    public final elfl d() {
        final elfl g = elfo.g(new Callable() { // from class: ckmf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<ctwi> list;
                String str;
                ActivityManager activityManager;
                boolean isBackgroundRestricted;
                UsageStatsManager usageStatsManager;
                int appStandbyBucket;
                int i;
                String str2;
                crgf c;
                ArrayList arrayList = new ArrayList();
                evkn evknVar = ckmk.a;
                ckmk ckmkVar = ckmk.this;
                ckmm ckmmVar = (ckmm) ckmkVar.d.b();
                if (((ctud) ckmmVar.f.b()).k() && ((ctud) ckmmVar.f.b()).l()) {
                    list = ((ctwb) ckmmVar.g.b()).m();
                } else {
                    ensk j = ckmm.a.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) j.h("com/google/android/apps/messaging/shared/rcs/feedbackdata/RcsFeedbackSimInfoProvider", "getAllActiveSims", 42, "RcsFeedbackSimInfoProvider.kt")).q("Can not fetch rcs sim info for listnr bug report due to missing permissions.");
                    list = ffel.a;
                }
                int i2 = 10;
                ArrayList arrayList2 = new ArrayList(ffdx.n(list, 10));
                for (ctwi ctwiVar : list) {
                    int a2 = ctwiVar.a();
                    cosz coszVar = (cosz) fflm.b(((cort) ckmmVar.b.b()).i(a2));
                    if (coszVar == null) {
                        ensk j2 = ckmm.a.j();
                        i = i2;
                        j2.Y(ente.a, "Bugle");
                        enrr enrrVar = (enrr) j2;
                        enrrVar.Y(csux.t, Integer.valueOf(a2));
                        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/feedbackdata/RcsFeedbackSimInfoProvider", "toSimInfo", 81, "RcsFeedbackSimInfoProvider.kt")).q("No sim info to log PSD RCS data for.");
                    } else {
                        i = i2;
                    }
                    awui a3 = ((ckac) ckmmVar.e.b()).a(a2);
                    if (a3 == null || (c = ((crgh) ckmmVar.d.b()).c(a3)) == null || (str2 = c.g) == null) {
                        str2 = "[unavailable]";
                    }
                    String str3 = str2;
                    eqwf eqwfVar = coszVar != null ? ((djrv) ckmmVar.c.b()).b(coszVar.c).a : null;
                    Boolean bool = null;
                    String u = ctwiVar.u();
                    String q = ctwiVar.q();
                    String str4 = coszVar != null ? coszVar.k : null;
                    String str5 = coszVar != null ? coszVar.l : null;
                    if (coszVar != null) {
                        bool = Boolean.valueOf(coszVar.o);
                    }
                    arrayList2.add(new ckml(u, q, a2, eqwfVar, str3, str4, str5, bool, null));
                    i2 = i;
                }
                int i3 = i2;
                String k = evknVar.k(arrayList2);
                cfzc cfzcVar = new cfzc();
                cfzcVar.b("RcsSimInfos");
                cfzcVar.c(k);
                arrayList.add(cfzcVar.a());
                boolean i4 = dkuy.i(ckmkVar.b);
                cfzc cfzcVar2 = new cfzc();
                cfzcVar2.b("RcsHostApk");
                cfzcVar2.c(true != i4 ? "cs.apk" : "Bugle");
                arrayList.add(cfzcVar2.a());
                cfzc cfzcVar3 = new cfzc();
                cfzcVar3.b("SystemBinding");
                cfzcVar3.c(true != dkuy.e(ckmkVar.b) ? "Disabled" : "Enabled");
                arrayList.add(cfzcVar3.a());
                cfzc cfzcVar4 = new cfzc();
                cfzcVar4.b("RcsBOE");
                cfzcVar4.c(true != dkvw.c(ckmkVar.b) ? "Optimized" : "Exempted");
                arrayList.add(cfzcVar4.a());
                String str6 = "[Unavailable]";
                if (Build.VERSION.SDK_INT < 28 || (usageStatsManager = (UsageStatsManager) ckmkVar.b.getSystemService("usagestats")) == null) {
                    str = "[Unavailable]";
                } else {
                    appStandbyBucket = usageStatsManager.getAppStandbyBucket();
                    str = (String) enhk.o(Integer.valueOf(i3), "Active", 30, "Frequent", 40, "Rare", 20, "WorkingSet").getOrDefault(Integer.valueOf(appStandbyBucket), null);
                    if (str == null) {
                        str = Integer.toString(appStandbyBucket);
                    }
                }
                cfzc cfzcVar5 = new cfzc();
                cfzcVar5.b("RcsStandbyBucket");
                cfzcVar5.c(str);
                arrayList.add(cfzcVar5.a());
                cfzc cfzcVar6 = new cfzc();
                cfzcVar6.b("RcsBackgroundRestricted");
                if (Build.VERSION.SDK_INT >= 28 && (activityManager = (ActivityManager) ckmkVar.b.getSystemService("activity")) != null) {
                    isBackgroundRestricted = activityManager.isBackgroundRestricted();
                    str6 = Boolean.toString(isBackgroundRestricted);
                }
                cfzcVar6.c(str6);
                arrayList.add(cfzcVar6.a());
                return arrayList;
            }
        }, this.f);
        final elfl g2 = ((altk) this.c.b()).g();
        return elfo.k(g, g2).a(new Callable() { // from class: ckmj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final List list = (List) erqt.q(g);
                ((Optional) erqt.q(g2)).ifPresent(new Consumer() { // from class: ckmi
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        evkn evknVar = ckmk.a;
                        cfzc cfzcVar = new cfzc();
                        cfzcVar.b("CsApkVersion");
                        cfzcVar.c((String) obj);
                        list.add(cfzcVar.a());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                int d = ((altk) ckmk.this.c.b()).d();
                if (d >= 0) {
                    cfzc cfzcVar = new cfzc();
                    cfzcVar.b("CsApkVersionCode");
                    cfzcVar.c(String.valueOf(d));
                    list.add(cfzcVar.a());
                }
                return list;
            }
        }, this.g);
    }
}
