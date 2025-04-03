package defpackage;

import android.util.Log;
import com.google.android.libraries.hats20.SurveyPromptActivity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dujj implements dulh {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ dujl d;

    public dujj(dujl dujlVar, String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = dujlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dulh
    public final void a(int i) {
        dujl dujlVar = this.d;
        dujlVar.l = Integer.toString(i);
        dujlVar.k.b();
        evps evpsVar = (evps) evpt.a.createBuilder();
        dujl dujlVar2 = this.d;
        if (dujlVar2.k.e()) {
            long a = dujlVar2.k.a();
            evpsVar.copyOnWrite();
            evpt evptVar = (evpt) evpsVar.instance;
            evptVar.b |= 2;
            evptVar.e = a;
            boolean d = dujlVar2.k.d();
            evpsVar.copyOnWrite();
            evpt evptVar2 = (evpt) evpsVar.instance;
            evptVar2.b |= 1;
            evptVar2.c = d;
            String str = dujlVar2.l;
            if (str != null) {
                evpsVar.a(str);
                Log.d("HatsLibSurveyActivity", "Selected response: ".concat(String.valueOf(dujlVar2.l)));
            }
        }
        evpt evptVar3 = (evpt) evpsVar.build();
        if (evptVar3 != null) {
            dujlVar2.e.d(0, evptVar3, (euka) dujlVar2.g.b.get(0));
            List list = dujlVar2.e.b;
            if (dujv.b(0, evptVar3.e)) {
                evps evpsVar2 = (evps) evptVar3.toBuilder();
                evpsVar2.copyOnWrite();
                evpt.a((evpt) evpsVar2.instance);
                evptVar3 = (evpt) evpsVar2.build();
            }
            list.add(evptVar3);
        }
        dujl dujlVar3 = this.d;
        SurveyPromptActivity.H(dujlVar3.a.a(), this.a, dujlVar3.f, dujlVar3.g, dujlVar3.e, Integer.valueOf(this.b), dujlVar3.i, dujlVar3.j, this.c);
        this.d.m = true;
        this.d.a.dismissAllowingStateLoss();
    }
}
