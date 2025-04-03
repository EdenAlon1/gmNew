package defpackage;

import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anh {
    public static int a(bhj bhjVar, int i) {
        int ordinal = bhjVar.ordinal();
        return ordinal != 0 ? (ordinal == 3 && ara.a(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i == 2 ? 5 : 1;
    }
}
