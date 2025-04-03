package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqwa {
    public final Context a;
    public final ea b;
    public final errl c;
    public final duqi d;
    public final dqwd e;
    public final dqwf f;
    public final ffix g;
    public final ffix h;
    public final dqsv i;
    public Object m;
    public final dqvn n;
    private final ffsk o;
    public final dqvz j = new dqvz(this);
    private final ffbz p = ffca.a(new ffix() { // from class: dqvq
        @Override // defpackage.ffix
        public final Object invoke() {
            Object systemService = dqwa.this.a.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            boolean z = false;
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    });
    private final ffbz q = ffca.a(new ffix() { // from class: dqvr
        @Override // defpackage.ffix
        public final Object invoke() {
            Optional empty = Optional.empty();
            Optional empty2 = Optional.empty();
            Optional empty3 = Optional.empty();
            duqu duquVar = new duqu();
            dqwa dqwaVar = dqwa.this;
            return new durd(duquVar, engw.r(dqwaVar.e), empty, true, dqwaVar.d, dqwaVar.c, true, empty2, empty3);
        }
    });
    private final ffbz r = ffca.a(new ffix() { // from class: dqvs
        @Override // defpackage.ffix
        public final Object invoke() {
            dure dureVar = new dure();
            dureVar.n = 1;
            int i = dureVar.m;
            dureVar.e = 9;
            dureVar.a = -1.0f;
            dureVar.m = i | 419;
            dureVar.d(0);
            dureVar.a(0);
            dureVar.b(0);
            dureVar.m |= 3072;
            dureVar.c(false);
            dureVar.j = -1;
            int i2 = dureVar.m;
            dureVar.h = true;
            dureVar.g = null;
            dureVar.k = true;
            dureVar.l = true;
            dureVar.o = 1;
            dureVar.p = 1;
            dureVar.m = i2 | 123392;
            dureVar.a(18);
            dureVar.f = 1;
            dureVar.m |= 64;
            dqwa dqwaVar = dqwa.this;
            dureVar.d(dqwaVar.a.getResources().getDimensionPixelSize(R.dimen.emoji_tab_height));
            dureVar.b(180);
            dureVar.c(dqwaVar.b());
            dqof dqofVar = dqwaVar.i.d;
            dureVar.g = dqofVar != null ? dqofVar.a() : null;
            if (dureVar.m == 131071 && dureVar.n != 0 && dureVar.o != 0 && dureVar.p != 0) {
                return new durf(dureVar.a, dureVar.b, dureVar.c, dureVar.d, dureVar.e, dureVar.f, dureVar.g, dureVar.h, dureVar.i, dureVar.j, dureVar.k, dureVar.l);
            }
            StringBuilder sb = new StringBuilder();
            if (dureVar.n == 0) {
                sb.append(" headerLayoutOrientation");
            }
            if ((1 & dureVar.m) == 0) {
                sb.append(" headerIconSelectedOverrideTint");
            }
            if ((dureVar.m & 2) == 0) {
                sb.append(" rows");
            }
            if ((dureVar.m & 4) == 0) {
                sb.append(" rowHeight");
            }
            if ((dureVar.m & 8) == 0) {
                sb.append(" maxRecentCount");
            }
            if ((dureVar.m & 16) == 0) {
                sb.append(" poolSize");
            }
            if ((dureVar.m & 32) == 0) {
                sb.append(" columns");
            }
            if ((dureVar.m & 64) == 0) {
                sb.append(" minRowsPerCategory");
            }
            if ((dureVar.m & 128) == 0) {
                sb.append(" emojiIconBackground");
            }
            if ((dureVar.m & 256) == 0) {
                sb.append(" hideCategoryTitle");
            }
            if ((dureVar.m & 512) == 0) {
                sb.append(" displayEmojiVariants");
            }
            if ((dureVar.m & 1024) == 0) {
                sb.append(" emojiPlaceHolderDrawable");
            }
            if ((dureVar.m & 2048) == 0) {
                sb.append(" customEmojiTypeface");
            }
            if ((dureVar.m & 4096) == 0) {
                sb.append(" popupWindowFocusable");
            }
            if ((dureVar.m & 8192) == 0) {
                sb.append(" categoryIconMinWidth");
            }
            if ((dureVar.m & 16384) == 0) {
                sb.append(" scrollToHeaderPositionOnCategoryChange");
            }
            if ((dureVar.m & 32768) == 0) {
                sb.append(" enableHorizontalCategoryStartMargin");
            }
            if (dureVar.o == 0) {
                sb.append(" highLightSelectedEmojiStatus");
            }
            if (dureVar.p == 0) {
                sb.append(" scrollToInitialEmojiOption");
            }
            if ((dureVar.m & 65536) == 0) {
                sb.append(" useTitleCaseCategoryNames");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
    });
    public final ffbz k = ffca.a(new ffix() { // from class: dqvt
        @Override // defpackage.ffix
        public final Object invoke() {
            durb durbVar = new durb();
            durbVar.e = (byte) (durbVar.e | 12);
            durbVar.a(false);
            durbVar.d = null;
            durbVar.b = 9;
            durbVar.e = (byte) (durbVar.e | 2);
            dqwa dqwaVar = dqwa.this;
            durbVar.a = dqwaVar.a.getResources().getDimensionPixelSize(R.dimen.emoji_tab_height);
            durbVar.e = (byte) (durbVar.e | 1);
            durbVar.a(dqwaVar.b());
            dqof dqofVar = dqwaVar.i.d;
            durbVar.d = dqofVar != null ? dqofVar.a() : null;
            if (durbVar.e == 31) {
                return new durc(durbVar.a, durbVar.b, durbVar.c, durbVar.d);
            }
            StringBuilder sb = new StringBuilder();
            if ((durbVar.e & 1) == 0) {
                sb.append(" rowHeight");
            }
            if ((durbVar.e & 2) == 0) {
                sb.append(" columns");
            }
            if ((durbVar.e & 4) == 0) {
                sb.append(" emojiIconBackground");
            }
            if ((durbVar.e & 8) == 0) {
                sb.append(" emojiPlaceHolderDrawable");
            }
            if ((durbVar.e & 16) == 0) {
                sb.append(" popupWindowFocusable");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
    });
    public final dutk l = new dutk() { // from class: dqvu
        @Override // defpackage.dutk
        public final void a(ImageView imageView, View view, boolean z) {
            Drawable background;
            dsjz dsjzVar = ((dsxk) dqwa.this.h.invoke()).k;
            if (dsjzVar != null) {
                int i = z ? dsjzVar.b : dsjzVar.c;
                if (imageView != null) {
                    imageView.setColorFilter(i);
                }
                if (view == null || (background = view.getBackground()) == null) {
                    return;
                }
                background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
        }
    };

    public dqwa(Context context, ea eaVar, ffsk ffskVar, errl errlVar, duqi duqiVar, dqwd dqwdVar, dqwf dqwfVar, ffix ffixVar, ffix ffixVar2, dqvn dqvnVar, dqsv dqsvVar) {
        this.a = context;
        this.b = eaVar;
        this.o = ffskVar;
        this.c = errlVar;
        this.d = duqiVar;
        this.e = dqwdVar;
        this.f = dqwfVar;
        this.g = ffixVar;
        this.h = ffixVar2;
        this.n = dqvnVar;
        this.i = dqsvVar;
        ffqy.d(ffskVar, null, null, new dqvw(this, null), 3);
        ffqy.d(ffskVar, null, null, new dqvy(this, null), 3);
    }

    public final void a(boolean z) {
        int i = true != z ? 8 : 0;
        dqwf dqwfVar = this.f;
        dqwfVar.c.setVisibility(i);
        dqwfVar.d.setVisibility((z && this.i.f) ? 0 : 8);
        dqwfVar.b.setVisibility(true != z ? 8 : 0);
    }

    public final boolean b() {
        return ((Boolean) this.p.a()).booleanValue();
    }

    public final void c() {
        Object obj = this.m;
        if (!(obj instanceof dutb)) {
            dqwf dqwfVar = this.f;
            dutb dutbVar = new dutb(dqwfVar.c, dqwfVar.a, this.j, (dutt) this.r.a(), (dutf) this.q.a());
            dutbVar.u = true;
            if (dutbVar.o.isEmpty()) {
                Context context = dutbVar.b;
                emxg emxgVar = new emxg() { // from class: dusk
                    @Override // defpackage.emxg
                    public final boolean a(Object obj2) {
                        enru enruVar = dutb.a;
                        return true;
                    }
                };
                dusl duslVar = new dusl(dutbVar);
                engw engwVar = dutbVar.i;
                int i = dutbVar.C;
                dutbVar.d.x();
                dutbVar.y = new dutj(context, emxgVar, duslVar, engwVar, i);
                dutbVar.w.am(dutbVar.y);
            }
            dutbVar.x.am(dutbVar.f());
            dutbVar.j.ifPresent(new Consumer() { // from class: dusm
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    enru enruVar = dutb.a;
                    ((duul) obj2).g();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.m = dutbVar;
            obj = dutbVar;
        }
        ((dutb) obj).c(this.l);
        a(true);
    }
}
