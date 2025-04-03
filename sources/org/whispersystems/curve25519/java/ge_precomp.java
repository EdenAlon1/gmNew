package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ge_precomp {
    public int[] xy2d;
    public int[] yminusx;
    public int[] yplusx;

    public ge_precomp() {
        this.yplusx = new int[10];
        this.yminusx = new int[10];
        this.xy2d = new int[10];
    }

    public ge_precomp(int[] iArr, int[] iArr2, int[] iArr3) {
        this.yplusx = iArr;
        this.yminusx = iArr2;
        this.xy2d = iArr3;
    }
}
