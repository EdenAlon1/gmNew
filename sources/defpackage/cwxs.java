package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwxs extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ SwitchPreferenceCompat c;
    final /* synthetic */ aetu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwxs(SwitchPreferenceCompat switchPreferenceCompat, aetu aetuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = switchPreferenceCompat;
        this.d = aetuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwxs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            aetu aetuVar = this.d;
            this.a = switchPreferenceCompat;
            this.b = 1;
            Object b = aetuVar.b(this);
            if (b == ffhhVar) {
                return ffhhVar;
            }
            obj2 = switchPreferenceCompat;
            obj = b;
        }
        ((TwoStatePreference) obj2).k(obj == aeuk.PHOTOS_LINK);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwxs(this.c, this.d, ffguVar);
    }
}
