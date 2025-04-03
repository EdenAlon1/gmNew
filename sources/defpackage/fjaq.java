package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjaq {
    public List a;
    public List b;

    public final void a(fizg fizgVar) {
        List list;
        List list2 = this.b;
        if (list2 != null) {
            fjar fjarVar = (fjar) list2.get(list2.size() - 1);
            list = fjarVar.b.size() > 0 ? fjarVar.b : fjarVar.c;
        } else {
            list = this.a;
        }
        list.add(fizgVar);
    }
}
