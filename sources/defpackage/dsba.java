package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsba extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ dsbf c;
    final /* synthetic */ RecyclerView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsba(dsbf dsbfVar, RecyclerView recyclerView, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = dsbfVar;
        this.d = recyclerView;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dsba dsbaVar = new dsba(this.c, this.d, (ffgu) obj3);
        dsbaVar.a = (Size) obj;
        dsbaVar.b = (dsat) obj2;
        return dsbaVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        obj3.getClass();
        dsbf dsbfVar = this.c;
        dsbfVar.bb(this.d, (Size) obj2, (dsat) obj3);
        return ffcu.a;
    }
}
