package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class criq extends cril implements crir {
    public RoundedImageView a;
    protected boolean b;
    protected int c;
    protected int d;
    protected boolean e;
    protected ekms f;
    public errl g;
    public fazb h;
    public ffbr i;
    private ListenableFuture j;
    private crig k;

    public criq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        this.k = null;
    }

    public static ekms f(ekms ekmsVar, Uri uri, Point point, MessagePartCoreData messagePartCoreData) {
        ekms Q = ekmsVar.i(uri).Q(point.x, point.y);
        return (uri == null || !csuu.z(uri) || messagePartCoreData.aa() == null) ? Q : Q.W(new rjn(messagePartCoreData.aa()));
    }

    private final ekms j() {
        ekms p = ekmq.c(this).c().p(rff.b());
        return csjc.j() ? (ekms) p.V(rfy.b, true) : p;
    }

    private final void k() {
        ListenableFuture listenableFuture = this.j;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            this.j = null;
        }
    }

    @Override // defpackage.crii
    public final void c() {
        this.a.setImageDrawable(null);
    }

    @Override // defpackage.crid
    public final void d(boolean z, bcse bcseVar, Drawable drawable, float[] fArr) {
        setSelected(z);
        if (z) {
            this.a.setColorFilter(this.d);
        } else {
            this.a.clearColorFilter();
        }
        this.a.r(fArr);
    }

    public final ekms e(ekms ekmsVar) {
        return ekmsVar.a(new crip(this));
    }

    @Override // defpackage.crii
    public final void g(MessagePartCoreData messagePartCoreData, boolean z, String str, int i) {
        cbbi cbbiVar;
        if (messagePartCoreData.bj() && this.e) {
            setGravity(17);
            this.a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        if (this.f != null) {
            int minimumHeight = this.a.getMinimumHeight();
            int maxHeight = this.a.getMaxHeight();
            int maxWidth = this.a.getMaxWidth();
            Point point = new Point(messagePartCoreData.c(), messagePartCoreData.b());
            ctap.l(point, maxWidth, maxHeight, minimumHeight);
            Uri x = messagePartCoreData.x() != null ? messagePartCoreData.x() : messagePartCoreData.t();
            if (messagePartCoreData.v() != null) {
                ekms d = f(this.f, messagePartCoreData.v(), point, messagePartCoreData).a(new crio()).d(f(j(), x, point, messagePartCoreData));
                this.f = d;
                ekms e = e(d);
                this.f = e;
                e.v(this.a);
            } else if (x != null) {
                ekms f = f(this.f, x, point, messagePartCoreData);
                this.f = f;
                ekms e2 = e(f);
                this.f = e2;
                e2.v(this.a);
            }
        } else if (this.k != null) {
            RoundedImageView roundedImageView = this.a;
            if (roundedImageView instanceof AsyncImageView) {
                AsyncImageView asyncImageView = (AsyncImageView) roundedImageView;
                int q = asyncImageView.q();
                int p = asyncImageView.p();
                getClass();
                cfup cfupVar = crih.a;
                Uri t = messagePartCoreData.t();
                if (t == null) {
                    t = messagePartCoreData.x();
                }
                Uri uri = t;
                if (le.n(messagePartCoreData.V())) {
                    String o = csuu.o(uri);
                    cbbiVar = o != null ? new cbbf(o, q, p, messagePartCoreData.c(), messagePartCoreData.b()) : new cbce(uri, q, p, messagePartCoreData.c(), messagePartCoreData.b(), true, false, false, 0);
                } else {
                    cbbiVar = null;
                }
                asyncImageView.d(cbbiVar);
            }
        }
        String U = messagePartCoreData.U();
        if (TextUtils.isEmpty(U)) {
            this.a.setContentDescription(getResources().getString(R.string.message_image_content_description));
        } else {
            this.a.setContentDescription(U);
        }
        final String X = messagePartCoreData.X();
        if (X != null && crnx.j(getContext())) {
            final RoundedImageView roundedImageView2 = this.a;
            k();
            ListenableFuture e3 = ((eere) this.h.b()).e(X);
            this.j = e3;
            elfr.l(e3, new csvw(new Consumer() { // from class: crim
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    String str2 = ((ewnk) obj).h;
                    if (cuxt.i(str2)) {
                        return;
                    }
                    View view = roundedImageView2;
                    view.setContentDescription(view.getContext().getResources().getString(R.string.sticker_content_description, str2));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: crin
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    csjy.h("Bugle", (Throwable) obj, "Failed to get sticker ".concat(String.valueOf(cskt.b(X))));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), this.g);
        }
        if (i == 1) {
            h(this.a, messagePartCoreData);
        }
    }

    @Override // defpackage.crir
    public final void i(crig crigVar) {
        this.k = crigVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f = j();
        int i = this.c;
        if (i >= 0) {
            this.a.u = i;
        }
        if (this.b) {
            this.a.getLayoutParams().width = -1;
            this.a.getLayoutParams().height = -1;
            this.a.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.a.setOnLongClickListener(onLongClickListener);
    }

    protected void h(RoundedImageView roundedImageView, MessagePartCoreData messagePartCoreData) {
    }
}
