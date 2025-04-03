package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebvq implements dwac {
    final /* synthetic */ Context a;

    public ebvq(Context context) {
        this.a = context;
    }

    @Override // defpackage.dwac
    public final /* synthetic */ emxc a(dvwk dvwkVar) {
        return emux.a;
    }

    @Override // defpackage.dwac
    public final /* synthetic */ emxc b(dvwk dvwkVar) {
        return emux.a;
    }

    @Override // defpackage.dwac
    public final emxc c(dvwk dvwkVar) {
        return emxc.j(dfli.c(78315553, faxv.EVENT_OVERRIDE));
    }

    @Override // defpackage.dwac
    public final ListenableFuture d(dvwk dvwkVar, ListenableFuture listenableFuture) {
        ezop ezopVar = (ezop) ezoq.a.createBuilder();
        ezon ezonVar = (ezon) ezoo.a.createBuilder();
        String packageName = this.a.getPackageName();
        ezonVar.copyOnWrite();
        ezoo ezooVar = (ezoo) ezonVar.instance;
        packageName.getClass();
        ezooVar.b |= 64;
        ezooVar.g = packageName;
        ezopVar.copyOnWrite();
        ezoq ezoqVar = (ezoq) ezopVar.instance;
        ezoo ezooVar2 = (ezoo) ezonVar.build();
        ezooVar2.getClass();
        ezoqVar.c = ezooVar2;
        ezoqVar.b |= 1;
        return erqt.i(ezopVar.build());
    }

    @Override // defpackage.dwac
    public final /* synthetic */ ListenableFuture e(dvwk dvwkVar, ListenableFuture listenableFuture) {
        return dwab.b();
    }

    @Override // defpackage.dwac
    public final faxs f(dvwk dvwkVar) {
        return faxs.DEFAULT;
    }

    @Override // defpackage.dwac
    public final String g(dvwk dvwkVar) {
        return "ONEGOOGLE_MOBILE";
    }

    @Override // defpackage.dwac
    public final /* synthetic */ ListenableFuture h() {
        throw null;
    }
}
