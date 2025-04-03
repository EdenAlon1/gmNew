package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.transferview.TransferView;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjgu extends cjgv {
    public final ViewGroup a;
    public final ffbz b;
    private final ImageView c;
    private final TextView d;
    private final TextView e;
    private final ImageView f;

    public cjgu(final View view) {
        View findViewById = view.findViewById(R.id.attachment_preview_container);
        findViewById.getClass();
        this.a = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.attachment_preview_thumbnail);
        findViewById2.getClass();
        this.c = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.attachment_preview_title);
        findViewById3.getClass();
        this.d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.attachment_preview_description);
        findViewById4.getClass();
        this.e = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.gallery_photos_logo);
        findViewById5.getClass();
        this.f = (ImageView) findViewById5;
        this.b = ffca.a(new ffix() { // from class: cjgt
            @Override // defpackage.ffix
            public final Object invoke() {
                return (TransferView) view.findViewById(R.id.transfer_view);
            }
        });
    }

    @Override // defpackage.cjgv
    public final ViewGroup a() {
        return this.a;
    }

    @Override // defpackage.cjgv
    public final ImageView b() {
        return this.f;
    }

    @Override // defpackage.cjgv
    public final ImageView c() {
        return this.c;
    }

    @Override // defpackage.cjgv
    public final TextView d() {
        return this.e;
    }

    @Override // defpackage.cjgv
    public final TextView e() {
        return this.d;
    }
}
