package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sje implements ffji {
    final /* synthetic */ sjn a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ ffrf e;

    public sje(sjn sjnVar, int i, int i2, int i3, ffrf ffrfVar) {
        this.a = sjnVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = ffrfVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((ajiy) obj).getClass();
        Context context = this.a.b;
        String string = context.getString(this.b);
        String string2 = context.getString(this.c);
        string2.getClass();
        String string3 = this.a.b.getString(this.d);
        string3.getClass();
        return new dmve(string2, null, null, string, false, false, new doas(string3, new sjc(this.e)), null, new sjd(this.e), 182);
    }
}
