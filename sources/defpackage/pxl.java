package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pxl {
    public static pxk a(pxm pxmVar, pxs pxsVar) {
        otj a = otj.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        a.g(1, pxsVar.a);
        a.e(2, pxsVar.b);
        pxq pxqVar = (pxq) pxmVar;
        pxqVar.a.m();
        Cursor a2 = ovn.a(pxqVar.a, a, false);
        try {
            return a2.moveToFirst() ? new pxk(a2.getString(ovm.b(a2, "work_spec_id")), a2.getInt(ovm.b(a2, "generation")), a2.getInt(ovm.b(a2, "system_id"))) : null;
        } finally {
            a2.close();
            a.j();
        }
    }
}
