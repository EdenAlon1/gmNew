package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxkv extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ SwitchPreferenceCompat c;
    final /* synthetic */ cxkx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxkv(SwitchPreferenceCompat switchPreferenceCompat, cxkx cxkxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = switchPreferenceCompat;
        this.d = cxkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxkv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            curb curbVar = (curb) this.d.c.b();
            this.a = switchPreferenceCompat;
            this.b = 1;
            Object a = curbVar.a(this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            obj2 = switchPreferenceCompat;
            obj = a;
        }
        ((TwoStatePreference) obj2).k(((Boolean) obj).booleanValue());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cxkv(this.c, this.d, ffguVar);
    }
}
