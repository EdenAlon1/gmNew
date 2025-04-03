package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dwej {
    SURFACE_0(R.dimen.gm3_sys_elevation_level0),
    SURFACE_1(R.dimen.gm3_sys_elevation_level1),
    SURFACE_2(R.dimen.gm3_sys_elevation_level2),
    SURFACE_3(R.dimen.gm3_sys_elevation_level3),
    SURFACE_4(R.dimen.gm3_sys_elevation_level4),
    SURFACE_5(R.dimen.gm3_sys_elevation_level5);

    private final int h;

    dwej(int i) {
        this.h = i;
    }

    public final int a(Context context) {
        return new ehfz(context).a(ehdr.c(context, R.attr.colorSurface, 0), context.getResources().getDimension(this.h));
    }
}
