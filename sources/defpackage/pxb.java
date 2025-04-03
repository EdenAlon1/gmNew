package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pxb implements pwz {
    public final otb a;
    public final oru b;

    public pxb(otb otbVar) {
        this.a = otbVar;
        this.b = new pxa(otbVar);
    }

    @Override // defpackage.pwz
    public final List a(String str) {
        otj a = otj.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        a.g(1, str);
        this.a.m();
        Cursor a2 = ovn.a(this.a, a, false);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.j();
        }
    }
}
