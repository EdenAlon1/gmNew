package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bana;
import defpackage.banb;
import defpackage.bbcg;
import defpackage.bzea;
import defpackage.bzeh;
import defpackage.bzej;
import defpackage.bzgd;
import defpackage.cgcv;
import defpackage.chep;
import defpackage.chez;
import defpackage.chwu;
import defpackage.chwv;
import defpackage.chww;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.eogt;
import defpackage.erqt;
import defpackage.ervu;
import defpackage.ervv;
import defpackage.erxg;
import defpackage.erxi;
import defpackage.esaa;
import defpackage.eyfy;
import defpackage.eygu;
import defpackage.fbzx;
import defpackage.fcek;
import defpackage.ffbr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessExpressiveStickerFavoriteAction extends Action<ListenableFuture<fbzx>> {
    private final ffbr b;
    private final chep c;
    private final chez d;
    private final ffbr e;
    private final chww f;
    private static final cskc a = cskc.g("BugleNetwork", "ProcessExpressiveStickerFavoriteAction");
    public static final Parcelable.Creator<Action<ListenableFuture<fbzx>>> CREATOR = new bana();

    /* compiled from: PG */
    public interface a {
        banb ia();
    }

    public ProcessExpressiveStickerFavoriteAction(ffbr ffbrVar, chep chepVar, chez chezVar, chww chwwVar, ffbr ffbrVar2, Parcel parcel) {
        super(parcel, eogt.PROCESS_EXPRESSIVE_STICKER_FAVORITE_ACTION);
        this.b = ffbrVar;
        this.c = chepVar;
        this.f = chwwVar;
        this.e = ffbrVar2;
        this.d = chezVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessExpressiveStickerFavoriteAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        chwv a2;
        bbcg bbcgVar = this.t;
        byte[] A = this.t.A("desktop_id_key");
        String l = bbcgVar.l("request_id_key");
        if (A == null || l == null) {
            a.n("Desktop ID or request ID null, skipping StickerFavorite.");
            return erqt.i(null);
        }
        try {
            fcek fcekVar = (fcek) eyfy.parseFrom(fcek.a, A);
            ervu ervuVar = (ervu) ervv.a.createBuilder();
            boolean y = this.t.y("is_favorite_key");
            ervuVar.copyOnWrite();
            ((ervv) ervuVar.instance).c = y;
            String l2 = this.t.l("pack_id_key");
            ervuVar.copyOnWrite();
            ervv ervvVar = (ervv) ervuVar.instance;
            l2.getClass();
            ervvVar.b = l2;
            ervv ervvVar2 = (ervv) ervuVar.build();
            if (((Boolean) cgcv.a.e()).booleanValue()) {
                bzej f = ((bzgd) this.e.b()).f(fcekVar.c);
                if (f == null) {
                    csjb e = a.e();
                    e.A("desktopId", fcekVar.c);
                    e.I("Desktop not found. Skipping favorite sticker sync.");
                    e.r();
                    return erqt.i(null);
                }
                chwu a3 = this.f.a(((bzeh) f).b, esaa.GET_UPDATES);
                a3.c = l;
                erxg erxgVar = (erxg) erxi.a.createBuilder();
                erxgVar.copyOnWrite();
                erxi erxiVar = (erxi) erxgVar.instance;
                ervvVar2.getClass();
                erxiVar.c = ervvVar2;
                erxiVar.b = 10;
                a3.b(erxgVar.build());
                a2 = a3.a();
            } else {
                chwu c = this.f.c(fcekVar, Optional.empty(), esaa.GET_UPDATES);
                c.c = l;
                erxg erxgVar2 = (erxg) erxi.a.createBuilder();
                erxgVar2.copyOnWrite();
                erxi erxiVar2 = (erxi) erxgVar2.instance;
                ervvVar2.getClass();
                erxiVar2.c = ervvVar2;
                erxiVar2.b = 10;
                c.b(erxgVar2.build());
                a2 = c.a();
            }
            ((bzea) this.b.b()).f(l, fcekVar.c, esaa.GET_UPDATES.a(), 10, a2.c);
            elfl a4 = ((Boolean) cgcv.a.e()).booleanValue() ? this.d.a(a2) : this.c.a(a2);
            a2.q(a4);
            return a4;
        } catch (eygu e2) {
            a.o("Desktop ID invalid.", e2);
            return erqt.i(null);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.FavoriteStickersUpdate.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ProcessExpressiveStickerFavoriteAction(ffbr ffbrVar, chep chepVar, chez chezVar, chww chwwVar, ffbr ffbrVar2, fcek fcekVar, String str, String str2, boolean z) {
        super(eogt.PROCESS_EXPRESSIVE_STICKER_FAVORITE_ACTION);
        this.b = ffbrVar;
        this.c = chepVar;
        this.d = chezVar;
        this.f = chwwVar;
        this.e = ffbrVar2;
        this.t.q("desktop_id_key", fcekVar.toByteArray());
        this.t.v("request_id_key", str);
        this.t.v("pack_id_key", str2);
        this.t.p("is_favorite_key", z);
    }
}
