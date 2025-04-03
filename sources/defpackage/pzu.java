package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzu {
    public static final pqb a(UUID uuid, pte pteVar) {
        uuid.getClass();
        pof pofVar = pteVar.d.m;
        qak qakVar = pteVar.m.a;
        qakVar.getClass();
        return pqf.a(pofVar, "CancelWorkById", qakVar, new pzq(pteVar, uuid));
    }

    public static final void b(pte pteVar, String str) {
        pua a;
        WorkDatabase workDatabase = pteVar.e;
        workDatabase.getClass();
        pyk D = workDatabase.D();
        pwz x = workDatabase.x();
        List i = ffdx.i(str);
        while (!i.isEmpty()) {
            String str2 = (String) ffdx.s(i);
            pqp a2 = D.a(str2);
            if (a2 != pqp.SUCCEEDED && a2 != pqp.FAILED) {
                pzg pzgVar = (pzg) D;
                pzgVar.a.m();
                oyf d = pzgVar.d.d();
                d.g(1, str2);
                try {
                    ((pzg) D).a.n();
                    try {
                        d.a();
                        ((pzg) D).a.q();
                    } finally {
                    }
                } finally {
                    pzgVar.d.f(d);
                }
            }
            i.addAll(x.a(str2));
        }
        prv prvVar = pteVar.g;
        prvVar.getClass();
        synchronized (prvVar.j) {
            ppt.c().a(prv.a, a.t(str, "Processor cancelling "));
            prvVar.h.add(str);
            a = prvVar.a(str);
        }
        prv.e(str, a, 1);
        Iterator it = pteVar.f.iterator();
        while (it.hasNext()) {
            ((prx) it.next()).b(str);
        }
    }

    public static final void c(final String str, final pte pteVar) {
        str.getClass();
        final WorkDatabase workDatabase = pteVar.e;
        workDatabase.getClass();
        workDatabase.p(new Runnable() { // from class: pzo
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = str;
                pyk D = WorkDatabase.this.D();
                otj a = otj.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
                a.g(1, str2);
                pzg pzgVar = (pzg) D;
                pzgVar.a.m();
                Cursor a2 = ovn.a(pzgVar.a, a, false);
                try {
                    ArrayList arrayList = new ArrayList(a2.getCount());
                    while (a2.moveToNext()) {
                        arrayList.add(a2.getString(0));
                    }
                    a2.close();
                    a.j();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        pzu.b(pteVar, (String) it.next());
                    }
                } catch (Throwable th) {
                    a2.close();
                    a.j();
                    throw th;
                }
            }
        });
    }

    public static final void d(pte pteVar) {
        psa.a(pteVar.d, pteVar.e, pteVar.f);
    }
}
