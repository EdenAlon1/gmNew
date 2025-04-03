package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqpn {
    private final ParticipantsTable.BindData a;

    public aqpn(ParticipantsTable.BindData bindData) {
        this.a = bindData;
    }

    public final boolean a() {
        return b() && cuky.a(this.a.n()).d();
    }

    public final boolean b() {
        return this.a.ab();
    }

    public final boolean c() {
        return !b() && cuky.a(this.a.n()).c();
    }

    public final boolean d() {
        return b() && cuky.a(this.a.n()).c();
    }
}
