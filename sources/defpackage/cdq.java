package defpackage;

import android.os.Build;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdq {
    public static volatile bfx a;

    static {
        bfu.b.a(bjb.a(), new ksp() { // from class: cdp
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                bfs bfsVar = (bfs) obj;
                bfx bfxVar = cdq.a;
                ArrayList arrayList = new ArrayList();
                if (bfsVar.a(SurfaceViewStretchedQuirk.class, Build.VERSION.SDK_INT < 33 && (("SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER) && ("F2Q".equalsIgnoreCase(Build.DEVICE) || "Q2Q".equalsIgnoreCase(Build.DEVICE))) || (("OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE)) || ("LENOVO".equalsIgnoreCase(Build.MANUFACTURER) && "Q706F".equalsIgnoreCase(Build.DEVICE)))))) {
                    arrayList.add(new SurfaceViewStretchedQuirk());
                }
                if (bfsVar.a(SurfaceViewNotCroppedByParentQuirk.class, "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL))) {
                    arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
                }
                cdq.a = new bfx(arrayList);
                avw.a("DeviceQuirks", "view DeviceQuirks = ".concat(bfx.b(cdq.a)));
            }
        });
    }

    public static bfr a(Class cls) {
        return a.a(cls);
    }
}
