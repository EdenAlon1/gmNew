package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pxj implements pxg {
    public final otb a;

    public pxj(otb otbVar) {
        this.a = otbVar;
    }

    public final void a(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            owa.a(hashMap, new ffji() { // from class: pxi
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    pxj.this.a((HashMap) obj);
                    return ffcu.a;
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        owh.a(sb, size);
        sb.append(")");
        otj a = otj.a(sb.toString(), size);
        Iterator it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            a.g(i, (String) it.next());
            i++;
        }
        Cursor a2 = ovn.a(this.a, a, false);
        try {
            int a3 = ovm.a(a2, "work_spec_id");
            if (a3 != -1) {
                while (a2.moveToNext()) {
                    ArrayList arrayList = (ArrayList) hashMap.get(a2.getString(a3));
                    if (arrayList != null) {
                        arrayList.add(pot.c(a2.getBlob(0)));
                    }
                }
            }
        } finally {
            a2.close();
        }
    }

    public final void b(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            owa.a(hashMap, new ffji() { // from class: pxh
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    pxj.this.b((HashMap) obj);
                    return ffcu.a;
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        owh.a(sb, size);
        sb.append(")");
        otj a = otj.a(sb.toString(), size);
        Iterator it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            a.g(i, (String) it.next());
            i++;
        }
        Cursor a2 = ovn.a(this.a, a, false);
        try {
            int a3 = ovm.a(a2, "work_spec_id");
            if (a3 != -1) {
                while (a2.moveToNext()) {
                    ArrayList arrayList = (ArrayList) hashMap.get(a2.getString(a3));
                    if (arrayList != null) {
                        arrayList.add(a2.getString(0));
                    }
                }
            }
        } finally {
            a2.close();
        }
    }
}
