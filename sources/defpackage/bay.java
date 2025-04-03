package defpackage;

import android.util.Range;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bay extends bek {
    private final bcm a;
    private final bgl b;

    public bay(bcm bcmVar, bgl bglVar) {
        super(bcmVar);
        this.a = bcmVar;
        this.b = bglVar;
    }

    @Override // defpackage.bek, defpackage.atc
    public final ListenableFuture i(boolean z) {
        return !biu.a(this.b, 6) ? new bkk(new IllegalStateException("Torch is not supported")) : this.a.i(z);
    }

    @Override // defpackage.bek, defpackage.atc
    public final ListenableFuture j(float f) {
        if (!biu.a(this.b, 0)) {
            return new bkk(new IllegalStateException("Zoom is not supported"));
        }
        bgl bglVar = this.b;
        if (bglVar == null) {
            return this.a.j(f);
        }
        Range a = bglVar.a();
        if (a == null) {
            return this.a.j(f);
        }
        if (f <= 1.0f && f >= 0.0f) {
            return this.a.k(bba.t(f, ((Float) a.getLower()).floatValue(), ((Float) a.getUpper()).floatValue()));
        }
        return new bkk(new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]"));
    }

    @Override // defpackage.bek, defpackage.atc
    public final ListenableFuture k(float f) {
        Range a;
        if (!biu.a(this.b, 0)) {
            return new bkk(new IllegalStateException("Zoom is not supported"));
        }
        bgl bglVar = this.b;
        if (bglVar == null || (a = bglVar.a()) == null || (f >= ((Float) a.getLower()).floatValue() && f <= ((Float) a.getUpper()).floatValue())) {
            return this.a.k(f);
        }
        return new bkk(new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + a.getLower() + " , " + a.getUpper() + "]"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r5 == false) goto L30;
     */
    @Override // defpackage.bek, defpackage.atc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture l(defpackage.aud r7) {
        /*
            r6 = this;
            bgl r0 = r6.b
            if (r0 == 0) goto L78
            auc r1 = new auc
            r1.<init>(r7)
            java.util.List r2 = r7.a
            boolean r2 = r2.isEmpty()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L22
            int[] r2 = new int[]{r5, r3}
            boolean r2 = defpackage.biu.a(r0, r2)
            if (r2 != 0) goto L22
            r1.b(r5)
            r4 = r5
        L22:
            java.util.List r2 = r7.b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L39
            r2 = 3
            int[] r2 = new int[]{r2}
            boolean r2 = defpackage.biu.a(r0, r2)
            if (r2 != 0) goto L39
            r1.b(r3)
            goto L3a
        L39:
            r5 = r4
        L3a:
            java.util.List r2 = r7.c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L51
            r2 = 4
            int[] r3 = new int[]{r2}
            boolean r0 = defpackage.biu.a(r0, r3)
            if (r0 != 0) goto L51
            r1.b(r2)
            goto L54
        L51:
            if (r5 != 0) goto L54
            goto L78
        L54:
            aud r7 = new aud
            r7.<init>(r1)
            java.util.List r0 = r7.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L73
            java.util.List r0 = r7.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L73
            java.util.List r7 = r7.c
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L73
            r7 = 0
            goto L78
        L73:
            aud r7 = new aud
            r7.<init>(r1)
        L78:
            if (r7 != 0) goto L87
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "FocusMetering is not supported"
            r7.<init>(r0)
            bkk r0 = new bkk
            r0.<init>(r7)
            return r0
        L87:
            bcm r0 = r6.a
            com.google.common.util.concurrent.ListenableFuture r7 = r0.l(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bay.l(aud):com.google.common.util.concurrent.ListenableFuture");
    }
}
