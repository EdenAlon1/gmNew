package defpackage;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.banner.HomeBannerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aefn {
    public final elbx a;
    public final ejlq b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final Button f;
    public final Button g;

    public aefn(elbx elbxVar, ejlq ejlqVar, HomeBannerView homeBannerView) {
        this.a = elbxVar;
        this.b = ejlqVar;
        this.c = (ImageView) homeBannerView.findViewById(R.id.banner_icon);
        this.d = (TextView) homeBannerView.findViewById(R.id.banner_title);
        this.e = (TextView) homeBannerView.findViewById(R.id.banner_body);
        this.f = (Button) homeBannerView.findViewById(R.id.banner_positive_button);
        this.g = (Button) homeBannerView.findViewById(R.id.banner_negative_button);
    }
}
