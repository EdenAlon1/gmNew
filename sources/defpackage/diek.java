package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class diek extends dhzv {
    public diek(Context context, dfqz dfqzVar) {
        super(context, dfqzVar);
    }

    @Override // defpackage.dhzv
    public final dhre a(String str, String str2, byte[] bArr) {
        dfre dfreVar = this.k;
        dieh diehVar = new dieh(dfreVar, str, str2, bArr);
        dfreVar.b(diehVar);
        return dfwu.a(diehVar, new dfwt() { // from class: diej
            @Override // defpackage.dfwt
            public final Object a(dfrl dfrlVar) {
                return Integer.valueOf(((diei) dfrlVar).a);
            }
        });
    }
}
