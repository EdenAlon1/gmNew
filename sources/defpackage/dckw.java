package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dckw extends vk {
    private final dckt e;
    private final ekms f;
    public int d = 2;
    public final List a = new ArrayList();

    public dckw(Context context, dckt dcktVar) {
        this.f = ekmq.a(context.getApplicationContext()).b().q(rig.e());
        this.e = dcktVar;
    }

    @Override // defpackage.vk
    public final int a() {
        int i = this.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return 2;
        }
        if (i2 != 2) {
            return this.a.size() + 1;
        }
        return 1;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        int i2;
        int i3 = this.d;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 != 0) {
            i2 = 2;
            if (i4 == 2) {
                return 4;
            }
        } else {
            i2 = 3;
        }
        if (i == 0) {
            return 1;
        }
        return i2;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new dckv(from.inflate(R.layout.location_attachment_picker_nearby_list_header_m2, viewGroup, false));
        }
        if (i == 2) {
            return new dckv(from.inflate(R.layout.location_attachment_picker_nearby_list_item_m2, viewGroup, false));
        }
        if (i == 3) {
            return new dckv(from.inflate(R.layout.location_attachment_picker_progress_bar, viewGroup, false));
        }
        if (i != 4) {
            return null;
        }
        return new dckv(from.inflate(R.layout.location_attachment_picker_nearby_places_error_m2, viewGroup, false));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        int i2;
        dckv dckvVar = (dckv) wrVar;
        if (dE(i) == 2 && i - 1 >= 0) {
            final cazn caznVar = (cazn) this.a.get(i2);
            final dckt dcktVar = this.e;
            ekms ekmsVar = this.f;
            dckvVar.s.setText(caznVar.b());
            dckvVar.t.setText(caznVar.a());
            dckvVar.u.setText(dckvVar.a.getContext().getString(R.string.location_attachment_picker_nearby_distance, 0));
            dckvVar.a.setOnClickListener(new View.OnClickListener() { // from class: dcku
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = dckv.w;
                    dckt.this.d(caznVar);
                }
            });
            dckvVar.v.setImageResource(R.drawable.location_attachment_picker_nearby_icon_default_m2);
            if (caznVar.d) {
                Bitmap bitmap = caznVar.c;
                if (bitmap != null) {
                    ekmsVar.g(bitmap).q(rig.b()).v(dckvVar.v);
                    return;
                }
                return;
            }
            caznVar.d = true;
            int dimensionPixelSize = dckvVar.a.getResources().getDimensionPixelSize(R.dimen.location_attachment_picker_nearby_image_size);
            String b = emxe.b(caznVar.b.ac());
            ahoz ahozVar = dcktVar.c;
            synchronized (ahozVar.d) {
                ahozVar.j.add(new ahou(ahozVar, b, dimensionPixelSize, dimensionPixelSize, i));
            }
        }
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return i;
    }
}
