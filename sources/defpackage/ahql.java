package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahql extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ int b;
    final /* synthetic */ ahqt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahql(ahqt ahqtVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = ahqtVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        ahql ahqlVar = new ahql(this.c, (ffgu) obj3);
        ahqlVar.a = (pmd) obj;
        ahqlVar.b = intValue;
        return ahqlVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        List list = ((pmd) this.a).a;
        int i = this.b;
        ArrayList<plm> arrayList = new ArrayList();
        for (Object obj2 : list) {
            plm plmVar = (plm) obj2;
            if ((plmVar instanceof plm) && ffkj.e(plmVar.b(), plj.a)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        for (plm plmVar2 : arrayList) {
            plmVar2.getClass();
            arrayList2.add(plmVar2);
        }
        return new Float(((plm) ffdx.M(arrayList2)) != null ? r6.a().left / i : kpp.a(this.c.b.getResources(), R.dimen.split_view_leftside_width_percent));
    }
}
