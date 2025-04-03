package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eest extends wr {
    final ImageView s;
    final TextView t;
    final TextView u;
    final ImageButton v;
    final ImageButton w;
    public boolean x;
    final /* synthetic */ eesu y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eest(eesu eesuVar, View view) {
        super(view);
        this.y = eesuVar;
        this.s = (ImageView) view.findViewById(R.id.pack_icon);
        TextView textView = (TextView) view.findViewById(R.id.pack_name);
        this.t = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.pack_author);
        this.u = textView2;
        this.v = (ImageButton) view.findViewById(R.id.favorite_pack_icon);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.ordering_icon);
        this.w = imageButton;
        if (eesuVar.d.G()) {
            Context context = view.getContext();
            textView.setTextColor(context.getColor(R.color.white));
            textView2.setTextColor(context.getColor(R.color.sticker_pack_author_color_dark_mode));
            imageButton.setColorFilter(context.getColor(R.color.white));
        }
    }

    public final void C() {
        Context context = this.a.getContext();
        if (this.x) {
            int color = context.getColor(true != this.y.d.G() ? R.color.favorite_enabled_color : R.color.favorite_enabled_color_dark_mode);
            this.v.setImageResource(R.drawable.quantum_ic_favorite_white_24);
            this.v.setColorFilter(color);
            this.v.setContentDescription(context.getString(R.string.cd_sticker_favorite_on_icon));
            return;
        }
        int color2 = context.getColor(true != this.y.d.G() ? R.color.favorite_disabled_color : R.color.favorite_disabled_color_dark_mode);
        this.v.setImageResource(R.drawable.quantum_ic_favorite_border_white_24);
        this.v.setColorFilter(color2);
        this.v.setContentDescription(context.getString(R.string.cd_sticker_favorite_off_icon));
    }
}
