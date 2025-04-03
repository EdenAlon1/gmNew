package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eayl extends eayk {
    final /* synthetic */ eaym b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eayl(eaym eaymVar) {
        super(eaymVar);
        this.b = eaymVar;
    }

    @Override // defpackage.eayk
    public final void a(ConstraintLayout constraintLayout) {
        this.b.l.setVisibility(0);
        eaym.f(this.b.i);
        eaym.f(this.b.j);
        eaym eaymVar = this.b;
        eaymVar.i.setGravity(17);
        eaymVar.j.setGravity(17);
        eaymVar.k.setGravity(17);
        if (this.b.k.getVisibility() == 0) {
            eaym.f(this.b.k);
            this.b.m.setVisibility(0);
        }
        int[][] iArr = {new int[]{R.id.og_privacy_policy_button}, new int[]{R.id.og_separator1}, new int[]{R.id.og_tos_button}, new int[]{R.id.og_separator2}, new int[]{R.id.og_custom_button}};
        kkk kkkVar = new kkk();
        kkkVar.d(constraintLayout);
        int i = 0;
        while (i < 5) {
            int x = i == 0 ? 0 : ffdo.x(iArr[i - 1]);
            int i2 = i + 1;
            int x2 = i == 4 ? 0 : ffdo.x(iArr[i2]);
            int x3 = ffdo.x(iArr[i]);
            int i3 = x == 0 ? 3 : 4;
            int i4 = x;
            int i5 = x3;
            kkkVar.g(i5, 3, i4, i3, 0);
            kkkVar.g(i5, 4, x2, x2 == 0 ? 4 : 3, 0);
            if (i4 != 0) {
                kkkVar.g(i4, 4, i5, 3, 0);
                i5 = i5;
            }
            if (x2 != 0) {
                kkkVar.g(x2, 3, i5, 4, 0);
            }
            i = i2;
        }
        for (int i6 = 0; i6 < 5; i6++) {
            int[] iArr2 = iArr[i6];
            int length = iArr2.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = i7 == 0 ? 0 : iArr2[i7 - 1];
                int i9 = i7 + 1;
                int i10 = i7 == iArr2.length + (-1) ? 0 : iArr2[i9];
                int i11 = i7;
                int i12 = iArr2[i11];
                kkkVar.g(i12, 6, i8, i8 == 0 ? 6 : 7, 0);
                int i13 = i8;
                kkkVar.g(i12, 7, i10, i10 == 0 ? 7 : 6, 0);
                if (i13 != 0) {
                    kkkVar.g(i13, 7, i12, 6, 0);
                    i12 = i12;
                }
                if (i10 != 0) {
                    kkkVar.g(i10, 6, i12, 7, 0);
                }
                if (i11 > 0) {
                    kkkVar.f(iArr2[i11], 3, iArr2[0], 3);
                    kkkVar.f(iArr2[i11], 4, iArr2[0], 4);
                }
                i7 = i9;
            }
        }
        kkkVar.c(constraintLayout);
    }
}
