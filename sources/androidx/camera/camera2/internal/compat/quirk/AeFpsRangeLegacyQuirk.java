package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import defpackage.apd;
import defpackage.bgr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements AeFpsRangeQuirk {
    private final Range a;

    public AeFpsRangeLegacyQuirk(apd apdVar) {
        Range[] rangeArr = (Range[]) apdVar.c(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range range = null;
        if (rangeArr != null && (rangeArr.length) != 0) {
            for (Range range2 : rangeArr) {
                Range range3 = new Range(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / 1000 : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / 1000 : ((Integer) range2.getUpper()).intValue()));
                if (((Integer) range3.getUpper()).intValue() == 30 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
            }
        }
        this.a = range;
    }

    @Override // androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk
    public final Range a() {
        Range range = this.a;
        return range != null ? range : bgr.g;
    }
}
