package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jnj extends ffkk implements ffjm {
    public static final jnj a = new jnj();

    public jnj() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hqt hqtVar = (hqt) obj;
        List list = ((jws) obj2).b;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(jom.a((jwq) list.get(i), jom.s, hqtVar));
        }
        return arrayList;
    }
}
