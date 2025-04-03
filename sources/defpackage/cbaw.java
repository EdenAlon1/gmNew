package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbaw extends cbbk {
    public static final cskc a = cskc.g("Bugle", "DecodedImageResource");
    public boolean b;
    public final ctap c;
    private Bitmap j;

    public cbaw(String str, Bitmap bitmap, int i, cqoh cqohVar, ctap ctapVar) {
        super(str, i, cqohVar);
        this.b = true;
        this.j = bitmap;
        this.c = ctapVar;
    }

    @Override // defpackage.cbcc
    public final int a() {
        o();
        try {
            csix.l(this.j);
            return this.j.getAllocationByteCount();
        } finally {
            r();
        }
    }

    @Override // defpackage.cbcc
    protected final void b() {
        o();
        try {
            Bitmap bitmap = this.j;
            if (bitmap != null) {
                bitmap.recycle();
                this.j = null;
            }
        } finally {
            r();
        }
    }

    @Override // defpackage.cbbk
    public final int c() {
        return this.d;
    }

    @Override // defpackage.cbbk
    public final Bitmap d() {
        o();
        try {
            return this.j;
        } finally {
            r();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        throw r0;
     */
    @Override // defpackage.cbbk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap e() {
        /*
            r2 = this;
            r2.o()
            r2.o()     // Catch: java.lang.Throwable -> L1d
            int r0 = r2.f     // Catch: java.lang.Throwable -> L18
            r1 = 1
            defpackage.csix.a(r1, r0)     // Catch: java.lang.Throwable -> L18
            r2.r()     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r0 = r2.j     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            r2.j = r1     // Catch: java.lang.Throwable -> L1d
            r2.r()
            return r0
        L18:
            r0 = move-exception
            r2.r()     // Catch: java.lang.Throwable -> L1d
            throw r0     // Catch: java.lang.Throwable -> L1d
        L1d:
            r0 = move-exception
            r2.r()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbaw.e():android.graphics.Bitmap");
    }

    @Override // defpackage.cbbk
    public final Drawable f(Resources resources) {
        Drawable bitmapDrawable;
        o();
        try {
            int i = this.d;
            Bitmap bitmap = this.j;
            bitmap.getClass();
            if (i != 1 && i != 0) {
                bitmapDrawable = new cuxy(i, resources, bitmap);
                return bitmapDrawable;
            }
            bitmapDrawable = new BitmapDrawable(resources, bitmap);
            return bitmapDrawable;
        } finally {
            r();
        }
    }

    @Override // defpackage.cbcc
    public final cbbn g(cbbn cbbnVar) {
        csix.f(false);
        Bitmap d = d();
        d.getClass();
        if (d.hasAlpha()) {
            return null;
        }
        return new cbav(this, cbbnVar);
    }

    @Override // defpackage.cbcc
    public final boolean h() {
        return this.b;
    }

    @Override // defpackage.cbbk
    public final boolean i() {
        return true;
    }

    @Override // defpackage.cbbk
    public final byte[] j() {
        byte[] bArr;
        o();
        try {
            try {
                bArr = this.c.o(this.j, 100);
            } catch (Exception e) {
                a.o("Error trying to get the bitmap bytes.", e);
                bArr = null;
            }
            return bArr;
        } finally {
            r();
        }
    }
}
