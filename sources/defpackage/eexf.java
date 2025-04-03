package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eexf implements rot {
    private final Context a;

    public eexf(Context context) {
        this.a = context;
    }

    @Override // defpackage.rot
    public final String a() {
        return "poke";
    }

    @Override // defpackage.rot
    public final void b(ros rosVar) {
        String F;
        String str;
        String[] d;
        eexh eexhVar = eeww.a;
        PrintStream printStream = rosVar.a;
        if (!eewu.b) {
            printStream.println("ERROR: poke is not enabled");
            return;
        }
        ListIterator listIterator = rosVar.b.listIterator();
        String str2 = listIterator.hasNext() ? (String) listIterator.next() : null;
        Context context = this.a;
        eewp c = eeww.c();
        if ("autocomplete".equals(str2)) {
            if (eewu.b) {
                eewm c2 = eewy.c(listIterator, c);
                if (listIterator.hasNext()) {
                    eewl a = eeww.a(c2, (String) listIterator.next());
                    d = a == null ? eewy.a : a.d(context, eewy.b(listIterator));
                } else {
                    HashSet hashSet = new HashSet();
                    Iterator it = c2.d().iterator();
                    while (it.hasNext()) {
                        hashSet.add(((eewl) it.next()).b());
                    }
                    Iterator it2 = c2.e().iterator();
                    while (it2.hasNext()) {
                        hashSet.add(((eewm) it2.next()).c());
                    }
                    d = (String[]) hashSet.toArray(new String[hashSet.size()]);
                }
            } else {
                d = eewy.a;
            }
            F = TextUtils.join(" ", d);
        } else if ("run".equals(str2)) {
            eewm c3 = eewy.c(listIterator, c);
            if (listIterator.hasNext()) {
                String str3 = (String) listIterator.next();
                String[] b = eewy.b(listIterator);
                eewl a2 = eeww.a(c3, str3);
                if (a2 != null) {
                    try {
                        str = a2.c(context, b);
                    } catch (Exception e) {
                        str = "Action failed:\n" + e.toString() + "\n  " + TextUtils.join("\n  ", e.getStackTrace());
                    }
                } else {
                    str = "Invalid action: ".concat(String.valueOf(str3));
                }
                F = String.valueOf(str).concat("\n");
            } else {
                eexb eexbVar = new eexb();
                eewy.a(c3, 0, eexbVar);
                F = eexbVar.toString();
            }
        } else {
            F = a.F(listIterator, "Invalid command: ", "\n");
        }
        printStream.print(F);
    }
}
