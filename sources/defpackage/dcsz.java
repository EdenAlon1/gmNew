package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediaviewer.CenterFitVideoView;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcsz {
    public dbti a;
    public boolean b;
    public CenterFitVideoView c;
    public ZoomableImageView d;
    public long e;
    public final dcso g;
    public final ffbr h;
    public dcsx i;
    public final Point f = new Point();
    private final Runnable j = new dcsy(this);

    public dcsz(dcso dcsoVar, ffbr ffbrVar) {
        this.g = dcsoVar;
        this.h = ffbrVar;
    }

    static dcso h(Uri uri, String str, int i) {
        dcso f = dcso.f();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        bundle.putString("content_type", str);
        bundle.putInt("starting_view_state", i - 1);
        f.at(bundle);
        return f;
    }

    public final Rect a() {
        if (!g()) {
            return new Rect();
        }
        d();
        this.d.c();
        return this.d.a();
    }

    public final void b() {
        this.e = -1L;
        CenterFitVideoView centerFitVideoView = this.c;
        if (centerFitVideoView != null) {
            centerFitVideoView.removeCallbacks(this.j);
        }
    }

    public final void c() {
        if (this.c.isPlaying()) {
            this.c.postDelayed(this.j, 250L);
        }
    }

    public final void d() {
        dcso dcsoVar = this.g;
        if (dcsoVar == null) {
            return;
        }
        Resources B = dcsoVar.B();
        int dimension = (int) B.getDimension(R.dimen.media_viewer_edit_horizontal_padding);
        int dimension2 = (int) B.getDimension(R.dimen.media_viewer_edit_vertical_padding);
        int dimension3 = (int) B.getDimension(R.dimen.media_viewer_edit_corner_radius);
        this.d.e(dimension, dimension2, dimension, dimension2);
        this.d.d(dimension3);
    }

    public final void e() {
        dcsx dcsxVar;
        long currentPosition = this.c.getCurrentPosition() / 1000;
        if (this.e == currentPosition || (dcsxVar = this.i) == null) {
            return;
        }
        this.e = currentPosition;
        Context z = this.g.z();
        ((dcty) dcsxVar).B.setText(String.format("%s/%s", csjh.a(z, this.c.getCurrentPosition()), csjh.a(z, this.c.getDuration())));
    }

    public final void f() {
        Point point = this.f;
        CenterFitVideoView centerFitVideoView = this.c;
        int i = point.x;
        int i2 = point.y;
        ViewGroup viewGroup = (ViewGroup) centerFitVideoView.getParent();
        float f = i;
        float f2 = i2;
        float min = Math.min(viewGroup.getWidth() / f, viewGroup.getHeight() / f2);
        float f3 = f * min;
        float f4 = f2 * min;
        ViewGroup.LayoutParams layoutParams = centerFitVideoView.getLayoutParams();
        layoutParams.width = (int) f3;
        layoutParams.height = (int) f4;
        centerFitVideoView.setLayoutParams(layoutParams);
    }

    public final boolean g() {
        return this.g != null && this.d.getVisibility() == 0;
    }
}
