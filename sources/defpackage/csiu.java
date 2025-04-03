package defpackage;

import android.app.Activity;
import android.os.Bundle;
import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csiu implements csiv {
    public static final /* synthetic */ int a = 0;
    private final Set b;
    private final Set c = new HashSet();
    private final Set d = new HashSet();
    private final Set e = new HashSet();

    public csiu(Set set) {
        this.b = set;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ekzz f = eleg.f("AppStateManagerV2#onActivityCreated");
        try {
            if (this.c.add(activity) && this.c.size() == 1) {
                Iterable$EL.forEach(this.b, new Consumer() { // from class: csis
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = csiu.a;
                        ((csib) obj).a();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.e.remove(activity) && this.e.isEmpty()) {
            Iterable$EL.forEach(this.b, new Consumer() { // from class: csii
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = csiu.a;
                    ((csib) obj).e();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (this.d.remove(activity) && this.d.isEmpty()) {
            Iterable$EL.forEach(this.b, new Consumer() { // from class: csil
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = csiu.a;
                    ((csib) obj).f();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (this.c.remove(activity) && this.c.isEmpty()) {
            Iterable$EL.forEach(this.b, new Consumer() { // from class: csim
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = csiu.a;
                    ((csib) obj).d();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.e.remove(activity) && this.e.isEmpty()) {
            Iterable$EL.forEach(this.b, new Consumer() { // from class: csip
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = csiu.a;
                    ((csib) obj).e();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ekzz f = eleg.f("AppStateManagerV2#onActivityResumed");
        try {
            if (this.c.add(activity) && this.c.size() == 1) {
                Iterable$EL.forEach(this.b, new Consumer() { // from class: csit
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = csiu.a;
                        ((csib) obj).a();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (this.d.add(activity) && this.d.size() == 1) {
                Iterable$EL.forEach(this.b, new Consumer() { // from class: csij
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = csiu.a;
                        ((csib) obj).c();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (this.e.add(activity) && this.e.size() == 1) {
                Iterable$EL.forEach(this.b, new Consumer() { // from class: csik
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = csiu.a;
                        ((csib) obj).b();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ekzz f = eleg.f("AppStateManagerV2#onActivityStarted");
        try {
            if (this.c.add(activity) && this.c.size() == 1) {
                Iterable$EL.forEach(this.b, new Consumer() { // from class: csiq
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = csiu.a;
                        ((csib) obj).a();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (this.d.add(activity) && this.d.size() == 1) {
                Iterable$EL.forEach(this.b, new Consumer() { // from class: csir
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = csiu.a;
                        ((csib) obj).c();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.e.remove(activity) && this.e.isEmpty()) {
            Iterable$EL.forEach(this.b, new Consumer() { // from class: csin
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = csiu.a;
                    ((csib) obj).e();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (this.d.remove(activity) && this.d.isEmpty()) {
            Iterable$EL.forEach(this.b, new Consumer() { // from class: csio
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = csiu.a;
                    ((csib) obj).f();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
