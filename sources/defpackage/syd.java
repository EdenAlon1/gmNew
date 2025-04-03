package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syd extends sye {
    public final ParticipantsTable.BindData a;

    public syd(ParticipantsTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // defpackage.sye, defpackage.tai
    public final ParticipantsTable.BindData a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tai) {
            tai taiVar = (tai) obj;
            taiVar.b();
            if (this.a.equals(taiVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DialogTarget{participant=" + this.a.toString() + "}";
    }

    @Override // defpackage.tai
    public final void b() {
    }
}
