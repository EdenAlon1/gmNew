package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebph extends ebpe {
    public final eave a;
    public final ebtd b;
    public final eawd c;
    public final View.OnClickListener d;

    public ebph(eave eaveVar, ebtd ebtdVar, eawd eawdVar, View.OnClickListener onClickListener) {
        this.a = eaveVar;
        this.b = ebtdVar;
        this.c = eawdVar;
        this.d = onClickListener;
    }

    @Override // defpackage.ebpe
    public final View.OnClickListener a() {
        return this.d;
    }

    @Override // defpackage.ebpe
    public final eave b() {
        return this.a;
    }

    @Override // defpackage.ebpe
    public final eawd c() {
        return this.c;
    }

    @Override // defpackage.ebpe
    public final ebtd d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ebtd ebtdVar;
        eawd eawdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebpe) {
            ebpe ebpeVar = (ebpe) obj;
            if (this.a.equals(ebpeVar.b()) && ((ebtdVar = this.b) != null ? ebtdVar.equals(ebpeVar.d()) : ebpeVar.d() == null) && ((eawdVar = this.c) != null ? eawdVar.equals(ebpeVar.c()) : ebpeVar.c() == null) && this.d.equals(ebpeVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        ebtd ebtdVar = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (ebtdVar == null ? 0 : ebtdVar.hashCode())) * 1000003;
        eawd eawdVar = this.c;
        return ((hashCode2 ^ (eawdVar != null ? eawdVar.hashCode() : 0)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        View.OnClickListener onClickListener = this.d;
        eawd eawdVar = this.c;
        ebtd ebtdVar = this.b;
        return "AccountLayer{accountConverter=" + this.a.toString() + ", avatarRetriever=" + String.valueOf(ebtdVar) + ", avatarImageLoader=" + String.valueOf(eawdVar) + ", onAddAccount=" + onClickListener.toString() + "}";
    }
}
