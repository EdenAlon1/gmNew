package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzpm {
    public final ffbr a;
    public final akzt b;
    private final bzoe c;

    public bzpm(bzoe bzoeVar, ffbr ffbrVar, akzt akztVar) {
        this.c = bzoeVar;
        this.a = ffbrVar;
        this.b = akztVar;
    }

    public final void a(fcek fcekVar, String str) {
        if (fcekVar == null || TextUtils.isEmpty(str)) {
            this.b.e("Bugle.Ditto.Connectivity.UpdateOnWorker.Skip.Count", fcekVar == null ? 4 : 5);
            return;
        }
        bzoe bzoeVar = this.c;
        bzoy bzoyVar = (bzoy) bzoz.a.createBuilder();
        esea eseaVar = esea.MOBILE_DATA_CONNECTION;
        bzoyVar.copyOnWrite();
        ((bzoz) bzoyVar.instance).c = eseaVar.a();
        bzoyVar.copyOnWrite();
        bzoz bzozVar = (bzoz) bzoyVar.instance;
        bzozVar.d = fcekVar;
        bzozVar.b |= 1;
        bzoyVar.copyOnWrite();
        bzoz bzozVar2 = (bzoz) bzoyVar.instance;
        str.getClass();
        bzozVar2.e = str;
        bzoz bzozVar3 = (bzoz) bzoyVar.build();
        cetp cetpVar = new cetp();
        cetpVar.b = "ditto-user-alert-mobile-connection";
        cetpVar.f = new bzpl(this);
        ((cevh) bzoeVar.a.b()).a(ceyr.h("ditto_process_user_alert", bzozVar3, cetpVar.a()));
    }
}
