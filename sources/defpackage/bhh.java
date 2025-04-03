package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface bhh extends bli, beq {
    public static final bdn p = new bbf("camerax.core.useCase.defaultSessionConfig", bgk.class, null);
    public static final bdn q = new bbf("camerax.core.useCase.defaultCaptureConfig", bdk.class, null);
    public static final bdn r = new bbf("camerax.core.useCase.sessionConfigUnpacker", bgf.class, null);
    public static final bdn s = new bbf("camerax.core.useCase.captureConfigUnpacker", bdj.class, null);
    public static final bdn t = new bbf("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE, null);
    public static final bdn u = new bbf("camerax.core.useCase.targetFrameRate", Range.class, null);
    public static final bdn v = new bbf("camerax.core.useCase.zslDisabled", Boolean.TYPE, null);
    public static final bdn w = new bbf("camerax.core.useCase.highResolutionDisabled", Boolean.TYPE, null);
    public static final bdn x = new bbf("camerax.core.useCase.captureType", bhj.class, null);
    public static final bdn y = new bbf("camerax.core.useCase.previewStabilizationMode", Integer.TYPE, null);
    public static final bdn z = new bbf("camerax.core.useCase.videoStabilizationMode", Integer.TYPE, null);
    public static final bdn A = new bbf("camerax.core.useCase.takePictureManagerProvider", bal.class, null);

    int b();

    int d();

    Range e(Range range);

    bal g();

    bgk j();

    bhj k();

    bgk v();

    bgf w();

    int x();

    boolean y();

    boolean z();
}
