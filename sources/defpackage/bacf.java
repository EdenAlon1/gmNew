package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bacf extends bata {
    public final aoku a;
    public final ParticipantsTable.BindData b;

    public bacf(aoku aokuVar, ParticipantsTable.BindData bindData) {
        this.a = aokuVar;
        if (bindData == null) {
            throw new NullPointerException("Null rawSender");
        }
        this.b = bindData;
    }

    @Override // defpackage.bata
    public final aoku a() {
        return this.a;
    }

    @Override // defpackage.bata
    public final ParticipantsTable.BindData b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bata) {
            bata bataVar = (bata) obj;
            if (this.a.equals(bataVar.a()) && this.b.equals(bataVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SenderInfo{messagingIdentity=" + ((aoks) this.a).o() + ", rawSender=" + this.b.toString() + "}";
    }
}
