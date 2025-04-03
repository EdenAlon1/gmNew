package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerItemView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wee extends vk {
    public List a;
    private final ekyo d;

    public wee(ekyo ekyoVar) {
        int i = engw.d;
        this.a = enou.a;
        this.d = ekyoVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return ((enou) this.a).c;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new wed((SimPickerItemView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sim_picker_item_view, viewGroup, false));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        wed wedVar = (wed) wrVar;
        elav a = this.d.a("SimPickerItemAdapter#onBindViewHolder");
        try {
            wef H = wedVar.s.H();
            bcxq bcxqVar = (bcxq) this.a.get(i);
            if (TextUtils.isEmpty(bcxqVar.g())) {
                H.e.setVisibility(8);
            } else {
                H.e.setVisibility(0);
                H.e.setText(bcxqVar.g());
            }
            String f = bcxqVar.f();
            if (TextUtils.isEmpty(f)) {
                H.d.setVisibility(8);
            } else {
                H.d.setVisibility(0);
                H.d.setText(H.a.a(H.g.u(f, bcxqVar.b())));
            }
            H.f.i(bcxqVar.c());
            wde wdeVar = new wde(bcxqVar);
            H.b.b(H.c, wdeVar);
            H.b.b(H.f, wdeVar);
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
