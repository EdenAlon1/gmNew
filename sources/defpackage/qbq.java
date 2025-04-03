package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbq {
    public static final String a = ppt.d("DiagnosticsWrkr");

    public static final String a(pxu pxuVar, pzj pzjVar, pxm pxmVar, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pyj pyjVar = (pyj) it.next();
            pxk a2 = pxl.a(pxmVar, pzh.a(pyjVar));
            Integer valueOf = a2 != null ? Integer.valueOf(a2.c) : null;
            String str = pyjVar.c;
            otj a3 = otj.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            a3.g(1, str);
            pxw pxwVar = (pxw) pxuVar;
            pxwVar.a.m();
            Cursor a4 = ovn.a(pxwVar.a, a3, false);
            try {
                ArrayList arrayList = new ArrayList(a4.getCount());
                while (a4.moveToNext()) {
                    arrayList.add(a4.getString(0));
                }
                a4.close();
                a3.j();
                sb.append("\n" + pyjVar.c + "\t " + pyjVar.e + "\t " + valueOf + "\t " + pyjVar.d.name() + "\t " + ffdx.aA(arrayList, ",", null, null, null, 62) + "\t " + ffdx.aA(pzjVar.a(pyjVar.c), ",", null, null, null, 62) + '\t');
            } catch (Throwable th) {
                a4.close();
                a3.j();
                throw th;
            }
        }
        return sb.toString();
    }
}
