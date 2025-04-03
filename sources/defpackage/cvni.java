package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvni {
    public final byyt a;
    public final boolean b;
    private final ParticipantsTable.BindData c;

    public cvni(ParticipantsTable.BindData bindData, byyt byytVar) {
        this.c = bindData;
        this.a = byytVar;
        boolean z = false;
        if (bindData != null && cuky.a(bindData.n()).b()) {
            z = true;
        }
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvni)) {
            return false;
        }
        cvni cvniVar = (cvni) obj;
        return ffkj.e(this.c, cvniVar.c) && this.a == cvniVar.a;
    }

    public final int hashCode() {
        ParticipantsTable.BindData bindData = this.c;
        int hashCode = bindData == null ? 0 : bindData.hashCode();
        byyt byytVar = this.a;
        return (hashCode * 31) + (byytVar != null ? byytVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParticipantAndArchiveStatus(participant=" + this.c + ", archiveStatus=" + this.a + ")";
    }
}
