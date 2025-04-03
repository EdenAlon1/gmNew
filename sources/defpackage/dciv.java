package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dciv extends dbzx {
    public dciv(dcja dcjaVar) {
        super(dcjaVar, R.dimen.c2o_gif_category_item_height);
    }

    @Override // defpackage.dbzx
    protected final /* bridge */ /* synthetic */ wr F(ViewGroup viewGroup, int i) {
        return new dciu(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_gif_category_item_view, viewGroup, false));
    }

    @Override // defpackage.dbzx
    protected final boolean H() {
        return true;
    }

    @Override // defpackage.dbzx
    protected final int m() {
        return R.string.c2o_gif_hint;
    }
}
