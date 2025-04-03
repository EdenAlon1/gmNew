package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardVideoOverlayView;
import defpackage.akvg;
import defpackage.altk;
import defpackage.bbcb;
import defpackage.bbcd;
import defpackage.csix;
import defpackage.csjy;
import defpackage.csrh;
import defpackage.csuu;
import defpackage.czov;
import defpackage.czpq;
import defpackage.czps;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RichCardVideoOverlayView extends czov implements bbcb<Long> {
    protected final TextView a;
    public Uri b;
    public altk c;
    public akvg d;
    public czps e;
    public ffbr f;
    private bbcd g;

    public RichCardVideoOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.rich_card_video_overlay_view, this);
        onFinishInflate();
        this.a = (TextView) findViewById(R.id.duration);
        setOnClickListener(new View.OnClickListener() { // from class: czpp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RichCardVideoOverlayView richCardVideoOverlayView = RichCardVideoOverlayView.this;
                Uri uri = richCardVideoOverlayView.b;
                if (uri != null) {
                    richCardVideoOverlayView.d.E(richCardVideoOverlayView.getContext(), uri, null);
                    richCardVideoOverlayView.c.T(6);
                }
            }
        });
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void a(bbcd bbcdVar, Action action, Object obj, Object obj2) {
        Long l = (Long) obj2;
        if (this.g == bbcdVar && this.a != null) {
            e(l != null ? l.longValue() : 0L);
        } else if (this.a != null) {
            csjy.c("BugleRbmRichCard", "ignoring duration because a newer uri is associated with this view, or the view was destroyed");
            e(0L);
        }
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void b(bbcd bbcdVar, Object obj, Object obj2) {
        csjy.i("Bugle", "failed to get duration for this uri");
        e(0L);
    }

    public final void e(long j) {
        this.a.setText(j == 0 ? null : csrh.h(j));
        String string = getContext().getString(R.string.video_attachment_content_description);
        if (j != 0) {
            string = string + " " + ((csrh) this.f.b()).g(j);
        }
        this.a.setContentDescription(string);
        this.a.requestLayout();
    }

    public final void f(Uri uri) {
        csix.g();
        Uri uri2 = this.b;
        if (uri2 == null || !uri2.equals(uri)) {
            this.b = uri;
            if (uri == null) {
                e(0L);
                return;
            }
            Context context = (Context) this.e.a.b();
            context.getClass();
            this.g = new GetMediaDurationAction(context, uri).p(this);
        }
    }

    /* compiled from: PG */
    public static class GetMediaDurationAction extends Action<Long> {
        public static final Parcelable.Creator<Action<Long>> CREATOR = new czpq();
        private final Context a;

        /* compiled from: PG */
        public interface a {
            czps dc();
        }

        public GetMediaDurationAction(Context context, Uri uri) {
            super(eogt.RBM_GET_MEDIA_DURATION_ACTION);
            this.t.v("source_uri", uri.toString());
            this.a = context;
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final ekzz a() {
            return eleg.f("GetMediaDurationAction");
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final /* bridge */ /* synthetic */ Object b() {
            return Long.valueOf(csuu.c(this.a, Uri.parse(this.t.l("source_uri"))));
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final String c() {
            return "Bugle.DataModel.Action.GetMediaDurationAction.ExecuteAction.Latency";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            D(parcel, i);
        }

        public GetMediaDurationAction(Context context, Parcel parcel) {
            super(parcel, eogt.RBM_GET_MEDIA_DURATION_ACTION);
            this.a = context;
        }
    }
}
