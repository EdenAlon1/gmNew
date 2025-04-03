package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehep extends wc {
    final /* synthetic */ ehfh a;
    final /* synthetic */ MaterialButton b;
    final /* synthetic */ ehes c;

    public ehep(ehes ehesVar, ehfh ehfhVar, MaterialButton materialButton) {
        this.a = ehfhVar;
        this.b = materialButton;
        this.c = ehesVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int L = i < 0 ? this.c.b().L() : this.c.b().N();
        this.c.c = this.a.F(L);
        this.b.setText(this.a.F(L).f());
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }
}
