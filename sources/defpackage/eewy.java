package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eewy {
    public static final String[] a = new String[0];

    public static void a(eewm eewmVar, int i, eexb eexbVar) {
        ArrayList<eewl> arrayList;
        ArrayList arrayList2;
        eexbVar.a(i + i);
        eexbVar.println(eewmVar.c());
        int i2 = i + 1;
        if (i2 > 3) {
            eexbVar.a(8);
            eexbVar.println("...");
            return;
        }
        eexh eexhVar = eeww.a;
        List d = eewmVar.d();
        if (d == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList3 = new ArrayList(d);
            Collections.sort(arrayList3, new Comparator() { // from class: eewr
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    eexh eexhVar2 = eeww.a;
                    return ((eewl) obj).b().toLowerCase(Locale.ENGLISH).compareTo(((eewl) obj2).b().toLowerCase(Locale.ENGLISH));
                }
            });
            arrayList = arrayList3;
        }
        for (eewl eewlVar : arrayList) {
            eexbVar.a(i2 + i2);
            eexbVar.println(eewlVar.b());
        }
        List e = eewmVar.e();
        if (e == null) {
            arrayList2 = new ArrayList();
        } else {
            ArrayList arrayList4 = new ArrayList(e);
            Collections.sort(arrayList4, new Comparator() { // from class: eewq
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    eexh eexhVar2 = eeww.a;
                    return ((eewm) obj).c().toLowerCase(Locale.ENGLISH).compareTo(((eewm) obj2).c().toLowerCase(Locale.ENGLISH));
                }
            });
            arrayList2 = arrayList4;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a((eewm) it.next(), i2, eexbVar);
        }
    }

    public static String[] b(ListIterator listIterator) {
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasNext()) {
            arrayList.add((String) listIterator.next());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static final eewm c(ListIterator listIterator, eewm eewmVar) {
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            eewm b = eeww.b(eewmVar, (String) listIterator.next());
            if (b == null) {
                listIterator.previous();
                break;
            }
            eewmVar = b;
        }
        return eewmVar;
    }
}
