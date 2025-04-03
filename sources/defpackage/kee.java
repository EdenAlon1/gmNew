package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kee extends kwi {
    final /* synthetic */ kef a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kee(kef kefVar) {
        super(1);
        this.a = kefVar;
    }

    @Override // defpackage.kwi
    public final kxh b(kxh kxhVar, List list) {
        kef kefVar = this.a;
        if (kefVar.c) {
            return kxhVar;
        }
        int i = 0;
        View childAt = kefVar.getChildAt(0);
        int max = Math.max(0, childAt.getLeft());
        int max2 = Math.max(0, childAt.getTop());
        int max3 = Math.max(0, kefVar.getWidth() - childAt.getRight());
        int max4 = Math.max(0, kefVar.getHeight() - childAt.getBottom());
        if (max != 0) {
            i = max;
        } else if (max2 == 0) {
            if (max3 != 0) {
                max2 = 0;
            } else {
                if (max4 == 0) {
                    return kxhVar;
                }
                max2 = 0;
                max3 = 0;
            }
        }
        return kxhVar.n(i, max2, max3, max4);
    }

    @Override // defpackage.kwi
    public final kwh e(kwh kwhVar) {
        kef kefVar = this.a;
        if (!kefVar.c) {
            int i = 0;
            View childAt = kefVar.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, kefVar.getWidth() - childAt.getRight());
            int max4 = Math.max(0, kefVar.getHeight() - childAt.getBottom());
            if (max != 0) {
                i = max;
            } else if (max2 == 0) {
                if (max3 != 0) {
                    max2 = 0;
                } else if (max4 != 0) {
                    max2 = 0;
                    max3 = 0;
                }
            }
            kpt kptVar = kwhVar.a;
            kpt d = kpt.d(i, max2, max3, max4);
            int i2 = d.b;
            int i3 = d.c;
            int i4 = d.d;
            int i5 = d.e;
            return new kwh(kxh.i(kptVar, i2, i3, i4, i5), kxh.i(kwhVar.b, i2, i3, i4, i5));
        }
        return kwhVar;
    }
}
