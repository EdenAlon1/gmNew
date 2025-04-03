package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edjy implements edgc {
    public final edto a;
    public final edgh b;
    public final edgm c;
    public final edkp d;
    public final dlpw e;
    public final edkq f;

    public edjy(edkq edkqVar, edto edtoVar, edgh edghVar, edgm edgmVar, edkp edkpVar, dlpw dlpwVar) {
        this.f = edkqVar;
        this.a = edtoVar;
        this.b = edghVar;
        this.c = edgmVar;
        this.d = edkpVar;
        this.e = dlpwVar;
    }

    @Override // defpackage.edgc
    public final dhre a(edrs edrsVar, final int i) {
        edqs edqsVar = (edqs) edrsVar;
        if (TextUtils.isEmpty(edqsVar.a)) {
            return dhrt.b(new dfqu(new Status(9012, "Place ID must not be empty.")));
        }
        if (edqsVar.b.isEmpty()) {
            return dhrt.b(new dfqu(new Status(9012, "Place Fields must not be empty.")));
        }
        edkq edkqVar = this.f;
        edjl edjlVar = new edjl(edrsVar, edkqVar.b(), edkqVar.a(), this.a);
        dlpw dlpwVar = this.e;
        edgh edghVar = this.b;
        final long a = dlpwVar.a();
        return edghVar.a(edjlVar, edjm.class).b(new dhqh() { // from class: edjw
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                edjm edjmVar = (edjm) dhreVar.i();
                String str = edjmVar.status;
                int a2 = edkc.a(str);
                if (edsh.b(a2)) {
                    throw new dfqu(new Status(a2, edkc.b(str, edjmVar.errorMessage)));
                }
                edkb edkbVar = edjmVar.result;
                String[] strArr = edjmVar.htmlAttributions;
                return new edqt(edjz.d(edkbVar, strArr != null ? engw.p(strArr) : null));
            }
        }).b(new dhqh() { // from class: edjx
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                long j = a;
                int i2 = i;
                edjy edjyVar = edjy.this;
                edjyVar.d.d(dhreVar, j, edjyVar.e.a(), 2, i2, edfs.a);
                return (edrt) dhreVar.i();
            }
        });
    }
}
