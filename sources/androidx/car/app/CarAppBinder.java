package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import androidx.car.app.CarAppBinder;
import androidx.car.app.ICarApp;
import androidx.car.app.navigation.NavigationManager;
import androidx.car.app.utils.RemoteUtils;
import defpackage.a;
import defpackage.cel;
import defpackage.cex;
import defpackage.cfb;
import defpackage.cfl;
import defpackage.cfn;
import defpackage.cfp;
import defpackage.clh;
import defpackage.cls;
import defpackage.clu;
import defpackage.clv;
import defpackage.lki;
import defpackage.lkj;
import defpackage.lkk;
import defpackage.lkv;
import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CarAppBinder extends ICarApp.Stub {
    private cfp mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private clu mHostValidator;
    private cel mService;

    public CarAppBinder(cel celVar, SessionInfo sessionInfo) {
        this.mService = celVar;
        this.mCurrentSessionInfo = sessionInfo;
    }

    private lkk getCurrentLifecycle() {
        cfp cfpVar = this.mCurrentSession;
        if (cfpVar == null) {
            return null;
        }
        return cfpVar.a;
    }

    private clu getHostValidator() {
        if (this.mHostValidator == null) {
            cel celVar = this.mService;
            celVar.getClass();
            this.mHostValidator = celVar.b();
        }
        return this.mHostValidator;
    }

    private void onConfigurationChangedInternal(cfp cfpVar, Configuration configuration) {
        cls.a();
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(configuration);
            Log.d("CarApp", "onCarConfigurationChanged configuration: ".concat(String.valueOf(configuration)));
        }
        cfpVar.b.c(configuration);
        cfpVar.b.getResources().getConfiguration();
    }

    private void onNewIntentInternal(cfp cfpVar, Intent intent) {
        cls.a();
    }

    public void destroy() {
        onDestroyLifecycle();
        this.mCurrentSession = null;
        this.mHostValidator = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    @Override // androidx.car.app.ICarApp
    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        try {
            cel celVar = this.mService;
            celVar.getClass();
            RemoteUtils.g(iOnDoneCallback, "getAppInfo", celVar.fh());
        } catch (IllegalArgumentException e) {
            RemoteUtils.f(iOnDoneCallback, "getAppInfo", e);
        }
    }

    cel getCarAppService() {
        return this.mService;
    }

    cfp getCurrentSession() {
        return this.mCurrentSession;
    }

    public SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    public HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(final String str, final IOnDoneCallback iOnDoneCallback) {
        cls.b(new Runnable() { // from class: cee
            @Override // java.lang.Runnable
            public final void run() {
                CarAppBinder.this.m185lambda$getManager$7$androidxcarappCarAppBinder(str, iOnDoneCallback);
            }
        });
    }

    /* renamed from: lambda$getManager$7$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ void m185lambda$getManager$7$androidxcarappCarAppBinder(String str, IOnDoneCallback iOnDoneCallback) {
        char c;
        cfp cfpVar = this.mCurrentSession;
        cfpVar.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 96801) {
            if (hashCode == 1862666772 && str.equals("navigation")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("app")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            RemoteUtils.g(iOnDoneCallback, "getManager", ((AppManager) cfpVar.a().a(AppManager.class)).b);
        } else if (c == 1) {
            RemoteUtils.g(iOnDoneCallback, "getManager", ((NavigationManager) cfpVar.a().a(NavigationManager.class)).a);
        } else {
            Log.e("CarApp", String.valueOf(str).concat("%s is not a valid manager"));
            RemoteUtils.f(iOnDoneCallback, "getManager", new InvalidParameterException(String.valueOf(str).concat(" is not a valid manager type")));
        }
    }

    /* renamed from: lambda$onAppCreate$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m186lambda$onAppCreate$0$androidxcarappCarAppBinder(ICarHost iCarHost, Configuration configuration, Intent intent) {
        cel celVar = this.mService;
        celVar.getClass();
        cfp cfpVar = this.mCurrentSession;
        if (cfpVar == null || cfpVar.a.c == lkj.DESTROYED) {
            this.mCurrentSessionInfo.getClass();
            cfpVar = celVar.fg();
            this.mCurrentSession = cfpVar;
        }
        HandshakeInfo handshakeInfo = getHandshakeInfo();
        handshakeInfo.getClass();
        celVar.b.getClass();
        cex cexVar = cfpVar.b;
        cexVar.c = handshakeInfo.getHostCarAppApiLevel();
        cexVar.b(celVar, configuration);
        cex cexVar2 = cfpVar.b;
        cls.a();
        cfb cfbVar = cexVar2.b;
        iCarHost.getClass();
        cls.a();
        cfbVar.a();
        cfbVar.a = iCarHost;
        lkv lkvVar = cfpVar.a;
        lkj lkjVar = lkvVar.c;
        int size = ((cfn) cfpVar.a().a(cfn.class)).a.size();
        if (lkjVar.a(lkj.CREATED) && size > 0) {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "onAppCreate the app was already created");
            }
            onNewIntentInternal(cfpVar, intent);
            return null;
        }
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate the app was not yet created or the screen stack was empty state: " + lkvVar.c + ", stack size: " + size);
        }
        cfpVar.b(lki.ON_CREATE);
        cfn cfnVar = (cfn) cfpVar.a().a(cfn.class);
        cfl c = cfpVar.c();
        cls.a();
        if (((lkv) cfnVar.c).c.equals(lkj.DESTROYED)) {
            if (!Log.isLoggable("CarApp", 3)) {
                return null;
            }
            Log.d("CarApp", "Pushing screens after the DESTROYED state is a no-op");
            return null;
        }
        if (c.a.c.equals(lkj.DESTROYED)) {
            throw new IllegalStateException(String.format(Locale.US, "Failed to push screen (%s), because it has already been destroyed. Please note that screens are single-use, so a fresh instance is required every time you call screenManager.push().", c));
        }
        c.getClass();
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", a.i(c, "Pushing screen ", " to the top of the screen stack"));
        }
        if (!cfnVar.a.contains(c)) {
            cfl cflVar = (cfl) cfnVar.a.peek();
            cfnVar.b(c, true);
            if (!cfnVar.a.contains(c)) {
                return null;
            }
            if (cflVar != null) {
                cfn.c(cflVar, false);
            }
            if (!((lkv) cfnVar.c).c.a(lkj.RESUMED)) {
                return null;
            }
            c.b(lki.ON_RESUME);
            return null;
        }
        cfl cflVar2 = (cfl) cfnVar.a.peek();
        if (cflVar2 == null || cflVar2 == c) {
            return null;
        }
        cfnVar.a.remove(c);
        cfnVar.b(c, false);
        cfn.c(cflVar2, false);
        if (!((lkv) cfnVar.c).c.a(lkj.RESUMED)) {
            return null;
        }
        c.b(lki.ON_RESUME);
        return null;
    }

    /* renamed from: lambda$onAppPause$3$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m187lambda$onAppPause$3$androidxcarappCarAppBinder() {
        cfp cfpVar = this.mCurrentSession;
        cfpVar.getClass();
        cfpVar.b(lki.ON_PAUSE);
        return null;
    }

    /* renamed from: lambda$onAppResume$2$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m188lambda$onAppResume$2$androidxcarappCarAppBinder() {
        cfp cfpVar = this.mCurrentSession;
        cfpVar.getClass();
        cfpVar.b(lki.ON_RESUME);
        return null;
    }

    /* renamed from: lambda$onAppStart$1$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m189lambda$onAppStart$1$androidxcarappCarAppBinder() {
        cfp cfpVar = this.mCurrentSession;
        cfpVar.getClass();
        cfpVar.b(lki.ON_START);
        return null;
    }

    /* renamed from: lambda$onAppStop$4$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m190lambda$onAppStop$4$androidxcarappCarAppBinder() {
        cfp cfpVar = this.mCurrentSession;
        cfpVar.getClass();
        cfpVar.b(lki.ON_STOP);
        return null;
    }

    /* renamed from: lambda$onConfigurationChanged$6$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m191lambda$onConfigurationChanged$6$androidxcarappCarAppBinder(Configuration configuration) {
        cfp cfpVar = this.mCurrentSession;
        cfpVar.getClass();
        onConfigurationChangedInternal(cfpVar, configuration);
        return null;
    }

    /* renamed from: lambda$onNewIntent$5$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m192lambda$onNewIntent$5$androidxcarappCarAppBinder(Intent intent) {
        cfp cfpVar = this.mCurrentSession;
        cfpVar.getClass();
        onNewIntentInternal(cfpVar, intent);
        return null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final ICarHost iCarHost, final Intent intent, final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(intent);
            Log.d("CarApp", "onAppCreate intent: ".concat(String.valueOf(intent)));
        }
        RemoteUtils.b(iOnDoneCallback, "onAppCreate", new clh() { // from class: ced
            @Override // defpackage.clh
            public final Object a() {
                CarAppBinder.this.m186lambda$onAppCreate$0$androidxcarappCarAppBinder(iCarHost, configuration, intent);
                return null;
            }
        });
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate completed");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.d(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new clh() { // from class: cea
            @Override // defpackage.clh
            public final Object a() {
                CarAppBinder.this.m187lambda$onAppPause$3$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.d(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new clh() { // from class: ceg
            @Override // defpackage.clh
            public final Object a() {
                CarAppBinder.this.m188lambda$onAppResume$2$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.d(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new clh() { // from class: ceb
            @Override // defpackage.clh
            public final Object a() {
                CarAppBinder.this.m189lambda$onAppStart$1$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.d(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new clh() { // from class: cec
            @Override // defpackage.clh
            public final Object a() {
                CarAppBinder.this.m190lambda$onAppStop$4$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    public void onAutoDriveEnabled() {
        cfp cfpVar = this.mCurrentSession;
        if (cfpVar != null) {
            cls.a();
            if (Log.isLoggable("CarApp.Nav", 3)) {
                Log.d("CarApp.Nav", "Executing onAutoDriveEnabled");
            }
            Log.w("CarApp.Nav", "NavigationManagerCallback not set, skipping onAutoDriveEnabled");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.d(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new clh() { // from class: cdz
            @Override // defpackage.clh
            public final Object a() {
                CarAppBinder.this.m191lambda$onConfigurationChanged$6$androidxcarappCarAppBinder(configuration);
                return null;
            }
        });
    }

    public void onDestroyLifecycle() {
        cfp cfpVar = this.mCurrentSession;
        if (cfpVar != null) {
            cfpVar.b(lki.ON_DESTROY);
        }
        this.mCurrentSession = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: IllegalArgumentException -> 0x0242, ckv -> 0x0244, TryCatch #5 {ckv -> 0x0244, IllegalArgumentException -> 0x0242, blocks: (B:3:0x0013, B:5:0x0032, B:6:0x0042, B:8:0x0046, B:10:0x004c, B:22:0x0235, B:25:0x0053, B:29:0x0074, B:32:0x007a, B:35:0x007e, B:37:0x0082, B:40:0x00af, B:42:0x00bb, B:44:0x00c3, B:117:0x00ca, B:118:0x00d3, B:120:0x00d7, B:123:0x00de, B:124:0x008d, B:126:0x0091, B:127:0x009b, B:129:0x00a5, B:130:0x0061, B:133:0x006e), top: B:2:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e8 A[Catch: ckv | IllegalArgumentException -> 0x023c, ckv -> 0x023e, TryCatch #4 {ckv | IllegalArgumentException -> 0x023c, blocks: (B:11:0x01f9, B:14:0x020f, B:19:0x0222, B:20:0x0231, B:31:0x01e8, B:41:0x01d1, B:52:0x00e4, B:55:0x00e9, B:57:0x00f1, B:59:0x00f9, B:63:0x0127, B:66:0x014e, B:68:0x0154, B:70:0x015b, B:73:0x0165, B:75:0x016c, B:78:0x0176, B:80:0x017d, B:82:0x0185, B:84:0x018c, B:85:0x0192, B:86:0x0134, B:88:0x0139, B:90:0x0149, B:95:0x0102, B:97:0x0107, B:99:0x010f, B:101:0x0114, B:106:0x0120, B:111:0x01ac, B:112:0x01c5, B:49:0x01c6), top: B:51:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[Catch: IllegalArgumentException -> 0x0242, ckv -> 0x0244, TRY_LEAVE, TryCatch #5 {ckv -> 0x0244, IllegalArgumentException -> 0x0242, blocks: (B:3:0x0013, B:5:0x0032, B:6:0x0042, B:8:0x0046, B:10:0x004c, B:22:0x0235, B:25:0x0053, B:29:0x0074, B:32:0x007a, B:35:0x007e, B:37:0x0082, B:40:0x00af, B:42:0x00bb, B:44:0x00c3, B:117:0x00ca, B:118:0x00d3, B:120:0x00d7, B:123:0x00de, B:124:0x008d, B:126:0x0091, B:127:0x009b, B:129:0x00a5, B:130:0x0061, B:133:0x006e), top: B:2:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af A[Catch: IllegalArgumentException -> 0x0242, ckv -> 0x0244, TryCatch #5 {ckv -> 0x0244, IllegalArgumentException -> 0x0242, blocks: (B:3:0x0013, B:5:0x0032, B:6:0x0042, B:8:0x0046, B:10:0x004c, B:22:0x0235, B:25:0x0053, B:29:0x0074, B:32:0x007a, B:35:0x007e, B:37:0x0082, B:40:0x00af, B:42:0x00bb, B:44:0x00c3, B:117:0x00ca, B:118:0x00d3, B:120:0x00d7, B:123:0x00de, B:124:0x008d, B:126:0x0091, B:127:0x009b, B:129:0x00a5, B:130:0x0061, B:133:0x006e), top: B:2:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: IllegalArgumentException -> 0x0242, ckv -> 0x0244, TryCatch #5 {ckv -> 0x0244, IllegalArgumentException -> 0x0242, blocks: (B:3:0x0013, B:5:0x0032, B:6:0x0042, B:8:0x0046, B:10:0x004c, B:22:0x0235, B:25:0x0053, B:29:0x0074, B:32:0x007a, B:35:0x007e, B:37:0x0082, B:40:0x00af, B:42:0x00bb, B:44:0x00c3, B:117:0x00ca, B:118:0x00d3, B:120:0x00d7, B:123:0x00de, B:124:0x008d, B:126:0x0091, B:127:0x009b, B:129:0x00a5, B:130:0x0061, B:133:0x006e), top: B:2:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.car.app.ICarApp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onHandshakeCompleted(defpackage.ckp r21, androidx.car.app.IOnDoneCallback r22) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.car.app.CarAppBinder.onHandshakeCompleted(ckp, androidx.car.app.IOnDoneCallback):void");
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(final Intent intent, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.d(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new clh() { // from class: cef
            @Override // defpackage.clh
            public final Object a() {
                CarAppBinder.this.m192lambda$onNewIntent$5$androidxcarappCarAppBinder(intent);
                return null;
            }
        });
    }

    void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (hostCarAppApiLevel <= 0 || hostCarAppApiLevel > clv.a()) {
            throw new IllegalArgumentException(a.h(hostCarAppApiLevel, "Invalid Car App API level received: "));
        }
        this.mHandshakeInfo = handshakeInfo;
    }
}
