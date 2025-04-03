package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class becn extends bgmo {
    public final ConversationIdType a;
    public final engw b;

    public becn(ConversationIdType conversationIdType, engw engwVar) {
        this.a = conversationIdType;
        this.b = engwVar;
    }

    @Override // defpackage.bgmo
    public final ConversationIdType a() {
        return this.a;
    }

    @Override // defpackage.bgmo
    public final engw b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bgmo) {
            bgmo bgmoVar = (bgmo) obj;
            bgmoVar.g();
            bgmoVar.i();
            bgmoVar.k();
            bgmoVar.h();
            bgmoVar.j();
            bgmoVar.e();
            bgmoVar.f();
            if (this.a.equals(bgmoVar.a()) && enkr.h(this.b, bgmoVar.b())) {
                bgmoVar.d();
                bgmoVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 798697306) * 1000003) ^ this.b.hashCode()) * (-721379959);
    }

    public final String toString() {
        engw engwVar = this.b;
        return "ConversationListQueryBuilder{whereArchived=null, whereNotArchived=null, whereSpam=null, whereCloudSync=null, whereNotCloudSync=null, whereActiveRcsGroup=null, whereApprovedByParent=false, conversationId=" + this.a.toString() + ", conversationIds=" + engwVar.toString() + ", limit=null, additionalPredicate=null}";
    }

    @Override // defpackage.bgmo
    public final void c() {
    }

    @Override // defpackage.bgmo
    public final void d() {
    }

    @Override // defpackage.bgmo
    public final void e() {
    }

    @Override // defpackage.bgmo
    public final void f() {
    }

    @Override // defpackage.bgmo
    public final void g() {
    }

    @Override // defpackage.bgmo
    public final void h() {
    }

    @Override // defpackage.bgmo
    public final void i() {
    }

    @Override // defpackage.bgmo
    public final void j() {
    }

    @Override // defpackage.bgmo
    public final void k() {
    }
}
