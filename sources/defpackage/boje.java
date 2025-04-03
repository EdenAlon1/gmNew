package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ParticipantIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boje extends dtyx<boja, bojc, boje, ParticipantIdsQuery.BindData, boiz> {
    public boje(String[] strArr) {
        super("participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bojc b() {
        l();
        return new bojc(this.a.a());
    }
}
