package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkyu extends dkyv {
    private final ffbz b;

    public dkyu(final Context context) {
        context.getClass();
        this.b = ffca.a(new ffix() { // from class: dkyt
            @Override // defpackage.ffix
            public final Object invoke() {
                etqk etqkVar = new etqk();
                etqkVar.c(context, "moirai_keyset", "moirai_pref");
                etqkVar.b("android-keystore://hades_moirai");
                etqkVar.d = this.a;
                return etqkVar.a().a();
            }
        });
    }

    @Override // defpackage.dkyv
    protected final etga a() {
        Object a = this.b.a();
        a.getClass();
        return (etga) a;
    }
}
