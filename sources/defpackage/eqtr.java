package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqtr {
    public final epqs a;

    public eqtr(epqs epqsVar) {
        this.a = epqsVar;
    }

    public final /* synthetic */ eprl a() {
        eyfy build = this.a.build();
        build.getClass();
        return (eprl) build;
    }

    public final void b(epqu epquVar) {
        epqs epqsVar = this.a;
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        eprl eprlVar2 = eprl.a;
        eprlVar.d = epquVar;
        eprlVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }

    public final void c(epqy epqyVar) {
        epqs epqsVar = this.a;
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        eprl eprlVar2 = eprl.a;
        eprlVar.d = epqyVar;
        eprlVar.c = 103;
    }

    public final void d(eprc eprcVar) {
        epqs epqsVar = this.a;
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        eprl eprlVar2 = eprl.a;
        eprlVar.d = eprcVar;
        eprlVar.c = 104;
    }

    public final void e(int i) {
        epqs epqsVar = this.a;
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        eprl eprlVar2 = eprl.a;
        eprlVar.b |= 2;
        eprlVar.f = i;
    }

    public final void f(String str) {
        str.getClass();
        epqs epqsVar = this.a;
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        eprl eprlVar2 = eprl.a;
        eprlVar.b |= 8;
        eprlVar.g = str;
    }

    public final void g(epri epriVar) {
        epqs epqsVar = this.a;
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        eprl eprlVar2 = eprl.a;
        eprlVar.d = epriVar;
        eprlVar.c = 105;
    }

    public final void h(int i) {
        epqs epqsVar = this.a;
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        eprl eprlVar2 = eprl.a;
        eprlVar.b |= 1;
        eprlVar.e = i;
    }
}
