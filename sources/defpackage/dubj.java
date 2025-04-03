package defpackage;

import com.google.mediapipe.framework.TextureFrame;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dubj implements exky {
    public exky a;
    long b = Long.MAX_VALUE;

    @Override // defpackage.exky
    public final void hI(TextureFrame textureFrame) {
        exky exkyVar = this.a;
        if (exkyVar == null) {
            textureFrame.release();
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        long timestamp = textureFrame.getTimestamp();
        long min = Math.min(this.b, nanoTime - timestamp);
        this.b = min;
        exkyVar.hI(new dubk(textureFrame, timestamp + min));
    }
}
