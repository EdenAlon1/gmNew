package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public abstract class aztg {
    public abstract ParticipantsTable.BindData a();

    public abstract Optional b();

    public final int c() {
        return a().q() + 1;
    }

    public final int d() {
        return a().q();
    }

    public final int e() {
        return a().r();
    }

    public final int f() {
        return a().s();
    }

    public final SelfIdentityId g() {
        return aqvf.b(a().S());
    }

    public final String h() {
        return a().X();
    }

    public final boolean i() {
        return a().q() != -1;
    }

    public final boolean j() {
        return a().r() == -1;
    }
}
