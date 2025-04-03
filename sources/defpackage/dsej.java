package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsej extends wr {
    public static final /* synthetic */ int y = 0;
    public final View s;
    public final TextView t;
    public final TextView u;
    public final View v;
    public final ImageView w;
    final /* synthetic */ dsek x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsej(dsek dsekVar, View view) {
        super(view);
        this.x = dsekVar;
        this.s = view;
        View findViewById = view.findViewById(R.id.sticker_pack_title_label);
        findViewById.getClass();
        this.t = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.sticker_pack_artist_label);
        findViewById2.getClass();
        this.u = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.back_button);
        findViewById3.getClass();
        this.v = findViewById3;
        View findViewById4 = view.findViewById(R.id.favorite_button);
        findViewById4.getClass();
        this.w = (ImageView) findViewById4;
    }

    public final void C(View view) {
        dscj dscjVar = this.x.f;
        if (dscjVar == null) {
            ffkj.c("stickerPack");
            dscjVar = null;
        }
        if (dscjVar.f) {
            this.w.setImageResource(R.drawable.quantum_gm_ic_favorite_vd_theme_24);
            this.w.setContentDescription(view.getResources().getString(R.string.sticker_pack_favorite_button_remove_content_description));
            this.w.setSelected(true);
        } else {
            this.w.setImageResource(R.drawable.quantum_gm_ic_favorite_border_vd_theme_24);
            this.w.setSelected(false);
            this.w.setContentDescription(view.getResources().getString(R.string.sticker_pack_favorite_button_add_content_description));
        }
    }
}
