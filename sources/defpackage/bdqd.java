package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bdqd extends bdsn {
    public final String a;
    public final ParticipantsTable.BindData b;
    private final ParticipantsTable.BindData c;

    public bdqd(String str, ParticipantsTable.BindData bindData, ParticipantsTable.BindData bindData2) {
        if (str == null) {
            throw new NullPointerException("Null foundOrCreatedParticipantId");
        }
        this.a = str;
        if (bindData == null) {
            throw new NullPointerException("Null idealParticipantBindData");
        }
        this.c = bindData;
        if (bindData2 == null) {
            throw new NullPointerException("Null existingParticipantBindData");
        }
        this.b = bindData2;
    }

    @Override // defpackage.bdsn
    public final ParticipantsTable.BindData a() {
        return this.b;
    }

    @Override // defpackage.bdsn
    public final ParticipantsTable.BindData b() {
        return this.c;
    }

    @Override // defpackage.bdsn
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdsn) {
            bdsn bdsnVar = (bdsn) obj;
            if (this.a.equals(bdsnVar.c()) && this.c.equals(bdsnVar.b()) && this.b.equals(bdsnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ParticipantsTable.BindData bindData = this.b;
        return "ParticipantInformation{foundOrCreatedParticipantId=" + this.a + ", idealParticipantBindData=" + this.c.toString() + ", existingParticipantBindData=" + bindData.toString() + "}";
    }
}
