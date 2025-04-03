package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcji implements bbin {
    private final dtzj a;
    private final Map b;
    private final Map c;

    public bcji() {
        dtzq dtzqVar = new dtzq("(CASE $V WHEN $V THEN $V ELSE $V END)", new Object[]{ParticipantsTable.c.d, -2, 0, 1});
        this.a = dtzqVar;
        this.b = ffew.c(new ffcf(bcjh.c.h, dtzqVar));
        bcjj bcjjVar = bcjj.a;
        this.c = bcjj.b;
    }

    @Override // defpackage.bbin
    public final void a() {
        bcjj.a.a();
    }

    @Override // defpackage.bbin
    public final void b(bbim bbimVar) {
        bbimVar.getClass();
        String[] strArr = bcjh.a;
        dtvx dtvxVar = new dtvx("participants_backup", "backup");
        ArrayList arrayList = new ArrayList(2);
        ffle.a(this.c.keySet().toArray(new bcic[0]), arrayList);
        ffle.a(this.b.keySet().toArray(new bcic[0]), arrayList);
        dtvxVar.b((dtry[]) arrayList.toArray(new dtry[arrayList.size()]));
        bcjj bcjjVar = bcjj.a;
        Map map = this.b;
        bvvn c = bcjj.c();
        for (Map.Entry entry : map.entrySet()) {
            c.n((dtzj) entry.getValue(), String.valueOf(((bcic) entry.getKey()).d()).concat("_expression"));
        }
        dtvxVar.c = c.b();
        dtvxVar.a().a();
    }
}
