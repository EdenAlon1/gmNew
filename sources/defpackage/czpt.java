package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czpt extends czpz {
    public final boolean a;
    public final String b;
    public final engw c;
    public final int d;
    public final MessageIdType e;

    public czpt(boolean z, String str, engw engwVar, int i, MessageIdType messageIdType) {
        this.a = z;
        this.b = str;
        this.c = engwVar;
        this.d = i;
        if (messageIdType == null) {
            throw new NullPointerException("Null currentMessageId");
        }
        this.e = messageIdType;
    }

    @Override // defpackage.czpz
    public final int a() {
        return this.d;
    }

    @Override // defpackage.czpz
    public final MessageIdType b() {
        return this.e;
    }

    @Override // defpackage.czpz
    public final engw c() {
        return this.c;
    }

    @Override // defpackage.czpz
    public final String d() {
        return this.b;
    }

    @Override // defpackage.czpz
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        String str;
        engw engwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof czpz) {
            czpz czpzVar = (czpz) obj;
            if (this.a == czpzVar.e() && ((str = this.b) != null ? str.equals(czpzVar.d()) : czpzVar.d() == null) && ((engwVar = this.c) != null ? enkr.h(engwVar, czpzVar.c()) : czpzVar.c() == null) && this.d == czpzVar.a() && this.e.equals(czpzVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
        engw engwVar = this.c;
        return (((((hashCode * 1000003) ^ (engwVar != null ? engwVar.hashCode() : 0)) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        MessageIdType messageIdType = this.e;
        return "ConversationSearchData{searching=" + this.a + ", searchQuery=" + this.b + ", matchedMessageIds=" + String.valueOf(this.c) + ", currentPos=" + this.d + ", currentMessageId=" + messageIdType.toString() + "}";
    }
}
