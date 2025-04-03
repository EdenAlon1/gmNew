package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eemk extends eemm {
    @Override // defpackage.eemm
    public final eeku b() {
        eekr eekrVar = new eekr();
        this.a.a(2090);
        this.a.h();
        this.a.a(58);
        this.a.h();
        String f = this.a.f();
        this.a.a(10);
        try {
            eekrVar.e(Integer.parseInt(f));
            return eekrVar;
        } catch (NumberFormatException unused) {
            throw f("bad integer format");
        }
    }
}
