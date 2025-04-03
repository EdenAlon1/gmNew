package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.View;
import android.widget.TableLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egmg extends egmi {
    public egrf a;
    public egaj b;
    public dvyc c;
    public dvxi d;
    public egjk e;
    public egmo f;
    public MaterialTextView g;
    public egnm h;

    public egmg(Context context) {
        super(context);
        setOrientation(1);
        if (!this.i) {
            Object context2 = getContext();
            while (!(context2 instanceof fazf) && (context2 instanceof ContextWrapper)) {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            ((fazf) context2).ab().a(this);
        }
        inflate(getContext(), true != fdrm.l() ? R.layout.photo_picker_google_photos_section : R.layout.photo_picker_google_photos_section_art_style, this);
        this.g = (MaterialTextView) findViewById(R.id.photo_picker_suggested_section_title);
        this.f = new egmo((TableLayout) findViewById(R.id.photo_picker_suggested_photos_grid), getContext().getResources().getInteger(R.integer.photo_picker_num_columns));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List a(engw engwVar) {
        ArrayList arrayList = new ArrayList();
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            ewlp ewlpVar = (ewlp) engwVar.get(i);
            if ((ewlpVar.b & 1) != 0) {
                final SquareImageView a = fdrm.l() ? SquareImageView.a(getContext()) : new SquareImageView(getContext());
                if ((ewlpVar.b & 8) != 0) {
                    Context context = getContext();
                    eyja eyjaVar = ewlpVar.f;
                    if (eyjaVar == null) {
                        eyjaVar = eyja.a;
                    }
                    a.setContentDescription(context.getString(R.string.op3_picker_accessibility_photo, efzu.a(eyjaVar)));
                }
                final Uri a2 = egai.a(ewlpVar);
                egaj egajVar = this.b;
                egal egalVar = new egal();
                egalVar.a();
                egajVar.g(a2, egalVar, a);
                this.c.b.a(89756).b(a);
                a.setOnClickListener(new View.OnClickListener() { // from class: egmf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        egmg egmgVar = egmg.this;
                        egmgVar.d.a(dvxh.e(), a);
                        egmgVar.e.c = 9;
                        egmgVar.a.m(a2);
                    }
                });
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public final void b(int i) {
        this.c.b.a(i).b(this);
    }

    public final void c(int i) {
        this.g.setText(getContext().getString(i));
    }
}
