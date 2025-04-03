package defpackage;

import android.text.Layout;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nkr {
    public static final Comparator a = new Comparator() { // from class: nkq
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((nkr) obj2).c, ((nkr) obj).c);
        }
    };
    public final lsz b;
    public final int c;

    public nkr(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        lsy lsyVar = new lsy();
        lsyVar.a = charSequence;
        lsyVar.c = alignment;
        lsyVar.c(f, 0);
        lsyVar.e = i;
        lsyVar.f = f2;
        lsyVar.g = i2;
        lsyVar.h = -3.4028235E38f;
        if (z) {
            lsyVar.e(i3);
        }
        this.b = lsyVar.a();
        this.c = i4;
    }
}
