package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvkk extends cvkp {
    public final MessageCoreData a;
    public final Uri b;
    public final int c;
    private final engw d;

    public cvkk(MessageCoreData messageCoreData, Uri uri, int i, engw engwVar) {
        this.a = messageCoreData;
        this.b = uri;
        this.c = i;
        this.d = engwVar;
    }

    @Override // defpackage.cvkp
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cvkp
    public final Uri b() {
        return this.b;
    }

    @Override // defpackage.cvkp
    public final MessageCoreData c() {
        return this.a;
    }

    @Override // defpackage.cvkp
    public final engw d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvkp) {
            cvkp cvkpVar = (cvkp) obj;
            if (this.a.equals(cvkpVar.c()) && this.b.equals(cvkpVar.b()) && this.c == cvkpVar.a() && enkr.h(this.d, cvkpVar.d())) {
                cvkpVar.e();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        engw engwVar = this.d;
        Uri uri = this.b;
        return "SendMmsMessageRequest{messageCoreData=" + this.a.toString() + ", messageUri=" + uri.toString() + ", subId=" + this.c + ", recipients=" + engwVar.toString() + ", isRetry=false}";
    }

    @Override // defpackage.cvkp
    public final void e() {
    }
}
