package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aihq implements aigz, aigx {
    private static final enru a = enru.c("com/google/android/apps/messaging/navigation/NavigationRouterImpl");
    private final aiii b;
    private final ffbr c;
    private final Set d;
    private final fgcm e;

    public aihq(aiii aiiiVar, ffbr ffbrVar) {
        aiiiVar.getClass();
        this.b = aiiiVar;
        this.c = ffbrVar;
        this.d = new LinkedHashSet();
        this.e = fgdm.a(true);
    }

    @Override // defpackage.aigx
    public final fgdj a() {
        return this.b.a();
    }

    @Override // defpackage.aigx
    public final void b(int i) {
        this.b.c(i);
        this.b.b();
    }

    @Override // defpackage.aigx
    public final void c(int i, Object obj) {
        this.b.d(i, obj);
        this.b.b();
    }

    @Override // defpackage.aigx
    public final void d(int i) {
        this.b.e(i);
    }

    @Override // defpackage.aigx
    public final void e(aihv aihvVar, boolean z) {
        Optional optional = (Optional) this.c.b();
        final ffji ffjiVar = new ffji() { // from class: aihm
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((ajjo) obj).k());
            }
        };
        if (((Boolean) optional.map(new Function() { // from class: aihn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            ((ajjo) ((Optional) this.c.b()).get()).e(aihvVar, z);
            return;
        }
        if (z) {
            this.d.remove(aihvVar);
        } else {
            this.d.add(aihvVar);
        }
        if (ffkj.e(aihvVar, aijc.a)) {
            this.e.f(Boolean.valueOf(z));
        }
    }

    @Override // defpackage.aigz
    public final Object f(aihu aihuVar, ffgu ffguVar) {
        enru enruVar = a;
        ((enrr) enruVar.e().h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "navigate", 82, "NavigationRouterImpl.kt")).t("Navigation requested to %s", aihuVar);
        ffhg ffhgVar = new ffhg(ffhi.c(ffguVar));
        if (this.d.contains(aihuVar)) {
            ((enrr) enruVar.j().h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "navigate", 86, "NavigationRouterImpl.kt")).q("Attempting to navigate to disabled navigation target.");
            ffhgVar.w(ffci.a(new aigy()));
        } else {
            try {
                this.b.g(aihuVar, ffhgVar);
            } catch (Exception e) {
                ((enrr) ((enrr) a.j()).g(e).h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "navigate", 100, "NavigationRouterImpl.kt")).q("Navigation request failed.");
                ffhgVar.w(ffci.a(e));
            }
        }
        Object a2 = ffhgVar.a();
        if (a2 == ffhh.a) {
            ffguVar.getClass();
        }
        return a2;
    }

    @Override // defpackage.aigz
    public final fgdj g() {
        Optional optional = (Optional) this.c.b();
        final ffji ffjiVar = new ffji() { // from class: aihi
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((ajjo) obj).k());
            }
        };
        return ((Boolean) optional.map(new Function() { // from class: aihj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue() ? ((ajjo) ((Optional) this.c.b()).get()).g() : this.e;
    }

    @Override // defpackage.aigz
    public final void h(aihs aihsVar) {
        enru enruVar = a;
        ((enrr) enruVar.e().h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "navigate", 43, "NavigationRouterImpl.kt")).t("Navigation requested to %s", aihsVar);
        Optional optional = (Optional) this.c.b();
        final ffji ffjiVar = new ffji() { // from class: aihg
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((ajjo) obj).k());
            }
        };
        if (((Boolean) optional.map(new Function() { // from class: aihh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            ((ajjo) ((Optional) this.c.b()).get()).h(aihsVar);
        } else {
            if (this.d.contains(aihsVar)) {
                ((enrr) enruVar.j().h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "navigate", 50, "NavigationRouterImpl.kt")).q("Attempting to navigate to disabled navigation target.");
                throw new aigy();
            }
            this.b.f(aihsVar);
        }
    }

    @Override // defpackage.aigz
    public final boolean i(aihv aihvVar) {
        Optional optional = (Optional) this.c.b();
        final ffji ffjiVar = new ffji() { // from class: aiho
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((ajjo) obj).k());
            }
        };
        return ((Boolean) optional.map(new Function() { // from class: aihp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue() ? ((ajjo) ((Optional) this.c.b()).get()).i(aihvVar) : !this.d.contains(aihvVar);
    }

    @Override // defpackage.aigz
    public final boolean j(aihs aihsVar) {
        ((enrr) a.e().h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "tryNavigate", 61, "NavigationRouterImpl.kt")).t("Navigation requested to %s", aihsVar);
        Optional optional = (Optional) this.c.b();
        final ffji ffjiVar = new ffji() { // from class: aihk
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((ajjo) obj).k());
            }
        };
        if (((Boolean) optional.map(new Function() { // from class: aihl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            return ((ajjo) ((Optional) this.c.b()).get()).j(aihsVar);
        }
        try {
            h(aihsVar);
            return true;
        } catch (Exception e) {
            ((enrr) ((enrr) a.j()).g(e).h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "tryNavigate", 71, "NavigationRouterImpl.kt")).q("Navigation request failed.");
            return false;
        }
    }
}
