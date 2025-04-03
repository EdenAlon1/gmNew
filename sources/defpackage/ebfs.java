package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebfs extends ebfp {
    public final int a;
    public final Drawable b;
    public final int c;
    public final String d;
    public final int e;
    public final View.OnClickListener f;
    public final ebfq g;
    public final lld h;
    public final boolean i;
    public final ebfm j;
    public final emxc k;
    public final emxc l;

    public ebfs(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, ebfq ebfqVar, lld lldVar, boolean z, ebfm ebfmVar, emxc emxcVar, emxc emxcVar2) {
        this.a = i;
        this.b = drawable;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = onClickListener;
        this.g = ebfqVar;
        this.h = lldVar;
        this.i = z;
        this.j = ebfmVar;
        this.k = emxcVar;
        this.l = emxcVar2;
    }

    @Override // defpackage.ebfp
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ebfp
    public final int b() {
        return this.a;
    }

    @Override // defpackage.ebfp
    public final int c() {
        return this.e;
    }

    @Override // defpackage.ebfp
    public final Drawable d() {
        return this.b;
    }

    @Override // defpackage.ebfp
    public final View.OnClickListener e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        ebfq ebfqVar;
        lld lldVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebfp) {
            ebfp ebfpVar = (ebfp) obj;
            if (this.a == ebfpVar.b() && ((drawable = this.b) != null ? drawable.equals(ebfpVar.d()) : ebfpVar.d() == null) && this.c == ebfpVar.a() && this.d.equals(ebfpVar.n()) && this.e == ebfpVar.c() && this.f.equals(ebfpVar.e()) && ((ebfqVar = this.g) != null ? ebfqVar.equals(ebfpVar.k()) : ebfpVar.k() == null) && ((lldVar = this.h) != null ? lldVar.equals(ebfpVar.f()) : ebfpVar.f() == null)) {
                ebfpVar.p();
                if (this.i == ebfpVar.o() && this.j.equals(ebfpVar.g()) && this.k.equals(ebfpVar.l()) && this.l.equals(ebfpVar.m())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ebfp
    public final lld f() {
        return this.h;
    }

    @Override // defpackage.ebfp
    public final ebfm g() {
        return this.j;
    }

    public final int hashCode() {
        Drawable drawable = this.b;
        int hashCode = (((((((((drawable == null ? 0 : drawable.hashCode()) ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
        ebfq ebfqVar = this.g;
        int hashCode2 = ((hashCode * 1000003) ^ (ebfqVar == null ? 0 : ebfqVar.hashCode())) * 1000003;
        lld lldVar = this.h;
        return ((((((((hashCode2 ^ (lldVar != null ? lldVar.hashCode() : 0)) * (-721379959)) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ 2040732332;
    }

    @Override // defpackage.ebfp
    public final ebfn i() {
        return new ebfr(this);
    }

    @Override // defpackage.ebfp
    public final ebfq k() {
        return this.g;
    }

    @Override // defpackage.ebfp
    public final emxc l() {
        return this.k;
    }

    @Override // defpackage.ebfp
    public final emxc m() {
        return this.l;
    }

    @Override // defpackage.ebfp
    public final String n() {
        return this.d;
    }

    @Override // defpackage.ebfp
    public final boolean o() {
        return this.i;
    }

    public final String toString() {
        emxc emxcVar = this.l;
        emxc emxcVar2 = this.k;
        ebfm ebfmVar = this.j;
        lld lldVar = this.h;
        ebfq ebfqVar = this.g;
        View.OnClickListener onClickListener = this.f;
        return "ActionSpec{id=" + this.a + ", icon=" + String.valueOf(this.b) + ", iconResId=" + this.c + ", label=" + this.d + ", veId=" + this.e + ", onClickListener=" + onClickListener.toString() + ", visibilityHandler=" + String.valueOf(ebfqVar) + ", trailingTextContentLiveData=" + String.valueOf(lldVar) + ", highlightTextRetriever=null, visibleOnIncognito=" + this.i + ", actionType=" + ebfmVar.toString() + ", availabilityChecker=" + String.valueOf(emxcVar2) + ", customLabelContentDescription=" + String.valueOf(emxcVar) + "}";
    }

    @Override // defpackage.ebfp
    public final void p() {
    }
}
