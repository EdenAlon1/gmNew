package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebeb extends ebfd {
    public LinearProgressIndicator y;
    public View z;

    public ebeb(ViewGroup viewGroup, Context context, ebvw ebvwVar) {
        super(viewGroup, context, ebvwVar);
    }

    @Override // defpackage.ebfd
    protected final View D(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.s).inflate(R.layout.og_progress_card_content, viewGroup);
        this.z = inflate;
        this.y = (LinearProgressIndicator) inflate.findViewById(R.id.og_card_progress_indicator);
        Context context = this.s;
        LinearProgressIndicator linearProgressIndicator = this.y;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.progress_bar_round_corners);
        ehlc ehlcVar = linearProgressIndicator.a;
        if (ehlcVar.b != dimensionPixelSize) {
            ehlcVar.b = Math.round(Math.min(dimensionPixelSize, ehlcVar.a / 2.0f));
            linearProgressIndicator.invalidate();
        }
        ((ehmk) linearProgressIndicator.a).a();
        linearProgressIndicator.invalidate();
        LinearProgressIndicator linearProgressIndicator2 = this.y;
        ehlc ehlcVar2 = linearProgressIndicator2.a;
        if (ehlcVar2.g != 0) {
            ehlcVar2.g = 0;
            ehlcVar2.a();
            linearProgressIndicator2.invalidate();
        }
        LinearProgressIndicator linearProgressIndicator3 = this.y;
        ehmk ehmkVar = (ehmk) linearProgressIndicator3.a;
        if (ehmkVar.p != 0) {
            ehmkVar.p = Math.min(0, ehmkVar.a);
            ((ehmk) linearProgressIndicator3.a).a();
            linearProgressIndicator3.invalidate();
        }
        return this.z;
    }

    @Override // defpackage.ebfd, defpackage.ebdm
    protected final void E(lkr lkrVar) {
        super.E(lkrVar);
        ((ebdz) this.x).getClass();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ebfd
    /* renamed from: G, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void H(lkr lkrVar, ebdz ebdzVar) {
        super.H(lkrVar, ebdzVar);
        throw null;
    }
}
