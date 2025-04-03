package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzm implements pzj {
    public final otb a;
    public final oru b;
    public final otr c;

    public pzm(otb otbVar) {
        this.a = otbVar;
        this.b = new pzk(otbVar);
        this.c = new pzl(otbVar);
    }

    @Override // defpackage.pzj
    public final List a(String str) {
        otj a = otj.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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

    @Override // defpackage.pzj
    public final /* synthetic */ void b(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            pzi pziVar = new pzi((String) it.next(), str);
            this.a.m();
            this.a.n();
            try {
                this.b.a(pziVar);
                this.a.q();
            } finally {
                this.a.o();
            }
        }
    }
}
