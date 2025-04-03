package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface bcf extends bfz {
    public static final bdn a = new bbf("camerax.core.camera.useCaseConfigFactory", bhl.class, null);
    public static final bdn b;
    public static final bdn c;
    public static final bdn d;
    public static final bdn e;

    static {
        new bbf("camerax.core.camera.compatibilityId", bem.class, null);
        b = new bbf("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);
        c = new bbf("camerax.core.camera.SessionProcessor", bgl.class, null);
        new bbf("camerax.core.camera.isZslDisabled", Boolean.class, null);
        d = new bbf("camerax.core.camera.isPostviewSupported", Boolean.class, null);
        e = new bbf("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);
    }

    bhl a();

    bgl b();
}
