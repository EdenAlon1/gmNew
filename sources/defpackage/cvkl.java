package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvkl extends cvkq {
    public final MessageCoreData a;
    public final Uri b;
    public final int c;
    public final aoku d;
    public final String e;

    public cvkl(MessageCoreData messageCoreData, Uri uri, int i, aoku aokuVar, String str) {
        this.a = messageCoreData;
        this.b = uri;
        this.c = i;
        this.d = aokuVar;
        this.e = str;
    }

    @Override // defpackage.cvkq
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cvkq
    public final Uri b() {
        return this.b;
    }

    @Override // defpackage.cvkq
    public final aoku c() {
        return this.d;
    }

    @Override // defpackage.cvkq
    public final MessageCoreData d() {
        return this.a;
    }

    @Override // defpackage.cvkq
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvkq) {
            cvkq cvkqVar = (cvkq) obj;
            if (this.a.equals(cvkqVar.d()) && this.b.equals(cvkqVar.b()) && this.c == cvkqVar.a() && this.d.equals(cvkqVar.c()) && ((str = this.e) != null ? str.equals(cvkqVar.e()) : cvkqVar.e() == null)) {
                cvkqVar.f();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
        String str = this.e;
        return (((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "SendSmsMessageRequest{messageCoreData=" + this.a.toString() + ", messageUri=" + this.b.toString() + ", subId=" + this.c + ", recipient=" + ((aoks) this.d).o() + ", smsServiceCenter=" + this.e + ", isRetry=false}";
    }

    @Override // defpackage.cvkq
    public final void f() {
    }
}
