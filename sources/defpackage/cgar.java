package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgar implements cfzm {
    public final Context a;
    public final ffbr b;
    public final ffbr c;
    public final dkpp d;
    public final ctwb e;
    public final ffbr f;
    private final errl g;
    private final errl h;
    private final csps i;
    private final atuy j;

    public cgar(Context context, errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, dkpp dkppVar, ctwb ctwbVar, csps cspsVar, atuy atuyVar, ffbr ffbrVar3) {
        this.a = context;
        this.g = errlVar;
        this.h = errlVar2;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = dkppVar;
        this.e = ctwbVar;
        this.i = cspsVar;
        this.j = atuyVar;
        this.f = ffbrVar3;
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl c() {
        return cfzj.c();
    }

    @Override // defpackage.cfzm
    public final elfl d() {
        final csps cspsVar = this.i;
        return elfo.i(engw.v(elfo.g(new Callable() { // from class: cgal
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                hashMap.put("isDeviceConnectedToWifi", String.valueOf(dksg.b(csps.this.a)));
                return hashMap;
            }
        }, this.h), elfo.g(new Callable() { // from class: cgaq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle;
                String str;
                HashMap hashMap = new HashMap();
                cgar cgarVar = cgar.this;
                try {
                    PackageInfo packageInfo = cgarVar.a.getPackageManager().getPackageInfo(cgarVar.a.getPackageName(), 0);
                    bundle = packageInfo.applicationInfo.metaData;
                    try {
                        str = Arrays.toString(packageInfo.splitNames);
                    } catch (PackageManager.NameNotFoundException unused) {
                        str = "Unable to get package";
                        if (bundle == null) {
                        }
                        hashMap.put("installedSplits", str);
                        hashMap.put("derivedApkId", r2);
                        return hashMap;
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    bundle = null;
                }
                String valueOf = (bundle == null && bundle.containsKey("com.android.vending.derived.apk.id")) ? String.valueOf(bundle.getInt("com.android.vending.derived.apk.id")) : "APK not generated or signed by Play";
                hashMap.put("installedSplits", str);
                hashMap.put("derivedApkId", valueOf);
                return hashMap;
            }
        }, this.h), elfo.g(new Callable() { // from class: cgak
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int importance;
                HashMap hashMap = new HashMap();
                cgar cgarVar = cgar.this;
                boolean K = ((cins) cgarVar.b.b()).K();
                hashMap.put("NotificationsEnabled", String.valueOf(K));
                if (K) {
                    NotificationChannel f = ((cthp) cgarVar.c.b()).f();
                    boolean z = false;
                    if (f != null) {
                        importance = f.getImportance();
                        if (importance > 2) {
                            z = true;
                        }
                    }
                    hashMap.put("DefaultNotificationChannelEnabled", String.valueOf(z));
                }
                return hashMap;
            }
        }, this.h), elfo.g(new Callable() { // from class: cgam
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                hashMap.put("AndroidId", String.valueOf(digu.b(cgar.this.a.getContentResolver(), "android_id", 0L)));
                return hashMap;
            }
        }, this.g), ((ersq) ((atuv) this.j).a.b()).a("bugle.sim_subscription_info_retriever_to_fill_feedback_psd_map") ? elfo.g(new Callable() { // from class: cgai
            @Override // java.util.concurrent.Callable
            public final Object call() {
                enhd enhdVar = new enhd();
                cgar cgarVar = cgar.this;
                cost a = ((cort) cgarVar.f.b()).a();
                enhdVar.k("Number of Sim Slots", Integer.toString(cgarVar.e.e()));
                enhdVar.k("Voice Sim Equal to Data Sim", true != a.c.equals(a.e) ? "False" : "True");
                for (cosz coszVar : ((cort) cgarVar.f.b()).p()) {
                    enhdVar.k(String.format("GID%s", Integer.valueOf(coszVar.e)), coszVar.t);
                }
                return enhdVar.c();
            }
        }, this.h) : elfo.g(new Callable() { // from class: cgaj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cgar cgarVar = cgar.this;
                String num = Integer.toString(cgarVar.e.e());
                ctwb ctwbVar = cgarVar.e;
                return enhk.n("Number of Sim Slots", num, "Voice Sim Equal to Data Sim", ctwbVar.b() == ctwbVar.d() ? "True" : "False", "GID1", cgarVar.d.i());
            }
        }, this.h))).h(new emwl() { // from class: cgah
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Stream filter = Collection.EL.stream((List) obj).filter(new Predicate() { // from class: cgan
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
                    public final boolean test(Object obj2) {
                        return Objects.nonNull((Map) obj2);
                    }
                });
                int i = engw.d;
                return (List) Collection.EL.stream((engw) filter.collect(endq.a)).map(new Function() { // from class: cgao
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return cfzj.a((Map) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).flatMap(new Function() { // from class: cgap
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Collection.EL.stream((engw) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.a);
            }
        }, this.h);
    }
}
