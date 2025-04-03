package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcav extends dcbc {
    public final ea a;
    public final AttachmentQueueState b;
    public final czgx c;
    public final dbxy d;
    public final bcpw e;
    public final dcbb f;
    public final czgy g;
    public final int h;
    public final ContentGridView i;
    private final dcaf j;

    public dcav(ea eaVar, AttachmentQueueState attachmentQueueState, czgx czgxVar, ContentGridView contentGridView, dbxy dbxyVar, bcpw bcpwVar, dcbb dcbbVar, dcaf dcafVar, czgy czgyVar, int i) {
        this.a = eaVar;
        this.b = attachmentQueueState;
        this.c = czgxVar;
        if (contentGridView == null) {
            throw new NullPointerException("Null contentGridView");
        }
        this.i = contentGridView;
        if (dbxyVar == null) {
            throw new NullPointerException("Null compose2oIntentLauncher");
        }
        this.d = dbxyVar;
        this.e = bcpwVar;
        this.f = dcbbVar;
        this.j = dcafVar;
        this.g = czgyVar;
        this.h = i;
    }

    @Override // defpackage.dcbc
    public final int a() {
        return this.h;
    }

    @Override // defpackage.dcbc
    public final ea b() {
        return this.a;
    }

    @Override // defpackage.dcbc
    public final bcpw c() {
        return this.e;
    }

    @Override // defpackage.dcbc
    public final czgx d() {
        return this.c;
    }

    @Override // defpackage.dcbc
    public final czgy e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        czgx czgxVar;
        dcbb dcbbVar;
        dcaf dcafVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcbc) {
            dcbc dcbcVar = (dcbc) obj;
            if (this.a.equals(dcbcVar.b()) && this.b.equals(dcbcVar.g()) && ((czgxVar = this.c) != null ? czgxVar.equals(dcbcVar.d()) : dcbcVar.d() == null) && this.i.equals(dcbcVar.j()) && this.d.equals(dcbcVar.f()) && this.e.equals(dcbcVar.c()) && ((dcbbVar = this.f) != null ? dcbbVar.equals(dcbcVar.i()) : dcbcVar.i() == null) && ((dcafVar = this.j) != null ? dcafVar.equals(dcbcVar.h()) : dcbcVar.h() == null) && this.g.equals(dcbcVar.e()) && this.h == dcbcVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dcbc
    public final dbxy f() {
        return this.d;
    }

    @Override // defpackage.dcbc
    public final AttachmentQueueState g() {
        return this.b;
    }

    @Override // defpackage.dcbc
    public final dcaf h() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        czgx czgxVar = this.c;
        int hashCode2 = ((((((((hashCode * 1000003) ^ (czgxVar == null ? 0 : czgxVar.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        dcbb dcbbVar = this.f;
        int hashCode3 = (hashCode2 ^ (dcbbVar == null ? 0 : dcbbVar.hashCode())) * 1000003;
        dcaf dcafVar = this.j;
        return ((((hashCode3 ^ (dcafVar != null ? dcafVar.hashCode() : 0)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h;
    }

    @Override // defpackage.dcbc
    public final dcbb i() {
        return this.f;
    }

    @Override // defpackage.dcbc
    public final ContentGridView j() {
        return this.i;
    }

    public final String toString() {
        czgy czgyVar = this.g;
        dcaf dcafVar = this.j;
        dcbb dcbbVar = this.f;
        bcpw bcpwVar = this.e;
        dbxy dbxyVar = this.d;
        ContentGridView contentGridView = this.i;
        czgx czgxVar = this.c;
        AttachmentQueueState attachmentQueueState = this.b;
        return "CategoryParameters{fragment=" + this.a.toString() + ", attachmentQueueState=" + attachmentQueueState.toString() + ", conversationInputBase=" + String.valueOf(czgxVar) + ", contentGridView=" + contentGridView.toString() + ", compose2oIntentLauncher=" + dbxyVar.toString() + ", draftDataModel=" + bcpwVar.toString() + ", categoryOrganizer=" + String.valueOf(dcbbVar) + ", contentCategoryHost=" + String.valueOf(dcafVar) + ", conversationInputHost=" + czgyVar.toString() + ", categoryIndex=" + this.h + "}";
    }
}
