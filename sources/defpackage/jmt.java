package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmt extends ffkk implements ffjm {
    public static final jmt a = new jmt();

    public jmt() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hqt hqtVar = (hqt) obj;
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(jom.a((jlk) list.get(i), jom.c, hqtVar));
        }
        return arrayList;
    }
}
