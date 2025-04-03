package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.MyStickersContentItemView;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dccl extends dclr {
    public final altk f;
    public final BiConsumer g;
    private final cxqk h;
    private final dccj i;
    private final ekms j;
    private final boolean k;

    public dccl(Context context, altk altkVar, cxqk cxqkVar, dccj dccjVar, AttachmentQueueState attachmentQueueState, dcab dcabVar, ContentGridView contentGridView, int i, BiConsumer biConsumer) {
        super(dccjVar, attachmentQueueState, dcabVar, contentGridView, i);
        this.f = altkVar;
        this.h = cxqkVar;
        this.i = dccjVar;
        this.g = biConsumer;
        this.j = ekmq.a(context).c().q(rig.e()).p(rff.b());
        this.k = ((Boolean) cful.R.e()).booleanValue();
    }

    public static eohh h(eumg eumgVar) {
        int ordinal = eumgVar.ordinal();
        return ordinal != 4 ? ordinal != 12 ? eohh.EXPRESSIVE_STICKER_CHOOSER : eohh.EXPRESSIVE_STICKER_PACK_DETAILS : eohh.EXPRESSIVE_STICKER_GALLERY_SEARCH;
    }

    @Override // defpackage.dbzy
    public final int a() {
        boolean z = this.k;
        return (z ? 1 : 0) + super.a();
    }

    @Override // defpackage.dbzy
    public final int b(int i) {
        return (this.k && i == 0) ? 6 : 1;
    }

    @Override // defpackage.dbzy
    public final long c(int i, int i2) {
        if (i2 == 1) {
            return this.i.b(i - (this.k ? 1 : 0)).o().hashCode();
        }
        if (i2 == 6) {
            return -1L;
        }
        throw new IllegalStateException(a.h(i2, "Unknown view type "));
    }

    @Override // defpackage.dbzy
    public final void d(dcal dcalVar, int i) {
        super.d(dcalVar, i);
        int b = b(i);
        if (b != 1) {
            if (b != 6) {
                throw new IllegalStateException(a.h(b, "Unknown view type "));
            }
            ((MyStickersContentItemView) dcalVar).setOnClickListener(this.h.a(new View.OnClickListener() { // from class: dcck
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dccl.this.g.accept(eptm.FAVORITES, 2);
                }
            }));
            return;
        }
        ExpressiveStickerContentItemView expressiveStickerContentItemView = (ExpressiveStickerContentItemView) dcalVar;
        dccj dccjVar = this.i;
        int i2 = i - (this.k ? 1 : 0);
        ekms ekmsVar = this.j;
        bwwz b2 = dccjVar.b(i2);
        ekmsVar.i(b2.m()).v((ImageView) expressiveStickerContentItemView.findViewById(R.id.sticker_image));
        String str = (String) this.i.e.get(b2.o());
        if (!TextUtils.isEmpty(str)) {
            expressiveStickerContentItemView.setContentDescription(expressiveStickerContentItemView.getContext().getResources().getString(R.string.sticker_content_description, str));
        }
        if (!((Boolean) cful.o.e()).booleanValue()) {
            ExpressiveStickerContentItem expressiveStickerContentItem = new ExpressiveStickerContentItem(b2);
            expressiveStickerContentItemView.g = expressiveStickerContentItem;
            expressiveStickerContentItemView.e(this.A.g(expressiveStickerContentItem), this.A.o(expressiveStickerContentItem));
            return;
        }
        uel uelVar = new uel();
        uelVar.c(b2.n());
        uelVar.e(b2.m());
        uelVar.a = new Size(b2.l(), b2.k());
        uelVar.d(b2.o());
        uelVar.b(eohh.EXPRESSIVE_STICKER_CHOOSER);
        ufg a = uelVar.a();
        expressiveStickerContentItemView.h = a;
        expressiveStickerContentItemView.e(this.A.f(a), this.A.n(a));
    }

    @Override // defpackage.dbzy
    protected final void f(dcal dcalVar, int i) {
        String str;
        ExpressiveStickerContentItemView expressiveStickerContentItemView = (ExpressiveStickerContentItemView) dcalVar;
        boolean z = expressiveStickerContentItemView.k;
        boolean z2 = !z;
        if (((Boolean) cful.o.e()).booleanValue()) {
            ufg ufgVar = (ufg) expressiveStickerContentItemView.h;
            v(ufgVar, z2, i);
            str = ufgVar.a();
        } else {
            ExpressiveStickerContentItem expressiveStickerContentItem = (ExpressiveStickerContentItem) expressiveStickerContentItemView.g;
            w(expressiveStickerContentItem, z2, i);
            str = expressiveStickerContentItem.a;
        }
        if (z) {
            return;
        }
        this.f.w(str, eumg.CLIENT_PICKER_RECENTS);
    }

    @Override // defpackage.dclr
    protected final epts i() {
        return epts.STICKER;
    }

    @Override // defpackage.dclr
    protected final eptu j() {
        return eptu.COLLAPSED;
    }
}
