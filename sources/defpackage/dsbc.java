package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsbc implements ffxy {
    final /* synthetic */ dsbf a;
    final /* synthetic */ RecyclerView b;

    public dsbc(dsbf dsbfVar, RecyclerView recyclerView) {
        this.a = dsbfVar;
        this.b = recyclerView;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        dsbf dsbfVar = this.a;
        dsat e = dsbf.e(dsbfVar);
        e.getClass();
        dsbfVar.bb(this.b, (Size) obj, e);
        return ffcu.a;
    }
}
