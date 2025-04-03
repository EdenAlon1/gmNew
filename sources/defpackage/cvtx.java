package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvtx implements ffxy {
    final /* synthetic */ cvsj a;
    final /* synthetic */ Context b;
    final /* synthetic */ View c;
    final /* synthetic */ jdt d;

    public cvtx(cvsj cvsjVar, jdt jdtVar, Context context, View view) {
        this.a = cvsjVar;
        this.d = jdtVar;
        this.b = context;
        this.c = view;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        this.a.h.invoke(bool);
        if (booleanValue && this.a.k.b) {
            jdt jdtVar = this.d;
            Context context = this.b;
            View view = this.c;
            if (jdtVar != null) {
                jdtVar.a();
            }
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
        return ffcu.a;
    }
}
