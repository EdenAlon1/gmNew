package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afcs extends agzi {
    public final MessageIdType a;
    public final String b;
    public final Uri c;
    public final String d;
    public final long e;

    public afcs(MessageIdType messageIdType, String str, Uri uri, String str2, long j) {
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        this.b = str;
        this.c = uri;
        this.d = str2;
        this.e = j;
    }

    @Override // defpackage.agzi
    public final long a() {
        return this.e;
    }

    @Override // defpackage.agzi
    public final Uri b() {
        return this.c;
    }

    @Override // defpackage.agzi
    public final MessageIdType c() {
        return this.a;
    }

    @Override // defpackage.agzi
    public final String d() {
        return this.b;
    }

    @Override // defpackage.agzi
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        Uri uri;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agzi) {
            agzi agziVar = (agzi) obj;
            if (this.a.equals(agziVar.c()) && ((str = this.b) != null ? str.equals(agziVar.d()) : agziVar.d() == null) && ((uri = this.c) != null ? uri.equals(agziVar.b()) : agziVar.b() == null) && ((str2 = this.d) != null ? str2.equals(agziVar.e()) : agziVar.e() == null) && this.e == agziVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Uri uri = this.c;
        int hashCode3 = (hashCode2 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        String str2 = this.d;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        long j = this.e;
        return ((hashCode3 ^ hashCode4) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Uri uri = this.c;
        return "SnippetParameters{messageId=" + this.a.toString() + ", previewContentType=" + this.b + ", previewUri=" + String.valueOf(uri) + ", textSnippet=" + this.d + ", sortTimestamp=" + this.e + "}";
    }
}
