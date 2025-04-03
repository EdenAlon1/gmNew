package defpackage;

import android.view.View;
import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dujg implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ dujl d;

    public dujg(dujl dujlVar, String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = dujlVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dujl dujlVar = this.d;
        SurveyPromptActivity.H(dujlVar.a.a(), this.a, dujlVar.f, dujlVar.g, dujlVar.e, Integer.valueOf(this.b), dujlVar.i, dujlVar.j, this.c);
        this.d.m = true;
        this.d.a.dismissAllowingStateLoss();
    }
}
