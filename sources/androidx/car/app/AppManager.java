package androidx.car.app;

import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Log;
import androidx.car.app.AppManager;
import androidx.car.app.IAppManager;
import androidx.car.app.model.TemplateInfo;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cdu;
import defpackage.cex;
import defpackage.cey;
import defpackage.cfb;
import defpackage.cfn;
import defpackage.cgf;
import defpackage.clh;
import defpackage.lkk;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppManager implements cgf {
    public final cex a;
    public final IAppManager.Stub b;
    public final cfb c;
    public final lkk d;
    final HandlerThread e = new HandlerThread("LocationUpdateThread");
    public final cdu f = new LocationListener() { // from class: cdu
        @Override // android.location.LocationListener
        public final void onLocationChanged(final Location location) {
            AppManager.this.c.b("sendLocation", new cey() { // from class: cdt
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.cey
                public final void a(Object obj) {
                    obj.sendLocation(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onLocationChanged(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                onLocationChanged((Location) list.get(i));
            }
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onFlushComplete(int i) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };

    /* compiled from: PG */
    /* renamed from: androidx.car.app.AppManager$1, reason: invalid class name */
    public class AnonymousClass1 extends IAppManager.Stub {
        final /* synthetic */ cex val$carContext;

        public AnonymousClass1(cex cexVar) {
            this.val$carContext = cexVar;
        }

        public static /* synthetic */ Object lambda$onBackPressed$0(cex cexVar) {
            cexVar.a.d();
            return null;
        }

        public static /* synthetic */ Object lambda$startLocationUpdates$1(cex cexVar) {
            AppManager appManager = (AppManager) cexVar.a(AppManager.class);
            appManager.b();
            ((LocationManager) appManager.a.getSystemService("location")).requestLocationUpdates("fused", 1000L, 1.0f, appManager.f, appManager.e.getLooper());
            return null;
        }

        public static /* synthetic */ Object lambda$stopLocationUpdates$2(cex cexVar) {
            ((AppManager) cexVar.a(AppManager.class)).b();
            return null;
        }

        @Override // androidx.car.app.IAppManager
        public void getTemplate(IOnDoneCallback iOnDoneCallback) {
            final cfn cfnVar = (cfn) this.val$carContext.a(cfn.class);
            cfnVar.getClass();
            RemoteUtils.d(AppManager.this.d, iOnDoneCallback, "getTemplate", new clh() { // from class: cdw
                @Override // defpackage.clh
                public final Object a() {
                    TemplateWrapper templateWrapper;
                    cls.a();
                    cfn cfnVar2 = cfn.this;
                    cfl a = cfnVar2.a();
                    if (Log.isLoggable("CarApp", 3)) {
                        Objects.toString(a);
                        Log.d("CarApp", "Requesting template from Screen ".concat(a.toString()));
                    }
                    cjg a2 = a.a();
                    TemplateWrapper wrap = (!a.c || (templateWrapper = a.b) == null) ? TemplateWrapper.wrap(a2) : TemplateWrapper.wrap(a2, new TemplateInfo(templateWrapper.getTemplate().getClass(), templateWrapper.getId()).getTemplateId());
                    a.c = false;
                    a.b = wrap;
                    if (Log.isLoggable("CarApp", 3)) {
                        Log.d("CarApp", a.j(a, a2, "Returning ", " from screen "));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (cfl cflVar : cfnVar2.a) {
                        if (cflVar.b == null) {
                            cflVar.b = TemplateWrapper.wrap(cflVar.a());
                        }
                        arrayList.add(new TemplateInfo(cflVar.b.getTemplate().getClass(), cflVar.b.getId()));
                    }
                    wrap.setTemplateInfosForScreenStack(arrayList);
                    return wrap;
                }
            });
        }

        @Override // androidx.car.app.IAppManager
        public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
            final cex cexVar = this.val$carContext;
            RemoteUtils.d(AppManager.this.d, iOnDoneCallback, "onBackPressed", new clh() { // from class: cdv
                @Override // defpackage.clh
                public final Object a() {
                    AppManager.AnonymousClass1.lambda$onBackPressed$0(cex.this);
                    return null;
                }
            });
        }

        @Override // androidx.car.app.IAppManager
        public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            cex cexVar = this.val$carContext;
            PackageManager packageManager = cexVar.getPackageManager();
            int checkPermission = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", cexVar.getPackageName());
            int checkPermission2 = packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", this.val$carContext.getPackageName());
            if (checkPermission == -1 && checkPermission2 == -1) {
                RemoteUtils.f(iOnDoneCallback, "startLocationUpdates", new SecurityException("Location permission(s) not granted."));
            }
            AppManager appManager = AppManager.this;
            final cex cexVar2 = this.val$carContext;
            RemoteUtils.d(appManager.d, iOnDoneCallback, "startLocationUpdates", new clh() { // from class: cdy
                @Override // defpackage.clh
                public final Object a() {
                    AppManager.AnonymousClass1.lambda$startLocationUpdates$1(cex.this);
                    return null;
                }
            });
        }

        @Override // androidx.car.app.IAppManager
        public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            final cex cexVar = this.val$carContext;
            RemoteUtils.d(AppManager.this.d, iOnDoneCallback, "stopLocationUpdates", new clh() { // from class: cdx
                @Override // defpackage.clh
                public final Object a() {
                    AppManager.AnonymousClass1.lambda$stopLocationUpdates$2(cex.this);
                    return null;
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [cdu] */
    public AppManager(cex cexVar, cfb cfbVar, lkk lkkVar) {
        this.a = cexVar;
        this.c = cfbVar;
        this.d = lkkVar;
        this.b = new AnonymousClass1(cexVar);
    }

    public final void a() {
        this.c.b("invalidate", new cey() { // from class: cds
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.cey
            public final void a(Object obj) {
                obj.invalidate();
            }
        });
    }

    final void b() {
        ((LocationManager) this.a.getSystemService("location")).removeUpdates(this.f);
    }
}
