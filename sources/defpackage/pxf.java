package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pxf implements pxd {
    private final otb a;
    private final oru b;

    public pxf(otb otbVar) {
        this.a = otbVar;
        this.b = new pxe(otbVar);
    }

    @Override // defpackage.pxd
    public final Long a(String str) {
        otj a = otj.a("SELECT long_value FROM Preference where `key`=?", 1);
        a.g(1, str);
        this.a.m();
        Cursor a2 = ovn.a(this.a, a, false);
        try {
            Long l = null;
            if (a2.moveToFirst() && !a2.isNull(0)) {
                l = Long.valueOf(a2.getLong(0));
            }
            return l;
        } finally {
            a2.close();
            a.j();
        }
    }

    @Override // defpackage.pxd
    public final void b(pxc pxcVar) {
        this.a.m();
        this.a.n();
        try {
            this.b.a(pxcVar);
            this.a.q();
        } finally {
            this.a.o();
        }
    }
}
