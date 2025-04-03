package defpackage;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvrl implements Serializable {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("GnpSdk");
    private final Set c;

    public dvrl(Set set) {
        this.c = set;
        ((ensz) ((ensz) b.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "<init>", 28, "TargetElementFinder.java")).t("set is %s.", set);
    }

    public static View c(Activity activity, View view, emwl emwlVar) {
        View d;
        View e = e(view, emwlVar);
        return (e != null || (d = easo.d(activity)) == null) ? e : e(d, emwlVar);
    }

    private static View e(View view, emwl emwlVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.poll();
            if (((Boolean) emwlVar.apply(view2)).booleanValue()) {
                return view2;
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayDeque.offer(viewGroup.getChildAt(i));
                }
            }
        }
        return null;
    }

    public final View a(Activity activity, View view, String str) {
        View d;
        if (activity == null) {
            ((ensz) ((ensz) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementById", 40, "TargetElementFinder.java")).q("activity is null, can't find view.");
            return null;
        }
        Resources resources = activity.getResources();
        if (resources == null) {
            return null;
        }
        int identifier = resources.getIdentifier(str, "id", activity.getPackageName());
        if (identifier == 0) {
            ((ensz) ((ensz) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementById", 51, "TargetElementFinder.java")).t("Did not find resource with id %s", str);
            return null;
        }
        if (view == null) {
            view = activity.findViewById(R.id.content);
        }
        View findViewById = view.findViewById(identifier);
        if (findViewById == null && (d = easo.d(activity)) != null) {
            findViewById = d.findViewById(identifier);
        }
        View rootView = view.getRootView();
        if (findViewById == null && rootView != null) {
            findViewById = rootView.findViewById(identifier);
        }
        if (findViewById == null) {
            ((ensz) ((ensz) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementById", 73, "TargetElementFinder.java")).t("Did not find a view with id %s", str);
        }
        return findViewById;
    }

    public final View b(Activity activity, View view, final String str) {
        if (activity == null) {
            ((ensz) ((ensz) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByTag", 88, "TargetElementFinder.java")).q("activity is null, can't find view.");
            return null;
        }
        if (str == null) {
            ((ensz) ((ensz) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByTag", 93, "TargetElementFinder.java")).q("Received null tag, can't find a view with tag.");
            return null;
        }
        if (view == null) {
            view = activity.findViewById(R.id.content);
        }
        View c = c(activity, view, new emwl() { // from class: dvrj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = dvrl.a;
                return Boolean.valueOf(str.equals(((View) obj).getTag(com.google.android.apps.messaging.R.id.growthkit_view_tag)));
            }
        });
        View rootView = view.getRootView();
        if (c == null && rootView != null) {
            c = c(activity, rootView, new emwl() { // from class: dvrk
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    int i = dvrl.a;
                    return Boolean.valueOf(str.equals(((View) obj).getTag(com.google.android.apps.messaging.R.id.growthkit_view_tag)));
                }
            });
        }
        if (c == null) {
            ((ensz) ((ensz) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByTag", 112, "TargetElementFinder.java")).t("Did not find a view with tag %s", str);
        }
        return c;
    }

    public final View d(Activity activity) {
        if (activity == null) {
            ((ensz) ((ensz) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByVeId", 122, "TargetElementFinder.java")).q("activity is null, can't find view.");
            return null;
        }
        if (this.c.isEmpty()) {
            ((ensz) ((ensz) b.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByVeId", 127, "TargetElementFinder.java")).q("No Visual Element View Finder was bound, can't find View");
            return null;
        }
        enqu listIterator = ((enpd) this.c).listIterator();
        while (listIterator.hasNext()) {
            View a2 = ((dvuj) listIterator.next()).a();
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
