package com.google.android.apps.messaging.ui.ditto;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.WindowManager;
import defpackage.cfup;
import defpackage.cfvl;
import defpackage.dbqh;
import defpackage.dfvd;
import defpackage.dhvy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CameraSourcePreview extends ViewGroup {
    public static final cfup a = cfvl.e(cfvl.b, "start_camera_max_retry", 3);
    private static final String g = "CameraSourcePreview";
    public dhvy b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private final SurfaceView h;

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        this.c = false;
        this.e = false;
        SurfaceView surfaceView = new SurfaceView(context);
        this.h = surfaceView;
        surfaceView.getHolder().addCallback(new dbqh(this));
        addView(surfaceView);
    }

    private final boolean b() {
        return ((360 - (((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation() * 90)) % 360) % 180 == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r18 = r3;
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ca A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:66:0x0099, B:70:0x00aa, B:89:0x00c4, B:91:0x00d1, B:92:0x00dc, B:94:0x00e2, B:96:0x00f1, B:97:0x00fa, B:99:0x0100, B:109:0x0123, B:110:0x0139, B:112:0x013f, B:122:0x0160, B:124:0x0169, B:125:0x0170, B:133:0x01a6, B:135:0x01bd, B:137:0x01ca, B:138:0x01dc, B:140:0x01ea, B:142:0x01f6, B:143:0x01ff, B:144:0x0213, B:146:0x0217, B:148:0x021b, B:150:0x0227, B:151:0x0231, B:152:0x0238, B:154:0x0286, B:155:0x0289, B:157:0x01d4), top: B:65:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ea A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:66:0x0099, B:70:0x00aa, B:89:0x00c4, B:91:0x00d1, B:92:0x00dc, B:94:0x00e2, B:96:0x00f1, B:97:0x00fa, B:99:0x0100, B:109:0x0123, B:110:0x0139, B:112:0x013f, B:122:0x0160, B:124:0x0169, B:125:0x0170, B:133:0x01a6, B:135:0x01bd, B:137:0x01ca, B:138:0x01dc, B:140:0x01ea, B:142:0x01f6, B:143:0x01ff, B:144:0x0213, B:146:0x0217, B:148:0x021b, B:150:0x0227, B:151:0x0231, B:152:0x0238, B:154:0x0286, B:155:0x0289, B:157:0x01d4), top: B:65:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0227 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:66:0x0099, B:70:0x00aa, B:89:0x00c4, B:91:0x00d1, B:92:0x00dc, B:94:0x00e2, B:96:0x00f1, B:97:0x00fa, B:99:0x0100, B:109:0x0123, B:110:0x0139, B:112:0x013f, B:122:0x0160, B:124:0x0169, B:125:0x0170, B:133:0x01a6, B:135:0x01bd, B:137:0x01ca, B:138:0x01dc, B:140:0x01ea, B:142:0x01f6, B:143:0x01ff, B:144:0x0213, B:146:0x0217, B:148:0x021b, B:150:0x0227, B:151:0x0231, B:152:0x0238, B:154:0x0286, B:155:0x0289, B:157:0x01d4), top: B:65:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0231 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:66:0x0099, B:70:0x00aa, B:89:0x00c4, B:91:0x00d1, B:92:0x00dc, B:94:0x00e2, B:96:0x00f1, B:97:0x00fa, B:99:0x0100, B:109:0x0123, B:110:0x0139, B:112:0x013f, B:122:0x0160, B:124:0x0169, B:125:0x0170, B:133:0x01a6, B:135:0x01bd, B:137:0x01ca, B:138:0x01dc, B:140:0x01ea, B:142:0x01f6, B:143:0x01ff, B:144:0x0213, B:146:0x0217, B:148:0x021b, B:150:0x0227, B:151:0x0231, B:152:0x0238, B:154:0x0286, B:155:0x0289, B:157:0x01d4), top: B:65:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0286 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:66:0x0099, B:70:0x00aa, B:89:0x00c4, B:91:0x00d1, B:92:0x00dc, B:94:0x00e2, B:96:0x00f1, B:97:0x00fa, B:99:0x0100, B:109:0x0123, B:110:0x0139, B:112:0x013f, B:122:0x0160, B:124:0x0169, B:125:0x0170, B:133:0x01a6, B:135:0x01bd, B:137:0x01ca, B:138:0x01dc, B:140:0x01ea, B:142:0x01f6, B:143:0x01ff, B:144:0x0213, B:146:0x0217, B:148:0x021b, B:150:0x0227, B:151:0x0231, B:152:0x0238, B:154:0x0286, B:155:0x0289, B:157:0x01d4), top: B:65:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d4 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:66:0x0099, B:70:0x00aa, B:89:0x00c4, B:91:0x00d1, B:92:0x00dc, B:94:0x00e2, B:96:0x00f1, B:97:0x00fa, B:99:0x0100, B:109:0x0123, B:110:0x0139, B:112:0x013f, B:122:0x0160, B:124:0x0169, B:125:0x0170, B:133:0x01a6, B:135:0x01bd, B:137:0x01ca, B:138:0x01dc, B:140:0x01ea, B:142:0x01f6, B:143:0x01ff, B:144:0x0213, B:146:0x0217, B:148:0x021b, B:150:0x0227, B:151:0x0231, B:152:0x0238, B:154:0x0286, B:155:0x0289, B:157:0x01d4), top: B:65:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02b9 A[Catch: RuntimeException -> 0x02ca, IOException -> 0x02cc, SecurityException -> 0x02ce, TryCatch #8 {IOException -> 0x02cc, SecurityException -> 0x02ce, RuntimeException -> 0x02ca, blocks: (B:22:0x028c, B:27:0x02a6, B:29:0x02b9, B:30:0x02be, B:34:0x02bc, B:77:0x02e4), top: B:21:0x028c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02bc A[Catch: RuntimeException -> 0x02ca, IOException -> 0x02cc, SecurityException -> 0x02ce, TryCatch #8 {IOException -> 0x02cc, SecurityException -> 0x02ce, RuntimeException -> 0x02ca, blocks: (B:22:0x028c, B:27:0x02a6, B:29:0x02b9, B:30:0x02be, B:34:0x02bc, B:77:0x02e4), top: B:21:0x028c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.ditto.CameraSourcePreview.a():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        dfvd dfvdVar;
        dhvy dhvyVar = this.b;
        int i7 = 320;
        int i8 = 240;
        if (dhvyVar != null && (dfvdVar = dhvyVar.e) != null) {
            i7 = dfvdVar.a;
            i8 = dfvdVar.b;
        }
        boolean b = b();
        int i9 = true != b ? i8 : i7;
        if (true == b) {
            i7 = i8;
        }
        int i10 = i3 - i;
        int i11 = i4 - i2;
        float f = i9;
        float f2 = i7;
        float f3 = i10 / f2;
        float f4 = i11 / f;
        if (f3 > f4) {
            int i12 = (int) (f * f3);
            int i13 = (i12 - i11) / 2;
            i11 = i12;
            i6 = i13;
            i5 = 0;
        } else {
            int i14 = (int) (f2 * f4);
            i5 = (i14 - i10) / 2;
            i10 = i14;
            i6 = 0;
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            getChildAt(i15).layout(-i5, -i6, i10 - i5, i11 - i6);
        }
        a();
    }
}
