package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efol extends ClickableSpan {
    final /* synthetic */ String a;
    final /* synthetic */ Activity b;
    final /* synthetic */ String c;

    public efol(String str, Activity activity, String str2) {
        this.a = str;
        this.b = activity;
        this.c = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        efou efouVar = new efou();
        String str = this.a;
        if (str != null) {
            efoo.d(this.b, str);
        } else {
            try {
                Activity activity = this.b;
                String str2 = this.c;
                activity.getClass();
                if (str2 != null && !str2.isEmpty()) {
                    Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", str2).putExtra("extra.screenId", 500);
                    if (putExtra.resolveActivity(activity.getPackageManager()) == null) {
                        edtq.a(activity);
                    } else {
                        activity.startActivityForResult(putExtra, 0);
                    }
                }
                edtq.a(activity);
            } catch (edtp e) {
                Log.e("ResourceUtils", "No app found to open URL: ".concat(String.valueOf(e.a)));
            }
        }
        Activity activity2 = this.b;
        String str3 = this.c;
        efpb efpbVar = efor.c;
        if (efor.c(fdul.b(efor.b))) {
            efos a = efos.a();
            fabk fabkVar = (fabk) fabm.a.createBuilder();
            fabkVar.copyOnWrite();
            ((fabm) fabkVar.instance).b = 0;
            fabkVar.copyOnWrite();
            ((fabm) fabkVar.instance).c = fabl.a(4);
            a.d((fabm) fabkVar.build(), efouVar.b(), efouVar.a(), activity2, str3);
        }
    }
}
