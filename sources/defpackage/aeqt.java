package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeqt implements View.OnClickListener {
    final /* synthetic */ aeqk a;
    final /* synthetic */ aerc b;

    public aeqt(aeqk aeqkVar, aerc aercVar) {
        this.a = aeqkVar;
        this.b = aercVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d(aers.a);
        cfva cfvaVar = cjja.a;
        Uri parse = Uri.parse((String) cjja.e.e());
        aerc aercVar = this.b;
        Context A = aercVar.c.A();
        akvg akvgVar = (akvg) aercVar.e.b();
        ddzb ddzbVar = (ddzb) aercVar.f.a.b();
        ddzbVar.getClass();
        akvgVar.getClass();
        dedf.a(parse, ddzbVar, A, akvgVar, A.getPackageManager());
    }
}
