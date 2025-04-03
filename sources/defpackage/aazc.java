package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abac b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazc(abac abacVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abacVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aazc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ygy ygyVar = (ygy) this.b.n.b();
            IncomingDraft incomingDraft = new IncomingDraft(aygq.m, this.c, null, null, false, null, null, false, 252, null);
            aazb aazbVar = new aazb(null);
            this.a = 1;
            obj = ygyVar.a(incomingDraft, aazbVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ((Boolean) obj).booleanValue();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aazc(this.b, this.c, ffguVar);
    }
}
