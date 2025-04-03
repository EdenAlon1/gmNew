package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjd extends vk {
    public engw a;
    private final vin d;

    public vjd(vin vinVar) {
        this.d = vinVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reaction_instance, viewGroup, false);
        vin vinVar = this.d;
        cuxh cuxhVar = (cuxh) vinVar.a.b();
        cuxhVar.getClass();
        ekmz ekmzVar = (ekmz) vinVar.b.b();
        ekmzVar.getClass();
        inflate.getClass();
        return new vim(cuxhVar, ekmzVar, inflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        vim vimVar = (vim) wrVar;
        vji vjiVar = (vji) this.a.get(i);
        vjg vjgVar = vjiVar.a;
        String str = vjgVar.c;
        ((qqo) vimVar.t.e(Uri.parse(vjgVar.d)).A()).v(vimVar.v);
        vimVar.w.setText(vimVar.s.c(str));
        cmrl cmrlVar = vjiVar.a.e;
        if (cmrlVar == null) {
            cmrlVar = cmrl.a;
        }
        String str2 = cmrlVar.d;
        vimVar.y.setText(str2);
        if (!TextUtils.isEmpty(str)) {
            vimVar.a.setContentDescription(vimVar.u.getString(R.string.reaction_instance_content_description, str, str2));
        }
        if (vjiVar.a.f) {
            vimVar.x.setVisibility(0);
        } else {
            vimVar.x.setVisibility(8);
        }
    }
}
