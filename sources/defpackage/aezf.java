package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aezf extends aezx {
    public final ParticipantsTable.BindData a;
    public final engw b;
    public final engi c;
    public final boolean d;
    public final SuperSortLabel e;

    public aezf(ParticipantsTable.BindData bindData, engw engwVar, engi engiVar, boolean z, SuperSortLabel superSortLabel) {
        if (bindData == null) {
            throw new NullPointerException("Null sender");
        }
        this.a = bindData;
        if (engwVar == null) {
            throw new NullPointerException("Null otherParticipants");
        }
        this.b = engwVar;
        if (engiVar == null) {
            throw new NullPointerException("Null classifications");
        }
        this.c = engiVar;
        this.d = z;
        if (superSortLabel == null) {
            throw new NullPointerException("Null previousLabelInConversation");
        }
        this.e = superSortLabel;
    }

    @Override // defpackage.aezx
    public final SuperSortLabel a() {
        return this.e;
    }

    @Override // defpackage.aezx
    public final ParticipantsTable.BindData b() {
        return this.a;
    }

    @Override // defpackage.aezx
    public final engi c() {
        return this.c;
    }

    @Override // defpackage.aezx
    public final engw d() {
        return this.b;
    }

    @Override // defpackage.aezx
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aezx) {
            aezx aezxVar = (aezx) obj;
            if (this.a.equals(aezxVar.b()) && enkr.h(this.b, aezxVar.d()) && this.c.equals(aezxVar.c()) && this.d == aezxVar.e() && this.e.equals(aezxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        SuperSortLabel superSortLabel = this.e;
        engi engiVar = this.c;
        engw engwVar = this.b;
        return "MappingParams{sender=" + this.a.toString() + ", otherParticipants=" + engwVar.toString() + ", classifications=" + engiVar.toString() + ", conversationStartedByUser=" + this.d + ", previousLabelInConversation=" + superSortLabel.toString() + "}";
    }
}
