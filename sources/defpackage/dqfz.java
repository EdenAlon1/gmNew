package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqfz extends vk {
    public final ffix a;
    private final dqli d;

    public dqfz(dqli dqliVar, ffix ffixVar) {
        this.d = dqliVar;
        this.a = ffixVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return m() ? 1 : 0;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return 6;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.select_media_permission_request_banner, viewGroup, false);
        inflate.getClass();
        return new dqfy(this, inflate);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        dqfy dqfyVar = (dqfy) wrVar;
        dqfyVar.getClass();
        final dqfz dqfzVar = dqfyVar.t;
        dqfyVar.s.setOnClickListener(new View.OnClickListener() { // from class: dqfx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = dqfy.u;
                dqfz.this.a.invoke();
            }
        });
    }

    public final boolean m() {
        return this.d.d(dqlf.h);
    }
}
