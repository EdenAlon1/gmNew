package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxx {
    private final ffbr a;

    public dcxx(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public static Spannable a(String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int lastIndexOf = str.lastIndexOf(str2);
        spannableStringBuilder.setSpan(new URLSpan(str3), lastIndexOf, str2.length() + lastIndexOf, 17);
        return spannableStringBuilder;
    }

    public static Spannable b(Context context) {
        String a = crmi.a(context);
        return a(context.getString(R.string.google_tos_multisim_tooltip_text_v2, a), a, context.getString(R.string.learn_more_url, ctid.c(context).getLanguage()));
    }

    public static void d(Context context, View view, Spannable spannable, int i) {
        if (view.getRootView().findViewById(R.id.google_tos_tooltip_popup_window) != null) {
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.google_tos_tooltip_popup_window_view, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.google_tos_tooltip_text);
        textView.setText(spannable);
        egyl.b(textView);
        egyl.c(textView);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(Math.min(context.getResources().getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth), context.getResources().getDisplayMetrics().widthPixels), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(Math.max(view.getTop() - i, context.getResources().getDimensionPixelSize(R.dimen.tooltip_min_height)), context.getResources().getDisplayMetrics().heightPixels), Integer.MIN_VALUE));
        int measuredWidth = inflate.getMeasuredWidth();
        int measuredHeight = inflate.getMeasuredHeight();
        PopupWindow popupWindow = new PopupWindow(inflate);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(false);
        popupWindow.setWidth(measuredWidth);
        popupWindow.setHeight(measuredHeight);
        popupWindow.showAsDropDown(view, (view.getMeasuredWidth() - measuredWidth) / 2, Math.max(-(view.getMeasuredHeight() + measuredHeight + i), -(view.getMeasuredHeight() + ((int) view.getY()))));
    }

    public static final void e(final Context context, final TextView textView) {
        textView.setOnClickListener(new View.OnClickListener() { // from class: dcxv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Context context2 = context;
                dcxx.d(context2, textView, dcxx.b(context2), context2.getResources().getDimensionPixelSize(R.dimen.multisim_tooltip_bottom_margin));
            }
        });
        Drawable drawable = context.getResources().getDrawable(R.drawable.quantum_gm_ic_info_black_24);
        drawable.setTint(crlu.a(context, R.attr.colorOnSurfaceVariant));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        kvo.p(textView, new dcxw(context));
    }

    public final void c(Context context, TextView textView) {
        ctwi k = ((ctwb) this.a.b()).k();
        int d = k.d() + 1;
        textView.setText(context.getResources().getString(R.string.google_tos_multisim_text, Integer.valueOf(d), k.r()));
        e(context, textView);
    }
}
