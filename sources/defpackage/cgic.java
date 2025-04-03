package defpackage;

import com.google.android.gms.kids.IndividualContactRequest;
import com.google.android.gms.kids.TrustedContactsRequest;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgic extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgie b;
    final /* synthetic */ IndividualContactRequest[] c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgic(ffgu ffguVar, cgie cgieVar, IndividualContactRequest[] individualContactRequestArr) {
        super(2, ffguVar);
        this.b = cgieVar;
        this.c = individualContactRequestArr;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgic) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dgsq dgsqVar = (dgsq) this.b.d.b();
        TrustedContactsRequest trustedContactsRequest = new TrustedContactsRequest();
        trustedContactsRequest.a = this.c;
        dhre d = dgsqVar.d(trustedContactsRequest);
        this.a = 1;
        Object a = fgju.a(d, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cgic cgicVar = new cgic(ffguVar, this.b, this.c);
        cgicVar.d = obj;
        return cgicVar;
    }
}
