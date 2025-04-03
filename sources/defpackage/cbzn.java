package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbzn extends ccud {
    private final String a;
    private final MessagesTable.BindData b;
    private final engw c;
    private final Optional d;
    private final bton e;

    public cbzn(String str, MessagesTable.BindData bindData, engw engwVar, Optional optional, bton btonVar) {
        this.a = str;
        this.b = bindData;
        this.c = engwVar;
        this.d = optional;
        this.e = btonVar;
    }

    @Override // defpackage.ccud
    public final bton a() {
        return this.e;
    }

    @Override // defpackage.ccud
    public final MessagesTable.BindData b() {
        return this.b;
    }

    @Override // defpackage.ccud
    public final engw c() {
        return this.c;
    }

    @Override // defpackage.ccud
    public final Optional d() {
        return this.d;
    }

    @Override // defpackage.ccud
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        bton btonVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ccud) {
            ccud ccudVar = (ccud) obj;
            if (this.a.equals(ccudVar.e()) && this.b.equals(ccudVar.b()) && enkr.h(this.c, ccudVar.c()) && this.d.equals(ccudVar.d()) && ((btonVar = this.e) != null ? btonVar.equals(ccudVar.a()) : ccudVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        bton btonVar = this.e;
        return (hashCode * 1000003) ^ (btonVar == null ? 0 : btonVar.hashCode());
    }

    public final String toString() {
        bton btonVar = this.e;
        Optional optional = this.d;
        engw engwVar = this.c;
        return "MessageBulkInsertionContainer{cmsId=" + this.a + ", messagesTableBindData=" + this.b.toString() + ", partsTableBindDataList=" + engwVar.toString() + ", additionalFields=" + String.valueOf(optional) + ", linkPreviewBindData=" + String.valueOf(btonVar) + "}";
    }
}
