package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kcm extends ffkk implements ffix {
    final /* synthetic */ kcp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcm(kcp kcpVar) {
        super(0);
        this.a = kcpVar;
    }

    @Override // defpackage.ffix
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.a.w.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
