package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajfj extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ SwitchPreferenceCompat c;
    final /* synthetic */ ajfi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajfj(SwitchPreferenceCompat switchPreferenceCompat, ajfi ajfiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = switchPreferenceCompat;
        this.d = ajfiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajfj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            SwitchPreferenceCompat switchPreferenceCompat = this.c;
            cjeo cjeoVar = (cjeo) ((Optional) this.d.b.b()).get();
            this.a = switchPreferenceCompat;
            this.b = 1;
            Object f = cjeoVar.f(this);
            if (f == ffhhVar) {
                return ffhhVar;
            }
            obj2 = switchPreferenceCompat;
            obj = f;
        }
        ((TwoStatePreference) obj2).k(((Boolean) obj).booleanValue());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajfj(this.c, this.d, ffguVar);
    }
}
