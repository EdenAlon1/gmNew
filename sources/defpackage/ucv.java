package defpackage;

import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ucv extends ucz {
    private final MessageCoreData a;
    private final bcyk b;
    private final RepliedToDataAdapter c;
    private final int d;

    public ucv(MessageCoreData messageCoreData, bcyk bcykVar, int i, RepliedToDataAdapter repliedToDataAdapter) {
        this.a = messageCoreData;
        this.b = bcykVar;
        this.d = i;
        this.c = repliedToDataAdapter;
    }

    @Override // defpackage.ucz
    public final RepliedToDataAdapter a() {
        return this.c;
    }

    @Override // defpackage.ucz
    public final bcyk b() {
        return this.b;
    }

    @Override // defpackage.ucz
    public final MessageCoreData c() {
        return this.a;
    }

    @Override // defpackage.ucz
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        RepliedToDataAdapter repliedToDataAdapter;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucz) {
            ucz uczVar = (ucz) obj;
            if (this.a.equals(uczVar.c()) && this.b.equals(uczVar.b()) && this.d == uczVar.d() && ((repliedToDataAdapter = this.c) != null ? repliedToDataAdapter.equals(uczVar.a()) : uczVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        RepliedToDataAdapter repliedToDataAdapter = this.c;
        return (((hashCode * 1000003) ^ this.d) * 1000003) ^ (repliedToDataAdapter == null ? 0 : repliedToDataAdapter.hashCode());
    }

    public final String toString() {
        RepliedToDataAdapter repliedToDataAdapter = this.c;
        bcyk bcykVar = this.b;
        return "DraftData{message=" + this.a.toString() + ", conversation=" + bcykVar.toString() + ", source=" + ucy.a(this.d) + ", repliedToDataAdapter=" + String.valueOf(repliedToDataAdapter) + "}";
    }
}
