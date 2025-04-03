package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebnm extends ebno {
    public final int a;
    public final Drawable b;
    public final int c;
    public final String d;
    public final int e;
    public final View.OnClickListener f;
    public final emxc g;

    public ebnm(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, emxc emxcVar) {
        this.a = i;
        this.b = drawable;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = onClickListener;
        this.g = emxcVar;
    }

    @Override // defpackage.ebno
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ebno
    public final int b() {
        return this.a;
    }

    @Override // defpackage.ebno
    public final int c() {
        return this.e;
    }

    @Override // defpackage.ebno
    public final Drawable d() {
        return this.b;
    }

    @Override // defpackage.ebno
    public final View.OnClickListener e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebno) {
            ebno ebnoVar = (ebno) obj;
            if (this.a == ebnoVar.b() && ((drawable = this.b) != null ? drawable.equals(ebnoVar.d()) : ebnoVar.d() == null) && this.c == ebnoVar.a() && this.d.equals(ebnoVar.g()) && this.e == ebnoVar.c() && this.f.equals(ebnoVar.e()) && this.g.equals(ebnoVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ebno
    public final emxc f() {
        return this.g;
    }

    @Override // defpackage.ebno
    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        Drawable drawable = this.b;
        return (((((((((((drawable == null ? 0 : drawable.hashCode()) ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "SimpleActionSpec{id=" + this.a + ", icon=" + String.valueOf(this.b) + ", iconResId=" + this.c + ", label=" + this.d + ", veId=" + this.e + ", onClickListener=" + this.f.toString() + ", availabilityChecker=Optional.absent()}";
    }
}
