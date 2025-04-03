package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aktm implements aema {
    private final Context a;
    private int b;
    private TextView c;
    private ImageView d;
    private crly e;
    private crly f;

    public aktm(Context context) {
        this.a = context;
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        if (aelyVar.Y()) {
            return;
        }
        if (TextUtils.isEmpty(aelyVar.I())) {
            if ((!ctjd.f() || !aelyVar.W()) && (!stl.a() || !aelyVar.U())) {
                this.e.g(8);
            }
            this.f.g(8);
            return;
        }
        this.e.g(0);
        TextView textView = (TextView) this.e.b();
        this.c = textView;
        if (textView != null) {
            String I = aelyVar.I();
            I.getClass();
            textView.setText(I);
            TextView textView2 = this.c;
            Integer w = aelyVar.w();
            w.getClass();
            w.intValue();
            textView2.setTextColor(ehdr.b(textView2, R.attr.colorOnSurfaceVariant));
        }
        boolean z2 = (aelyVar.T() || this.c == null) ? false : true;
        this.f.g(true == z2 ? 0 : 8);
        if (z2) {
            Context context = this.a;
            Integer u = aelyVar.u();
            u.getClass();
            u.intValue();
            Drawable drawable = context.getDrawable(R.drawable.gs_schedule_send_vd_theme_24);
            drawable.getClass();
            drawable.setAutoMirrored(true);
            ImageView imageView = (ImageView) this.f.b();
            this.d = imageView;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                ImageView imageView2 = this.d;
                Integer v = aelyVar.v();
                v.getClass();
                v.intValue();
                imageView2.setColorFilter(ehdr.b(imageView2, R.attr.colorOnSurfaceVariant));
            }
        }
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.e = new crly(view, R.id.additional_text, R.id.additional_text, R.layout.additional_text_view);
        this.f = new crly(view, R.id.additional_info_icon, R.id.additional_info_icon, R.layout.additional_info_icon);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        return (aelyVar.T() == aelyVar2.T() && TextUtils.equals(aelyVar.I(), aelyVar2.I())) ? false : true;
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        String ak = aekiVar.ak("scheduled_messages_count");
        this.b = ak == null ? 0 : Integer.parseInt(ak);
        if (!((Boolean) cnvu.a.e()).booleanValue() || this.b <= 0) {
            return;
        }
        aelu aeluVar = (aelu) aelxVar;
        aeluVar.x = this.a.getResources().getQuantityString(R.plurals.scheduled_message, this.b);
        aeluVar.y = Integer.valueOf(R.drawable.gs_schedule_send_vd_theme_24);
        Integer valueOf = Integer.valueOf(R.attr.colorOnSurfaceVariant);
        aeluVar.z = valueOf;
        aeluVar.A = valueOf;
    }

    @Override // defpackage.aema
    public final aely a(aely aelyVar) {
        return aelyVar;
    }
}
