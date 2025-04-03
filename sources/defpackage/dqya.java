package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqya extends dqwt {
    public final GridLayoutManager h;
    private final dqwo i;

    public dqya(Context context, int i, ffji ffjiVar, GridLayoutManager gridLayoutManager, ffjm ffjmVar, ffji ffjiVar2) {
        super(context, i, ffjiVar);
        this.h = gridLayoutManager;
        dqxz dqxzVar = new dqxz(this, ffjmVar, ffjiVar2);
        this.i = dqxzVar;
        RecyclerView recyclerView = (RecyclerView) FrameLayout.inflate(context, R.layout.rv_only_emoji_set_view, this).findViewById(R.id.rv_only_recycler_view);
        recyclerView.am(dqxzVar);
        recyclerView.ap(gridLayoutManager);
    }

    @Override // defpackage.dqwt
    public final dqwo d() {
        return this.i;
    }
}
