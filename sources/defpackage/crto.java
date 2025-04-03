package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crto extends crzp {
    private final MessageCoreData a;
    private final ParticipantsTable.BindData b;
    private final ParticipantsTable.BindData c;
    private final bseh d;
    private final bton e;
    private final engw f;
    private final engw g;
    private final enhk h;
    private final engw i;

    public crto(MessageCoreData messageCoreData, ParticipantsTable.BindData bindData, ParticipantsTable.BindData bindData2, bseh bsehVar, bton btonVar, engw engwVar, engw engwVar2, enhk enhkVar, engw engwVar3) {
        this.a = messageCoreData;
        this.b = bindData;
        this.c = bindData2;
        this.d = bsehVar;
        this.e = btonVar;
        this.f = engwVar;
        this.g = engwVar2;
        this.h = enhkVar;
        this.i = engwVar3;
    }

    @Override // defpackage.crzp
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.crzp
    public final bseh b() {
        return this.d;
    }

    @Override // defpackage.crzp
    public final bton c() {
        return this.e;
    }

    @Override // defpackage.crzp
    public final ParticipantsTable.BindData d() {
        return this.c;
    }

    @Override // defpackage.crzp
    public final ParticipantsTable.BindData e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ParticipantsTable.BindData bindData;
        ParticipantsTable.BindData bindData2;
        bseh bsehVar;
        bton btonVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof crzp) {
            crzp crzpVar = (crzp) obj;
            if (this.a.equals(crzpVar.a()) && ((bindData = this.b) != null ? bindData.equals(crzpVar.e()) : crzpVar.e() == null) && ((bindData2 = this.c) != null ? bindData2.equals(crzpVar.d()) : crzpVar.d() == null) && ((bsehVar = this.d) != null ? bsehVar.equals(crzpVar.b()) : crzpVar.b() == null) && ((btonVar = this.e) != null ? btonVar.equals(crzpVar.c()) : crzpVar.c() == null) && enkr.h(this.f, crzpVar.f()) && enkr.h(this.g, crzpVar.h()) && this.h.equals(crzpVar.i()) && enkr.h(this.i, crzpVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.crzp
    public final engw f() {
        return this.f;
    }

    @Override // defpackage.crzp
    public final engw g() {
        return this.i;
    }

    @Override // defpackage.crzp
    public final engw h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        ParticipantsTable.BindData bindData = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (bindData == null ? 0 : bindData.hashCode())) * 1000003;
        ParticipantsTable.BindData bindData2 = this.c;
        int hashCode3 = (hashCode2 ^ (bindData2 == null ? 0 : bindData2.hashCode())) * 1000003;
        bseh bsehVar = this.d;
        int hashCode4 = (hashCode3 ^ (bsehVar == null ? 0 : bsehVar.hashCode())) * 1000003;
        bton btonVar = this.e;
        return ((((((((hashCode4 ^ (btonVar != null ? btonVar.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.crzp
    public final enhk i() {
        return this.h;
    }

    public final String toString() {
        engw engwVar = this.i;
        enhk enhkVar = this.h;
        engw engwVar2 = this.g;
        engw engwVar3 = this.f;
        bton btonVar = this.e;
        bseh bsehVar = this.d;
        ParticipantsTable.BindData bindData = this.c;
        ParticipantsTable.BindData bindData2 = this.b;
        return "CmsMessageObjectData{message=" + this.a.toString() + ", senderParticipant=" + String.valueOf(bindData2) + ", selfParticipant=" + String.valueOf(bindData) + ", conversation=" + String.valueOf(bsehVar) + ", linkPreview=" + String.valueOf(btonVar) + ", conversationSuggestions=" + engwVar3.toString() + ", spamSources=" + engwVar2.toString() + ", cmsData=" + enhkVar.toString() + ", messageAnnotations=" + engwVar.toString() + "}";
    }
}
