package defpackage;

import com.google.mediapipe.framework.GlSyncToken;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exks extends exln {
    final /* synthetic */ exkt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exks(exkt exktVar, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = exktVar;
    }

    @Override // defpackage.exln, com.google.mediapipe.framework.TextureFrame
    public final void release() {
        super.release();
        this.a.b(this);
    }

    @Override // defpackage.exln, com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final void release(GlSyncToken glSyncToken) {
        super.release(glSyncToken);
        this.a.b(this);
    }
}
