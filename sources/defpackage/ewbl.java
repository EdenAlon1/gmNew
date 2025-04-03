package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewbl implements dgtx {
    final /* synthetic */ Context a;
    final /* synthetic */ ewbg b;
    final /* synthetic */ ewdr c;
    final /* synthetic */ String d;
    final /* synthetic */ dgtx e;
    final /* synthetic */ ewbr f;
    final /* synthetic */ int g;

    public ewbl(ewbr ewbrVar, Context context, ewbg ewbgVar, int i, ewdr ewdrVar, String str, dgtx dgtxVar) {
        this.a = context;
        this.b = ewbgVar;
        this.g = i;
        this.c = ewdrVar;
        this.d = str;
        this.e = dgtxVar;
        this.f = ewbrVar;
    }

    @Override // defpackage.dgtx
    public final void a(int i, String str) {
        this.e.a(i, str);
    }

    @Override // defpackage.dgtx
    public final void b(dgtt dgttVar) {
        ewdn ewdnVar = this.c.b;
        if (ewdnVar == null) {
            ewdnVar = ewdn.a;
        }
        ewdi ewdiVar = (ewdnVar.b == 4 ? (ewdf) ewdnVar.c : ewdf.a).c;
        if (ewdiVar == null) {
            ewdiVar = ewdi.a;
        }
        ewdi ewdiVar2 = ewdiVar;
        ewbr ewbrVar = this.f;
        int i = this.g;
        this.e.b(new ewbp(this.a, ewbrVar.b, this.b, dgttVar, i, ewdiVar2, this.d, this.c));
    }
}
