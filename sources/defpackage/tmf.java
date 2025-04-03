package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmf {
    public static final cskc a = cskc.g("BugleCms", "CloudStoreRequestHeaderFactory");
    private static final etau d;
    public final axkm b;
    public final errl c;
    private final Context e;

    static {
        etas etasVar = (etas) etau.a.createBuilder();
        eswg eswgVar = (eswg) eswh.a.createBuilder();
        eswgVar.copyOnWrite();
        ((eswh) eswgVar.instance).d = "ANDROID_MESSAGES";
        etasVar.copyOnWrite();
        etau etauVar = (etau) etasVar.instance;
        eswh eswhVar = (eswh) eswgVar.build();
        eswhVar.getClass();
        etauVar.c = eswhVar;
        etauVar.b |= 1;
        d = (etau) etasVar.build();
    }

    public tmf(axkm axkmVar, Context context, errl errlVar) {
        this.b = axkmVar;
        this.e = context;
        this.c = errlVar;
    }

    public final elfl a(final etas etasVar) {
        return this.b.n().h(new emwl() { // from class: tly
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cskc cskcVar = tmf.a;
                boolean isPresent = optional.isPresent();
                etas etasVar2 = etas.this;
                if (!isPresent) {
                    tmf.a.r("Missing device ID in proto store");
                    return etasVar2;
                }
                eswg eswgVar = (eswg) eswh.a.createBuilder();
                eswgVar.copyOnWrite();
                ((eswh) eswgVar.instance).d = "ANDROID_MESSAGES";
                String str = (String) optional.get();
                eswgVar.copyOnWrite();
                ((eswh) eswgVar.instance).b = str;
                eswh eswhVar = (eswh) eswgVar.build();
                etasVar2.copyOnWrite();
                etau etauVar = (etau) etasVar2.instance;
                etau etauVar2 = etau.a;
                eswhVar.getClass();
                etauVar.c = eswhVar;
                etauVar.b |= 1;
                return etasVar2;
            }
        }, this.c);
    }

    public final elfl b(final etas etasVar) {
        return this.b.k().h(new emwl() { // from class: tme
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axez axezVar = (axez) obj;
                tmf tmfVar = tmf.this;
                axkl axklVar = tmfVar.b.n;
                axeu b = axeu.b(axezVar.l);
                if (b == null) {
                    b = axeu.UNSPECIFIED_STATUS;
                }
                etas etasVar2 = etasVar;
                if (axkl.f(b)) {
                    etasVar2.a(esxi.FEATURE_TYPE_MULTI_DEVICE);
                    return etasVar2;
                }
                axkl axklVar2 = tmfVar.b.n;
                axeu b2 = axeu.b(axezVar.r);
                if (b2 == null) {
                    b2 = axeu.UNSPECIFIED_STATUS;
                }
                if (axkl.f(b2)) {
                    etasVar2.a(esxi.FEATURE_TYPE_BACKUP_AND_RESTORE);
                }
                return etasVar2;
            }
        }, this.c);
    }

    public final etas c() {
        etas etasVar = (etas) d.toBuilder();
        String uuid = UUID.randomUUID().toString();
        etasVar.copyOnWrite();
        etau etauVar = (etau) etasVar.instance;
        uuid.getClass();
        etauVar.d = uuid;
        eswl eswlVar = (eswl) eswm.a.createBuilder();
        eswlVar.copyOnWrite();
        ((eswm) eswlVar.instance).b = "PHONE";
        String d2 = crob.d(this.e);
        eswlVar.copyOnWrite();
        eswm eswmVar = (eswm) eswlVar.instance;
        d2.getClass();
        eswmVar.c = d2;
        int b = crob.b(this.e);
        eswlVar.copyOnWrite();
        ((eswm) eswlVar.instance).d = b;
        int c = crob.c(this.e);
        eswlVar.copyOnWrite();
        ((eswm) eswlVar.instance).e = c;
        eswm eswmVar2 = (eswm) eswlVar.build();
        etasVar.copyOnWrite();
        etau etauVar2 = (etau) etasVar.instance;
        eswmVar2.getClass();
        etauVar2.e = eswmVar2;
        etauVar2.b |= 2;
        return etasVar;
    }

    public final etau d() {
        return (etau) c().build();
    }

    public final elfl e(int i) {
        etas c = c();
        c.copyOnWrite();
        etau etauVar = (etau) c.instance;
        etau etauVar2 = etau.a;
        etauVar.f = etat.a(i);
        return b(c).h(new tmc(), this.c);
    }
}
