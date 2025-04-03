package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazr extends ffhv implements ffji {
    final /* synthetic */ abac a;
    final /* synthetic */ aoax b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazr(abac abacVar, aoax aoaxVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = abacVar;
        this.b = aoaxVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((cuxz) this.a.I.b()).b(((aoat) this.b).d(), this.a.g.getString(R.string.otp_copied_to_clipboard));
        abac abacVar = this.a;
        axol.m(abacVar.f, new aazq(abacVar, this.b, null));
        return true;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aazr(this.a, this.b, (ffgu) obj).b(ffcu.a);
    }
}
