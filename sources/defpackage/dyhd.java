package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhd extends FrameLayout implements dzxm {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final CardView d;
    public final RecyclerView e;

    static {
        dyia.b();
        new Handler(Looper.getMainLooper());
    }

    public dyhd(Context context) {
        super(context, null, 0);
        inflate(getContext(), R.layout.attachment_previews_layout, this);
        this.a = (ImageView) findViewById(R.id.card_view_attachment_image);
        this.b = (TextView) findViewById(R.id.card_view_attachment_title);
        this.c = (TextView) findViewById(R.id.card_view_attachment_subtitle);
        this.d = (CardView) findViewById(R.id.card_view_attachment);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.previews_recycler_view);
        this.e = recyclerView;
        getContext();
        recyclerView.ap(new LinearLayoutManager(0));
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }
}
