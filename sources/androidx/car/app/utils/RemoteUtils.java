package androidx.car.app.utils;

import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.utils.RemoteUtils;
import defpackage.a;
import defpackage.cfc;
import defpackage.cfi;
import defpackage.cfr;
import defpackage.ckp;
import defpackage.clh;
import defpackage.cli;
import defpackage.clr;
import defpackage.cls;
import defpackage.lkk;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RemoteUtils {

    /* compiled from: PG */
    /* renamed from: androidx.car.app.utils.RemoteUtils$1, reason: invalid class name */
    public class AnonymousClass1 extends IOnDoneCallback.Stub {
        final /* synthetic */ cfi val$callback;

        public AnonymousClass1(cfi cfiVar) {
            this.val$callback = cfiVar;
        }

        @Override // androidx.car.app.IOnDoneCallback
        public void onFailure(ckp ckpVar) {
            this.val$callback.a();
        }

        @Override // androidx.car.app.IOnDoneCallback
        public void onSuccess(ckp ckpVar) {
            this.val$callback.b();
        }
    }

    /* compiled from: PG */
    public static class SurfaceCallbackStub extends ISurfaceCallback.Stub {
        private final lkk mLifecycle;
        private cfr mSurfaceCallback;

        SurfaceCallbackStub(lkk lkkVar, cfr cfrVar) {
            this.mLifecycle = lkkVar;
            this.mSurfaceCallback = cfrVar;
            lkkVar.c(new clr(this));
        }

        /* renamed from: lambda$onClick$7$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m209xa15b6dc7(float f, float f2) {
            cfr cfrVar = this.mSurfaceCallback;
            if (cfrVar == null) {
                return null;
            }
            cfrVar.a();
            return null;
        }

        /* renamed from: lambda$onFling$5$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m210xdfc586b5(float f, float f2) {
            cfr cfrVar = this.mSurfaceCallback;
            if (cfrVar == null) {
                return null;
            }
            cfrVar.b();
            return null;
        }

        /* renamed from: lambda$onScale$6$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m211x6ea0bd66(float f, float f2, float f3) {
            cfr cfrVar = this.mSurfaceCallback;
            if (cfrVar == null) {
                return null;
            }
            cfrVar.c();
            return null;
        }

        /* renamed from: lambda$onScroll$4$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m212x3d2f790d(float f, float f2) {
            cfr cfrVar = this.mSurfaceCallback;
            if (cfrVar == null) {
                return null;
            }
            cfrVar.d();
            return null;
        }

        /* renamed from: lambda$onStableAreaChanged$2$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m213x93973048(Rect rect) {
            cfr cfrVar = this.mSurfaceCallback;
            if (cfrVar == null) {
                return null;
            }
            cfrVar.e();
            return null;
        }

        /* renamed from: lambda$onSurfaceAvailable$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m214x37c861a2(ckp ckpVar) {
            cfr cfrVar = this.mSurfaceCallback;
            if (cfrVar == null) {
                return null;
            }
            cfrVar.f();
            return null;
        }

        /* renamed from: lambda$onSurfaceDestroyed$3$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m215xde96e8ef(ckp ckpVar) {
            cfr cfrVar = this.mSurfaceCallback;
            if (cfrVar == null) {
                return null;
            }
            cfrVar.g();
            return null;
        }

        /* renamed from: lambda$onVisibleAreaChanged$1$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m216xaf1354a8(Rect rect) {
            cfr cfrVar = this.mSurfaceCallback;
            if (cfrVar == null) {
                return null;
            }
            cfrVar.h();
            return null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onClick(final float f, final float f2) {
            RemoteUtils.c(this.mLifecycle, "onClick", new clh() { // from class: clk
                @Override // defpackage.clh
                public final Object a() {
                    return RemoteUtils.SurfaceCallbackStub.this.m209xa15b6dc7(f, f2);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onFling(final float f, final float f2) {
            RemoteUtils.c(this.mLifecycle, "onFling", new clh() { // from class: clo
                @Override // defpackage.clh
                public final Object a() {
                    return RemoteUtils.SurfaceCallbackStub.this.m210xdfc586b5(f, f2);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScale(final float f, final float f2, final float f3) {
            RemoteUtils.c(this.mLifecycle, "onScale", new clh() { // from class: clp
                @Override // defpackage.clh
                public final Object a() {
                    return RemoteUtils.SurfaceCallbackStub.this.m211x6ea0bd66(f, f2, f3);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScroll(final float f, final float f2) {
            RemoteUtils.c(this.mLifecycle, "onScroll", new clh() { // from class: cln
                @Override // defpackage.clh
                public final Object a() {
                    return RemoteUtils.SurfaceCallbackStub.this.m212x3d2f790d(f, f2);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onStableAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.d(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new clh() { // from class: clq
                @Override // defpackage.clh
                public final Object a() {
                    return RemoteUtils.SurfaceCallbackStub.this.m213x93973048(rect);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceAvailable(final ckp ckpVar, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.d(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new clh() { // from class: clm
                @Override // defpackage.clh
                public final Object a() {
                    return RemoteUtils.SurfaceCallbackStub.this.m214x37c861a2(ckpVar);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceDestroyed(final ckp ckpVar, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.d(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new clh() { // from class: clj
                @Override // defpackage.clh
                public final Object a() {
                    return RemoteUtils.SurfaceCallbackStub.this.m215xde96e8ef(ckpVar);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onVisibleAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.d(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new clh() { // from class: cll
                @Override // defpackage.clh
                public final Object a() {
                    return RemoteUtils.SurfaceCallbackStub.this.m216xaf1354a8(rect);
                }
            });
        }
    }

    public static Object a(String str, cli cliVar) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", a.a(str, "Dispatching call ", " to host"));
            }
            return cliVar.a();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new cfc(a.a(str, "Remote ", " call failed"), e2);
        }
    }

    public static void b(final IOnDoneCallback iOnDoneCallback, final String str, final clh clhVar) {
        cls.b(new Runnable() { // from class: clf
            @Override // java.lang.Runnable
            public final void run() {
                IOnDoneCallback iOnDoneCallback2 = IOnDoneCallback.this;
                String str2 = str;
                try {
                    RemoteUtils.g(iOnDoneCallback2, str2, clhVar.a());
                } catch (ckv e) {
                    RemoteUtils.f(iOnDoneCallback2, str2, e);
                } catch (RuntimeException e2) {
                    RemoteUtils.f(iOnDoneCallback2, str2, e2);
                    throw new RuntimeException(e2);
                }
            }
        });
    }

    public static void c(final lkk lkkVar, final String str, final clh clhVar) {
        cls.b(new Runnable() { // from class: clc
            @Override // java.lang.Runnable
            public final void run() {
                lkk lkkVar2 = lkk.this;
                clh clhVar2 = clhVar;
                if (lkkVar2 != null) {
                    try {
                        if (lkkVar2.a().a(lkj.CREATED)) {
                            clhVar2.a();
                            return;
                        }
                    } catch (ckv e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", a.n(clhVar2, "Lifecycle is not at least created when dispatching "));
            }
        });
    }

    public static void d(final lkk lkkVar, final IOnDoneCallback iOnDoneCallback, final String str, final clh clhVar) {
        cls.b(new Runnable() { // from class: clg
            @Override // java.lang.Runnable
            public final void run() {
                IOnDoneCallback iOnDoneCallback2 = iOnDoneCallback;
                String str2 = str;
                lkk lkkVar2 = lkk.this;
                clh clhVar2 = clhVar;
                if (lkkVar2 != null && lkkVar2.a().a(lkj.CREATED)) {
                    RemoteUtils.b(iOnDoneCallback2, str2, clhVar2);
                } else {
                    Objects.toString(clhVar2);
                    RemoteUtils.f(iOnDoneCallback2, str2, new IllegalStateException("Lifecycle is not at least created when dispatching ".concat(clhVar2.toString())));
                }
            }
        });
    }

    public static void e(String str, cli cliVar) {
        try {
            a(str, cliVar);
        } catch (RemoteException e) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call ".concat(str), e);
        }
    }

    public static void f(final IOnDoneCallback iOnDoneCallback, final String str, final Throwable th) {
        e(str.concat(" onFailure"), new cli() { // from class: cle
            @Override // defpackage.cli
            public final Object a() {
                try {
                    IOnDoneCallback.this.onFailure(new ckp(new FailureResponse(th)));
                    return null;
                } catch (ckv e) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str), e);
                    return null;
                }
            }
        });
    }

    public static void g(final IOnDoneCallback iOnDoneCallback, final String str, final Object obj) {
        e(str.concat(" onSuccess"), new cli() { // from class: cld
            @Override // defpackage.cli
            public final Object a() {
                ckp ckpVar;
                IOnDoneCallback iOnDoneCallback2 = IOnDoneCallback.this;
                Object obj2 = obj;
                if (obj2 == null) {
                    ckpVar = null;
                } else {
                    try {
                        ckpVar = new ckp(obj2);
                    } catch (ckv e) {
                        RemoteUtils.f(iOnDoneCallback2, str, e);
                    }
                }
                iOnDoneCallback2.onSuccess(ckpVar);
                return null;
            }
        });
    }
}
