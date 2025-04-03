package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsen extends wr {
    public static final /* synthetic */ int x = 0;
    public final View s;
    public final ImageView t;
    public final TextView u;
    public final View v;
    final /* synthetic */ dseo w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsen(dseo dseoVar, View view) {
        super(view);
        this.w = dseoVar;
        this.s = view;
        View findViewById = view.findViewById(R.id.sticker_pack_thumbnail);
        findViewById.getClass();
        this.t = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.sticker_pack_label);
        findViewById2.getClass();
        this.u = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.sticker_pack_favorite_indicator);
        findViewById3.getClass();
        this.v = findViewById3;
    }
}
