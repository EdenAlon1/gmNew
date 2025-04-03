package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzt extends ffkk implements ffix {
    final /* synthetic */ pte a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzt(pte pteVar, String str) {
        super(0);
        this.a = pteVar;
        this.b = str;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        final pte pteVar = this.a;
        final WorkDatabase workDatabase = pteVar.e;
        workDatabase.getClass();
        final String str = this.b;
        workDatabase.p(new Runnable() { // from class: pzs
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = str;
                pyk D = WorkDatabase.this.D();
                otj a = otj.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
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
        pzu.d(this.a);
        return ffcu.a;
    }
}
