package defpackage;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CategoryCustomizationActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcbf extends dcad {
    public final dbxy a;
    public final dcbb b;
    private final Set c;
    private ImageView d;
    private TextView m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dcbf(defpackage.dcbc r4) {
        /*
            r3 = this;
            eymn r0 = defpackage.eymn.CUSTOMIZATION
            dcav r4 = (defpackage.dcav) r4
            com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView r1 = r4.i
            int r2 = r4.h
            r3.<init>(r0, r1, r2)
            r0 = 131(0x83, float:1.84E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            enpx r1 = new enpx
            r1.<init>(r0)
            r3.c = r1
            dbxy r0 = r4.d
            r3.a = r0
            dcbb r4 = r4.f
            if (r4 == 0) goto L23
            r3.b = r4
            return
        L23:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CategoryOrganizer cannot be null!"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcbf.<init>(dcbc):void");
    }

    private final void k() {
        ImageView imageView = this.d;
        if (imageView == null || this.m == null) {
            return;
        }
        imageView.setColorFilter(this.k);
        this.m.setTextColor(this.k);
    }

    @Override // defpackage.dcae
    public final int a() {
        return R.dimen.customization_item_height;
    }

    @Override // defpackage.dcae
    public final int b() {
        return 0;
    }

    @Override // defpackage.dcae
    protected final int c() {
        return -1;
    }

    @Override // defpackage.dcae
    public final Set d() {
        return this.c;
    }

    @Override // defpackage.dcae
    public final void f(cxqz cxqzVar) {
        Intent intent;
        final CustomizationModel customizationModel;
        if (cxqzVar == null || (intent = cxqzVar.c) == null) {
            csjy.n("Bugle", "GalleryContentCategory: Full screen activity returned an empty intent");
        } else {
            if (cxqzVar.a != 131 || (customizationModel = (CustomizationModel) intent.getParcelableExtra("customization_model")) == null) {
                return;
            }
            cslq.f(new Runnable() { // from class: dcbe
                @Override // java.lang.Runnable
                public final void run() {
                    dcbf.this.b.D(customizationModel);
                }
            });
        }
    }

    @Override // defpackage.dcad, defpackage.dcae
    public final void gB(View view) {
        super.gB(view);
        View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.compose2o_customization_category_view, (ViewGroup) this.e, false);
        inflate.findViewById(R.id.compose2o_customization_button).setOnClickListener(new View.OnClickListener() { // from class: dcbd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dbxy dbxyVar = dcbf.this.a;
                eptm eptmVar = eptm.EXPAND;
                dbxp dbxpVar = (dbxp) dbxyVar;
                Intent intent = new Intent(dbxpVar.w.G(), (Class<?>) CategoryCustomizationActivity.class);
                intent.putExtra("customization_model", dbxpVar.v);
                dbxpVar.i(intent, 131, eptmVar);
            }
        });
        this.d = (ImageView) inflate.findViewById(R.id.compose2o_customization_button_icon);
        this.m = (TextView) inflate.findViewById(R.id.compose2o_customization_button_text);
        k();
        this.e.removeAllViews();
        this.e.addView(inflate);
    }

    @Override // defpackage.dcae
    public final boolean m() {
        return false;
    }

    @Override // defpackage.dcae
    public final void x(int i) {
        this.k = i;
        k();
    }

    @Override // defpackage.dcat
    public final void j() {
    }
}
