package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;
import androidx.car.app.navigation.NavigationManager;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cgf;
import defpackage.cjw;
import defpackage.clh;
import defpackage.cls;
import defpackage.lkk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NavigationManager implements cgf {
    public final INavigationManager.Stub a;

    /* compiled from: PG */
    /* renamed from: androidx.car.app.navigation.NavigationManager$1, reason: invalid class name */
    public class AnonymousClass1 extends INavigationManager.Stub {
        final /* synthetic */ lkk val$lifecycle;

        public AnonymousClass1(lkk lkkVar) {
            this.val$lifecycle = lkkVar;
        }

        /* renamed from: lambda$onStopNavigation$0$androidx-car-app-navigation-NavigationManager$1, reason: not valid java name */
        public /* synthetic */ Object m207xb1216230() {
            cls.a();
            return null;
        }

        @Override // androidx.car.app.navigation.INavigationManager
        public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.d(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new clh() { // from class: cjv
                @Override // defpackage.clh
                public final Object a() {
                    return NavigationManager.AnonymousClass1.this.m207xb1216230();
                }
            });
        }
    }

    public NavigationManager(lkk lkkVar) {
        this.a = new AnonymousClass1(lkkVar);
        lkkVar.c(new cjw(lkkVar));
    }
}
