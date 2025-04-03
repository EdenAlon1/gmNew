package defpackage;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class baj implements avr {
    avq[] a;
    private final Object b;
    private final int c;
    private final int d;
    private final avm e;

    public baj(Bitmap bitmap, long j) {
        ksw.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        int rowBytes = bitmap.getRowBytes();
        int i = ImageProcessingUtil.a;
        ImageProcessingUtil.nativeCopyBetweenByteBufferAndBitmap(bitmap, allocateDirect, bitmap.getRowBytes(), rowBytes, bitmap.getWidth(), bitmap.getHeight(), false);
        allocateDirect.rewind();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.b = new Object();
        this.c = width;
        this.d = height;
        this.e = new bai(j);
        allocateDirect.rewind();
        this.a = new avq[]{new bah(width * 4, allocateDirect)};
    }

    private final void g() {
        synchronized (this.b) {
            ksw.d(this.a != null, "The image is closed.");
        }
    }

    @Override // defpackage.avr
    public final int a() {
        synchronized (this.b) {
            g();
        }
        return 1;
    }

    @Override // defpackage.avr
    public final int b() {
        int i;
        synchronized (this.b) {
            g();
            i = this.d;
        }
        return i;
    }

    @Override // defpackage.avr
    public final int c() {
        int i;
        synchronized (this.b) {
            g();
            i = this.c;
        }
        return i;
    }

    @Override // defpackage.avr, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            g();
            this.a = null;
        }
    }

    @Override // defpackage.avr
    public final Image d() {
        synchronized (this.b) {
            g();
        }
        return null;
    }

    @Override // defpackage.avr
    public final avm e() {
        avm avmVar;
        synchronized (this.b) {
            g();
            avmVar = this.e;
        }
        return avmVar;
    }

    @Override // defpackage.avr
    public final avq[] f() {
        avq[] avqVarArr;
        synchronized (this.b) {
            g();
            avqVarArr = this.a;
            avqVarArr.getClass();
        }
        return avqVarArr;
    }
}
