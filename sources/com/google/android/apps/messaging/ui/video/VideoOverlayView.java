package com.google.android.apps.messaging.ui.video;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.bbcb;
import defpackage.bbcd;
import defpackage.csix;
import defpackage.csrh;
import defpackage.csuu;
import defpackage.deaa;
import defpackage.deab;
import defpackage.dead;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eogt;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VideoOverlayView extends deaa implements bbcb<Long> {
    private static final enru f = enru.c("com/google/android/apps/messaging/ui/video/VideoOverlayView");
    public bbcd a;
    public Uri b;
    public long c;
    public dead d;
    public ffbr e;
    private int g;

    public VideoOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        LayoutInflater.from(context).inflate(R.layout.video_overlay_view, (ViewGroup) this, true);
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void a(bbcd bbcdVar, Action action, Object obj, Object obj2) {
        Long l = (Long) obj2;
        if (l == null) {
            f();
            return;
        }
        TextView textView = (TextView) findViewById(R.id.duration);
        if (this.a == bbcdVar && textView != null) {
            e(l.longValue());
        } else if (textView != null) {
            ensk e = f.e();
            e.Y(ente.a, "Bugle");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/video/VideoOverlayView", "onActionSucceeded", 246, "VideoOverlayView.java")).q("ignoring duration because a newer uri is associated with this view, or the view was destroyed");
            e(0L);
        }
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void b(bbcd bbcdVar, Object obj, Object obj2) {
        f();
    }

    public final void e(long j) {
        TextView textView = (TextView) findViewById(R.id.duration);
        textView.setText(j == 0 ? null : csrh.h(j));
        String string = getContext().getString(R.string.video_attachment_content_description);
        if (j != 0) {
            string = string + " " + ((csrh) this.e.b()).g(j);
        }
        textView.setContentDescription(string);
        textView.setClickable(false);
        textView.setImportantForAccessibility(2);
        this.c = j;
    }

    public final void f() {
        ensk h = f.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/video/VideoOverlayView", "onActionFailed", 259, "VideoOverlayView.java")).q("failed to get duration for this uri");
        e(0L);
    }

    public final void g() {
        if (this.g == 2) {
            return;
        }
        csix.d(2, 0, 2);
        this.g = 2;
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int measuredWidth;
        int i5;
        int paddingTop = getPaddingTop();
        ImageView imageView = (ImageView) findViewById(R.id.icon);
        int measuredHeight = imageView.getMeasuredHeight() + paddingTop;
        TextView textView = (TextView) findViewById(R.id.duration);
        int measuredHeight2 = ((imageView.getMeasuredHeight() / 2) + paddingTop) - (textView.getMeasuredHeight() / 2);
        int measuredHeight3 = textView.getMeasuredHeight() + measuredHeight2;
        int i6 = this.g;
        int i7 = 0;
        if (i6 == 0) {
            imageView.setVisibility(0);
            paddingLeft = getPaddingLeft();
            i7 = textView.getMeasuredWidth() + paddingLeft + (getPaddingStart() / 2);
            measuredWidth = i7 + imageView.getMeasuredWidth();
            i5 = i7;
        } else if (i6 != 1) {
            imageView.setVisibility(8);
            paddingLeft = getPaddingLeft();
            i5 = textView.getMeasuredWidth() + paddingLeft;
            measuredWidth = 0;
        } else {
            imageView.setVisibility(0);
            i7 = getPaddingLeft();
            paddingLeft = imageView.getMeasuredWidth() + i7 + (getPaddingStart() / 2);
            i5 = paddingLeft + textView.getMeasuredWidth();
            measuredWidth = paddingLeft;
        }
        imageView.layout(i7, paddingTop, measuredWidth, measuredHeight);
        textView.layout(paddingLeft, measuredHeight2, i5, measuredHeight3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.video_play_icon_size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
        View findViewById = findViewById(R.id.icon);
        findViewById.measure(makeMeasureSpec2, makeMeasureSpec2);
        TextView textView = (TextView) findViewById(R.id.duration);
        textView.measure(makeMeasureSpec, makeMeasureSpec);
        findViewById(R.id.icon).measure(i, i2);
        int measuredWidth = textView.getMeasuredWidth();
        if (this.g != 2) {
            measuredWidth = textView.getMeasuredWidth() + findViewById.getMeasuredWidth() + (getPaddingStart() / 2);
        }
        setMeasuredDimension(measuredWidth + getPaddingLeft() + getPaddingRight(), findViewById.getMeasuredHeight() + getPaddingBottom() + getPaddingTop());
    }

    /* compiled from: PG */
    public static class GetMediaDurationAction extends Action<Long> {
        public static final Parcelable.Creator<Action<Long>> CREATOR = new deab();
        private final Context a;

        /* compiled from: PG */
        public interface a {
            dead dh();
        }

        public GetMediaDurationAction(Context context, Uri uri) {
            super(eogt.GET_MEDIA_DURATION_ACTION);
            this.t.v("source_uri", uri.toString());
            this.a = context;
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final ekzz a() {
            return eleg.f("VideoOverlayView.GetMediaDurationAction");
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
            super(parcel, eogt.GET_MEDIA_DURATION_ACTION);
            this.a = context;
        }
    }
}
