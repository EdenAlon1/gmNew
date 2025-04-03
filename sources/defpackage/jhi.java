package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhi extends ffkk implements ffjm {
    final /* synthetic */ jhk a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhi(jhk jhkVar, ffjm ffjmVar) {
        super(2);
        this.a = jhkVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        if (hfdVar.J((intValue & 3) != 2, intValue & 1)) {
            Object tag = this.a.a.getTag(R.id.inspection_slot_table_set);
            Set set = fflf.d(tag) ? (Set) tag : null;
            if (set == null) {
                Object parent = this.a.a.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = fflf.d(tag2) ? (Set) tag2 : null;
            }
            if (set != null) {
                set.add(hfdVar.d());
                hfdVar.i();
            }
            jhk jhkVar = this.a;
            boolean F = hfdVar.F(jhkVar);
            jhk jhkVar2 = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new jhf(jhkVar2, null);
                hfdVar.y(f);
            }
            hgs.g(jhkVar.a, (ffjm) f, hfdVar);
            jhk jhkVar3 = this.a;
            boolean F2 = hfdVar.F(jhkVar3);
            jhk jhkVar4 = this.a;
            Object f2 = hfdVar.f();
            if (F2 || f2 == hfc.a) {
                f2 = new jhg(jhkVar4, null);
                hfdVar.y(f2);
            }
            hgs.g(jhkVar3.a, (ffjm) f2, hfdVar);
            hfz.a(huf.a.c(set), hpx.d(-1193460702, new jhh(this.a, this.b), hfdVar), hfdVar, 56);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
