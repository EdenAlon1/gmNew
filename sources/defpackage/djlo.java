package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djlo implements djjx {
    private final errm a;
    private final Context b;
    private final dkpp c;
    private final dikt d;
    private final dikj e;
    private final djky f;
    private final djjo g;

    public djlo(Context context, dkpp dkppVar, djjo djjoVar, dikt diktVar, dikj dikjVar, errm errmVar, djky djkyVar) {
        this.b = context;
        this.c = dkppVar;
        this.g = djjoVar;
        this.d = diktVar;
        this.e = dikjVar;
        this.a = errmVar;
        this.f = djkyVar;
    }

    @Override // defpackage.djjx
    public final djjw a(String str, djjq djjqVar, djqr djqrVar, dkur dkurVar, djkh djkhVar, eehz eehzVar, eehs eehsVar, djts djtsVar, djtl djtlVar, diod diodVar, ffbr ffbrVar, dktn dktnVar) {
        dktn dktnVar2 = new dktn(String.format("%s [%s]", dktnVar, "SR"));
        Object b = ffbrVar.b();
        djmt djmtVar = new djmt(this.b, this.d);
        djlj djljVar = new djlj(this.b, this.d);
        djlk djlkVar = new djlk(this.b, this.d);
        InstantMessageConfiguration instantMessageConfiguration = (InstantMessageConfiguration) b;
        dikj dikjVar = this.e;
        errm errmVar = this.a;
        djjo djjoVar = this.g;
        return new djln(dktnVar2, new djmn(this.b, djkhVar, eehzVar, this.f, eehsVar, this.c, dktnVar2, errmVar, djjoVar, djtsVar, djtlVar, instantMessageConfiguration, diodVar, djmtVar, djljVar, dkurVar, dikjVar, djlkVar), this.g, djtsVar, djtlVar, this.e);
    }
}
