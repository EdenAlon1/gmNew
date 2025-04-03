package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nyn implements Comparable {
    public String a;
    public String b;

    public nyn(String str) {
        List list;
        str.getClass();
        List f = new ffpa("/").f(str);
        if (!f.isEmpty()) {
            ListIterator listIterator = f.listIterator(f.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = ffdx.ai(f, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = ffel.a;
        this.a = (String) list.get(0);
        this.b = (String) list.get(1);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(nyn nynVar) {
        nynVar.getClass();
        int i = true != ffkj.e(this.a, nynVar.a) ? 0 : 2;
        return ffkj.e(this.b, nynVar.b) ? i + 1 : i;
    }
}
