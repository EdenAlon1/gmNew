package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnnu implements ffbr {
    final /* synthetic */ ParticipantsTable.BindData a;

    public cnnu(ParticipantsTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* synthetic */ Object b() {
        bdgc y = bdgd.y();
        y.l(false);
        y.k(false);
        y.z(new cpxu());
        y.p(ffdx.b(this.a));
        ((bczj) y).b = Optional.empty();
        y.m(0);
        return y.A();
    }
}
