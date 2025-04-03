package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efta extends vk {
    private List a;

    @Override // defpackage.vk
    public final int a() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new efsz(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.survey_system_info_item, viewGroup, false));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        efsz efszVar = (efsz) wrVar;
        ksr ksrVar = (ksr) this.a.get(i);
        ((TextView) efszVar.s.findViewById(R.id.survey_system_info_item_key)).setText((CharSequence) ksrVar.a);
        ((TextView) efszVar.s.findViewById(R.id.survey_system_info_item_value)).setText((CharSequence) ksrVar.b);
    }

    public final void m(List list) {
        this.a = list;
        p();
    }
}
