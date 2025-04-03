package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcrh extends bcpr implements lon {
    public static final cskc a = cskc.g("BugleDataModel", "ConversationListData");
    protected bcrg b;
    public final cgix c;
    public final Optional d;
    public loo e;
    public Bundle f;
    private final ffbr g;
    private final azwc h;
    private final Context i;
    private final Optional j;
    private final ffbr k;

    public bcrh(ffbr ffbrVar, ffbr ffbrVar2, azwc azwcVar, Context context, bcrg bcrgVar, cgix cgixVar, Optional optional, Optional optional2) {
        this.k = ffbrVar;
        this.g = ffbrVar2;
        this.h = azwcVar;
        this.b = bcrgVar;
        this.i = context;
        this.j = optional;
        this.c = cgixVar;
        this.d = optional2;
    }

    @Override // defpackage.lon
    public final lox a(int i, Bundle bundle) {
        cskc cskcVar = a;
        csjb a2 = cskcVar.a();
        a2.I("onCreateLoader.");
        a2.y("id", i);
        a2.r();
        String string = bundle.getString("bindingId");
        if (!j(string)) {
            cskcVar.r("Creating loader after unbinding list.");
            return null;
        }
        if (i == 1) {
            azwc azwcVar = this.h;
            Context context = this.i;
            return azwcVar.a(string, context, bcqc.j(context), new ksz() { // from class: bcrf
                @Override // defpackage.ksz
                public final Object a() {
                    bcrh bcrhVar = bcrh.this;
                    bfkr a3 = bcrhVar.c.a();
                    becl beclVar = (becl) a3;
                    beclVar.e = Boolean.valueOf(bcrhVar.e());
                    if (bcrhVar.e()) {
                        a3.c(true);
                    }
                    if (bcrhVar.d.isPresent()) {
                        ((Boolean) bcrhVar.d.get()).booleanValue();
                        beclVar.d = true;
                    }
                    return a3.a().l();
                }
            });
        }
        if (i != 3) {
            csix.c("Unknown loader id");
            return null;
        }
        csix.c("Should be handled by annotationsLoaderCallbacks");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lon
    public final /* bridge */ /* synthetic */ void b(lox loxVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (!j(((bcqe) loxVar).t())) {
            a.r("Loader finished after unbinding list.");
            return;
        }
        int i = loxVar.b;
        csjb a2 = a.a();
        a2.I("onLoadFinished.");
        a2.y("id", i);
        a2.y("dataSize", cursor != null ? cursor.getCount() : 0);
        a2.r();
        if (i == 1) {
            if (cursor instanceof dtsr) {
                ((dtsr) cursor).dh();
            }
            this.b.s(this, cursor);
        } else if (i != 3) {
            csix.c("Unknown loader id");
        } else {
            csix.c("Should be handled by annotationsLoaderCallbacks");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lon
    public final void c(lox loxVar) {
        int i = loxVar.b;
        if (!j(((bcqe) loxVar).t())) {
            a.r("Loader reset after unbinding list.");
            return;
        }
        csjb a2 = a.a();
        a2.I("onLoaderReset.");
        a2.y("id", i);
        a2.r();
        if (i == 1) {
            this.b.s(this, null);
        } else if (i != 3) {
            csix.c("Unknown loader id");
        } else {
            csix.c("Should be handled by annotationsLoaderCallbacks");
        }
    }

    public final void d(boolean z) {
        ((carb) this.g.b()).d(z);
        if (z) {
            enru enruVar = csjy.a;
            ((cirp) this.k.b()).a(ciro.a);
        }
    }

    public final boolean e() {
        this.j.isPresent();
        return ((Boolean) this.j.get()).booleanValue();
    }

    @Override // defpackage.bcpr
    protected final void h() {
        this.b = null;
        loo looVar = this.e;
        if (looVar != null) {
            looVar.b(1);
            this.e.b(3);
            this.e = null;
        }
    }
}
