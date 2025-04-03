package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vzt extends vk {
    public String a;
    final /* synthetic */ vzn d;
    private final boolean e;

    public vzt(vzn vznVar, boolean z) {
        this.d = vznVar;
        this.e = z;
    }

    @Override // defpackage.vk
    public final int a() {
        return m() ? 1 : 0;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return R.layout.group_name;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        return new vzs(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        vzs vzsVar = (vzs) wrVar;
        vzsVar.t.setText(this.a);
        vzn vznVar = this.d;
        if (vznVar.B && !this.e) {
            vzsVar.u.setVisibility(8);
            return;
        }
        vznVar.x.G();
        vzsVar.s.setOnClickListener(new elay((elbx) this.d.t.b(), "GroupNameViewHolder root onClickListener", new View.OnClickListener() { // from class: vzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }));
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return 2131624365L;
    }

    final boolean m() {
        return this.a != null;
    }
}
