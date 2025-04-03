package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aso implements avr {
    private final Image a;
    private final asn[] b;
    private final avm c;

    public aso(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new asn[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new asn(planes[i]);
            }
        } else {
            this.b = new asn[0];
        }
        this.c = new asv(bgw.a, image.getTimestamp(), new Matrix());
    }

    @Override // defpackage.avr
    public final int a() {
        return this.a.getFormat();
    }

    @Override // defpackage.avr
    public final int b() {
        return this.a.getHeight();
    }

    @Override // defpackage.avr
    public final int c() {
        return this.a.getWidth();
    }

    @Override // defpackage.avr, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.avr
    public final Image d() {
        return this.a;
    }

    @Override // defpackage.avr
    public final avm e() {
        return this.c;
    }

    @Override // defpackage.avr
    public final avq[] f() {
        return this.b;
    }
}
