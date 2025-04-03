package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardView;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaAttachmentView;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo;
import defpackage.cbke;
import defpackage.cbkm;
import defpackage.cblo;
import defpackage.csix;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.csuu;
import defpackage.czot;
import defpackage.czpg;
import defpackage.czph;
import defpackage.czpi;
import defpackage.czpj;
import defpackage.czpm;
import defpackage.ekmq;
import defpackage.ekms;
import defpackage.ffbr;
import defpackage.rff;
import defpackage.riq;
import defpackage.rjb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RichCardMediaAttachmentView extends czot implements czpm, cblo {
    public static final cskc a = cskc.g("BugleRbmRichCard", "RichCardMediaAttachmentView");
    public ImageView b;
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;
    public int g;
    protected boolean h;
    public Uri i;
    public czpj j;
    public int k;
    public int l;
    private int m;
    private RichCardVideoOverlayView n;
    private RichCardMediaDownloadOverlayView o;
    private ImageView p;
    private int q;
    private ekms r;

    public RichCardMediaAttachmentView(Context context) {
        super(context);
        this.q = 3622735;
        this.k = 1;
        this.l = 1;
        this.g = -1;
        this.h = true;
        t();
    }

    private final void t() {
        inflate(getContext(), R.layout.rich_card_media_attachment_view, this);
        this.b = (ImageView) findViewById(R.id.rich_card_thumbnail_image);
        this.n = (RichCardVideoOverlayView) findViewById(R.id.rich_card_video_overlay);
        this.o = (RichCardMediaDownloadOverlayView) findViewById(R.id.rich_card_media_download_overlay);
        this.p = (ImageView) findViewById(R.id.rich_card_media_placeholder_icon);
        setBackgroundColor(this.q);
        RichCardMediaDownloadOverlayView richCardMediaDownloadOverlayView = this.o;
        richCardMediaDownloadOverlayView.a = this;
        richCardMediaDownloadOverlayView.c();
        this.p.setTag(R.id.rich_card_media_icon_tag, czpi.NONE);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: czpf
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [czid, czpj] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czpj czpjVar;
                RichCardMediaAttachmentView richCardMediaAttachmentView = RichCardMediaAttachmentView.this;
                if (richCardMediaAttachmentView.l == 2 && richCardMediaAttachmentView.k == 5 && (czpjVar = richCardMediaAttachmentView.j) != null) {
                    MessagePartCoreData i = czpjVar.i();
                    Rect g = ((csmj) richCardMediaAttachmentView.e.b()).g(view);
                    ?? r0 = richCardMediaAttachmentView.j;
                    czic czicVar = ((ConversationRichCardView) r0).m;
                    if (czicVar == 0 || i == null) {
                        return;
                    }
                    czicVar.H(r0, i, g, false);
                }
            }
        });
        this.m = getResources().getInteger(R.integer.rich_card_media_cross_fade_duration);
        this.r = ekmq.c(this).c().y();
    }

    @Override // defpackage.cblo
    public final void a(String str) {
        if (r(str)) {
            this.g = 0;
            this.k = 2;
            this.o.c();
        }
    }

    @Override // defpackage.cblo
    public final void b(String str) {
        if (r(str)) {
            this.k = 4;
            this.o.c();
        }
    }

    @Override // defpackage.cblo
    public final void c(String str, long j, long j2) {
        if (r(str)) {
            if (j2 <= 0) {
                this.g = -1;
            } else {
                this.g = (int) ((j / j2) * 100.0d);
            }
            this.o.c();
        }
    }

    @Override // defpackage.cblo
    public final void e(String str, Uri uri) {
        if (r(str)) {
            csjb a2 = a.a();
            a2.I("Rich Card media at uri ");
            a2.I(str);
            a2.I(" was successfully downloaded to ");
            a2.I(uri);
            a2.r();
        }
    }

    @Override // defpackage.czpm
    public final int h() {
        return this.g;
    }

    @Override // defpackage.czpm
    public final long i() {
        GeneralPurposeRichCardMediaInfo generalPurposeRichCardMediaInfo;
        czpj czpjVar = this.j;
        if (czpjVar == null) {
            csix.c("Total media size was requested but RichCardMediaAttachmentHost was null.");
            return -1L;
        }
        GeneralPurposeRichCard generalPurposeRichCard = ((ConversationRichCardView) czpjVar).h;
        if (generalPurposeRichCard != null && (generalPurposeRichCardMediaInfo = generalPurposeRichCard.content.media) != null) {
            return generalPurposeRichCardMediaInfo.mediaFileSize.longValue();
        }
        csix.c("Media size was requested but no media is present.");
        return -1L;
    }

    public final void j() {
        this.q = 3622735;
        k();
        l();
    }

    public final void k() {
        this.b.setImageURI(null);
        this.b.setVisibility(8);
        setBackgroundColor(this.q);
        this.i = null;
    }

    public final void l() {
        this.n.f(null);
        this.n.setVisibility(8);
    }

    @Override // defpackage.czpm
    public final void m() {
        czpj czpjVar = this.j;
        if (czpjVar == null) {
            csix.c("A download cancellation was requested but the RichCardMediaAttachmentHost was null for this view.");
            return;
        }
        String j = czpjVar.j();
        if (j == null) {
            a.n("Requested cancellation of download that has no url in the first place");
            return;
        }
        ((cbkm) ((cbke) this.c.b()).a).a(Uri.parse(j));
        this.g = 0;
        this.k = 2;
        this.o.c();
    }

    @Override // defpackage.czpm
    public final void n() {
        czpj czpjVar = this.j;
        if (czpjVar == null) {
            csix.c("A download cancellation was requested but the RichCardMediaAttachmentHost was null for this view.");
            return;
        }
        MessagePartCoreData i = czpjVar.i();
        if (i == null) {
            a.n("Requested download of media but there is no associated media message part data");
            return;
        }
        ((cbke) this.c.b()).a(i, this);
        this.k = 3;
        this.o.c();
    }

    public final void o(Uri uri) {
        if (!csuu.x(uri)) {
            csix.c("Expected URI to be a local URI. Received URI: ".concat(uri.toString()));
            return;
        }
        if (uri.equals(this.i)) {
            return;
        }
        this.b.setVisibility(0);
        if (this.i != null && this.b.isLaidOut()) {
            this.r.i(uri).w(new czpg(this, this.b.getWidth(), this.b.getHeight(), uri));
            return;
        }
        czph czphVar = new czph(this, uri);
        if (this.h) {
            this.r.i(uri).f(czphVar).w(new riq(this.b, null));
            return;
        }
        ekms i = this.r.i(uri);
        int i2 = this.m;
        rff rffVar = new rff();
        rffVar.e(new rjb(i2));
        i.p(rffVar).f(czphVar).w(new riq(this.b, null));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.round(Math.max(getResources().getDimension(R.dimen.rich_card_min_height), View.MeasureSpec.getSize(i2))), 1073741824));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r14) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaAttachmentView.p(boolean):void");
    }

    protected final void q() {
        int i;
        String j = this.j.j();
        MessagePartCoreData i2 = this.j.i();
        if (TextUtils.isEmpty(j) || !((cbke) this.c.b()).b(j) || i2 == null) {
            i = 2;
        } else {
            ((cbke) this.c.b()).a(i2, this);
            i = 3;
        }
        this.k = i;
    }

    protected final boolean r(String str) {
        if (!TextUtils.isEmpty(str)) {
            czpj czpjVar = this.j;
            if (czpjVar == null) {
                csix.c("The current media uri string was requested from the rich card but the RichCardMediaAttachmentHost was null.");
                return false;
            }
            String j = czpjVar.j();
            if (!TextUtils.isEmpty(j)) {
                return j.equals(str);
            }
        }
        return false;
    }

    @Override // defpackage.czpm
    public final int s() {
        return this.k;
    }

    public RichCardMediaAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = 3622735;
        this.k = 1;
        this.l = 1;
        this.g = -1;
        this.h = true;
        t();
    }

    @Override // defpackage.cblo
    public final void d(String str) {
    }
}
