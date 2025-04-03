package defpackage;

import android.provider.Telephony;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqt extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ lh b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqt(ffgu ffguVar, bara baraVar, lh lhVar, int i, String str) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = lhVar;
        this.c = i;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cskc cskcVar = bara.a;
        return this.a.v.h(this.b, Telephony.Mms.Inbox.CONTENT_URI, this.c, this.d, -1L, null);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqt baqtVar = new baqt(ffguVar, this.a, this.b, this.c, this.d);
        baqtVar.e = obj;
        return baqtVar;
    }
}
