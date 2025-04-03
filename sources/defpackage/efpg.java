package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efpg extends efsk {
    public efpg(fajr fajrVar) {
        this.a = fajrVar;
        this.b = 1;
    }

    @Override // defpackage.efsk
    public final ea a(Integer num, int i) {
        fajr fajrVar = this.a;
        efpi efpiVar = new efpi();
        efpiVar.at(efpi.a(fajrVar, num, i));
        return efpiVar;
    }
}
