package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjgx {
    static final /* synthetic */ ffmx[] a;
    public final ViewGroup b;
    public final ffbz c;
    public final ffls d;
    private final ffbz e;

    static {
        ffko ffkoVar = new ffko(cjgx.class, "currentState", "getCurrentState()Lcom/google/android/apps/messaging/shared/photos/attachments/GooglePhotosAttachmentViewInflater$Binding;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
    }

    public cjgx(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.b = viewGroup;
        this.e = ffca.a(new ffix() { // from class: cjgq
            @Override // defpackage.ffix
            public final Object invoke() {
                ViewGroup viewGroup2 = cjgx.this.b;
                View inflate = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.attachment_compose_photos_link_share, viewGroup2, true);
                inflate.getClass();
                cjgu cjguVar = new cjgu(inflate);
                LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.google_photos_transfer_view, cjguVar.a, true);
                return cjguVar;
            }
        });
        this.c = ffca.a(new ffix() { // from class: cjgr
            @Override // defpackage.ffix
            public final Object invoke() {
                ViewGroup viewGroup2 = cjgx.this.b;
                View inflate = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.conversation_message_link_preview_container, viewGroup2, true);
                inflate.getClass();
                cjgs cjgsVar = new cjgs(inflate);
                cjgsVar.d.setImageDrawable(viewGroup2.getContext().getDrawable(R.drawable.product_logo_photos_color_24));
                Object parent = cjgsVar.b.getParent();
                parent.getClass();
                ((View) parent).setVisibility(0);
                cjgsVar.b.setVisibility(0);
                cjgsVar.c.setVisibility(8);
                cjgsVar.a.setBackground(viewGroup2.getContext().getDrawable(R.drawable.compose_attachment_preview_image_bg));
                ViewGroup viewGroup3 = cjgsVar.a;
                Context context = viewGroup2.getContext();
                context.getClass();
                Point c = dskj.c(context);
                viewGroup3.setMinimumWidth(Integer.valueOf(Math.max(c.x, c.y)).intValue());
                return cjgsVar;
            }
        });
        this.d = new cjgw();
    }

    public final cjgu a() {
        return (cjgu) this.e.a();
    }
}
