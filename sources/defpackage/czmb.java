package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czmb implements czlz {
    public final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public czmb(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.a = ffbrVar3;
    }

    @Override // defpackage.czlz
    public final void a(CharSequence charSequence, ImageView imageView, Drawable drawable, ffix ffixVar, czmi czmiVar) {
        ImageView imageView2;
        charSequence.getClass();
        czmiVar.getClass();
        if (ffkj.e(charSequence, imageView.getTag(R.id.message_animated_emoji_view))) {
            return;
        }
        String b = ((czmd) this.c.b()).b(charSequence);
        if (b == null) {
            ffixVar.invoke();
            return;
        }
        emhu emhuVar = (emhu) emhv.a.createBuilder();
        emhw emhwVar = (emhw) emhx.a.createBuilder();
        emhwVar.copyOnWrite();
        emhx emhxVar = (emhx) emhwVar.instance;
        emhxVar.b |= 2;
        emhxVar.d = "animated_emoji";
        emhwVar.copyOnWrite();
        emhx emhxVar2 = (emhx) emhwVar.instance;
        emhxVar2.b |= 1;
        emhxVar2.c = b;
        emhuVar.copyOnWrite();
        emhv emhvVar = (emhv) emhuVar.instance;
        emhx emhxVar3 = (emhx) emhwVar.build();
        emhxVar3.getClass();
        emhvVar.c = emhxVar3;
        emhvVar.b |= 1;
        eyfy build = emhuVar.build();
        build.getClass();
        qqo f = ((qqo) ((ekmz) this.b.b()).a(qci.class).k((emhv) build).S(drawable)).f(new czma(ffixVar, imageView, charSequence, czmiVar, this));
        crkl crklVar = new crkl();
        crklVar.a = imageView;
        crklVar.b(0);
        crklVar.a(false);
        crklVar.b(-1);
        crklVar.a(true);
        if (crklVar.d == 3 && (imageView2 = crklVar.a) != null) {
            f.w(new crko(imageView2, crklVar.b, crklVar.c));
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (crklVar.a == null) {
            sb.append(" imageView");
        }
        if ((crklVar.d & 1) == 0) {
            sb.append(" repeatCount");
        }
        if ((crklVar.d & 2) == 0) {
            sb.append(" playAnimation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
