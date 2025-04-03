package defpackage;

import com.google.mediapipe.framework.ProtoUtil;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class exoq implements AutoCloseable {
    public static final /* synthetic */ int d = 0;
    public final exod a;
    public final String b = "image_in";
    public final String c = "norm_rect_in";

    static {
        ProtoUtil.b(exlm.class, "mediapipe.NormalizedRect");
    }

    public exoq(exod exodVar) {
        this.a = exodVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
