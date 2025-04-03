package defpackage;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProcessingUtil;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayo implements bnd {
    private final bnb a;

    public ayo(bnb bnbVar) {
        this.a = bnbVar;
    }

    @Override // defpackage.bnd
    public final /* synthetic */ Object a(Object obj) {
        bmc bmcVar = (bmc) obj;
        new baj((Bitmap) bmcVar.a, bmcVar.h.a());
        final bmy bmyVar = new bmy();
        final bnb bnbVar = this.a;
        try {
            avr a = ((avo) kfg.a(new kfd() { // from class: bna
                @Override // defpackage.kfd
                public final Object a(final kfb kfbVar) {
                    final bnb bnbVar2 = bnb.this;
                    bnbVar2.a.execute(new Runnable() { // from class: bmz
                        @Override // java.lang.Runnable
                        public final void run() {
                            bnb bnbVar3 = bnb.this;
                            kfb kfbVar2 = kfbVar;
                            try {
                                kfbVar2.b(bnbVar3.b.a());
                            } catch (awm e) {
                                bnbVar3.c.accept(e);
                                kfbVar2.c(e);
                            }
                        }
                    });
                    return "InternalImageProcessor#process " + bmyVar.hashCode();
                }
            }).get()).a();
            a.getClass();
            avq[] f = a.f();
            boolean z = f.length == 1;
            int c = a.c();
            int b = a.b();
            ksw.b(z, "Expect a single plane");
            ksw.b(f[0].a() == 4, "Expect pixelStride=4");
            ksw.b(f[0].b() == c * 4, "Expect rowStride=width*4");
            Bitmap createBitmap = Bitmap.createBitmap(c, b, Bitmap.Config.ARGB_8888);
            f[0].c().rewind();
            ImageProcessingUtil.a(createBitmap, f[0].c(), f[0].b());
            bia biaVar = bmcVar.b;
            biaVar.getClass();
            return bne.i(createBitmap, biaVar, bmcVar.e, bmcVar.f, bmcVar.g, bmcVar.h);
        } catch (Exception e) {
            Exception exc = e;
            Throwable cause = exc.getCause();
            Throwable th = exc;
            if (cause != null) {
                th = exc.getCause();
            }
            throw new avl("Failed to invoke ImageProcessor.", th);
        }
    }
}
