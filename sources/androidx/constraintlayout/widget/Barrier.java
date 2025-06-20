package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.kiq;
import defpackage.kjx;
import defpackage.kko;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Barrier extends kjx {
    public int a;
    public kiq b;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // defpackage.kjx
    protected final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.b = new kiq();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, kko.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    this.a = obtainStyledAttributes.getInt(26, 0);
                } else if (index == 25) {
                    this.b.b = obtainStyledAttributes.getBoolean(25, true);
                } else if (index == 27) {
                    this.b.c = obtainStyledAttributes.getDimensionPixelSize(27, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.i = this.b;
        k();
    }

    public final void b(int i) {
        this.b.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000c, code lost:
    
        if (r0 == 6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0013, code lost:
    
        if (r0 == 6) goto L5;
     */
    @Override // defpackage.kjx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.kiu r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.a
            r1 = 1
            r2 = 0
            r3 = 6
            r4 = 5
            if (r7 == 0) goto Lf
            if (r0 != r4) goto Lc
        La:
            r0 = r1
            goto L16
        Lc:
            if (r0 != r3) goto L16
            goto L11
        Lf:
            if (r0 != r4) goto L13
        L11:
            r0 = r2
            goto L16
        L13:
            if (r0 != r3) goto L16
            goto La
        L16:
            boolean r7 = r6 instanceof defpackage.kiq
            if (r7 == 0) goto L1e
            kiq r6 = (defpackage.kiq) r6
            r6.a = r0
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.c(kiu, boolean):void");
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
