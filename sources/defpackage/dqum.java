package defpackage;

import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqum extends dquo {
    private final TextView s;

    public dqum(View view) {
        super(view);
        this.s = (TextView) view;
    }

    @Override // defpackage.dquo
    public final void C(dquu dquuVar) {
        dquuVar.getClass();
        dqut dqutVar = (dqut) dquuVar;
        this.s.setText(dqutVar.a);
        this.s.setContentDescription(dqutVar.a);
    }
}
