package defpackage;

import android.graphics.Bitmap;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duho implements FrameSequenceDrawable.BitmapProvider, qwv {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final FrameSequence b;
    private final qxf c;
    private final LinkedList d = new LinkedList();

    public duho(FrameSequence frameSequence, qxf qxfVar) {
        this.b = frameSequence;
        this.c = qxfVar;
    }

    @Override // defpackage.qwv
    public final int a() {
        FrameSequence frameSequence = this.b;
        return (int) (frameSequence.getWidth() * frameSequence.getHeight() * ((this.b.getFrameCount() * 0.06d) + 16.0d));
    }

    @Override // android.support.rastermill.FrameSequenceDrawable.BitmapProvider
    public final Bitmap acquireBitmap(int i, int i2) {
        return this.c.a(i, i2, a);
    }

    @Override // defpackage.qwv
    public final Class b() {
        return FrameSequenceDrawable.class;
    }

    @Override // defpackage.qwv
    public final /* bridge */ /* synthetic */ Object c() {
        FrameSequenceDrawable frameSequenceDrawable = new FrameSequenceDrawable(this.b, this);
        this.d.add(frameSequenceDrawable);
        return frameSequenceDrawable;
    }

    @Override // defpackage.qwv
    public final void e() {
        while (!this.d.isEmpty()) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) this.d.poll();
            if (!frameSequenceDrawable.isDestroyed()) {
                frameSequenceDrawable.destroy();
            }
        }
    }

    @Override // android.support.rastermill.FrameSequenceDrawable.BitmapProvider
    public final void releaseBitmap(Bitmap bitmap) {
        this.c.d(bitmap);
    }
}
