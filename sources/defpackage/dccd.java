package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dccd extends dbzx {
    public dccd(dccl dcclVar) {
        super(dcclVar, R.dimen.sticker_content_item_size);
    }

    @Override // defpackage.dbzx
    protected final wr F(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new dccb(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_expressive_sticker_item_view, viewGroup, false));
        }
        if (i == 6) {
            return new dccc(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_expressive_sticker_my_stickers_item_view_m2, viewGroup, false));
        }
        throw new IllegalStateException(a.h(i, "Unknown view type "));
    }

    @Override // defpackage.dbzx
    protected final boolean H() {
        return true;
    }

    @Override // defpackage.dbzx
    protected final int m() {
        return R.string.c2o_category_expressive_stickers_overflow_content_description;
    }
}
