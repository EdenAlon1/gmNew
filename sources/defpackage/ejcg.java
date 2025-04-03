package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejcg implements qud {
    final /* synthetic */ ejch a;

    public ejcg(ejch ejchVar) {
        this.a = ejchVar;
    }

    @Override // defpackage.qud
    public final Class a() {
        return Bitmap.class;
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.LOCAL;
    }

    @Override // defpackage.qud
    public final void g(qqe qqeVar, quc qucVar) {
        qucVar.c(BitmapFactory.decodeResource(this.a.a.getResources(), R.drawable.account_switcher_blue));
    }

    @Override // defpackage.qud
    public final void d() {
    }

    @Override // defpackage.qud
    public final void e() {
    }
}
