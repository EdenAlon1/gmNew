package defpackage;

import android.util.Size;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface bet extends bfz {
    public static final bdn E = new bbf("camerax.core.imageOutput.targetAspectRatio", ass.class, null);
    public static final bdn F = new bbf("camerax.core.imageOutput.targetRotation", Integer.TYPE, null);
    public static final bdn G = new bbf("camerax.core.imageOutput.appTargetRotation", Integer.TYPE, null);
    public static final bdn H = new bbf("camerax.core.imageOutput.mirrorMode", Integer.TYPE, null);
    public static final bdn I = new bbf("camerax.core.imageOutput.targetResolution", Size.class, null);
    public static final bdn J = new bbf("camerax.core.imageOutput.defaultResolution", Size.class, null);
    public static final bdn K = new bbf("camerax.core.imageOutput.maxResolution", Size.class, null);
    public static final bdn L = new bbf("camerax.core.imageOutput.supportedResolutions", List.class, null);
    public static final bdn M = new bbf("camerax.core.imageOutput.resolutionSelector", boy.class, null);
    public static final bdn N = new bbf("camerax.core.imageOutput.customOrderedResolutions", List.class, null);

    int A();

    int B(int i);

    boy D();

    boolean E();

    int F();

    List H();

    Size I();

    Size J();

    int K();

    boy L();

    List M();

    Size N();
}
