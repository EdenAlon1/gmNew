package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rk implements DialogInterface.OnClickListener, rs {
    iv a;
    final /* synthetic */ rt b;
    private ListAdapter c;
    private CharSequence d;

    public rk(rt rtVar) {
        this.b = rtVar;
    }

    @Override // defpackage.rs
    public final int a() {
        return 0;
    }

    @Override // defpackage.rs
    public final int b() {
        return 0;
    }

    @Override // defpackage.rs
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.rs
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.rs
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.rs
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rs
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rs
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rs
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.rs
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rs
    public final void k(int i, int i2) {
        if (this.c == null) {
            return;
        }
        iu iuVar = new iu(this.b.a);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            iuVar.setTitle(charSequence);
        }
        iuVar.e(this.c, this.b.getSelectedItemPosition(), this);
        iv create = iuVar.create();
        this.a = create;
        ListView d = create.d();
        d.setTextDirection(i);
        d.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.rs
    public final void m() {
        iv ivVar = this.a;
        if (ivVar != null) {
            ivVar.dismiss();
            this.a = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.setSelection(i);
        if (this.b.getOnItemClickListener() != null) {
            this.b.performItemClick(null, i, this.c.getItemId(i));
        }
        m();
    }

    @Override // defpackage.rs
    public final boolean x() {
        iv ivVar = this.a;
        if (ivVar != null) {
            return ivVar.isShowing();
        }
        return false;
    }
}
