package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcpe {
    public static final dtzj a;
    public static final dtzj b;
    public static final dtzj c;
    public static final dtzj d;

    static {
        String[] strArr = PartsTable.a;
        bwau bwauVar = PartsTable.d.b;
        a = new dtzq("SELECT COUNT(*) FROM $V AS parts_1 WHERE $V{J:bugle_parts} = $V{X:parts_1}", new Object[]{"parts", bwauVar, bwauVar});
        String[] strArr2 = bcds.a;
        bccp bccpVar = bcds.c;
        bccq bccqVar = bccpVar.b;
        b = new dtzq("SELECT COUNT(*) FROM $V AS backup_parts_1 WHERE $V = $V{X:backup_parts_1}", new Object[]{"parts_backup", bccqVar, bccqVar});
        bwat bwatVar = PartsTable.d;
        bwau bwauVar2 = bwatVar.a;
        bwau bwauVar3 = bwatVar.e;
        bwau bwauVar4 = bwatVar.b;
        c = new dtzq("SELECT part_order FROM (SELECT $V{X:parts_2} AS pid, (ROW_NUMBER() OVER(ORDER BY $V{X:parts_2}, $V{X:parts_2})) AS part_order FROM $V AS parts_2 WHERE $V{J:bugle_parts} = $V{X:parts_2}) WHERE pid = $V{J:bugle_parts}", new Object[]{bwauVar2, bwauVar3, bwauVar2, "parts", bwauVar4, bwauVar4, bwauVar2});
        bccq bccqVar2 = bccpVar.a;
        d = new dtzq("SELECT part_order FROM (SELECT $V{X:backup_parts_2} AS pid, (ROW_NUMBER() OVER(ORDER BY $V{X:backup_parts_2}, $V{X:backup_parts_2})) AS part_order FROM $V AS backup_parts_2 WHERE $V = $V{X:backup_parts_2}) WHERE pid = $V", new Object[]{bccqVar2, bccpVar.c, bccqVar2, "parts_backup", bccqVar, bccqVar, bccqVar2});
    }
}
