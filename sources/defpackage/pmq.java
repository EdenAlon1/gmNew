package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pmq {
    public static final pmd a(pme pmeVar, WindowLayoutInfo windowLayoutInfo) {
        pll pllVar;
        plk plkVar;
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            plm plmVar = null;
            if (foldingFeature instanceof FoldingFeature) {
                foldingFeature.getClass();
                FoldingFeature foldingFeature2 = foldingFeature;
                int type = foldingFeature2.getType();
                if (type == 1) {
                    pllVar = pll.a;
                } else if (type == 2) {
                    pllVar = pll.b;
                }
                int state = foldingFeature2.getState();
                if (state == 1) {
                    plkVar = plk.a;
                } else if (state == 2) {
                    plkVar = plk.b;
                }
                Rect bounds = foldingFeature2.getBounds();
                bounds.getClass();
                pgm pgmVar = new pgm(bounds);
                Rect a = pmeVar.a();
                if ((pgmVar.a() != 0 || pgmVar.b() != 0) && ((pgmVar.b() == a.width() || pgmVar.a() == a.height()) && ((pgmVar.b() >= a.width() || pgmVar.a() >= a.height()) && (pgmVar.b() != a.width() || pgmVar.a() != a.height())))) {
                    Rect bounds2 = foldingFeature2.getBounds();
                    bounds2.getClass();
                    plmVar = new plm(new pgm(bounds2), pllVar, plkVar);
                }
            }
            if (plmVar != null) {
                arrayList.add(plmVar);
            }
        }
        return new pmd(arrayList);
    }

    public static final pmd b(Context context, WindowLayoutInfo windowLayoutInfo) {
        pmh pmhVar = new pmh(null);
        if (Build.VERSION.SDK_INT >= 30) {
            return a(pnu.a().b(context, pmhVar.b), windowLayoutInfo);
        }
        if (Build.VERSION.SDK_INT < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        pnq pnqVar = pmhVar.b;
        return a(pnu.a().a((Activity) context, pnqVar), windowLayoutInfo);
    }
}
