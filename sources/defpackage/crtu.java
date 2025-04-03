package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crtu extends csby {
    private final ParticipantsTable.BindData a;
    private final long b;
    private final bxro c;

    public crtu(ParticipantsTable.BindData bindData, long j, bxro bxroVar) {
        this.a = bindData;
        this.b = j;
        this.c = bxroVar;
    }

    @Override // defpackage.csby
    public final long a() {
        return this.b;
    }

    @Override // defpackage.csby
    public final ParticipantsTable.BindData b() {
        return this.a;
    }

    @Override // defpackage.csby
    public final bxro c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        bxro bxroVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof csby) {
            csby csbyVar = (csby) obj;
            if (this.a.equals(csbyVar.b()) && this.b == csbyVar.a() && ((bxroVar = this.c) != null ? bxroVar.equals(csbyVar.c()) : csbyVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        bxro bxroVar = this.c;
        int hashCode2 = bxroVar == null ? 0 : bxroVar.hashCode();
        long j = this.b;
        return (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ hashCode2;
    }

    public final String toString() {
        bxro bxroVar = this.c;
        return "CmsParticipantData{participant=" + this.a.toString() + ", linkPreviewCount=" + this.b + ", selfParticipantData=" + String.valueOf(bxroVar) + "}";
    }
}
