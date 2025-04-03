package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syl extends tak {
    public final taj a;
    public final Runnable b;
    public final ConversationIdType c;
    public final ParticipantsTable.BindData d;
    public final tah e;
    public final tai f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public syl(taj tajVar, int i, Runnable runnable, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, int i2, int i3, tah tahVar, tai taiVar, int i4) {
        this.a = tajVar;
        this.h = i;
        this.b = runnable;
        this.c = conversationIdType;
        this.d = bindData;
        this.i = i2;
        this.j = i3;
        this.e = tahVar;
        this.f = taiVar;
        this.g = i4;
    }

    @Override // defpackage.tak
    public final int a() {
        return this.g;
    }

    @Override // defpackage.tak
    public final tah b() {
        return this.e;
    }

    @Override // defpackage.tak
    public final tai c() {
        return this.f;
    }

    @Override // defpackage.tak
    public final taj d() {
        return this.a;
    }

    @Override // defpackage.tak
    public final ConversationIdType e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        ParticipantsTable.BindData bindData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tak) {
            tak takVar = (tak) obj;
            if (this.a.equals(takVar.d()) && this.h == takVar.h() && this.b.equals(takVar.g()) && this.c.equals(takVar.e()) && ((bindData = this.d) != null ? bindData.equals(takVar.f()) : takVar.f() == null) && this.i == takVar.j() && this.j == takVar.i() && this.e.equals(takVar.b()) && this.f.equals(takVar.c()) && this.g == takVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tak
    public final ParticipantsTable.BindData f() {
        return this.d;
    }

    @Override // defpackage.tak
    public final Runnable g() {
        return this.b;
    }

    @Override // defpackage.tak
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.h) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        ParticipantsTable.BindData bindData = this.d;
        return (((((((((((hashCode * 1000003) ^ (bindData == null ? 0 : bindData.hashCode())) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g;
    }

    @Override // defpackage.tak
    public final int i() {
        return this.j;
    }

    @Override // defpackage.tak
    public final int j() {
        return this.i;
    }

    public final String toString() {
        int i = this.h;
        String obj = this.a.toString();
        String str = i != 1 ? "EXIT_TO_HOME" : "SHOW_UNDO_UX";
        Runnable runnable = this.b;
        ConversationIdType conversationIdType = this.c;
        ParticipantsTable.BindData bindData = this.d;
        int i2 = this.i;
        int i3 = this.j;
        tah tahVar = this.e;
        tai taiVar = this.f;
        int i4 = this.g;
        return "DialogRequest{dialogType=" + obj + ", dialogDoneBehavior=" + str + ", onPositiveAction=" + runnable.toString() + ", conversationId=" + conversationIdType.toString() + ", targetParticipant=" + String.valueOf(bindData) + ", scope=" + erfd.c(i2) + ", entryPoint=" + erfc.b(i3) + ", dialogLoggingSource=" + tahVar.toString() + ", dialogTarget=" + taiVar.toString() + ", anchorViewId=" + i4 + "}";
    }
}
