package defpackage;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ellj {
    public static void a(Activity activity, Class cls, ellh ellhVar) {
        View findViewById = activity.findViewById(R.id.content);
        findViewById.getClass();
        k(com.google.android.apps.messaging.R.id.tiktok_event_activity_listeners, findViewById, cls, ellhVar);
    }

    public static void b(dn dnVar, Class cls, ellh ellhVar) {
        View a = elle.a(dnVar);
        a.getClass();
        k(com.google.android.apps.messaging.R.id.tiktok_event_fragment_listeners, a, cls, ellhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(ea eaVar, Class cls, ellh ellhVar) {
        View view = eaVar.Q;
        if (view != null) {
            k(com.google.android.apps.messaging.R.id.tiktok_event_fragment_listeners, view, cls, ellhVar);
        } else {
            emxf.b(eaVar instanceof ellr, "Fragments without views must implement EventReceiver to add a listener!");
            ((ellr) eaVar).f(cls, ellhVar);
        }
    }

    public static void d(View view, Class cls, ellh ellhVar) {
        k(com.google.android.apps.messaging.R.id.tiktok_event_view_listeners, view, cls, ellhVar);
    }

    public static void e(ellf ellfVar, Activity activity) {
        View findViewById = activity.findViewById(R.id.content);
        findViewById.getClass();
        l(com.google.android.apps.messaging.R.id.tiktok_event_activity_listeners, ellfVar, findViewById);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(ellf ellfVar, ea eaVar) {
        View view = eaVar.Q;
        if (view != null) {
            l(com.google.android.apps.messaging.R.id.tiktok_event_fragment_listeners, ellfVar, view);
            return;
        }
        efbd.c();
        if (eaVar instanceof ellr) {
            elli e = ((ellr) eaVar).e(ellfVar);
            if (e == elli.a) {
                return;
            }
            if (e != elli.b) {
                ellfVar = e.c;
            }
        }
        ea eaVar2 = eaVar.E;
        if (eaVar2 != null) {
            f(ellfVar, eaVar2);
            return;
        }
        eg G = eaVar.G();
        emxf.b(G != null, "Fragments must be attached to an Activity to receive events!");
        e(ellfVar, G);
    }

    public static void g(ellf ellfVar, View view) {
        view.getClass();
        l(com.google.android.apps.messaging.R.id.tiktok_event_view_listeners, ellfVar, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View h(ViewParent viewParent) {
        if (viewParent instanceof View) {
            return (View) viewParent;
        }
        if (viewParent != 0) {
            return h(viewParent.getParent());
        }
        return null;
    }

    private static cpn i(int i, View view) {
        return (cpn) view.getTag(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ellf, java.lang.Object] */
    private static emxc j(int i, View view, emxc emxcVar) {
        elli elliVar;
        if (emxcVar.g()) {
            ?? c = emxcVar.c();
            cpn i2 = i(i, view);
            if (i2 != null && !i2.isEmpty()) {
                Class<?> cls = c.getClass();
                int i3 = 0;
                while (true) {
                    if (i3 >= i2.d) {
                        elliVar = elli.b;
                        break;
                    }
                    Class cls2 = (Class) i2.d(i3);
                    ellh ellhVar = (ellh) i2.g(i3);
                    if (cls2.isAssignableFrom(cls)) {
                        elliVar = ellhVar.a(c);
                        break;
                    }
                    i3++;
                }
            } else {
                elliVar = elli.b;
            }
            if (elliVar == elli.a) {
                return emux.a;
            }
            if (elliVar != elli.b) {
                return emxc.j(elliVar.c);
            }
        }
        return emxcVar;
    }

    private static void k(int i, View view, Class cls, ellh ellhVar) {
        efbd.c();
        cpn i2 = i(i, view);
        if (i2 == null) {
            i2 = new cmh();
            view.setTag(i, i2);
        }
        for (int i3 = 0; i3 < i2.d; i3++) {
            Class<?> cls2 = (Class) i2.d(i3);
            if (cls.equals(cls2)) {
                throw new IllegalArgumentException(String.format(Locale.US, "Class %s is already registered as a listener. Are you adding the same View instance twice?", cls.getSimpleName()));
            }
            if (cls.isAssignableFrom(cls2)) {
                throw new IllegalArgumentException(String.format(Locale.US, "For class %s, a listener is already registered as a subtype: %s", cls.getSimpleName(), cls2.getSimpleName()));
            }
            if (cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(String.format(Locale.US, "For class %s, a listener is already registered as a supertype: %s", cls.getSimpleName(), cls2.getSimpleName()));
            }
        }
        i2.put(cls, ellhVar);
    }

    private static void l(int i, ellf ellfVar, View view) {
        efbd.c();
        emxc j = emxc.j(ellfVar);
        View view2 = view;
        while (view2 != null) {
            if (view2 != view || i == com.google.android.apps.messaging.R.id.tiktok_event_view_listeners) {
                j = j(com.google.android.apps.messaging.R.id.tiktok_event_view_listeners, view2, j);
            }
            if (view2 != view || i != com.google.android.apps.messaging.R.id.tiktok_event_activity_listeners) {
                j = j(com.google.android.apps.messaging.R.id.tiktok_event_fragment_listeners, view2, j);
            }
            j = j(com.google.android.apps.messaging.R.id.tiktok_event_activity_listeners, view2, j);
            if (!j.g()) {
                return;
            }
            Object tag = view2.getTag(com.google.android.apps.messaging.R.id.tiktok_event_parent);
            if (tag != null && !(tag instanceof View)) {
                throw new IllegalStateException("Invalid tag returned: " + String.valueOf(tag.getClass()) + tag.toString() + " for view " + view2.toString());
            }
            View view3 = (View) tag;
            view2 = view3 != null ? view3 : h(view2.getParent());
        }
    }
}
