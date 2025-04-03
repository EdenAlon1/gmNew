package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amfp extends amkz {
    private final ConversationId a;
    private final String b;
    private final boolean c;
    private final String d;
    private final int e;
    private final Uri f;
    private final alxm g;
    private final Instant h;

    public amfp(ConversationId conversationId, String str, boolean z, String str2, int i, Uri uri, alxm alxmVar, Instant instant) {
        this.a = conversationId;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = i;
        this.f = uri;
        this.g = alxmVar;
        this.h = instant;
    }

    @Override // defpackage.amkz, defpackage.alxn
    public final int a() {
        return this.e;
    }

    @Override // defpackage.amkz, defpackage.alxn
    public final Uri b() {
        return this.f;
    }

    @Override // defpackage.alxn
    public final ConversationId c() {
        return this.a;
    }

    @Override // defpackage.amkz, defpackage.alxn
    public final String d() {
        return this.d;
    }

    @Override // defpackage.amkz, defpackage.alxn
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof amkz) {
            amkz amkzVar = (amkz) obj;
            if (this.a.equals(amkzVar.c()) && this.b.equals(amkzVar.e()) && this.c == amkzVar.h() && this.d.equals(amkzVar.d()) && this.e == amkzVar.a() && ((uri = this.f) != null ? uri.equals(amkzVar.b()) : amkzVar.b() == null)) {
                amkzVar.i();
                alxm alxmVar = this.g;
                if (alxmVar != null ? alxmVar.equals(amkzVar.f()) : amkzVar.f() == null) {
                    if (this.h.equals(amkzVar.g())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.amkz
    public final alxm f() {
        return this.g;
    }

    @Override // defpackage.amkz
    public final Instant g() {
        return this.h;
    }

    @Override // defpackage.amkz
    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
        Uri uri = this.f;
        int hashCode2 = uri == null ? 0 : uri.hashCode();
        int i = ((hashCode * 1000003) ^ this.e) * 1000003;
        alxm alxmVar = this.g;
        return ((((i ^ hashCode2) * (-721379959)) ^ (alxmVar != null ? alxmVar.hashCode() : 0)) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        Instant instant = this.h;
        alxm alxmVar = this.g;
        Uri uri = this.f;
        return "DefaultConversationSummary{conversationId=" + this.a.toString() + ", name=" + this.b + ", isUnread=" + this.c + ", latestMessageSnippet=" + this.d + ", recipientCount=" + this.e + ", conversationAvatarUri=" + String.valueOf(uri) + ", messageSnippet=null, draftSnippet=" + String.valueOf(alxmVar) + ", sortTime=" + instant.toString() + "}";
    }

    @Override // defpackage.amkz
    public final void i() {
    }
}
