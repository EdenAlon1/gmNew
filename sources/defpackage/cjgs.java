package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjgs extends cjgv {
    public final ViewGroup a;
    public final ImageView b;
    public final TextView c;
    public final ImageView d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;

    public cjgs(View view) {
        View findViewById = view.findViewById(R.id.link_preview_content_container);
        findViewById.getClass();
        this.a = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.thumbnail_image);
        findViewById2.getClass();
        this.b = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.link_preview_title);
        findViewById3.getClass();
        this.e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.link_preview_domain);
        findViewById4.getClass();
        this.f = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.link_preview_icon);
        findViewById5.getClass();
        this.g = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.link_preview_description);
        findViewById6.getClass();
        this.c = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.link_preview_icon);
        findViewById7.getClass();
        this.d = (ImageView) findViewById7;
    }

    @Override // defpackage.cjgv
    public final ViewGroup a() {
        return this.a;
    }

    @Override // defpackage.cjgv
    public final ImageView b() {
        return this.g;
    }

    @Override // defpackage.cjgv
    public final ImageView c() {
        return this.b;
    }

    @Override // defpackage.cjgv
    public final TextView d() {
        return this.f;
    }

    @Override // defpackage.cjgv
    public final TextView e() {
        return this.e;
    }
}
