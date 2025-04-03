package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcbq extends dbzx {
    public dcbq(dcbs dcbsVar) {
        super(dcbsVar, R.dimen.emoji_content_item_height);
    }

    @Override // defpackage.dbzx
    protected final wr F(ViewGroup viewGroup, int i) {
        return new dcbp(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_emoji_item_view, viewGroup, false));
    }

    @Override // defpackage.dbzx
    protected final boolean H() {
        return true;
    }

    @Override // defpackage.dbzx
    protected final int m() {
        return R.string.c2o_category_emoji_content_description;
    }
}
