package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqm extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqm(ffjm ffjmVar) {
        super(2);
        this.a = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hrc hrcVar;
        hqt hqtVar = (hqt) obj;
        List list = (List) this.a.a(hqtVar, obj2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj3 = list.get(i);
            if (obj3 != null && (hrcVar = hqtVar.b) != null && !hrcVar.c(obj3)) {
                throw new IllegalArgumentException("item can't be saved");
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return new ArrayList(list);
    }
}
