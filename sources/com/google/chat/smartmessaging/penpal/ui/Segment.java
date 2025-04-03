package com.google.chat.smartmessaging.penpal.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.apps.common.proguard.UsedByNative;
import defpackage.ffkj;
import java.util.Arrays;

/* compiled from: PG */
@UsedByNative
/* loaded from: classes5.dex */
public final class Segment {
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public final int d;
    public Bitmap e;
    public Rect f;

    @UsedByNative
    public Segment(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        iArr.getClass();
        iArr2.getClass();
        iArr3.getClass();
        this.a = iArr;
        this.b = iArr2;
        this.c = iArr3;
        this.d = i;
        this.f = new Rect();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) obj;
        return ffkj.e(this.a, segment.a) && ffkj.e(this.b, segment.b) && ffkj.e(this.c, segment.c) && this.d == segment.d;
    }

    public final int hashCode() {
        return (((((Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c)) * 31) + this.d;
    }

    public final String toString() {
        int[] iArr = this.c;
        int[] iArr2 = this.b;
        return "Segment(mask=" + Arrays.toString(this.a) + ", boundingBox=" + Arrays.toString(iArr2) + ", sendButtonPosition=" + Arrays.toString(iArr) + ", pixelCount=" + this.d + ")";
    }
}
