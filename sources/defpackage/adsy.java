package defpackage;

import android.graphics.Bitmap;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsy extends adtb {
    public final engw a;
    public final adul b;
    public final Bitmap c;
    public final enhk d;
    public final Optional e;
    private final engw f;

    public adsy(engw engwVar, engw engwVar2, adul adulVar, Bitmap bitmap, enhk enhkVar, Optional optional) {
        this.a = engwVar;
        this.f = engwVar2;
        this.b = adulVar;
        this.c = bitmap;
        this.d = enhkVar;
        this.e = optional;
    }

    @Override // defpackage.adtb
    public final Bitmap a() {
        return this.c;
    }

    @Override // defpackage.adtb
    public final adul b() {
        return this.b;
    }

    @Override // defpackage.adtb
    public final engw c() {
        return this.a;
    }

    @Override // defpackage.adtb
    public final engw d() {
        return this.f;
    }

    @Override // defpackage.adtb
    public final enhk e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adtb) {
            adtb adtbVar = (adtb) obj;
            if (enkr.h(this.a, adtbVar.c()) && enkr.h(this.f, adtbVar.d()) && this.b.equals(adtbVar.b()) && ((bitmap = this.c) != null ? bitmap.equals(adtbVar.a()) : adtbVar.a() == null) && ennc.m(this.d, adtbVar.e()) && this.e.equals(adtbVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adtb
    public final Optional f() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b.hashCode();
        Bitmap bitmap = this.c;
        return (((((hashCode * 1000003) ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        enhk enhkVar = this.d;
        Bitmap bitmap = this.c;
        adul adulVar = this.b;
        engw engwVar = this.f;
        return "FeedbackActivityLaunchData{feedbackDataList=" + String.valueOf(this.a) + ", unselectedFeedbackDataList=" + String.valueOf(engwVar) + ", consentData=" + adulVar.toString() + ", screenshot=" + String.valueOf(bitmap) + ", extraPsd=" + String.valueOf(enhkVar) + ", throwable=" + String.valueOf(optional) + "}";
    }
}
