package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.avatar.ContactAvatarView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaec extends LinearLayout implements eadx {
    public int a;
    public final TextView b;
    final Animatable c;
    final pbt d;
    private final List e;
    private final RelativeLayout f;
    private final LinearLayout g;

    public eaec(Context context) {
        super(dzyd.a(context, fdql.i()), null, 0);
        this.e = new ArrayList(5);
        this.a = 5;
        inflate(getContext(), R.layout.typing_indicator_view, this);
        this.g = (LinearLayout) findViewById(R.id.typers);
        this.c = (Animatable) ((ImageView) findViewById(R.id.typing_dots)).getDrawable();
        this.f = (RelativeLayout) findViewById(R.id.typing_indicator_contents);
        TextView textView = (TextView) findViewById(R.id.additional_typers);
        this.b = textView;
        textView.setVisibility(8);
        this.d = new eaeb(this);
    }

    private final void c() {
        this.c.stop();
        pby.a((Drawable) this.c, this.d);
        this.c.start();
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    @Override // defpackage.eadx
    public final void b(List list) {
        if (list.size() > this.a) {
            this.b.setVisibility(0);
            this.g.setVisibility(8);
            c();
        } else {
            if (list.isEmpty()) {
                Object obj = this.c;
                pbt pbtVar = this.d;
                Drawable drawable = (Drawable) obj;
                if (drawable == null || pbtVar == null || !(drawable instanceof Animatable)) {
                    return;
                }
                pby.c((AnimatedVectorDrawable) drawable, pbtVar);
                return;
            }
            this.g.setVisibility(0);
            this.b.setVisibility(8);
            c();
        }
        int size = this.e.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (!list.contains(this.e.get(size)) && this.e.get(size) != null) {
                this.e.remove(size);
                this.g.removeViewAt(size);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            dzpb dzpbVar = (dzpb) list.get(i);
            if (!this.e.contains(dzpbVar)) {
                this.e.add(dzpbVar);
                ContactAvatarView contactAvatarView = new ContactAvatarView(getContext());
                contactAvatarView.b(dzpbVar);
                int dimension = (int) getContext().getResources().getDimension(R.dimen.avatar_size);
                contactAvatarView.d = dimension;
                Bitmap bitmap = contactAvatarView.e;
                if (bitmap != null) {
                    contactAvatarView.a.setImageBitmap(Bitmap.createScaledBitmap(bitmap, dimension, dimension, false));
                }
                contactAvatarView.setImportantForAccessibility(2);
                contactAvatarView.setFocusable(false);
                contactAvatarView.setPadding(0, 0, (int) getContext().getResources().getDimension(R.dimen.avatar_padding), 0);
                this.g.addView(contactAvatarView);
            }
        }
        int size2 = list.size();
        this.f.setContentDescription((list.size() == 1 && ((dzpb) list.get(0)).i().g()) ? getContext().getString(R.string.user_typing_message, ((dzpb) list.get(0)).i().c()) : getResources().getQuantityString(R.plurals.number_of_users_typing_message, size2, Integer.valueOf(size2)));
    }
}
