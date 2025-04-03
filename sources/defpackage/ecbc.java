package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecbc extends ecbn {
    public final emxc a;
    public final emxc b;
    public final View c;
    public final PopupWindow.OnDismissListener d;
    public final ebkg e;

    public ecbc(emxc emxcVar, emxc emxcVar2, View view, PopupWindow.OnDismissListener onDismissListener, ebkg ebkgVar) {
        this.a = emxcVar;
        this.b = emxcVar2;
        this.c = view;
        this.d = onDismissListener;
        this.e = ebkgVar;
    }

    @Override // defpackage.ecbn
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ecbn
    public final PopupWindow.OnDismissListener b() {
        return this.d;
    }

    @Override // defpackage.ecbn
    public final emxc c() {
        return this.a;
    }

    @Override // defpackage.ecbn
    public final emxc d() {
        return this.b;
    }

    @Override // defpackage.ecbn
    public final ebkg e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecbn) {
            ecbn ecbnVar = (ecbn) obj;
            if (this.a.equals(ecbnVar.c()) && this.b.equals(ecbnVar.d()) && this.c.equals(ecbnVar.a()) && this.d.equals(ecbnVar.b())) {
                ecbnVar.f();
                if (this.e.equals(ecbnVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        ebkg ebkgVar = this.e;
        PopupWindow.OnDismissListener onDismissListener = this.d;
        View view = this.c;
        emxc emxcVar = this.b;
        return "TooltipModel{backgroundColor=" + this.a.toString() + ", scrimColor=" + emxcVar.toString() + ", contentView=" + view.toString() + ", dismissListener=" + onDismissListener.toString() + ", placement=BELOW, readyListener=" + ebkgVar.toString() + "}";
    }

    @Override // defpackage.ecbn
    public final void f() {
    }
}
