package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzhh implements View.OnClickListener {
    final /* synthetic */ emxc a;
    final /* synthetic */ dzhi b;

    public dzhh(dzhi dzhiVar, emxc emxcVar) {
        this.a = emxcVar;
        this.b = dzhiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        Object c = this.a.c();
        Intent intent = new Intent("android.intent.action.VIEW");
        String str = ((dzgz) c).f;
        String[] strArr = dyhv.a;
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = false;
                break;
            }
            String str2 = strArr[i];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                z = true;
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    str = String.valueOf(str2).concat(String.valueOf(str.substring(str2.length())));
                }
            } else {
                i++;
            }
        }
        if (!z) {
            str = String.valueOf(dyhv.a[0]).concat(String.valueOf(str));
        }
        dzhi dzhiVar = this.b;
        intent.setData(Uri.parse(str));
        ((Activity) dzhiVar.getContext()).startActivity(intent);
    }
}
