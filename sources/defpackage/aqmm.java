package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqmm {
    private final ffbr a;
    private final ffbr b;

    public aqmm(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
    }

    public final aqml a(ParticipantsTable.BindData bindData, bqwx bqwxVar, ProfilesTable.BindData bindData2) {
        bindData.getClass();
        return new aqml(this.a, this.b, bindData, bqwxVar, bindData2);
    }
}
