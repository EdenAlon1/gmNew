package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebvk {
    public final eayo a;
    private final ebvw b;
    private final eave c;
    private final ebvy d;

    public ebvk(ebvw ebvwVar, ebvy ebvyVar, eave eaveVar, eayo eayoVar) {
        this.b = ebvwVar;
        this.d = ebvyVar;
        this.c = eaveVar;
        this.a = eayoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void a(ebvw ebvwVar, View view) {
        if (view instanceof ebwc) {
            ((ebwc) view).b(ebvwVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a(ebvwVar, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void c(ebvw ebvwVar, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                c(ebvwVar, viewGroup.getChildAt(i));
            }
        }
        if (view instanceof ebwc) {
            ((ebwc) view).ho(ebvwVar);
        }
    }

    private static void d(View view, ebve ebveVar) {
        view.setTag(R.id.view_bound_account_tag, ebveVar);
    }

    public final void b(View view, int i, Object obj) {
        ebve d = ebve.d(this.c, obj);
        ebve ebveVar = (ebve) view.getTag(R.id.view_bound_account_tag);
        if (d.equals(ebveVar)) {
            return;
        }
        if (ebveVar == null) {
            this.d.a(view, i, d);
            d(view, d);
            return;
        }
        int[] iArr = kvo.a;
        if (view.isAttachedToWindow()) {
            c(this.b, view);
            this.d.b.e(view);
            this.d.a(view, i, d);
            a(this.b, view);
            d(view, d);
        }
    }
}
