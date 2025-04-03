package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yis implements ffji {
    final /* synthetic */ ffrf a;
    final /* synthetic */ yja b;

    public yis(ffrf ffrfVar, yja yjaVar) {
        this.a = ffrfVar;
        this.b = yjaVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ajiy ajiyVar = (ajiy) obj;
        ajiyVar.getClass();
        this.a.d(new yio(ajiyVar));
        String string = this.b.b.getString(R.string.request_exact_alarm_permission);
        string.getClass();
        String string2 = this.b.b.getString(android.R.string.cancel);
        string2.getClass();
        doas doasVar = new doas(string2, new yip(this.a));
        String string3 = this.b.b.getString(android.R.string.ok);
        string3.getClass();
        return new dmve(string, null, null, null, false, false, new doas(string3, new yiq(this.a)), doasVar, new yir(this.a), 62);
    }
}
