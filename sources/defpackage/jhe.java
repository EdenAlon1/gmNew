package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhe {
    public static final Map a = new LinkedHashMap();

    public static final hfr a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof hfr) {
            return (hfr) tag;
        }
        return null;
    }

    public static final void b(View view, hfr hfrVar) {
        view.setTag(R.id.androidx_compose_ui_view_composition_context, hfrVar);
    }

    public static /* synthetic */ hjh c(View view, ffhd ffhdVar, int i) {
        ffhd ffhdVar2;
        hie hieVar;
        if ((i & 1) != 0) {
            ffhdVar = ffhe.a;
        }
        if (ffhdVar.get(ffgw.k) == null || ffhdVar.get(hhh.e) == null) {
            ffbz ffbzVar = jcc.a;
            if (jcd.a()) {
                ffhdVar2 = jca.a();
            } else {
                ffhdVar2 = (ffhd) jcc.b.get();
                if (ffhdVar2 == null) {
                    throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                }
            }
            ffhdVar = ffhdVar2.plus(ffhdVar);
        }
        hhh hhhVar = (hhh) ffhdVar.get(hhh.e);
        if (hhhVar != null) {
            hie hieVar2 = new hie(hhhVar);
            hhc hhcVar = hieVar2.a;
            synchronized (hhcVar.a) {
                hhcVar.d = false;
            }
            hieVar = hieVar2;
        } else {
            hieVar = null;
        }
        fflb fflbVar = new fflb();
        ffhd ffhdVar3 = (hvl) ffhdVar.get(hvl.b);
        if (ffhdVar3 == null) {
            ffhdVar3 = new jfa();
            fflbVar.a = ffhdVar3;
        }
        ffhd plus = ffhdVar.plus(hieVar != null ? hieVar : ffhe.a).plus(ffhdVar3);
        hjh hjhVar = new hjh(plus);
        hjhVar.x();
        ffsk b = ffsl.b(plus);
        lkr a2 = lmz.a(view);
        lkk P = a2 != null ? a2.P() : null;
        if (P != null) {
            view.addOnAttachStateChangeListener(new jgx(view, hjhVar));
            P.c(new jhb(b, hieVar, hjhVar, fflbVar, view));
            return hjhVar;
        }
        Objects.toString(view);
        imn.a("ViewTreeLifecycleOwner not found from ".concat(String.valueOf(view)));
        throw new ffbx();
    }
}
