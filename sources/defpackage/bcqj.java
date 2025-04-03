package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcqj extends bcum {
    private final bseh a;
    private final bctw b;
    private final Optional c;
    private final ParticipantsTable.BindData d;
    private final ParticipantsTable.BindData e;
    private final boolean f;
    private final byyt g;
    private final Optional h;
    private final Optional i;
    private final Optional j;

    public bcqj(bseh bsehVar, bctw bctwVar, Optional optional, ParticipantsTable.BindData bindData, ParticipantsTable.BindData bindData2, boolean z, byyt byytVar, Optional optional2, Optional optional3, Optional optional4) {
        if (bsehVar == null) {
            throw new NullPointerException("Null conversationBindData");
        }
        this.a = bsehVar;
        if (bctwVar == null) {
            throw new NullPointerException("Null conversationParticipantData");
        }
        this.b = bctwVar;
        if (optional == null) {
            throw new NullPointerException("Null e2eeInfoResult");
        }
        this.c = optional;
        if (bindData == null) {
            throw new NullPointerException("Null firstSender");
        }
        this.d = bindData;
        this.e = bindData2;
        this.f = z;
        if (byytVar == null) {
            throw new NullPointerException("Null archiveStatus");
        }
        this.g = byytVar;
        if (optional2 == null) {
            throw new NullPointerException("Null ringtoneTitle");
        }
        this.h = optional2;
        if (optional3 == null) {
            throw new NullPointerException("Null availableSelfIdentities");
        }
        this.i = optional3;
        if (optional4 == null) {
            throw new NullPointerException("Null activeSelfIdentity");
        }
        this.j = optional4;
    }

    @Override // defpackage.bcum
    public final bctw a() {
        return this.b;
    }

    @Override // defpackage.bcum
    public final bseh b() {
        return this.a;
    }

    @Override // defpackage.bcum
    public final ParticipantsTable.BindData c() {
        return this.d;
    }

    @Override // defpackage.bcum
    public final ParticipantsTable.BindData d() {
        return this.e;
    }

    @Override // defpackage.bcum
    public final byyt e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        ParticipantsTable.BindData bindData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcum) {
            bcum bcumVar = (bcum) obj;
            if (this.a.equals(bcumVar.b()) && this.b.equals(bcumVar.a()) && this.c.equals(bcumVar.h()) && this.d.equals(bcumVar.c()) && ((bindData = this.e) != null ? bindData.equals(bcumVar.d()) : bcumVar.d() == null) && this.f == bcumVar.j() && this.g.equals(bcumVar.e()) && this.h.equals(bcumVar.i()) && this.i.equals(bcumVar.g()) && this.j.equals(bcumVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bcum
    public final Optional f() {
        return this.j;
    }

    @Override // defpackage.bcum
    public final Optional g() {
        return this.i;
    }

    @Override // defpackage.bcum
    public final Optional h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        ParticipantsTable.BindData bindData = this.e;
        return (((((((((((hashCode * 1000003) ^ (bindData == null ? 0 : bindData.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.bcum
    public final Optional i() {
        return this.h;
    }

    @Override // defpackage.bcum
    public final boolean j() {
        return this.f;
    }

    public final String toString() {
        Optional optional = this.j;
        Optional optional2 = this.i;
        Optional optional3 = this.h;
        byyt byytVar = this.g;
        ParticipantsTable.BindData bindData = this.e;
        ParticipantsTable.BindData bindData2 = this.d;
        Optional optional4 = this.c;
        bctw bctwVar = this.b;
        return "OptionsListData{conversationBindData=" + this.a.toString() + ", conversationParticipantData=" + bctwVar.toString() + ", e2eeInfoResult=" + optional4.toString() + ", firstSender=" + bindData2.toString() + ", reportableParticipant=" + String.valueOf(bindData) + ", etouffeeCapable=" + this.f + ", archiveStatus=" + byytVar.toString() + ", ringtoneTitle=" + optional3.toString() + ", availableSelfIdentities=" + optional2.toString() + ", activeSelfIdentity=" + optional.toString() + "}";
    }
}
