package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardContent;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo;
import defpackage.bcse;
import defpackage.bcsf;
import defpackage.cgrq;
import defpackage.cqoh;
import defpackage.crjx;
import defpackage.csjy;
import defpackage.czic;
import defpackage.czid;
import defpackage.czor;
import defpackage.czpb;
import defpackage.czpd;
import defpackage.czpj;
import defpackage.czpo;
import defpackage.cztz;
import defpackage.czwk;
import defpackage.dkta;
import defpackage.eohh;
import defpackage.ffbr;
import defpackage.le;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationRichCardView extends czor implements czid, czpj, czpb {
    public bcse g;
    public GeneralPurposeRichCard h;
    public int i;
    public boolean j;
    public RichCardMediaAttachmentView k;
    public RichCardContentContainer l;
    public czic m;
    public crjx n;
    public cgrq o;
    public bcsf p;
    public czpo q;
    public cqoh r;
    public ffbr s;
    private RichCardMediaAttachmentView v;
    private RichCardMediaAttachmentView w;
    private RichCardMediaAttachmentView x;

    public ConversationRichCardView(Context context) {
        super(context, null, 0);
        this.i = 0;
    }

    private static void q(RichCardMediaAttachmentView... richCardMediaAttachmentViewArr) {
        for (RichCardMediaAttachmentView richCardMediaAttachmentView : richCardMediaAttachmentViewArr) {
            richCardMediaAttachmentView.j();
            richCardMediaAttachmentView.setVisibility(8);
        }
    }

    private final void r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            this.k = null;
            q(this.v, this.x, this.w);
            return;
        }
        if (i2 == 1) {
            RichCardMediaAttachmentView richCardMediaAttachmentView = this.v;
            this.k = richCardMediaAttachmentView;
            richCardMediaAttachmentView.setVisibility(0);
            q(this.w, this.x);
            return;
        }
        if (i2 != 2) {
            RichCardMediaAttachmentView richCardMediaAttachmentView2 = this.x;
            this.k = richCardMediaAttachmentView2;
            richCardMediaAttachmentView2.setVisibility(0);
            q(this.v, this.w);
            return;
        }
        RichCardMediaAttachmentView richCardMediaAttachmentView3 = this.w;
        this.k = richCardMediaAttachmentView3;
        richCardMediaAttachmentView3.setVisibility(0);
        q(this.v, this.x);
    }

    @Override // defpackage.czkr
    public final void b() {
        RichCardMediaAttachmentView richCardMediaAttachmentView = this.k;
        if (richCardMediaAttachmentView != null) {
            richCardMediaAttachmentView.j();
        }
    }

    @Override // defpackage.czid
    public final bcse c() {
        return this.g;
    }

    @Override // defpackage.czid
    public final void d(bcse bcseVar, String str, boolean z, boolean z2) {
        MessageIdType u = this.g.u();
        this.g = bcseVar;
        if (bcseVar.u().equals(u)) {
            l(bcseVar);
            return;
        }
        long epochMilli = this.r.f().toEpochMilli();
        List ad = bcseVar.ad();
        this.h = dkta.a(ad) ? null : (GeneralPurposeRichCard) ad.get(0);
        csjy.c("BugleRbmRichCard", "Time to parse/retrieve Rich Card model object from Json: " + (this.r.f().toEpochMilli() - epochMilli));
        k(str);
    }

    @Override // defpackage.czid
    public final void e(Object obj) {
        throw new UnsupportedOperationException("ConversationRichCardView does not support bindPayload().");
    }

    @Override // defpackage.czid
    public final void f(czic czicVar) {
        this.m = czicVar;
    }

    @Override // defpackage.czpj
    public final Uri g() {
        MessagePartCoreData y = this.g.y(this.i);
        if (y == null) {
            return null;
        }
        String V = y.V();
        String[] strArr = le.a;
        if (GeneralPurposeRichCardMediaInfo.SUPPORTED_RICH_CARD_MEDIA_TYPES.contains(V)) {
            return y.t();
        }
        return null;
    }

    @Override // defpackage.czpj
    public final Uri h() {
        MessagePartCoreData x = this.g.x(eohh.RICH_CARD_THUMBNAIL, this.i);
        if (x == null || !le.n(x.V())) {
            return null;
        }
        return x.t();
    }

    @Override // defpackage.czpj
    public final MessagePartCoreData i() {
        return this.g.y(this.i);
    }

    @Override // defpackage.czpj
    public final String j() {
        GeneralPurposeRichCard generalPurposeRichCard = this.h;
        generalPurposeRichCard.getClass();
        GeneralPurposeRichCardContent generalPurposeRichCardContent = generalPurposeRichCard.content;
        generalPurposeRichCardContent.getClass();
        GeneralPurposeRichCardMediaInfo generalPurposeRichCardMediaInfo = generalPurposeRichCardContent.media;
        if (generalPurposeRichCardMediaInfo == null) {
            return null;
        }
        return generalPurposeRichCardMediaInfo.mediaUrl;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardView.k(java.lang.String):void");
    }

    public final void l(bcse bcseVar) {
        czic czicVar;
        RichCardContentContainer richCardContentContainer;
        LinearLayout linearLayout;
        czpd czpdVar;
        this.g = bcseVar;
        RichCardMediaAttachmentView richCardMediaAttachmentView = this.k;
        if (richCardMediaAttachmentView != null) {
            richCardMediaAttachmentView.j = this;
            richCardMediaAttachmentView.p(false);
        }
        RichCardContentContainer richCardContentContainer2 = this.l;
        if (richCardContentContainer2 == null || richCardContentContainer2.getVisibility() != 0 || (czicVar = this.m) == null || (linearLayout = (richCardContentContainer = this.l).c) == null || linearLayout.getVisibility() != 0 || (czpdVar = richCardContentContainer.f) == null) {
            return;
        }
        cztz c = richCardContentContainer.c(czicVar);
        Iterator it = new ArrayList(czpdVar.o).iterator();
        while (it.hasNext()) {
            czpdVar.e((czwk) it.next(), c);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.g = this.p.a();
        this.v = (RichCardMediaAttachmentView) findViewById(R.id.rich_card_top_media);
        this.w = (RichCardMediaAttachmentView) findViewById(R.id.rich_card_left_media);
        this.x = (RichCardMediaAttachmentView) findViewById(R.id.rich_card_right_media);
        this.l = (RichCardContentContainer) findViewById(R.id.rich_card_content_container);
        this.v.j = this;
        this.w.j = this;
        this.x.j = this;
        this.l.d = this;
    }

    @Override // com.google.android.material.card.MaterialCardView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.j) {
            GeneralPurposeRichCard generalPurposeRichCard = this.h;
            generalPurposeRichCard.getClass();
            String str = generalPurposeRichCard.layout.cardWidth;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((str.hashCode() == -1747407794 && str.equals(GeneralPurposeRichCardLayoutInfo.WIDTH_SMALL)) ? getResources().getDimensionPixelSize(R.dimen.rich_card_carousel_small_width) : getResources().getDimensionPixelSize(R.dimen.rich_card_carousel_medium_width), 1073741824);
            int i3 = generalPurposeRichCard.layout.desiredHeight;
            if (i3 == -1) {
                i3 = getResources().getDimensionPixelSize(R.dimen.rich_card_min_height);
            }
            setMinimumHeight(i3);
            i = makeMeasureSpec;
        } else {
            int size = View.MeasureSpec.getSize(i);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.rich_card_max_width);
            if (dimensionPixelOffset > 0 && dimensionPixelOffset < size) {
                i = View.MeasureSpec.makeMeasureSpec(dimensionPixelOffset, View.MeasureSpec.getMode(i));
            }
        }
        super.onMeasure(i, i2);
    }

    public ConversationRichCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0;
    }

    @Override // defpackage.czkr
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }
}
