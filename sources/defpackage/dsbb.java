package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsbb extends ffhv implements ffjn {
    /* synthetic */ Object a;
    final /* synthetic */ dsbf b;
    final /* synthetic */ RecyclerView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsbb(dsbf dsbfVar, RecyclerView recyclerView, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = dsbfVar;
        this.c = recyclerView;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dsbb dsbbVar = new dsbb(this.b, this.c, (ffgu) obj3);
        dsbbVar.a = (Size) obj;
        return dsbbVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        dsbf dsbfVar = this.b;
        dsat e = dsbf.e(dsbfVar);
        e.getClass();
        dsbfVar.bb(this.c, (Size) obj2, e);
        return ffcu.a;
    }
}
