package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dict extends dhzj {
    public dict(Context context, dfqz dfqzVar) {
        super(context, dfqzVar);
    }

    @Override // defpackage.dhzj
    public final dhre a(Uri uri) {
        return dfwu.a(dicn.a(this.k, uri, 0), new dicq());
    }

    @Override // defpackage.dhzj
    public final dhre b() {
        dfre dfreVar = this.k;
        dicg dicgVar = new dicg(dfreVar);
        dfreVar.b(dicgVar);
        return dfwu.a(dicgVar, new dico());
    }

    @Override // defpackage.dhzj
    public final dhre c(Uri uri) {
        dfvf.a(uri, "uri must not be null");
        dfwv.b(true, "invalid filter type");
        dfre dfreVar = this.k;
        dich dichVar = new dich(dfreVar, uri);
        dfreVar.b(dichVar);
        return dfwu.a(dichVar, new dico());
    }

    @Override // defpackage.dhzj
    public final dhre d(Asset asset) {
        if (asset.b == null) {
            throw new IllegalArgumentException("invalid asset");
        }
        if (asset.a != null) {
            throw new IllegalArgumentException("invalid asset");
        }
        dfre dfreVar = this.k;
        dicj dicjVar = new dicj(dfreVar, asset);
        dfreVar.b(dicjVar);
        return dfwu.a(dicjVar, new dfwt() { // from class: dicp
            @Override // defpackage.dfwt
            public final Object a(dfrl dfrlVar) {
                return new dics((dicm) dfrlVar);
            }
        });
    }

    @Override // defpackage.dhzj
    public final dhre e(PutDataRequest putDataRequest) {
        dfre dfreVar = this.k;
        dicf dicfVar = new dicf(dfreVar, putDataRequest);
        dfreVar.b(dicfVar);
        return dfwu.a(dicfVar, new dfwt() { // from class: dicr
            @Override // defpackage.dfwt
            public final Object a(dfrl dfrlVar) {
                return ((dick) dfrlVar).a;
            }
        });
    }

    @Override // defpackage.dhzj
    public final dhre n(Uri uri) {
        return dfwu.a(dicn.a(this.k, uri, 1), new dicq());
    }
}
