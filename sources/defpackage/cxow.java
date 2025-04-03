package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;
import com.google.android.apps.messaging.ui.attachment.video.VideoAttachmentView;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxow implements crii {
    public Uri a;
    final ekms b;
    public ListenableFuture c = null;
    public final VideoAttachmentView d;
    public final ffbr e;
    public final RoundedImageView f;
    public final VideoOverlayView g;
    public final boolean h;
    public final boolean i;
    private final ffbr j;
    private final ffbr k;
    private final Context l;
    private final int m;

    public cxow(VideoAttachmentView videoAttachmentView, TypedArray typedArray, ffbr ffbrVar, ffbr ffbrVar2, final ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        final int dimensionPixelSize;
        this.d = videoAttachmentView;
        this.j = ffbrVar;
        this.k = ffbrVar2;
        this.e = ffbrVar5;
        Context context = videoAttachmentView.getContext();
        this.l = context;
        this.m = context.getColor(R.color.message_video_selected_tint);
        this.b = ekmq.c(videoAttachmentView).c().p(rff.b());
        View.inflate(context, R.layout.video_attachment_view_inline, videoAttachmentView);
        int i = 0;
        if (typedArray == null) {
            this.h = false;
            this.i = false;
            dimensionPixelSize = -1;
        } else {
            int[] iArr = cxon.a;
            this.h = typedArray.getBoolean(1, false);
            this.i = typedArray.getBoolean(3, false);
            dimensionPixelSize = typedArray.getDimensionPixelSize(4, -1);
            i = typedArray.getDimensionPixelSize(2, 0);
        }
        RoundedImageView roundedImageView = (RoundedImageView) videoAttachmentView.findViewById(R.id.video_thumbnail_image);
        this.f = roundedImageView;
        if (dimensionPixelSize >= 0) {
            roundedImageView.u = dimensionPixelSize;
        }
        VideoOverlayView videoOverlayView = (VideoOverlayView) videoAttachmentView.findViewById(R.id.video_overlay);
        this.g = videoOverlayView;
        if (i > 0) {
            videoOverlayView.setPadding(i, i, i, i);
        }
        if (this.h) {
            videoOverlayView.setVisibility(8);
        } else {
            roundedImageView.setOnClickListener(((cxqk) ffbrVar4.b()).a(new View.OnClickListener() { // from class: cxou
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    engw n;
                    cxow cxowVar = cxow.this;
                    if (cxowVar.a == null) {
                        return;
                    }
                    if (!((vyw) ffbrVar3.b()).f()) {
                        cxowVar.d.performClick();
                        return;
                    }
                    float[] fArr = cxowVar.f.v;
                    if (fArr == null) {
                        int i2 = engw.d;
                        n = enou.a;
                    } else {
                        n = engw.n(ermj.c(fArr));
                    }
                    int i3 = dimensionPixelSize;
                    VideoAttachmentView videoAttachmentView2 = cxowVar.d;
                    RoundedImageView roundedImageView2 = cxowVar.f;
                    Uri uri = cxowVar.a;
                    uri.getClass();
                    ellj.g(new cxol(videoAttachmentView2, roundedImageView2, i3, n, uri), cxowVar.d);
                }
            }));
        }
        if (this.i) {
            roundedImageView.getLayoutParams().width = -1;
            roundedImageView.getLayoutParams().height = -1;
            roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    @Override // defpackage.crii
    public final void c() {
        this.a = null;
        this.f.setImageDrawable(null);
    }

    @Override // defpackage.crid
    public final void d(boolean z, bcse bcseVar, Drawable drawable, float[] fArr) {
        this.d.setSelected(z);
        this.g.setVisibility(true != bcseVar.am(this.l) ? 0 : 8);
        if (z) {
            int i = this.m;
            this.f.setColorFilter(i);
            VideoOverlayView videoOverlayView = this.g;
            TextView textView = (TextView) videoOverlayView.findViewById(R.id.duration);
            ((ImageView) videoOverlayView.findViewById(R.id.icon)).setColorFilter(i);
            textView.setTextColor(i);
        } else {
            this.f.clearColorFilter();
            VideoOverlayView videoOverlayView2 = this.g;
            TextView textView2 = (TextView) videoOverlayView2.findViewById(R.id.duration);
            ((ImageView) videoOverlayView2.findViewById(R.id.icon)).clearColorFilter();
            textView2.setTextColor(videoOverlayView2.getResources().getColor(R.color.video_duration_text));
        }
        this.f.r(fArr);
    }

    @Override // defpackage.crii
    public final void g(final MessagePartCoreData messagePartCoreData, boolean z, String str, int i) {
        if (messagePartCoreData == null) {
            this.a = null;
            this.f.setImageURI(null);
            this.g.setVisibility(8);
            return;
        }
        this.g.setVisibility(0);
        ((FrameLayout.LayoutParams) this.g.getLayoutParams()).gravity = 85;
        this.g.g();
        final bdwv bdwvVar = (bdwv) this.k.b();
        final Uri v = messagePartCoreData.v();
        elfl g = (v != null && "file".equals(v.getScheme()) && bdwvVar.b.s()) ? elfo.g(new Callable() { // from class: bdwu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                bdwv bdwvVar2 = bdwv.this;
                Uri uri = v;
                String path = uri.getPath();
                if (path != null) {
                    File file = new File(path);
                    if (file.exists()) {
                        try {
                            return FileProvider.a((Context) bdwvVar2.d.b(), ((Context) bdwvVar2.d.b()).getPackageName() + ".fileprovider", file);
                        } catch (Exception e) {
                            csjb e2 = bdwv.a.e();
                            e2.I("Can't convert file uri to content uri.");
                            e2.l(uri);
                            e2.s(e);
                        }
                    }
                }
                return messagePartCoreData.t();
            }
        }, bdwvVar.c) : elfo.e(messagePartCoreData.t());
        this.c = g;
        erqt.r(g, axou.a(new csvw(new Consumer() { // from class: cxos
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cxow cxowVar = cxow.this;
                Uri uri = (Uri) obj;
                cxowVar.a = uri;
                MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                long k = messagePartCoreData2.k();
                csix.g();
                VideoOverlayView videoOverlayView = cxowVar.g;
                Uri uri2 = videoOverlayView.b;
                if (uri2 == null || !uri2.equals(uri) || (k != videoOverlayView.c && k >= 0)) {
                    videoOverlayView.b = uri;
                    if (uri == null) {
                        videoOverlayView.e(0L);
                    } else if (k > 0) {
                        videoOverlayView.e(k);
                    } else {
                        Context context = (Context) videoOverlayView.d.a.b();
                        context.getClass();
                        videoOverlayView.a = new VideoOverlayView.GetMediaDurationAction(context, uri).p(videoOverlayView);
                    }
                }
                RoundedImageView roundedImageView = cxowVar.f;
                int minimumHeight = roundedImageView.getMinimumHeight();
                int maxHeight = roundedImageView.getMaxHeight();
                int maxWidth = roundedImageView.getMaxWidth();
                Point point = new Point(messagePartCoreData2.c(), messagePartCoreData2.b());
                ctap.l(point, maxWidth, maxHeight, minimumHeight);
                ViewGroup.LayoutParams layoutParams = cxowVar.d.getLayoutParams();
                if (layoutParams.width == -2 && layoutParams.height == -2 && point.y >= point.x) {
                    layoutParams.width = point.x;
                    layoutParams.height = point.y;
                    cxowVar.d.setLayoutParams(layoutParams);
                }
                if (uri == null) {
                    uri = messagePartCoreData2.x();
                }
                if (uri != null) {
                    ekms Q = cxowVar.b.i(uri).Q(point.x, point.y);
                    if (csuu.z(uri) && messagePartCoreData2.aa() != null) {
                        Q = Q.W(new rjn(messagePartCoreData2.aa()));
                    }
                    Q.a(new cxov(cxowVar)).v(cxowVar.f);
                }
                cxowVar.d.setClickable(false);
                cxowVar.d.setImportantForAccessibility(2);
                if (cxowVar.a == null) {
                    cxowVar.f.setClickable(false);
                    cxowVar.f.setImportantForAccessibility(2);
                } else {
                    cxowVar.f.setClickable(true);
                    cxowVar.f.setImportantForAccessibility(1);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: cxot
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                csjy.h("Bugle", (Throwable) obj, "Failed to get media display uri to load the video");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), (Executor) this.j.b());
    }
}
