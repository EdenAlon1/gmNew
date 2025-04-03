package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dutn extends FrameLayout {
    private static final enru l = enru.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupView");
    private static final erml m = erml.c(R.style.EmojiSkintoneSelectorLight, R.style.EmojiSkintoneSelectorMediumLight, R.style.EmojiSkintoneSelectorMedium, R.style.EmojiSkintoneSelectorMediumDark, R.style.EmojiSkintoneSelectorDark);
    private static final enhk n;
    private static final enip o;
    private static final int[][] p;
    private static final erml q;
    private static final String[][] r;
    public final AtomicReference a;
    public FrameLayout b;
    public LinearLayout c;
    public LinearLayout d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    private final duvq s;
    private View.OnClickListener t;
    private engw u;
    private int v;
    private final String w;
    private CharSequence x;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("🤝", erml.b(R.drawable.handshake_skintone_shadow, R.drawable.handshake_shadow_skintone));
        enhdVar.k("👭", erml.b(R.drawable.holding_women_skintone_shadow, R.drawable.holding_women_shadow_skintone));
        enhdVar.k("👫", erml.b(R.drawable.holding_woman_man_skintone_shadow, R.drawable.holding_woman_man_shadow_skintone));
        enhdVar.k("👬", erml.b(R.drawable.holding_men_skintone_shadow, R.drawable.holding_men_shadow_skintone));
        enhdVar.k("🧑\u200d🤝\u200d🧑", erml.b(R.drawable.holding_people_skintone_shadow, R.drawable.holding_people_shadow_skintone));
        enhdVar.k("💏", erml.b(R.drawable.kiss_people_skintone_shadow, R.drawable.kiss_people_shadow_skintone));
        enhdVar.k("👩\u200d❤️\u200d💋\u200d👨", erml.b(R.drawable.kiss_woman_man_skintone_shadow, R.drawable.kiss_woman_man_shadow_skintone));
        enhdVar.k("👨\u200d❤️\u200d💋\u200d👨", erml.b(R.drawable.kiss_men_skintone_shadow, R.drawable.kiss_men_shadow_skintone));
        enhdVar.k("👩\u200d❤️\u200d💋\u200d👩", erml.b(R.drawable.kiss_women_skintone_shadow, R.drawable.kiss_women_shadow_skintone));
        enhdVar.k("💑", erml.b(R.drawable.couple_heart_people_skintone_shadow, R.drawable.couple_heart_people_shadow_skintone));
        enhdVar.k("👩\u200d❤️\u200d👨", erml.b(R.drawable.couple_heart_woman_man_skintone_shadow, R.drawable.couple_heart_woman_man_shadow_skintone));
        enhdVar.k("👨\u200d❤️\u200d👨", erml.b(R.drawable.couple_heart_men_skintone_shadow, R.drawable.couple_heart_men_shadow_skintone));
        enhdVar.k("👩\u200d❤️\u200d👩", erml.b(R.drawable.couple_heart_women_skintone_shadow, R.drawable.couple_heart_women_shadow_skintone));
        n = enhdVar.c();
        o = new enpx("👪");
        p = new int[][]{new int[]{0, 2, 3, 4, 5, 6}, new int[]{0, 7, 8, 9, 10, 11}, new int[]{0, 12, 13, 14, 15, 16}, new int[]{0, 17, 18, 19, 20, 21}, new int[]{1, 22, 23, 24, 25, 26}};
        q = erml.c(R.string.emoji_skin_tone_light_content_desc, R.string.emoji_skin_tone_medium_light_content_desc, R.string.emoji_skin_tone_medium_content_desc, R.string.emoji_skin_tone_medium_dark_content_desc, R.string.emoji_skin_tone_dark_content_desc);
        r = new String[][]{new String[]{"light_shadow", "medium_light_shadow", "medium_shadow", "medium_dark_shadow", "dark_shadow"}, new String[]{"shadow_light", "shadow_medium_light", "shadow_medium", "shadow_medium_dark", "shadow_dark"}};
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a4, code lost:
    
        if (r18.i == r14) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dutn(android.content.Context r19, defpackage.engw r20, android.view.View.OnClickListener r21, int r22, int r23, float r24, defpackage.duvq r25, java.lang.CharSequence r26) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dutn.<init>(android.content.Context, engw, android.view.View$OnClickListener, int, int, float, duvq, java.lang.CharSequence):void");
    }

    private static int d(boolean z, int i, int i2) {
        return i2 == -1 ? R.string.emoji_skin_tone_shadow_content_desc : z ? i == 0 ? q.a(i2) : R.string.emoji_skin_tone_shadow_content_desc : i != 0 ? q.a(i2) : R.string.emoji_skin_tone_shadow_content_desc;
    }

    private final Drawable e(Context context, int i, int i2) {
        erml ermlVar = (erml) n.get(this.u.get(0));
        if (ermlVar == null) {
            return null;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, m.a(i2));
        Resources resources = getResources();
        int a = ermlVar.a(i);
        Resources.Theme theme = contextThemeWrapper.getTheme();
        WeakHashMap weakHashMap = kpp.a;
        return resources.getDrawable(a, theme);
    }

    private static String f(Context context, int i, int i2) {
        return context.getString(R.string.emoji_variant_content_desc_template, context.getString(d(true, i, i2)), context.getString(d(false, i, i2)));
    }

    private final void g(View view) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = (this.v * this.e) / 2;
        layoutParams.height = this.g;
        view.setLayoutParams(layoutParams);
    }

    private final void h(View view) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = this.v;
        layoutParams.height = this.g;
        view.setLayoutParams(layoutParams);
    }

    private final void i(EmojiView emojiView, String str) {
        emojiView.setClickable(true);
        duvp i = duvq.i();
        i.d(str);
        duvi duviVar = (duvi) this.s;
        i.b(duviVar.c);
        i.g(duviVar.b);
        i.c(duviVar.d);
        int i2 = engw.d;
        i.h(enou.a);
        i.e(true);
        duvh duvhVar = new duvh(i.a());
        CharSequence charSequence = this.x;
        duvhVar.f(charSequence != null && str.contentEquals(charSequence));
        emojiView.c(duvhVar.a());
        emojiView.setOnClickListener(this.t);
        if (this.a.get() == null) {
            ((enrr) ((enrr) l.e()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupView", "setupEmojiView", 599, "EmojiPickerPopupView.java")).t("The first EmojiView is: %s", emojiView);
            this.a.set(emojiView);
        }
    }

    private final void j(Context context, LinearLayout linearLayout, Drawable drawable, String str, ColorStateList colorStateList) {
        inflate(context, R.layout.emoji_picker_popup_image_view, linearLayout);
        ImageView imageView = (ImageView) linearLayout.getChildAt(1);
        g(imageView);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.emoji_popup_image_view_result_emoji_vertical_padding);
        imageView.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(str);
        imageView.setImageTintList(colorStateList);
    }

    private static void k(View view, float f) {
        float paddingStart = view.getPaddingStart();
        float paddingTop = view.getPaddingTop();
        float f2 = paddingTop * f;
        view.setPaddingRelative((int) (paddingStart * f), (int) f2, (int) (view.getPaddingEnd() * f), (int) (view.getPaddingBottom() * f));
    }

    private final boolean l() {
        return this.h != -1;
    }

    private final boolean m() {
        return this.i != -1;
    }

    public final int a() {
        return (this.e * this.v) + this.c.getPaddingStart() + this.c.getPaddingEnd() + this.b.getPaddingStart() + this.b.getPaddingEnd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, int i2, boolean z, LinearLayout linearLayout) {
        int i3;
        inflate(getContext(), R.layout.emoji_picker_popup_view, linearLayout);
        EmojiView emojiView = (EmojiView) linearLayout.getChildAt(i2);
        int i4 = i + i;
        if (z) {
            i3 = this.e;
        } else {
            i4++;
            i3 = this.e;
        }
        int i5 = (i4 * i3) + i2;
        if (i5 >= this.u.size()) {
            emojiView.setVisibility(4);
        } else {
            i(emojiView, (String) this.u.get(i5));
        }
        h(emojiView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        if (childCount <= 0 || childCount > 2) {
            ((enrr) ((enrr) l.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupView", "processResultEmojiForRectangleLayout", 421, "EmojiPickerPopupView.java")).q("processResultEmojiForRectangleLayout(): unexpected emoji result row size");
        }
        if (childCount == 2) {
            linearLayout.removeViewAt(1);
        }
        Context context = getContext();
        if (l() && m()) {
            inflate(context, R.layout.emoji_picker_popup_view, linearLayout);
            EmojiView emojiView = (EmojiView) linearLayout.getChildAt(1);
            g(emojiView);
            i(emojiView, (String) this.u.get((this.h * this.e) + this.i + 1));
            return;
        }
        if (l()) {
            j(context, linearLayout, e(context, 0, this.h), f(context, 0, this.h), null);
        } else {
            if (m()) {
                j(context, linearLayout, e(context, 1, this.i), f(context, 1, this.i), null);
                return;
            }
            Drawable e = e(context, 0, 0);
            int i = this.h;
            j(context, linearLayout, e, f(context, i, i), ColorStateList.valueOf(-7829368));
        }
    }
}
