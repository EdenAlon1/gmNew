package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejk implements aema {
    private ImageView a;

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        this.a.setVisibility(aelyVar.b());
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.a = (ImageView) view.findViewById(R.id.conversation_notification_bell);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        return aelyVar2.b() != aelyVar.b();
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        aelxVar.j();
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }
}
