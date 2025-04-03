package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aepr implements aepn {
    public final aepp a;
    public final FrameLayout b;
    public List c = ffel.a;
    private final ffbz d;

    public aepr(aepp aeppVar, final ffbr ffbrVar) {
        this.a = aeppVar;
        LayoutInflater.from(aeppVar.getContext()).inflate(R.layout.attachment_preview_m2, (ViewGroup) aeppVar, true);
        this.b = (FrameLayout) aeppVar.findViewById(R.id.attachment_view);
        View findViewById = aeppVar.findViewById(R.id.close_button);
        findViewById.getClass();
        ((ImageButton) findViewById).setImageResource(R.drawable.remove_attachment_element_gm3);
        this.d = ffca.a(new ffix() { // from class: aepq
            @Override // defpackage.ffix
            public final Object invoke() {
                return ((cjgp) ffbr.this.b()).a(new cjgx(this.b));
            }
        });
    }

    @Override // defpackage.aepn
    public final void a(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Cannot update appearance with no Google Photos attachments");
        }
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        engw engwVar = (engw) list;
        enqv it = engwVar.iterator();
        while (it.hasNext()) {
            Uri t = ((MessagePartCoreData) it.next()).t();
            t.getClass();
            arrayList.add(t);
        }
        this.c = arrayList;
        cjgo cjgoVar = (cjgo) this.d.a();
        Context context = cjgoVar.b.b.getContext();
        context.getClass();
        List b = cjgo.b(list);
        ArrayList arrayList2 = new ArrayList();
        enqv it2 = engwVar.iterator();
        while (it2.hasNext()) {
            drso L = ((MessagePartCoreData) it2.next()).L();
            if (L != null) {
                arrayList2.add(L);
            }
        }
        cjgoVar.a(new cjgy(context, b, arrayList2));
    }
}
