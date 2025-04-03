package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebgf extends ebgo {
    public final Drawable a;
    public final int b;
    private final int c;
    private final String d;
    private final int e;
    private final View.OnClickListener f;
    private final ebfq g;
    private final llg h;
    private final emxc i;

    public ebgf(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, ebfq ebfqVar, llg llgVar, emxc emxcVar) {
        this.c = i;
        this.a = drawable;
        this.b = i2;
        this.d = str;
        this.e = i3;
        this.f = onClickListener;
        this.g = ebfqVar;
        this.h = llgVar;
        this.i = emxcVar;
    }

    @Override // defpackage.ebgo
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ebgo
    public final int b() {
        return this.c;
    }

    @Override // defpackage.ebgo
    public final int c() {
        return this.e;
    }

    @Override // defpackage.ebgo
    public final Drawable d() {
        return this.a;
    }

    @Override // defpackage.ebgo
    public final View.OnClickListener e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        ebfq ebfqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebgo) {
            ebgo ebgoVar = (ebgo) obj;
            if (this.c == ebgoVar.b() && ((drawable = this.a) != null ? drawable.equals(ebgoVar.d()) : ebgoVar.d() == null) && this.b == ebgoVar.a() && this.d.equals(ebgoVar.i()) && this.e == ebgoVar.c() && this.f.equals(ebgoVar.e()) && ((ebfqVar = this.g) != null ? ebfqVar.equals(ebgoVar.g()) : ebgoVar.g() == null) && this.h.equals(ebgoVar.f())) {
                ebgoVar.j();
                if (this.i.equals(ebgoVar.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ebgo
    public final llg f() {
        return this.h;
    }

    @Override // defpackage.ebgo
    public final ebfq g() {
        return this.g;
    }

    @Override // defpackage.ebgo
    public final emxc h() {
        return this.i;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int hashCode = (((((((((drawable == null ? 0 : drawable.hashCode()) ^ ((this.c ^ 1000003) * 1000003)) * 1000003) ^ this.b) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
        ebfq ebfqVar = this.g;
        return (((((hashCode * 1000003) ^ (ebfqVar != null ? ebfqVar.hashCode() : 0)) * 1000003) ^ this.h.hashCode()) * (-721379959)) ^ 2040732332;
    }

    @Override // defpackage.ebgo
    public final String i() {
        return this.d;
    }

    public final String toString() {
        return "CustomActionSpec{id=" + this.c + ", icon=" + String.valueOf(this.a) + ", iconResId=" + this.b + ", label=" + this.d + ", veId=" + this.e + ", onClickListener=" + this.f.toString() + ", visibilityHandler=" + String.valueOf(this.g) + ", trailingTextLiveData=" + this.h.toString() + ", highlightTextRetriever=null, availabilityChecker=Optional.absent()}";
    }

    @Override // defpackage.ebgo
    public final void j() {
    }
}
