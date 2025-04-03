package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.internal.IPhenotypeService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhlf extends dfra {
    public static final /* synthetic */ int a = 0;

    static {
        Pair.create(new dhln(), dhrt.c(null));
    }

    public dhlf(Context context) {
        super(context, dhkk.a, dfqp.q, dfqz.a);
    }

    public static dhre a() {
        return dhrt.b(new dfqu(new Status(16)));
    }

    public final dhre b(final String str) {
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhkv
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                int i = dhlf.a;
                ((IPhenotypeService) ((dhlo) obj).w()).commitToConfiguration(new dhle((dhri) obj2), str);
            }
        };
        return i(dfunVar.a());
    }

    public final dhre c(final String str, final int i, final String[] strArr, final byte[] bArr) {
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhku
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                int i2 = dhlf.a;
                ((IPhenotypeService) ((dhlo) obj).w()).register(new dhle((dhri) obj2), str, i, strArr, bArr);
            }
        };
        return i(dfunVar.a());
    }

    public final dhre d(final String str, final euln eulnVar) {
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhky
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                int i = dhlf.a;
                ((IPhenotypeService) ((dhlo) obj).w()).setRuntimeProperties(new dhla((dhri) obj2), str, eulnVar.toByteArray());
            }
        };
        dfunVar.b = new Feature[]{dhke.h};
        dfunVar.b();
        return i(dfunVar.a());
    }

    public final boolean e(int i) {
        return dfpj.d.i(this.c, i) == 0;
    }

    public final dhre n(final String str) {
        if (!e(12451000)) {
            return a();
        }
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhkt
            public final /* synthetic */ String b = "";

            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                int i = dhlf.a;
                dhle dhleVar = new dhle((dhri) obj2);
                ((IPhenotypeService) ((dhlo) obj).w()).commitToConfiguration(dhleVar, "CURRENT:" + this.b + ":" + str);
            }
        };
        return i(dfunVar.a());
    }

    public final dhre o(final String str, final String str2) {
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhkm
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                int i = dhlf.a;
                ((IPhenotypeService) ((dhlo) obj).w()).getConfigurationSnapshotWithToken(new dhle((dhri) obj2), str, str2, null);
            }
        };
        return i(dfunVar.a());
    }

    public final void p(final int[] iArr, final String str) {
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhkz
            public final /* synthetic */ String a = "MOBILE_CONFIGURATION_NAME_SPACE";

            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                int i = dhlf.a;
                dhle dhleVar = new dhle((dhri) obj2);
                ((IPhenotypeService) ((dhlo) obj).w()).weakRegister(dhleVar, "__internal.external_ids#".concat(this.a), 0, new String[]{str}, iArr, null);
            }
        };
        i(dfunVar.a());
    }
}
