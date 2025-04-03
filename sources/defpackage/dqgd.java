package defpackage;

import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqgd extends vk {
    public final ffix a;
    public ffji d;
    private final dqdb e;
    private final ffji f;

    public dqgd(dqdb dqdbVar, ffix ffixVar, ffji ffjiVar) {
        this.e = dqdbVar;
        this.a = ffixVar;
        this.f = ffjiVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return 1;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return 3;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.folders_button, viewGroup, false);
        inflate.getClass();
        return new dqgc(this, inflate);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        dqgc dqgcVar = (dqgc) wrVar;
        dqgcVar.getClass();
        Size a = this.e.a(3);
        final dqgd dqgdVar = dqgcVar.t;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: dqgb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = dqgc.u;
                dqgd.this.a.invoke();
            }
        };
        MaterialButton materialButton = dqgcVar.s;
        materialButton.setOnClickListener(onClickListener);
        ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = a != null ? a.getWidth() : -1;
        layoutParams.height = a != null ? a.getHeight() : -2;
        materialButton.setLayoutParams(layoutParams);
        int i2 = (a != null ? a.getWidth() : 0) > (a != null ? a.getHeight() : 0) ? 2 : 32;
        if (materialButton.f != i2) {
            materialButton.f = i2;
            materialButton.k(materialButton.getMeasuredWidth(), materialButton.getMeasuredHeight());
        }
        ffji ffjiVar = dqgdVar.d;
        if (ffjiVar != null) {
            ffjiVar.invoke(dqgcVar.s);
        }
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void i(wr wrVar) {
        ((dqgc) wrVar).getClass();
        this.f.invoke(true);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void j(wr wrVar) {
        ((dqgc) wrVar).getClass();
        this.f.invoke(false);
    }
}
