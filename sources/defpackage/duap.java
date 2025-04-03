package defpackage;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class duap {
    final List a;

    protected duap(duav duavVar) {
        this.a = new ArrayList(duavVar.a);
    }

    public final String a(dtzu dtzuVar) {
        List list = this.a;
        int size = list.size();
        int size2 = list.size();
        if (size2 == 0) {
            return "1";
        }
        if (size2 == 1) {
            StringBuilder sb = new StringBuilder();
            ((duaw) this.a.get(0)).b(dtzuVar, sb);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        ((duaw) this.a.get(0)).b(dtzuVar, sb2);
        for (int i = 1; i < size; i++) {
            sb2.append(" AND ");
            ((duaw) this.a.get(i)).b(dtzuVar, sb2);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final String b(dtzu dtzuVar, List list) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int size = this.a.size();
        if (size != 0) {
            if (size != 1) {
                sb.append("(");
                ((duaw) this.a.get(0)).a(dtzuVar, sb, arrayList);
                for (int i = 1; i < size; i++) {
                    sb.append(" AND ");
                    ((duaw) this.a.get(i)).a(dtzuVar, sb, arrayList);
                }
                sb.append(")");
            } else {
                ((duaw) this.a.get(0)).a(dtzuVar, sb, arrayList);
            }
        } else {
            sb.append("1");
        }
        if (list != null) {
            list.addAll(arrayList);
        }
        return sb.toString();
    }

    final void c(dtse dtseVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((duaw) it.next()).e(dtseVar);
        }
    }

    protected final boolean d(dtyl dtylVar, duaw duawVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((duaw) it.next()).c(dtylVar, duawVar)) {
                return true;
            }
        }
        return false;
    }

    protected final boolean e(String str, ContentValues contentValues) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((duaw) it.next()).d(str, contentValues)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof duap)) {
            return a(dtzu.b()).equals(((duap) obj).a(dtzu.b()));
        }
        return false;
    }

    public final boolean f(duao duaoVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (duaoVar.a((duaw) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a(dtzu.b()).hashCode();
    }
}
