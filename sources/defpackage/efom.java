package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efom extends ClickableSpan {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public efom(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        efou efouVar = new efou();
        String str = this.b;
        if (str == null) {
            str = "https://www.google.com/policies/terms/";
        }
        efoo.d(this.a, str);
        efpb efpbVar = efor.c;
        if (efor.c(fdul.b(efor.b))) {
            String str2 = this.c;
            Context context = this.a;
            efos a = efos.a();
            fabk fabkVar = (fabk) fabm.a.createBuilder();
            fabkVar.copyOnWrite();
            ((fabm) fabkVar.instance).b = 0;
            fabkVar.copyOnWrite();
            ((fabm) fabkVar.instance).c = fabl.a(5);
            a.d((fabm) fabkVar.build(), efouVar.b(), efouVar.a(), context, str2);
        }
    }
}
