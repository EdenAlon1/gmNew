package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efpu extends efsk {
    public efpu(fajr fajrVar) {
        this.a = fajrVar;
        this.b = 2;
    }

    @Override // defpackage.efsk
    public final ea a(Integer num, int i) {
        fajr fajrVar = this.a;
        efpw efpwVar = new efpw();
        efpwVar.at(efpw.a(fajrVar, num, i));
        return efpwVar;
    }
}
