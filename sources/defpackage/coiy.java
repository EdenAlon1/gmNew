package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class coiy {
    public abstract cnvv a();

    public final MessagesTable.BindData b() {
        return a().a;
    }

    public final ScheduledSendTable.BindData c() {
        return a().c;
    }

    public final Instant d() {
        return a().c.l();
    }

    public final String e() {
        return a().c.m();
    }

    public final PartsTable.BindData[] f() {
        return a().b;
    }
}
