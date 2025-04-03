package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsw extends cmtd {
    public final MessageIdType a;
    public final bdhg b;
    public final cmtb c;

    public cmsw(MessageIdType messageIdType, bdhg bdhgVar, cmtb cmtbVar) {
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        if (bdhgVar == null) {
            throw new NullPointerException("Null rcsMessageId");
        }
        this.b = bdhgVar;
        this.c = cmtbVar;
    }

    @Override // defpackage.cmtd
    public final MessageIdType a() {
        return this.a;
    }

    @Override // defpackage.cmtd
    public final bdhg b() {
        return this.b;
    }

    @Override // defpackage.cmtd
    public final cmtb c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmtd) {
            cmtd cmtdVar = (cmtd) obj;
            if (this.a.equals(cmtdVar.a()) && this.b.equals(cmtdVar.b()) && this.c.equals(cmtdVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        cmtb cmtbVar = this.c;
        bdhg bdhgVar = this.b;
        return "ReactedMessageData{messageId=" + this.a.toString() + ", rcsMessageId=" + bdhgVar.toString() + ", reactedMessageContent=" + cmtbVar.toString() + "}";
    }
}
