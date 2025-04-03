package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nur extends wr {
    public final TextView s;
    public final TextView t;
    public final ImageView u;

    public nur(final nva nvaVar, View view) {
        super(view);
        int i = lvf.a;
        this.s = (TextView) view.findViewById(R.id.exo_main_text);
        this.t = (TextView) view.findViewById(R.id.exo_sub_text);
        this.u = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new View.OnClickListener() { // from class: nuq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                nva nvaVar2 = nvaVar;
                int fr = nur.this.fr();
                if (fr == 0) {
                    nup nupVar = nvaVar2.d;
                    View view3 = nvaVar2.s;
                    lti.f(view3);
                    nvaVar2.a(nupVar, view3);
                    return;
                }
                if (fr != 1) {
                    nvaVar2.g.dismiss();
                    return;
                }
                num numVar = nvaVar2.f;
                View view4 = nvaVar2.s;
                lti.f(view4);
                nvaVar2.a(numVar, view4);
            }
        });
    }
}
