package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uhr implements dbxo {
    final /* synthetic */ uhs a;

    public uhr(uhs uhsVar) {
        this.a = uhsVar;
    }

    @Override // defpackage.dbxo
    public final void b(cxqz cxqzVar) {
        dbxt dbxtVar = this.a.n;
        if (dbxtVar != null) {
            dbxtVar.d(cxqzVar);
        }
    }

    @Override // defpackage.dbxo
    public final boolean l() {
        dbxt dbxtVar = this.a.n;
        if (dbxtVar != null) {
            dbxtVar.f();
        }
        return this.a.n != null;
    }

    @Override // defpackage.dbxo
    public final void m(ContentGridView contentGridView) {
        uhs uhsVar = this.a;
        uhsVar.q = contentGridView;
        uhsVar.n = dbxt.i(uhsVar.q);
        uhs uhsVar2 = this.a;
        uhsVar2.n.h(new uhp(uhsVar2));
        uhs uhsVar3 = this.a;
        dcaw dcawVar = uhsVar3.m;
        dcawVar.c = uhsVar3.q;
        dbxt dbxtVar = uhsVar3.n;
        dcawVar.a = dbxtVar;
        uhsVar3.l.j(dbxtVar);
        dbxp H = this.a.h().H();
        uhs uhsVar4 = this.a;
        CustomizationModel customizationModel = uhsVar4.e.a;
        H.v = customizationModel;
        this.a.n.c(uhsVar4.m.b(customizationModel, uhsVar4.l()));
    }

    @Override // defpackage.dbxo
    public final void a() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void c(Configuration configuration) {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void d(Bundle bundle) {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void i(Bundle bundle) {
    }
}
