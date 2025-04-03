package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqwt extends FrameLayout {
    static final /* synthetic */ ffmx[] a;
    public static final /* synthetic */ int g = 0;
    public final int b;
    public final ffji c;
    public final ffls d;
    public final LayoutInflater e;
    public final ffls f;
    private final ffbz h;
    private final ffls i;

    static {
        ffko ffkoVar = new ffko(dqwt.class, "configuration", "getConfiguration()Lcom/google/android/libraries/compose/emoji/ui/screen/EmojiConfiguration;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar, new ffko(dqwt.class, "emojiSet", "getEmojiSet()Lcom/google/android/libraries/compose/emoji/data/EmojiSet;", 0), new ffko(dqwt.class, "anchorTop", "getAnchorTop()I", 0)};
    }

    public dqwt(final Context context, int i, ffji ffjiVar) {
        super(context);
        this.b = i;
        this.c = ffjiVar;
        this.d = new dqwq(this);
        this.e = LayoutInflater.from(context);
        this.h = ffca.a(new ffix() { // from class: dqwm
            @Override // defpackage.ffix
            public final Object invoke() {
                int i2 = dqwt.g;
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.emoji_item_icon_padding));
            }
        });
        this.i = new dqwr(this);
        this.f = new dqws(0, this);
    }

    public final int a() {
        return ((Number) this.h.a()).intValue();
    }

    public final dqqj b() {
        return (dqqj) this.i.c(a[1]);
    }

    public final dqsv c() {
        return (dqsv) this.d.c(a[0]);
    }

    public abstract dqwo d();

    public final void e(dqqj dqqjVar) {
        this.i.d(a[1], dqqjVar);
    }
}
