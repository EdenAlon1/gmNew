package defpackage;

import android.content.res.Configuration;
import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsy {
    private final int a;
    private final ddsx[] b;

    public ddsy(int i, ddsx... ddsxVarArr) {
        this.a = i;
        this.b = ddsxVarArr;
    }

    public static boolean b(Configuration configuration) {
        return configuration.orientation == 2;
    }

    public final void a(Configuration configuration) {
        cxpo cxpoVar;
        ddsw ddswVar;
        int F;
        int i;
        int i2;
        if (configuration != null) {
            ddsx[] ddsxVarArr = this.b;
            boolean b = b(configuration);
            for (int i3 = 0; i3 < 2; i3++) {
                ddsx ddsxVar = ddsxVarArr[i3];
                vk vkVar = ddsxVar.a;
                GridLayoutManager gridLayoutManager = ddsxVar.b;
                if (vkVar instanceof cxpo) {
                    cxpo cxpoVar2 = (cxpo) vkVar;
                    cxpoVar = cxpoVar2;
                    vkVar = cxpoVar2.a;
                } else {
                    cxpoVar = null;
                }
                if ((vkVar instanceof ddsw) && gridLayoutManager.b != (F = (ddswVar = (ddsw) vkVar).F(b))) {
                    gridLayoutManager.r(F);
                    if (ddswVar.d != b) {
                        ddswVar.d = b;
                        ddswVar.p();
                    }
                    if (cxpoVar != null && (i = this.a) > 0 && (i2 = i * F) != cxpoVar.d) {
                        cxpoVar.d = i2;
                        cxpoVar.a.p();
                    }
                }
            }
        }
    }
}
