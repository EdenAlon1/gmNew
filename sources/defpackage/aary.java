package defpackage;

import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aary extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aasc b;
    final /* synthetic */ Optional c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aary(aasc aascVar, Optional optional, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aascVar;
        this.c = optional;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aary) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aasc aascVar = this.b;
            this.a = 1;
            obj = aascVar.d(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            aasc aascVar2 = this.b;
            final Optional optional = this.c;
            aascVar2.g.b(new ffji() { // from class: aarx
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    return ((zbo) Optional.this.get()).a((ajiy) obj2);
                }
            });
        } else {
            ((ddzb) this.b.k.b()).l(this.b.b.getString(R.string.custom_theme_tombstone_change_link_disabled_toast));
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aary(this.b, this.c, ffguVar);
    }
}
