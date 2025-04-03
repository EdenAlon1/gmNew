package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxpi {
    public ViewTreeObserver.OnGlobalLayoutListener b;
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();
    public Optional f = Optional.empty();
    private boolean h = false;
    public boolean g = false;
    public final lrm a = new cxph(this);

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.media3.exoplayer.ExoPlayer, java.lang.Object] */
    public final void a() {
        if (this.c.isPresent() && this.b != null) {
            ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c.get()).getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.b;
            onGlobalLayoutListener.getClass();
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            this.b = null;
        }
        if (this.e.isPresent() && this.f.isPresent() && this.c.isPresent() && !this.h) {
            this.h = true;
            this.d.ifPresent(new Consumer() { // from class: cxpa
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    View view = (View) obj;
                    view.setContentDescription(view.getResources().getString(R.string.video_thumbnail_view_play_button_content_description));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.e.get().ae();
            ((ViewGroup) this.c.get()).removeView((View) this.f.get());
            this.c = Optional.empty();
            this.d = Optional.empty();
            this.f = Optional.empty();
            this.e = Optional.empty();
            this.h = false;
            this.g = false;
        }
    }
}
