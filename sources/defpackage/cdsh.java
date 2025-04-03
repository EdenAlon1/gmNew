package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdsh extends cdvn {
    private final MessagesTable.BindData a;
    private final MessagesTable.BindData b;
    private final engw c;
    private final eshh d;

    public cdsh(MessagesTable.BindData bindData, MessagesTable.BindData bindData2, engw engwVar, eshh eshhVar) {
        this.a = bindData;
        this.b = bindData2;
        this.c = engwVar;
        this.d = eshhVar;
    }

    @Override // defpackage.cdvn
    public final MessagesTable.BindData a() {
        return this.a;
    }

    @Override // defpackage.cdvn
    public final MessagesTable.BindData b() {
        return this.b;
    }

    @Override // defpackage.cdvn
    public final engw c() {
        return this.c;
    }

    @Override // defpackage.cdvn
    public final eshh d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdvn) {
            cdvn cdvnVar = (cdvn) obj;
            if (this.a.equals(cdvnVar.a()) && this.b.equals(cdvnVar.b()) && enkr.h(this.c, cdvnVar.c()) && this.d.equals(cdvnVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        eshh eshhVar = this.d;
        engw engwVar = this.c;
        MessagesTable.BindData bindData = this.b;
        return "MessageToOverwrite{duplicateMessageInBugleDb=" + this.a.toString() + ", duplicateMessageInCms=" + bindData.toString() + ", duplicatePartsInCms=" + engwVar.toString() + ", duplicateAdditionalFieldsInCms=" + eshhVar.toString() + "}";
    }
}
