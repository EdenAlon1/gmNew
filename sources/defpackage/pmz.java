package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pmz {
    public static final /* synthetic */ int a = 0;
    private static final String b = "pmz";

    public static final pmd a(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        pll pllVar;
        plk plkVar;
        sidecarDeviceState.getClass();
        if (sidecarWindowLayoutInfo == null) {
            return new pmd(ffel.a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        int a2 = pmu.a(sidecarDeviceState);
        try {
            try {
                sidecarDeviceState2.posture = a2;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState2, Integer.valueOf(a2));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        List<SidecarDisplayFeature> b2 = pmu.b(sidecarWindowLayoutInfo);
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature sidecarDisplayFeature : b2) {
            sidecarDisplayFeature.getClass();
            String str = b;
            str.getClass();
            SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new pgt(sidecarDisplayFeature, str, 3).a("Type must be either TYPE_FOLD or TYPE_HINGE", pmv.a).a("Feature bounds must not be 0", pmw.a).a("TYPE_FOLD must have 0 area", pmx.a).a("Feature be pinned to either left or top", pmy.a).b();
            plm plmVar = null;
            if (sidecarDisplayFeature2 != null) {
                int type = sidecarDisplayFeature2.getType();
                if (type == 1) {
                    pllVar = pll.a;
                } else if (type == 2) {
                    pllVar = pll.b;
                }
                int a3 = pmu.a(sidecarDeviceState2);
                if (a3 == 2) {
                    plkVar = plk.b;
                } else if (a3 == 3) {
                    plkVar = plk.a;
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                plmVar = new plm(new pgm(rect), pllVar, plkVar);
            }
            if (plmVar != null) {
                arrayList.add(plmVar);
            }
        }
        return new pmd(arrayList);
    }
}
