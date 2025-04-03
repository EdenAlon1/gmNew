package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmu extends ffkk implements ffji {
    public static final jmu a = new jmu();

    public jmu() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            hrh hrhVar = jom.c;
            jlk jlkVar = null;
            if (!ffkj.e(obj2, false) && obj2 != null) {
                jlkVar = (jlk) hrhVar.a(obj2);
            }
            jlkVar.getClass();
            arrayList.add(jlkVar);
        }
        return arrayList;
    }
}
