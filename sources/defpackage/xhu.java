package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhu {
    public final String a;
    public final List b;
    public final String c;
    public final boolean d;
    public final MessageId e;
    public final EditingData f;
    public final Instant g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public xhu() {
        this(null, null, null, false, null, null, null, false, 0, false, 1023);
    }

    public static /* synthetic */ xhu c(xhu xhuVar, String str, List list, String str2, boolean z, MessageId messageId, Instant instant, boolean z2, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = xhuVar.a;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            list = xhuVar.b;
        }
        List list2 = list;
        String str4 = (i2 & 4) != 0 ? xhuVar.c : str2;
        boolean z3 = (i2 & 8) != 0 ? xhuVar.d : z;
        MessageId messageId2 = (i2 & 16) != 0 ? xhuVar.e : messageId;
        EditingData editingData = (i2 & 32) != 0 ? xhuVar.f : null;
        Instant instant2 = (i2 & 64) != 0 ? xhuVar.g : instant;
        boolean z4 = (i2 & 128) != 0 ? xhuVar.h : z2;
        int i3 = (i2 & 256) != 0 ? xhuVar.j : i;
        boolean z5 = xhuVar.i;
        list2.getClass();
        if (i3 != 0) {
            return new xhu(str3, list2, str4, z3, messageId2, editingData, instant2, z4, i3, z5);
        }
        throw null;
    }

    public final boolean a() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean a = atdm.a();
        return (!a ? !((str = this.a) == null || str.length() == 0) : !((str4 = this.a) == null || ffpc.J(str4))) || !this.b.isEmpty() || (!a ? !((str2 = this.c) == null || str2.length() == 0) : !((str3 = this.c) == null || ffpc.J(str3))) || this.d || this.e != null;
    }

    public final boolean b() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean a = atdm.a();
        return (!a ? !((str = this.a) == null || str.length() == 0) : !((str4 = this.a) == null || ffpc.J(str4))) || !this.b.isEmpty() || (!a ? !((str2 = this.c) == null || str2.length() == 0) : !((str3 = this.c) == null || ffpc.J(str3)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhu)) {
            return false;
        }
        xhu xhuVar = (xhu) obj;
        return ffkj.e(this.a, xhuVar.a) && ffkj.e(this.b, xhuVar.b) && ffkj.e(this.c, xhuVar.c) && this.d == xhuVar.d && ffkj.e(this.e, xhuVar.e) && ffkj.e(this.f, xhuVar.f) && ffkj.e(this.g, xhuVar.g) && this.h == xhuVar.h && this.j == xhuVar.j && this.i == xhuVar.i;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
        String str2 = this.c;
        int hashCode2 = ((((hashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + xhr.a(this.d)) * 31;
        MessageId messageId = this.e;
        int hashCode3 = (hashCode2 + (messageId == null ? 0 : messageId.hashCode())) * 31;
        EditingData editingData = this.f;
        int hashCode4 = (hashCode3 + (editingData == null ? 0 : editingData.hashCode())) * 31;
        Instant instant = this.g;
        return ((((((hashCode4 + (instant != null ? instant.hashCode() : 0)) * 31) + xhr.a(this.h)) * 31) + this.j) * 31) + xhr.a(this.i);
    }

    public final String toString() {
        String str = this.a;
        CharSequence c = str != null ? cskw.c(str) : null;
        List list = this.b;
        String str2 = this.c;
        CharSequence c2 = str2 != null ? cskw.c(str2) : null;
        boolean z = this.d;
        MessageId messageId = this.e;
        EditingData editingData = this.f;
        return "DraftData(text=" + ((Object) c) + ", attachments=" + list + ", subject=" + ((Object) c2) + ", isUrgent=" + z + ", replyToMessageId=" + messageId + ", editingData=" + (editingData != null ? editingData.toString() : null) + ", scheduledTime=" + this.g + ", isEncrypted=" + this.h + ", source=" + ((Object) xht.a(this.j)) + ")";
    }

    public xhu(String str, List list, String str2, boolean z, MessageId messageId, EditingData editingData, Instant instant, boolean z2, int i, boolean z3) {
        list.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = z;
        this.e = messageId;
        this.f = editingData;
        this.g = instant;
        this.h = z2;
        this.j = i;
        this.i = z3;
    }

    public /* synthetic */ xhu(String str, List list, String str2, boolean z, MessageId messageId, EditingData editingData, Instant instant, boolean z2, int i, boolean z3, int i2) {
        this(1 != (i2 & 1) ? str : null, (i2 & 2) != 0 ? ffel.a : list, (i2 & 4) != 0 ? null : str2, ((i2 & 8) == 0) & z, (i2 & 16) != 0 ? null : messageId, (i2 & 32) != 0 ? null : editingData, (i2 & 64) != 0 ? null : instant, ((i2 & 128) == 0) & z2, (i2 & 256) != 0 ? 1 : i, ((i2 & 512) == 0) & z3);
    }
}
