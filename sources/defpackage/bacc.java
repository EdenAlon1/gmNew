package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bacc extends basx {
    private final int a;
    private final ContentValues b;
    private final ParticipantsTable.BindData c;
    private final long d;
    private final ConversationIdType e;
    private final boolean f;
    private final long g;
    private final Uri h;
    private final boolean i;
    private final boolean j;
    private final byyt k;
    private final boolean l;
    private final byzi m;
    private final long n;
    private final baow o;
    private final boolean p;
    private final UUID q;

    public bacc(int i, ContentValues contentValues, ParticipantsTable.BindData bindData, long j, ConversationIdType conversationIdType, boolean z, long j2, Uri uri, boolean z2, boolean z3, byyt byytVar, boolean z4, byzi byziVar, long j3, baow baowVar, boolean z5, UUID uuid) {
        this.a = i;
        if (contentValues == null) {
            throw new NullPointerException("Null getMessageValues");
        }
        this.b = contentValues;
        this.c = bindData;
        this.d = j;
        this.e = conversationIdType;
        this.f = z;
        this.g = j2;
        this.h = uri;
        this.i = z2;
        this.j = z3;
        if (byytVar == null) {
            throw new NullPointerException("Null archiveStatus");
        }
        this.k = byytVar;
        this.l = z4;
        if (byziVar == null) {
            throw new NullPointerException("Null getVerificationStatus");
        }
        this.m = byziVar;
        this.n = j3;
        this.o = baowVar;
        this.p = z5;
        this.q = uuid;
    }

    @Override // defpackage.basx
    public final int a() {
        return this.a;
    }

    @Override // defpackage.basx
    public final long b() {
        return this.n;
    }

    @Override // defpackage.basx
    public final long c() {
        return this.g;
    }

    @Override // defpackage.basx
    public final long d() {
        return this.d;
    }

    @Override // defpackage.basx
    public final ContentValues e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        UUID uuid;
        if (obj == this) {
            return true;
        }
        if (obj instanceof basx) {
            basx basxVar = (basx) obj;
            if (this.a == basxVar.a() && this.b.equals(basxVar.e()) && this.c.equals(basxVar.i()) && this.d == basxVar.d() && this.e.equals(basxVar.h()) && this.f == basxVar.n() && this.g == basxVar.c() && ((uri = this.h) != null ? uri.equals(basxVar.f()) : basxVar.f() == null) && this.i == basxVar.o() && this.j == basxVar.p() && this.k.equals(basxVar.j()) && this.l == basxVar.q() && this.m.equals(basxVar.k()) && this.n == basxVar.b() && this.o.equals(basxVar.g()) && this.p == basxVar.m() && ((uuid = this.q) != null ? uuid.equals(basxVar.l()) : basxVar.l() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.basx
    public final Uri f() {
        return this.h;
    }

    @Override // defpackage.basx
    public final baow g() {
        return this.o;
    }

    @Override // defpackage.basx
    public final ConversationIdType h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        int hashCode2 = (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode();
        Uri uri = this.h;
        int hashCode3 = uri == null ? 0 : uri.hashCode();
        long j2 = this.g;
        int hashCode4 = ((((((((((((((((hashCode2 * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ hashCode3) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k.hashCode()) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ this.m.hashCode()) * 1000003;
        long j3 = this.n;
        int hashCode5 = (((((hashCode4 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.o.hashCode()) * 1000003) ^ (true == this.p ? 1231 : 1237)) * 1000003;
        UUID uuid = this.q;
        return hashCode5 ^ (uuid != null ? uuid.hashCode() : 0);
    }

    @Override // defpackage.basx
    public final ParticipantsTable.BindData i() {
        return this.c;
    }

    @Override // defpackage.basx
    public final byyt j() {
        return this.k;
    }

    @Override // defpackage.basx
    public final byzi k() {
        return this.m;
    }

    @Override // defpackage.basx
    public final UUID l() {
        return this.q;
    }

    @Override // defpackage.basx
    public final boolean m() {
        return this.p;
    }

    @Override // defpackage.basx
    public final boolean n() {
        return this.f;
    }

    @Override // defpackage.basx
    public final boolean o() {
        return this.i;
    }

    @Override // defpackage.basx
    public final boolean p() {
        return this.j;
    }

    @Override // defpackage.basx
    public final boolean q() {
        return this.l;
    }

    public final String toString() {
        UUID uuid = this.q;
        baow baowVar = this.o;
        byzi byziVar = this.m;
        byyt byytVar = this.k;
        Uri uri = this.h;
        ConversationIdType conversationIdType = this.e;
        ParticipantsTable.BindData bindData = this.c;
        return "InsertMessageInBugleDbParams{getSubId=" + this.a + ", getMessageValues=" + this.b.toString() + ", getSender=" + bindData.toString() + ", getThreadId=" + this.d + ", getConversationId=" + conversationIdType.toString() + ", isNewConversation=" + this.f + ", getReceivedTime=" + this.g + ", getMessageUri=" + String.valueOf(uri) + ", isNotified=" + this.i + ", isRead=" + this.j + ", archiveStatus=" + byytVar.toString() + ", shouldMessageBeIgnored=" + this.l + ", getVerificationStatus=" + byziVar.toString() + ", getMessageLoggingId=" + this.n + ", getRawSmsMessagingAddress=" + baowVar.toString() + ", isAllowedByParents=" + this.p + ", persistenceId=" + String.valueOf(uuid) + "}";
    }
}
