package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jka extends ffkk implements ffjm {
    public static final jka a = new jka();

    public jka() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        if (list == null) {
            return list2;
        }
        List am = ffdx.am(list);
        am.addAll(list2);
        return am;
    }
}
