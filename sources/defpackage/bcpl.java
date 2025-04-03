package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcpl {
    public static final dtzj a;
    public static final dtzj b;
    public static final dtzj c;

    static {
        dtzq dtzqVar = new dtzq("(CASE $V WHEN $V THEN $V ELSE ($V + $V) END)", new Object[]{bcjh.c.h, 0, -2, bcjh.c.a, 1073745920});
        a = dtzqVar;
        b = new dtzq("$V{J:bugle_participants} = $V", new Object[]{ParticipantsTable.c.d, dtzqVar});
        c = new dtzq("($V{J:bugle_participants} IS NULL AND $V IS NULL)", new Object[]{ParticipantsTable.c.f, bcjh.c.c});
    }
}
